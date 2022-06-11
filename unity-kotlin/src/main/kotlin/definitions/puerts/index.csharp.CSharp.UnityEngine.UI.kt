@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEngine.UI")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEngine.UI

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
import csharp.UnityEngine.Vector3
import csharp.UnityEngine.EventSystems.AxisEventData
import csharp.UnityEngine.EventSystems.PointerEventData
import csharp.UnityEngine.EventSystems.BaseEventData
import csharp.UnityEngine.EventSystems.UIBehaviour
import csharp.UnityEngine.EventSystems.IEventSystemHandler
import csharp.UnityEngine.EventSystems.IPointerEnterHandler
import csharp.UnityEngine.EventSystems.ISelectHandler
import csharp.UnityEngine.EventSystems.IPointerExitHandler
import csharp.UnityEngine.EventSystems.IDeselectHandler
import csharp.UnityEngine.EventSystems.IPointerDownHandler
import csharp.UnityEngine.EventSystems.IPointerUpHandler
import csharp.UnityEngine.EventSystems.IMoveHandler
import csharp.System.`Array$1`
import csharp.System.ValueType
import csharp.System.`IEquatable$1`
import csharp.System.Object
import csharp.UnityEngine.Vector2
import csharp.UnityEngine.Camera
import csharp.UnityEngine.Rect
import csharp.UnityEngine.Color
import csharp.UnityEngine.Events.UnityAction
import csharp.UnityEngine.Transform
import csharp.UnityEngine.ICanvasRaycastFilter
import csharp.UnityEngine.ISerializationCallbackReceiver
import csharp.UnityEngine.Material
import csharp.UnityEngine.Events.`UnityEvent$1`
import csharp.UnityEngine.GameObject
import csharp.UnityEngine.RectTransform
import csharp.UnityEngine.Events.UnityEvent
import csharp.UnityEngine.EventSystems.ISubmitHandler
import csharp.UnityEngine.EventSystems.IPointerClickHandler
import csharp.UnityEngine.Event
import csharp.UnityEngine.EventSystems.IBeginDragHandler
import csharp.UnityEngine.EventSystems.IDragHandler
import csharp.UnityEngine.EventSystems.IEndDragHandler
import csharp.UnityEngine.EventSystems.IUpdateSelectedHandler
import csharp.UnityEngine.TextGenerationSettings
import csharp.UnityEngine.TextAnchor
import csharp.System.Collections.Generic.`IEnumerable$1`
import csharp.System.Collections.Generic.`List$1`
import csharp.`$Ref`
import csharp.UnityEngine.UI.Dropdown.OptionData
import csharp.UnityEngine.Sprite
import csharp.UnityEngine.EventSystems.ICancelHandler
import csharp.UnityEngine.EventSystems.BaseRaycaster
import csharp.UnityEngine.Canvas
import csharp.System.Collections.Generic.`IList$1`
import csharp.System.`Func$2`
import csharp.UnityEngine.Component

import csharp.UnityEngine.EventSystems.IInitializePotentialDragHandler
import csharp.UnityEngine.EventSystems.IScrollHandler
//import csharp.UnityEngine.UI.Slider.Direction as _csharp_CSharp_UnityEngine_UI_Slider_Direction
import csharp.UnityEngine.Rendering.StencilOp
import csharp.UnityEngine.Rendering.CompareFunction
import csharp.UnityEngine.Rendering.ColorWriteMask
import csharp.UnityEngine.Mesh
import csharp.UnityEngine.UIVertex
import csharp.UnityEngine.Color32
import csharp.UnityEngine.Vector4
import csharp.System.IDisposable

external open class Selectable : UIBehaviour, IEventSystemHandler, IPointerEnterHandler, ISelectHandler, IPointerExitHandler, IDeselectHandler, IPointerDownHandler, IPointerUpHandler, IMoveHandler {
    override var `var`: Any
    open var navigation: Any
    open var transition: Any
    open var colors: Any
    open var spriteState: Any
    open var animationTriggers: Any
    open var targetGraphic: Any
    open var interactable: Any
    open var image: Any
    open val animator: Any
    open fun IsInteractable(): Boolean
    open fun FindSelectable(`$dir`: Vector3): Selectable
    open fun FindSelectableOnLeft(): Selectable
    open fun FindSelectableOnRight(): Selectable
    open fun FindSelectableOnUp(): Selectable
    open fun FindSelectableOnDown(): Selectable
    open fun OnMove(`$eventData`: AxisEventData)
    open fun OnPointerDown(`$eventData`: PointerEventData)
    open fun OnPointerUp(`$eventData`: PointerEventData)
    open fun OnPointerEnter(`$eventData`: PointerEventData)
    open fun OnPointerExit(`$eventData`: PointerEventData)
    open fun OnSelect(`$eventData`: BaseEventData)
    open fun OnDeselect(`$eventData`: BaseEventData)
    open fun Select()

    companion object {
        fun AllSelectablesNoAlloc(`$selectables`: `Array$1`<Selectable>): Number
    }
}

