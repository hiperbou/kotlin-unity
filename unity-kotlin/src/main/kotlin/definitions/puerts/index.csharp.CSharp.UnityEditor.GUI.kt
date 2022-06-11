@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEditor.GUI")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEditor.GUI

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
import csharp.System.Collections.Generic.`List$1`
import csharp.UnityEditor.Editor
import csharp.UnityEditor.IPreviewable
import csharp.UnityEditor.IToolModeOwner
import csharp.System.Type
import csharp.UnityEditor.SerializedProperty
import csharp.System.Object
import csharp.UnityEngine.Rect
import csharp.System.Action
import csharp.UnityEngine.Object as _csharp_CSharp_UnityEngine_Object
import csharp.System.`Array$1`
import csharp.System.`Action$1`
import csharp.TSProperties.ResultPair
import csharp.UnityEngine.GUIContent

external open class TSProperties_CustomEditor : Editor, IPreviewable, IToolModeOwner {
    override var `var`: Any
    open val drawInfo: Any
    open fun GetElements(): `List$1`<Element>
}

external open class DrawerInfo : Object {
    open var `var`: Any
    open var element: Any
    open var serializedObject: Any
    open fun GetOptionsName(`$type`: Type): String
    open fun UpdateProperties()
    open fun ApplyModifiedProperties()
    open fun GetSerializedProperty(`$name`: String): SerializedProperty
}

external open class Element : Object {
    constructor(`$node`: SerializedProperty, `$pairType`: Type)
    constructor(`$node`: SerializedProperty, `$pairType`: Type, `$arrayIndex`: Number, `$arrayParent`: SerializedProperty)
    constructor()
    open var `var`: Any
    open val type: Any
    open val valueType: Any
    open val arrayIndex: Any
    open val arrayParent: Any
    open val node: Any
    open val keyNode: Any
    open val indexNode: Any
    open val valueNode: Any
    open var key: Any
    open var index: Any
    open fun DeleteCommand()
    open fun Clean()
}

external open class Display : Object {
    constructor(`$drawInfo`: DrawerInfo)
    constructor()
    open fun Draw(`$position`: Rect, `$element`: Element)
    open fun GetHeight(`$element`: Element): Number
}

external open class DisplayUtility : Object {
    companion object {
        fun PopupCreate(`$info`: DrawerInfo, `$index`: Number, `$callback`: Action = definedExternally)
        fun PopupTypes(`$info`: DrawerInfo, `$element`: Element)
        fun PopupComponentsAndTypes(`$info`: DrawerInfo, `$element`: Element, `$obj`: _csharp_CSharp_UnityEngine_Object, `$targetType`: Type)
        fun PopupComponents(`$info`: DrawerInfo, `$node`: SerializedProperty, `$obj`: _csharp_CSharp_UnityEngine_Object, `$targetType`: Type)
        fun PopupArrayComponents(`$info`: DrawerInfo, `$arrayParent`: SerializedProperty, `$targetType`: Type)
        fun CheckKeyValidity(`$name`: String): Boolean
        fun CheckFields(`$type`: Type): Boolean
        fun Copy(`$from`: Element, `$to`: Element)
        fun Copy(`$fromNode`: SerializedProperty, `$toNode`: SerializedProperty, `$targetType`: Type)
        fun CustomMenu(`$options`: `Array$1`<String>, `$separator`: `Array$1`<String>, `$selected`: `Array$1`<Number>, `$disabled`: `Array$1`<Number>, `$callback`: `Action$1`<Number>)
        fun GenCode(`$pairs`: `Array$1`<ResultPair>, `$declareType`: String, `$useFullname`: Boolean): String
        fun PraseCode(`$editor`: TSProperties_CustomEditor, `$code`: String)
    }
}

external open class Drawer : Object {
    open var `var`: Any
    open var element: Any
    open var drawInfo: Any
    open fun Draw(`$position`: Rect, `$label`: GUIContent)
    open fun GetLineHeight(): Number
    open fun GetHeight(): Number
}

external open class ArrayDrawer : Drawer