using System.Collections;
using System.Collections.Generic;
using UnityEngine;

using UnityEngine;
using Puerts;

namespace UnityKotlin
{
    public delegate void initPong(Pong instance);
    public delegate void updatePong();

    public class PongKotlinModule
    {
        public initPong initPong;

        public PongKotlinModule(initPong initPong)
        {
            this.initPong = initPong;
        }
    }

    public class Pong : MonoBehaviour
    {
        public GameObject Paddle1;
        public GameObject Paddle2;
        public GameObject Ball;
        public GameObject LeftScore;
        public GameObject RightScore;

        public updatePong updatePong;

        private KotlinModuleLoader moduleLoader;
        private PongKotlinModule kotlin;

        void Start()
        {
            moduleLoader = new KotlinModuleLoader("kotlin-unity");
            kotlin = new PongKotlinModule(
                moduleLoader.getDelegate<initPong>("initPong")
            );
            
            kotlin.initPong(this);
        }

        void Update()
        {
            if (moduleLoader != null) moduleLoader.Tick();
            if (updatePong != null) updatePong();
        } 

        void OnDestroy()
        {
            if (moduleLoader != null) moduleLoader.Dispose();
        }
    }
}
