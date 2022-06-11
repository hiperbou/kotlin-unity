using UnityEngine;
using Puerts;

namespace UnityKotlin
{
    //public delegate void JsonMessageCallback(string json);

    public delegate string greet();
    public delegate string greetByName(string name);
    public delegate void useInstance(HelloKotlin instance);

    public class KotlinModule
    {
        public greet greet;
        public greetByName greetByName;
        public useInstance useInstance;

        public KotlinModule(greet greet, greetByName greetByName, useInstance useInstance)
        {
            this.greet = greet;
            this.greetByName = greetByName;
            this.useInstance = useInstance;
        }
    }

    public class KotlinModuleLoader
    {
        private string ModuleName;
        private string varname;
        private JsEnv jsEnv;

        public KotlinModuleLoader(string ModuleName)
        {
            jsEnv = new JsEnv(new DefaultLoader(), 9229);

            this.ModuleName = ModuleName;
            varname = "m_" + Time.frameCount;
            jsEnv.Eval("const " + varname + " = require('" + ModuleName + "');");
        }

        public T getDelegate<T>(string name) {
            return jsEnv.Eval<T>(varname + "." + name + ";");
        }

        public void Tick()
        {
            jsEnv.Tick();
        }

        public void Dispose()
        {
            jsEnv.Dispose();
        }
    }

    public class HelloKotlin : MonoBehaviour
    {
        //private JsonMessageCallback jsonMessageCallback;

        private KotlinModuleLoader moduleLoader;
        private KotlinModule kotlin;

        void Start()
        {
            moduleLoader = new KotlinModuleLoader("unity-kotlin");
            kotlin = new KotlinModule(
                moduleLoader.getDelegate<greet>("greet"),
                moduleLoader.getDelegate<greetByName>("greetByName"),
                moduleLoader.getDelegate<useInstance>("useInstance")
            );

            Debug.Log("Call Kotlin greet");
            var greeting = kotlin.greet();
            Debug.Log("Kotlin said " + greeting);

            Debug.Log("Call Kotlin greetByName");
            greeting = kotlin.greetByName("hiperbou");
            Debug.Log("Kotlin said " + greeting);

            Debug.Log("Call Kotlin useInstance");
            kotlin.useInstance(this);
            Debug.Log("Called Kotlin useInstance");
        }

        void Update()
        {
            if (moduleLoader != null) moduleLoader.Tick();
        }

        void OnDestroy()
        {
            if(moduleLoader!=null) moduleLoader.Dispose();
        }

        public string CSharpCall(string name)
        {
            return "Hello from C#, " + name;
        }

        /*public void AddEventCallback1(JsonMessageCallback jsonMessageCallback)
        {
            this.jsonMessageCallback += jsonMessageCallback;
        }
   
        public void RemoveEventCallback1(JsonMessageCallback jsonMessageCallback)
        {
            this.jsonMessageCallback -= jsonMessageCallback;
        }*/

        //This can be called from Kotlin code!
        public static void CallStaticFunction(object o)
        {
            Debug.Log("CallStaticFunction");
            Debug.Log("value type:" + o.GetType());
        }

        public static double Sum(double a, double b)
        {
            Debug.Log("Sum");
            Debug.Log("result:" + (a + b));
            return a + b;
        }

        void OnGUI()
        {
            if (GUILayout.Button("Press Me"))
                kotlin.useInstance(this);
        }
    }
}