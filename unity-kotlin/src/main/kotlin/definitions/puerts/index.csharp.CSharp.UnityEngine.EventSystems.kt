@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEngine.EventSystems")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEngine.EventSystems

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
import csharp.UnityEngine.MonoBehaviour
import csharp.System.Object
import csharp.System.ValueType

external open class UIBehaviour : MonoBehaviour {
    open fun IsActive(): Boolean
    open fun IsDestroyed(): Boolean
}

external interface IEventSystemHandler

external interface IPointerEnterHandler : IEventSystemHandler

external interface ISelectHandler : IEventSystemHandler

external interface IPointerExitHandler : IEventSystemHandler

external interface IDeselectHandler : IEventSystemHandler

external interface IPointerDownHandler : IEventSystemHandler

external interface IPointerUpHandler : IEventSystemHandler

external interface IMoveHandler : IEventSystemHandler

external open class AxisEventData : BaseEventData

external open class BaseEventData : AbstractEventData

external open class AbstractEventData : Object

external open class PointerEventData : BaseEventData

external interface ISubmitHandler : IEventSystemHandler

external interface IPointerClickHandler : IEventSystemHandler

external interface IBeginDragHandler : IEventSystemHandler

external interface IDragHandler : IEventSystemHandler

external interface IEndDragHandler : IEventSystemHandler

external interface IUpdateSelectedHandler : IEventSystemHandler

external interface ICancelHandler : IEventSystemHandler

external open class BaseRaycaster : UIBehaviour

external open class RaycastResult : ValueType

external interface IInitializePotentialDragHandler : IEventSystemHandler

external interface IScrollHandler : IEventSystemHandler