@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEngine.Events")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEngine.Events

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
import csharp.UnityEngine.ISerializationCallbackReceiver
import csharp.System.Object

external open class UnityEvent : UnityEventBase, ISerializationCallbackReceiver {
    open fun AddListener(`$call`: UnityAction)
    open fun RemoveListener(`$call`: UnityAction)
    open fun Invoke()
}

external open class UnityEventBase : Object, ISerializationCallbackReceiver {
    override fun OnBeforeSerialize()
    override fun OnAfterDeserialize()
}

external interface UnityAction {
    @nativeInvoke
    operator fun invoke()
    var Invoke: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external open class `UnityEvent$1`<T0> : UnityEventBase, ISerializationCallbackReceiver {
    open fun AddListener(`$call`: `UnityAction$1`<T0>)
    open fun RemoveListener(`$call`: `UnityAction$1`<T0>)
    open fun Invoke(`$arg0`: T0)
}

external interface `UnityAction$1`<T0> {
    @nativeInvoke
    operator fun invoke(arg0: T0)
    var Invoke: ((arg0: T0) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}