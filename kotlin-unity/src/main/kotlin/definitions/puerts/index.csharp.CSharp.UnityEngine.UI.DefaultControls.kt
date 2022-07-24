@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEngine.UI.DefaultControls")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEngine.UI.DefaultControls

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
import csharp.System.Type
import csharp.UnityEngine.GameObject
import csharp.UnityEngine.Sprite
import csharp.System.ValueType

external interface IFactoryControls {
    fun CreateGameObject(`$name`: String, vararg components: Type): GameObject
}

external open class Resources : ValueType {
    open var standard: Sprite
    open var background: Sprite
    open var inputField: Sprite
    open var knob: Sprite
    open var checkmark: Sprite
    open var dropdown: Sprite
    open var mask: Sprite
}