external open class Navigation : ValueType, `IEquatable$1`<Navigation> {
    open var `var`: Any
    open var mode: Any
    open var wrapAround: Any
    open var selectOnUp: Any
    open var selectOnDown: Any
    open var selectOnLeft: Any
    open var selectOnRight: Any
    open fun Equals(`$other`: Navigation): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class ColorBlock : ValueType, `IEquatable$1`<ColorBlock> {
    open var `var`: Any
    open var normalColor: Any
    open var highlightedColor: Any
    open var pressedColor: Any
    open var selectedColor: Any
    open var disabledColor: Any
    open var colorMultiplier: Any
    open var fadeDuration: Any
    override fun Equals(`$obj`: Any): Boolean
    open fun Equals(`$other`: ColorBlock): Boolean

    companion object {
        var defaultColorBlock: ColorBlock
        fun op_Equality(`$point1`: ColorBlock, `$point2`: ColorBlock): Boolean
        fun op_Inequality(`$point1`: ColorBlock, `$point2`: ColorBlock): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class SpriteState : ValueType, `IEquatable$1`<SpriteState> {
    open var `var`: Any
    open var highlightedSprite: Any
    open var pressedSprite: Any
    open var selectedSprite: Any
    open var disabledSprite: Any
    open fun Equals(`$other`: SpriteState): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class AnimationTriggers : Object {
    open var `var`: Any
    open var normalTrigger: Any
    open var highlightedTrigger: Any
    open var pressedTrigger: Any
    open var selectedTrigger: Any
    open var disabledTrigger: Any
}

external open class Graphic : UIBehaviour, ICanvasElement {
    override var `var`: Any
    open var color: Any
    open var raycastTarget: Any
    open val depth: Any
    open val rectTransform: RectTransform
    open val canvas: Any
    open val canvasRenderer: Any
    open val defaultMaterial: Any
    open var material: Any
    open val materialForRendering: Any
    open val mainTexture: Any
    open fun SetAllDirty()
    open fun SetLayoutDirty()
    open fun SetVerticesDirty()
    open fun SetMaterialDirty()
    open fun OnCullingChanged()
    override fun Rebuild(`$update`: CanvasUpdate)
    override fun LayoutComplete()
    override fun GraphicUpdateComplete()
    open fun OnRebuildRequested()
    open fun SetNativeSize()
    open fun Raycast(`$sp`: Vector2, `$eventCamera`: Camera): Boolean
    open fun PixelAdjustPoint(`$point`: Vector2): Vector2
    open fun GetPixelAdjustedRect(): Rect
    open fun CrossFadeColor(`$targetColor`: Color, `$duration`: Number, `$ignoreTimeScale`: Boolean, `$useAlpha`: Boolean)
    open fun CrossFadeColor(`$targetColor`: Color, `$duration`: Number, `$ignoreTimeScale`: Boolean, `$useAlpha`: Boolean, `$useRGB`: Boolean)
    open fun CrossFadeAlpha(`$alpha`: Number, `$duration`: Number, `$ignoreTimeScale`: Boolean)
    open fun RegisterDirtyLayoutCallback(`$action`: UnityAction)
    open fun UnregisterDirtyLayoutCallback(`$action`: UnityAction)
    open fun RegisterDirtyVerticesCallback(`$action`: UnityAction)
    open fun UnregisterDirtyVerticesCallback(`$action`: UnityAction)
    open fun RegisterDirtyMaterialCallback(`$action`: UnityAction)
    open fun UnregisterDirtyMaterialCallback(`$action`: UnityAction)
}

external interface ICanvasElement {
    val transform: Transform
    fun Rebuild(`$executing`: CanvasUpdate)
    fun LayoutComplete()
    fun GraphicUpdateComplete()
    fun IsDestroyed(): Boolean
}

external open class Image : MaskableGraphic, IMaterialModifier, IMaskable, ICanvasRaycastFilter, ICanvasElement, ISerializationCallbackReceiver, ILayoutElement, IClippable {
    override var `var`: Any
    open var sprite: Any
    open var overrideSprite: Any
    open var type: Any
    open var preserveAspect: Any
    open var fillCenter: Any
    open var fillMethod: Any
    open var fillAmount: Any
    open var fillClockwise: Any
    open var fillOrigin: Any
    open var alphaHitTestMinimumThreshold: Any
    open var useSpriteMesh: Any
    override val mainTexture: Any
    open val hasBorder: Any
    open var pixelsPerUnitMultiplier: Any
    open val pixelsPerUnit: Any
    override var material: Any
    override var minWidth: Number
    override var preferredWidth: Number
    override var flexibleWidth: Number
    override var minHeight: Number
    override var preferredHeight: Number
    override var flexibleHeight: Number
    override var layoutPriority: Number
    open fun DisableSpriteOptimizations()
    override fun OnBeforeSerialize()
    override fun OnAfterDeserialize()
    override fun CalculateLayoutInputHorizontal()
    override fun CalculateLayoutInputVertical()
    override fun IsRaycastLocationValid(`$screenPoint`: Vector2, `$eventCamera`: Camera): Boolean
}

external open class MaskableGraphic : Graphic, IMaterialModifier, IMaskable, ICanvasElement, IClippable {
    override var `var`: Any
    open var onCullStateChanged: Any
    open var maskable: Any
    open var isMaskingGraphic: Any
    override fun GetModifiedMaterial(`$baseMaterial`: Material): Material
    override fun Cull(`$clipRect`: Rect, `$validRect`: Boolean)
    override fun SetClipRect(`$clipRect`: Rect, `$validRect`: Boolean)
    override fun SetClipSoftness(`$clipSoftness`: Vector2)
    override fun RecalculateClipping()
    override fun RecalculateMasking()
    open class CullStateChangedEvent : `UnityEvent$1`<Boolean>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
}

external interface IMaterialModifier {
    fun GetModifiedMaterial(`$baseMaterial`: Material): Material
}

external interface IMaskable {
    fun RecalculateMasking()
}

external interface IClippable {
    var gameObject: GameObject
    val rectTransform: Transform //RectTransform
    fun RecalculateClipping()
    fun Cull(`$clipRect`: Rect, `$validRect`: Boolean)
    fun SetClipRect(`$value`: Rect, `$validRect`: Boolean)
    fun SetClipSoftness(`$clipSoftness`: Vector2)
}

external interface ILayoutElement {
    var minWidth: Number
    var preferredWidth: Number
    var flexibleWidth: Number
    var minHeight: Number
    var preferredHeight: Number
    var flexibleHeight: Number
    var layoutPriority: Number
    fun CalculateLayoutInputHorizontal()
    fun CalculateLayoutInputVertical()
}

external open class Button : Selectable, IEventSystemHandler, IPointerEnterHandler, ISelectHandler, IPointerExitHandler, IDeselectHandler, IPointerDownHandler, IPointerUpHandler, IMoveHandler, ISubmitHandler, IPointerClickHandler {
    override var `var`: Any
    open var onClick: Any
    open fun OnPointerClick(`$eventData`: PointerEventData)
    open fun OnSubmit(`$eventData`: BaseEventData)
    open class ButtonClickedEvent : UnityEvent, ISerializationCallbackReceiver
}

external open class InputField : Selectable, IBeginDragHandler, IDragHandler, IEndDragHandler, ICanvasElement, IEventSystemHandler, IPointerEnterHandler, IUpdateSelectedHandler, ISelectHandler, IPointerExitHandler, IDeselectHandler, IPointerDownHandler, IPointerUpHandler, IMoveHandler, ILayoutElement, ISubmitHandler, IPointerClickHandler {
    override var `var`: Any
    open var shouldHideMobileInput: Any
    open var shouldActivateOnSelect: Any
    open var text: Any
    open val isFocused: Any
    open var caretBlinkRate: Any
    open var caretWidth: Any
    open var textComponent: Any
    open var placeholder: Any
    open var caretColor: Any
    open var customCaretColor: Any
    open var selectionColor: Any
    open var onEndEdit: Any
    open var onSubmit: Any
    open var onValueChanged: Any
    open var onValidateInput: Any
    open var characterLimit: Any
    open var contentType: Any
    open var lineType: Any
    open var inputType: Any
    open val touchScreenKeyboard: Any
    open var keyboardType: Any
    open var characterValidation: Any
    open var readOnly: Any
    open val multiLine: Any
    open var asteriskChar: Any
    open val wasCanceled: Any
    open var caretPosition: Any
    open var selectionAnchorPosition: Any
    open var selectionFocusPosition: Any
    override var minWidth: Number
    override var preferredWidth: Number
    override var flexibleWidth: Number
    override var minHeight: Number
    override var preferredHeight: Number
    override var flexibleHeight: Number
    override var layoutPriority: Number
    open fun SetTextWithoutNotify(`$input`: String)
    open fun MoveTextEnd(`$shift`: Boolean)
    open fun MoveTextStart(`$shift`: Boolean)
    open fun OnBeginDrag(`$eventData`: PointerEventData)
    open fun OnDrag(`$eventData`: PointerEventData)
    open fun OnEndDrag(`$eventData`: PointerEventData)
    open fun ProcessEvent(`$e`: Event)
    open fun OnUpdateSelected(`$eventData`: BaseEventData)
    open fun ForceLabelUpdate()
    override fun Rebuild(`$update`: CanvasUpdate)
    override fun LayoutComplete()
    override fun GraphicUpdateComplete()
    open fun ActivateInputField()
    open fun OnPointerClick(`$eventData`: PointerEventData)
    open fun DeactivateInputField()
    open fun OnSubmit(`$eventData`: BaseEventData)
    override fun CalculateLayoutInputHorizontal()
    override fun CalculateLayoutInputVertical()
    open class EndEditEvent : `UnityEvent$1`<String>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
    open class SubmitEvent : `UnityEvent$1`<String>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
    open class OnChangeEvent : `UnityEvent$1`<String>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
    interface OnValidateInput {
        @nativeInvoke
        operator fun invoke(text: String, charIndex: Number, addedChar: Number): Number
        var Invoke: ((text: String, charIndex: Number, addedChar: Number) -> Number)?
            get() = definedExternally
            set(value) = definedExternally
    }
}

external open class Text : MaskableGraphic, IMaterialModifier, IMaskable, ICanvasElement, ILayoutElement, IClippable {
    override var `var`: Any
    open val cachedTextGenerator: Any
    open val cachedTextGeneratorForLayout: Any
    override val mainTexture: Any
    open var font: Any
    open var text: Any
    open var supportRichText: Any
    open var resizeTextForBestFit: Any
    open var resizeTextMinSize: Any
    open var resizeTextMaxSize: Any
    open var alignment: Any
    open var alignByGeometry: Any
    open var fontSize: Any
    open var horizontalOverflow: Any
    open var verticalOverflow: Any
    open var lineSpacing: Any
    open var fontStyle: Any
    open val pixelsPerUnit: Any
    override var minWidth: Number
    override var preferredWidth: Number
    override var flexibleWidth: Number
    override var minHeight: Number
    override var preferredHeight: Number
    override var flexibleHeight: Number
    override var layoutPriority: Number
    open fun FontTextureChanged()
    open fun GetGenerationSettings(`$extents`: Vector2): TextGenerationSettings
    override fun CalculateLayoutInputHorizontal()
    override fun CalculateLayoutInputVertical()

    companion object {
        fun GetTextAnchorPivot(`$anchor`: TextAnchor): Vector2
    }
}

external enum class CanvasUpdate {
    Prelayout /* = 0 */,
    Layout /* = 1 */,
    PostLayout /* = 2 */,
    PreRender /* = 3 */,
    LatePreRender /* = 4 */,
    MaxUpdateValue /* = 5 */
}

external open class Toggle : Selectable, ICanvasElement, IEventSystemHandler, IPointerEnterHandler, ISelectHandler, IPointerExitHandler, IDeselectHandler, IPointerDownHandler, IPointerUpHandler, IMoveHandler, ISubmitHandler, IPointerClickHandler {
    //open var toggleTransition: ToggleTransition
    open var graphic: Graphic
    open var onValueChanged: ToggleEvent
    override var `var`: Any
    open var group: Any
    open var isOn: Any
    override fun Rebuild(`$executing`: CanvasUpdate)
    override fun LayoutComplete()
    override fun GraphicUpdateComplete()
    open fun SetIsOnWithoutNotify(`$value`: Boolean)
    open fun OnPointerClick(`$eventData`: PointerEventData)
    open fun OnSubmit(`$eventData`: BaseEventData)
    open class ToggleEvent : `UnityEvent$1`<Boolean>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
}

external open class ToggleGroup : UIBehaviour {
    override var `var`: Any
    open var allowSwitchOff: Any
    open fun NotifyToggleOn(`$toggle`: Toggle, `$sendCallback`: Boolean = definedExternally)
    open fun UnregisterToggle(`$toggle`: Toggle)
    open fun RegisterToggle(`$toggle`: Toggle)
    open fun EnsureValidState()
    open fun AnyTogglesOn(): Boolean
    open fun ActiveToggles(): `IEnumerable$1`<Toggle>
    open fun GetFirstActiveToggle(): Toggle
    open fun SetAllTogglesOff(`$sendCallback`: Boolean = definedExternally)
}

external open class CanvasUpdateRegistry : Object {
    companion object {
        fun RegisterCanvasElementForLayoutRebuild(`$element`: ICanvasElement)
        fun TryRegisterCanvasElementForLayoutRebuild(`$element`: ICanvasElement): Boolean
        fun RegisterCanvasElementForGraphicRebuild(`$element`: ICanvasElement)
        fun TryRegisterCanvasElementForGraphicRebuild(`$element`: ICanvasElement): Boolean
        fun UnRegisterCanvasElementForRebuild(`$element`: ICanvasElement)
        fun IsRebuildingLayout(): Boolean
        fun IsRebuildingGraphics(): Boolean
    }
}

external open class ClipperRegistry : Object {
    open fun Cull()

    companion object {
        fun Register(`$c`: IClipper)
        fun Unregister(`$c`: IClipper)
    }
}

external interface IClipper {
    fun PerformClipping()
}

external open class Clipping : Object {
    companion object {
        fun FindCullAndClipWorldRect(`$rectMaskParents`: `List$1`<RectMask2D>, `$validRect`: `$Ref`<Boolean>): Rect
    }
}

external open class RectMask2D : UIBehaviour, ICanvasRaycastFilter, IClipper {
    override var `var`: Any
    open val canvasRect: Any
    open val rectTransform: Any
    override fun IsRaycastLocationValid(`$sp`: Vector2, `$eventCamera`: Camera): Boolean
    override fun PerformClipping()
    open fun UpdateClipSoftness()
    open fun AddClippable(`$clippable`: IClippable)
    open fun RemoveClippable(`$clippable`: IClippable)
}

external open class Dropdown : Selectable, ICancelHandler, IEventSystemHandler, IPointerEnterHandler, ISelectHandler, IPointerExitHandler, IDeselectHandler, IPointerDownHandler, IPointerUpHandler, IMoveHandler, ISubmitHandler, IPointerClickHandler {
    override var `var`: Any
    open var template: Any
    open var captionText: Any
    open var captionImage: Any
    open var itemText: Any
    open var itemImage: Any
    open var onValueChanged: Any
    open var alphaFadeSpeed: Any
    open var value: Any
    open fun SetValueWithoutNotify(`$input`: Number)
    open fun RefreshShownValue()
    open fun AddOptions(`$options`: `List$1`<OptionData>)
    open fun AddOptions(`$options`: `List$1`<String>)
    open fun AddOptions(`$options`: `List$1`<Sprite>)
    open fun ClearOptions()
    open fun OnPointerClick(`$eventData`: PointerEventData)
    open fun OnSubmit(`$eventData`: BaseEventData)
    open fun OnCancel(`$eventData`: BaseEventData)
    open fun Show()
    open fun Hide()
    open class OptionData : Object {
        constructor()
        constructor(`$text`: String)
        constructor(`$image`: Sprite)
        constructor(`$text`: String, `$image`: Sprite)
        open var `var`: Any
        open var text: Any
        open var image: Any
    }
    open class DropdownEvent : `UnityEvent$1`<Number>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
    open class OptionDataList : Object
}

external open class FontData : Object, ISerializationCallbackReceiver {
    open var `var`: Any
    open var font: Any
    open var fontSize: Any
    open var fontStyle: Any
    open var bestFit: Any
    open var minSize: Any
    open var maxSize: Any
    open var alignment: Any
    open var alignByGeometry: Any
    open var richText: Any
    open var horizontalOverflow: Any
    open var verticalOverflow: Any
    open var lineSpacing: Any
    override fun OnBeforeSerialize()
    override fun OnAfterDeserialize()
}

external open class FontUpdateTracker : Object {
    companion object {
        fun TrackText(`$t`: Text)
        fun UntrackText(`$t`: Text)
    }
}

external open class GraphicRaycaster : BaseRaycaster {
    override var `var`: Any
    open val sortOrderPriority: Any
    open val renderOrderPriority: Any
    open var ignoreReversedGraphics: Any
    open var blockingObjects: Any
    open var blockingMask: Any
    open val eventCamera: Any
}

external open class GraphicRegistry : Object {
    companion object {
        fun RegisterGraphicForCanvas(`$c`: Canvas, `$graphic`: Graphic)
        fun RegisterRaycastGraphicForCanvas(`$c`: Canvas, `$graphic`: Graphic)
        fun UnregisterGraphicForCanvas(`$c`: Canvas, `$graphic`: Graphic)
        fun UnregisterRaycastGraphicForCanvas(`$c`: Canvas, `$graphic`: Graphic)
        fun GetGraphicsForCanvas(`$canvas`: Canvas): `IList$1`<Graphic>
        fun GetRaycastableGraphicsForCanvas(`$canvas`: Canvas): `IList$1`<Graphic>
    }
}

external open class AspectRatioFitter : UIBehaviour, ILayoutSelfController, ILayoutController {
    override var `var`: Any
    open var aspectMode: Any
    open var aspectRatio: Any
    override fun SetLayoutHorizontal()
    override fun SetLayoutVertical()
    open fun IsComponentValidOnObject(): Boolean
    open fun IsAspectModeValid(): Boolean
}

external interface ILayoutSelfController : ILayoutController {
    override fun SetLayoutHorizontal()
    override fun SetLayoutVertical()
}

external interface ILayoutController {
    fun SetLayoutHorizontal()
    fun SetLayoutVertical()
}

external open class CanvasScaler : UIBehaviour {
    override var `var`: Any
    open var uiScaleMode: Any
    open var referencePixelsPerUnit: Any
    open var scaleFactor: Any
    open var screenMatchMode: Any
    open var matchWidthOrHeight: Any
    open var physicalUnit: Any
    open var fallbackScreenDPI: Any
    open var defaultSpriteDPI: Any
    open var dynamicPixelsPerUnit: Any
}

external open class ContentSizeFitter : UIBehaviour, ILayoutSelfController, ILayoutController {
    override var `var`: Any
    open var horizontalFit: Any
    open var verticalFit: Any
    override fun SetLayoutHorizontal()
    override fun SetLayoutVertical()
}

external open class GridLayoutGroup : LayoutGroup, ILayoutGroup, ILayoutElement, ILayoutController {
    override var `var`: Any
    open var startCorner: Any
    open var startAxis: Any
    open var constraint: Any
    open var constraintCount: Any
}

external open class LayoutGroup : UIBehaviour, ILayoutGroup, ILayoutElement, ILayoutController {
    override var `var`: Any
    open var padding: Any
    open var childAlignment: Any
    override var minWidth: Number
    override var preferredWidth: Number
    override var flexibleWidth: Number
    override var minHeight: Number
    override var preferredHeight: Number
    override var flexibleHeight: Number
    override var layoutPriority: Number
    override fun CalculateLayoutInputHorizontal()
    override fun CalculateLayoutInputVertical()
    override fun SetLayoutHorizontal()
    override fun SetLayoutVertical()
}

external interface ILayoutGroup : ILayoutController {
    override fun SetLayoutHorizontal()
    override fun SetLayoutVertical()
}

external open class HorizontalLayoutGroup : HorizontalOrVerticalLayoutGroup, ILayoutGroup, ILayoutElement, ILayoutController

external open class HorizontalOrVerticalLayoutGroup : LayoutGroup, ILayoutGroup, ILayoutElement, ILayoutController {
    override var `var`: Any
    open var spacing: Any
    open var childForceExpandWidth: Any
    open var childForceExpandHeight: Any
    open var childControlWidth: Any
    open var childControlHeight: Any
    open var childScaleWidth: Any
    open var childScaleHeight: Any
    open var reverseArrangement: Any
}

external interface ILayoutIgnorer {
    var ignoreLayout: Boolean
}

external open class LayoutElement : UIBehaviour, ILayoutIgnorer, ILayoutElement {
    override var `var`: Any
    override var ignoreLayout: Boolean
    override var minWidth: Number
    override var minHeight: Number
    override var preferredWidth: Number
    override var preferredHeight: Number
    override var flexibleWidth: Number
    override var flexibleHeight: Number
    override var layoutPriority: Number
    override fun CalculateLayoutInputHorizontal()
    override fun CalculateLayoutInputVertical()
}

external open class LayoutRebuilder : Object, ICanvasElement {
    open var `var`: Any
    override val transform: Transform
    override fun IsDestroyed(): Boolean
    override fun Rebuild(`$executing`: CanvasUpdate)
    override fun LayoutComplete()
    override fun GraphicUpdateComplete()

    companion object {
        fun ForceRebuildLayoutImmediate(`$layoutRoot`: RectTransform)
        fun MarkLayoutForRebuild(`$rect`: RectTransform)
    }
}

external open class LayoutUtility : Object {
    companion object {
        fun GetMinSize(`$rect`: RectTransform, `$axis`: Number): Number
        fun GetPreferredSize(`$rect`: RectTransform, `$axis`: Number): Number
        fun GetFlexibleSize(`$rect`: RectTransform, `$axis`: Number): Number
        fun GetMinWidth(`$rect`: RectTransform): Number
        fun GetPreferredWidth(`$rect`: RectTransform): Number
        fun GetFlexibleWidth(`$rect`: RectTransform): Number
        fun GetMinHeight(`$rect`: RectTransform): Number
        fun GetPreferredHeight(`$rect`: RectTransform): Number
        fun GetFlexibleHeight(`$rect`: RectTransform): Number
        fun GetLayoutProperty(`$rect`: RectTransform, `$property`: `Func$2`<ILayoutElement, Number>, `$defaultValue`: Number): Number
        fun GetLayoutProperty(`$rect`: RectTransform, `$property`: `Func$2`<ILayoutElement, Number>, `$defaultValue`: Number, `$source`: `$Ref`<ILayoutElement>): Number
    }
}

external open class VerticalLayoutGroup : HorizontalOrVerticalLayoutGroup, ILayoutGroup, ILayoutElement, ILayoutController

external open class Mask : UIBehaviour, IMaterialModifier, ICanvasRaycastFilter {
    override var `var`: Any
    open val rectTransform: Any
    open var showMaskGraphic: Any
    open val graphic: Any
    open fun MaskEnabled(): Boolean
    override fun IsRaycastLocationValid(`$sp`: Vector2, `$eventCamera`: Camera): Boolean
    override fun GetModifiedMaterial(`$baseMaterial`: Material): Material
}

external open class MaskUtilities : Object {
    companion object {
        fun Notify2DMaskStateChanged(`$mask`: Component)
        fun NotifyStencilStateChanged(`$mask`: Component)
        fun FindRootSortOverrideCanvas(`$start`: Transform): Transform
        fun GetStencilDepth(`$transform`: Transform, `$stopAfter`: Transform): Number
        fun IsDescendantOrSelf(`$father`: Transform, `$child`: Transform): Boolean
        fun GetRectMaskForClippable(`$clippable`: IClippable): RectMask2D
        fun GetRectMasksForClip(`$clipper`: RectMask2D, `$masks`: `List$1`<RectMask2D>)
    }
}

external open class RawImage : MaskableGraphic, IMaterialModifier, IMaskable, ICanvasElement, IClippable {
    override var `var`: Any
    override val mainTexture: Any
    open var texture: Any
    open var uvRect: Any
}

external open class Scrollbar : Selectable, IBeginDragHandler, IInitializePotentialDragHandler, IDragHandler, ICanvasElement, IEventSystemHandler, IPointerEnterHandler, ISelectHandler, IPointerExitHandler, IDeselectHandler, IPointerDownHandler, IPointerUpHandler, IMoveHandler {
    override var `var`: Any
    open var handleRect: Any
    open var direction: Any
    open var value: Any
    open var size: Any
    open var numberOfSteps: Any
    open var onValueChanged: Any
    open fun SetValueWithoutNotify(`$input`: Number)
    override fun Rebuild(`$executing`: CanvasUpdate)
    override fun LayoutComplete()
    override fun GraphicUpdateComplete()
    open fun OnBeginDrag(`$eventData`: PointerEventData)
    open fun OnDrag(`$eventData`: PointerEventData)
    open fun OnInitializePotentialDrag(`$eventData`: PointerEventData)
    //open fun SetDirection(`$direction`: Direction, `$includeRectLayouts`: Boolean)
    open class ScrollEvent : `UnityEvent$1`<Number>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
}

external open class ScrollRect : UIBehaviour, ILayoutGroup, IBeginDragHandler, IInitializePotentialDragHandler, IDragHandler, IEndDragHandler, ICanvasElement, IEventSystemHandler, IScrollHandler, ILayoutElement, ILayoutController {
    override var `var`: Any
    open var content: Any
    open var horizontal: Any
    open var vertical: Any
    open var movementType: Any
    open var elasticity: Any
    open var inertia: Any
    open var decelerationRate: Any
    open var scrollSensitivity: Any
    open var viewport: Any
    open var horizontalScrollbar: Any
    open var verticalScrollbar: Any
    open var horizontalScrollbarVisibility: Any
    open var verticalScrollbarVisibility: Any
    open var horizontalScrollbarSpacing: Any
    open var verticalScrollbarSpacing: Any
    open var onValueChanged: Any
    open var horizontalNormalizedPosition: Any
    open var verticalNormalizedPosition: Any
    override var minWidth: Number
    override var preferredWidth: Number
    override var flexibleWidth: Number
    override var minHeight: Number
    override var preferredHeight: Number
    override var flexibleHeight: Number
    override var layoutPriority: Number
    override fun Rebuild(`$executing`: CanvasUpdate)
    override fun LayoutComplete()
    override fun GraphicUpdateComplete()
    open fun StopMovement()
    open fun OnScroll(`$data`: PointerEventData)
    open fun OnInitializePotentialDrag(`$eventData`: PointerEventData)
    open fun OnBeginDrag(`$eventData`: PointerEventData)
    open fun OnEndDrag(`$eventData`: PointerEventData)
    open fun OnDrag(`$eventData`: PointerEventData)
    override fun CalculateLayoutInputHorizontal()
    override fun CalculateLayoutInputVertical()
    override fun SetLayoutHorizontal()
    override fun SetLayoutVertical()
    open class ScrollRectEvent : `UnityEvent$1`<Vector2>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
}

external open class Slider : Selectable, IInitializePotentialDragHandler, IDragHandler, ICanvasElement, IEventSystemHandler, IPointerEnterHandler, ISelectHandler, IPointerExitHandler, IDeselectHandler, IPointerDownHandler, IPointerUpHandler, IMoveHandler {
    override var `var`: Any
    open var fillRect: Any
    open var handleRect: Any
    open var direction: Any
    open var minValue: Any
    open var maxValue: Any
    open var wholeNumbers: Any
    open var value: Any
    open var normalizedValue: Any
    open var onValueChanged: Any
    open fun SetValueWithoutNotify(`$input`: Number)
    override fun Rebuild(`$executing`: CanvasUpdate)
    override fun LayoutComplete()
    override fun GraphicUpdateComplete()
    open fun OnDrag(`$eventData`: PointerEventData)
    open fun OnInitializePotentialDrag(`$eventData`: PointerEventData)
    //open fun SetDirection(`$direction`: _csharp_CSharp_UnityEngine_UI_Slider_Direction, `$includeRectLayouts`: Boolean)
    open class SliderEvent : `UnityEvent$1`<Number>, ISerializationCallbackReceiver {
        override fun OnBeforeSerialize()
        override fun OnAfterDeserialize()
    }
}

external open class StencilMaterial : Object {
    companion object {
        fun Add(`$baseMat`: Material, `$stencilID`: Number, `$operation`: StencilOp, `$compareFunction`: CompareFunction, `$colorWriteMask`: ColorWriteMask): Material
        fun Add(`$baseMat`: Material, `$stencilID`: Number, `$operation`: StencilOp, `$compareFunction`: CompareFunction, `$colorWriteMask`: ColorWriteMask, `$readMask`: Number, `$writeMask`: Number): Material
        fun Remove(`$customMat`: Material)
        fun ClearAll()
    }
}

external open class VertexHelper : Object, IDisposable {
    constructor()
    constructor(`$m`: Mesh)
    open var `var`: Any
    open val currentVertCount: Any
    open val currentIndexCount: Any
    open fun Dispose()
    open fun Clear()
    open fun PopulateUIVertex(`$vertex`: `$Ref`<UIVertex>, `$i`: Number)
    open fun SetUIVertex(`$vertex`: UIVertex, `$i`: Number)
    open fun FillMesh(`$mesh`: Mesh)
    open fun AddVert(`$position`: Vector3, `$color`: Color32, `$uv0`: Vector4, `$uv1`: Vector4, `$uv2`: Vector4, `$uv3`: Vector4, `$normal`: Vector3, `$tangent`: Vector4)
    open fun AddVert(`$position`: Vector3, `$color`: Color32, `$uv0`: Vector4, `$uv1`: Vector4, `$normal`: Vector3, `$tangent`: Vector4)
    open fun AddVert(`$position`: Vector3, `$color`: Color32, `$uv0`: Vector4)
    open fun AddVert(`$v`: UIVertex)
    open fun AddTriangle(`$idx0`: Number, `$idx1`: Number, `$idx2`: Number)
    open fun AddUIVertexQuad(`$verts`: `Array$1`<UIVertex>)
    open fun AddUIVertexStream(`$verts`: `List$1`<UIVertex>, `$indices`: `List$1`<Number>)
    open fun AddUIVertexTriangleStream(`$verts`: `List$1`<UIVertex>)
    open fun GetUIVertexStream(`$stream`: `List$1`<UIVertex>)
}

external open class BaseMeshEffect : UIBehaviour, IMeshModifier {
    open fun ModifyMesh(`$mesh`: Mesh)
    override fun ModifyMesh(`$vh`: VertexHelper)
}

external interface IMeshModifier {
    fun ModifyMesh(`$verts`: VertexHelper)
}

external open class Outline : Shadow, IMeshModifier

external open class Shadow : BaseMeshEffect, IMeshModifier {
    override var `var`: Any
    open var effectColor: Any
    open var useGraphicAlpha: Any
}

external open class PositionAsUV1 : BaseMeshEffect, IMeshModifier