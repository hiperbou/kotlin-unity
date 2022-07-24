@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("Puerts")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.Puerts

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import csharp.System.IntPtr
import csharp.System.Type
import csharp.System.`Func$1`
import csharp.System.Threading.Tasks.Task
import csharp.System.Object
import csharp.System.IDisposable
import csharp.System.Collections.Generic.`List$1`
import csharp.Puerts.JsEnv.JsEnvCreateCallback
import csharp.Puerts.JsEnv.JsEnvDisposeCallback
import csharp.`$Ref`

external open class JsEnv : Object, IDisposable {
    constructor()
    constructor(`$loader`: ILoader, `$debugPort`: Number = definedExternally)
    constructor(`$loader`: ILoader)
    constructor(`$loader`: ILoader, `$externalRuntime`: IntPtr, `$externalContext`: IntPtr)
    constructor(`$loader`: ILoader, `$debugPort`: Number, `$externalRuntime`: IntPtr, `$externalContext`: IntPtr)
    open var debugPort: Number
    open var `var`: Any
    open var ArgumentsPusher: Any
    open val Index: Any
    open fun ExecuteModule(`$filename`: String)
    open fun Eval(`$chunk`: String, `$chunkName`: String = definedExternally)
    open fun ClearModuleCache()
    open fun AddLazyStaticWrapLoader(`$type`: Type, `$lazyStaticWrapLoader`: `Func$1`<TypeRegisterInfo>)
    open fun RegisterGeneralGetSet(`$type`: Type, `$getter`: GeneralGetter, `$setter`: GeneralSetter)
    open fun GetTypeId(`$type`: Type): Number
    open fun LowMemoryNotification()
    open fun Tick()
    open fun WaitDebugger()
    open fun WaitDebuggerAsync(): Task
    open fun Dispose()
    interface JsEnvCreateCallback {
        @nativeInvoke
        operator fun invoke(env: JsEnv, loader: ILoader, debugPort: Number)
        var Invoke: ((env: JsEnv, loader: ILoader, debugPort: Number) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JsEnvDisposeCallback {
        @nativeInvoke
        operator fun invoke(env: JsEnv)
        var Invoke: ((env: JsEnv) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        var jsEnvs: `List$1`<JsEnv>
        var OnJsEnvCreate: JsEnvCreateCallback
        var OnJsEnvDispose: JsEnvDisposeCallback
        fun ClearAllModuleCaches()
    }
}

external interface ILoader {
    fun FileExists(`$filepath`: String): Boolean
    fun ReadFile(`$filepath`: String, `$debugpath`: `$Ref`<String>): String
}

external interface PushJSFunctionArgumentsCallback {
    @nativeInvoke
    operator fun invoke(isolate: IntPtr, jsEnvIdx: Number, nativeJsFuncPtr: IntPtr)
    var Invoke: ((isolate: IntPtr, jsEnvIdx: Number, nativeJsFuncPtr: IntPtr) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external open class TypeRegisterInfo : Object

external interface GeneralGetter {
    @nativeInvoke
    operator fun invoke(isolate: IntPtr, getValueApi: IGetValueFromJs, value: IntPtr, isByRef: Boolean): Any
    var Invoke: ((isolate: IntPtr, getValueApi: IGetValueFromJs, value: IntPtr, isByRef: Boolean) -> Any)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external interface IGetValueFromJs

external interface GeneralSetter {
    @nativeInvoke
    operator fun invoke(isolate: IntPtr, setValueApi: ISetValueToJs, holder: IntPtr, obj: Any)
    var Invoke: ((isolate: IntPtr, setValueApi: ISetValueToJs, holder: IntPtr, obj: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external interface ISetValueToJs