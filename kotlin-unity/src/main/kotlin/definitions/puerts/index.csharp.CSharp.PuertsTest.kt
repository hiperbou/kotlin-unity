@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("PuertsTest")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.PuertsTest

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
import csharp.System.Action
import csharp.System.Collections.IEnumerator
import csharp.UnityEngine.MonoBehaviour

external open class TSBehaviour : MonoBehaviour {
    open var ModuleName: String
    open var JsStart: Action
    open var JsUpdate: Action
    open var JsOnDestroy: Action
    open fun Coroutine(): IEnumerator
}