@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEngine")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEngine

import csharp.`$Ref`
import csharp.System.*
import csharp.System.Collections.Generic.*
import csharp.System.Collections.IEnumerable
import csharp.System.Collections.IEnumerator
import csharp.System.IO.Stream
import csharp.System.Runtime.InteropServices._Attribute
import csharp.System.Runtime.InteropServices._Exception
import csharp.System.Runtime.Serialization.ISerializable
import csharp.System.Text.Encoding
import csharp.Unity.Collections.`NativeArray$1`
import csharp.Unity.Collections.`NativeSlice$1`
import csharp.Unity.Jobs.JobHandle
import csharp.UnityEngine.Animations.AnimatorControllerPlayable
//import csharp.UnityEngine.Camera.GateFitMode
//import csharp.UnityEngine.Camera.MonoOrStereoscopicEye
//import csharp.UnityEngine.Camera.RenderRequestMode
//import csharp.UnityEngine.Camera.RenderRequestOutputSpace
//import csharp.UnityEngine.Camera.StereoscopicEye
import csharp.UnityEngine.Events.UnityAction
import csharp.UnityEngine.Events.`UnityAction$1`
import csharp.UnityEngine.Experimental.Rendering.DefaultFormat
import csharp.UnityEngine.Experimental.Rendering.FormatUsage
import csharp.UnityEngine.Experimental.Rendering.GraphicsFormat
import csharp.UnityEngine.Experimental.Rendering.TextureCreationFlags
//import csharp.UnityEngine.GUI.ToolbarButtonSize
import csharp.UnityEngine.GUI.WindowFunction
//import csharp.UnityEngine.GridBrushBase.FlipAxis
//import csharp.UnityEngine.GridBrushBase.RotationDirection
//import csharp.UnityEngine.GridLayout.CellLayout
//import csharp.UnityEngine.GridLayout.CellSwizzle
import csharp.UnityEngine.ParticleSystem.ColliderData
import csharp.UnityEngine.ParticleSystem.Particle
//import csharp.UnityEngine.RectTransform.Axis
//import csharp.UnityEngine.RectTransform.Edge
//import csharp.UnityEngine.ReflectionProbe.ReflectionProbeEvent
import csharp.UnityEngine.Rendering.*
import csharp.UnityEngine.SceneManagement.Scene
//import csharp.UnityEngine.ScreenCapture.StereoScreenCaptureMode
import csharp.UnityEngine.Scripting.PreserveAttribute
import csharp.UnityEngine.SocialPlatforms.*
//import csharp.UnityEngine.TextEditor.DblClickSnapping
//import csharp.UnityEngine.Texture2D.EXRFlags
//import csharp.UnityEngine.UISystemProfilerApi.SampleType
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.js.*

external open class Debug : csharp.System.Object {
    companion object {
        fun DrawLine(`$start`: Vector3, `$end`: Vector3, `$color`: Color, `$duration`: Number)
        fun DrawLine(`$start`: Vector3, `$end`: Vector3, `$color`: Color)
        fun DrawLine(`$start`: Vector3, `$end`: Vector3)
        fun DrawLine(`$start`: Vector3, `$end`: Vector3, `$color`: Color, `$duration`: Number, `$depthTest`: Boolean)
        fun DrawRay(`$start`: Vector3, `$dir`: Vector3, `$color`: Color, `$duration`: Number)
        fun DrawRay(`$start`: Vector3, `$dir`: Vector3, `$color`: Color)
        fun DrawRay(`$start`: Vector3, `$dir`: Vector3)
        fun DrawRay(`$start`: Vector3, `$dir`: Vector3, `$color`: Color, `$duration`: Number, `$depthTest`: Boolean)
        fun Break()
        fun DebugBreak()
        fun Log(`$message`: Any)
        fun Log(`$message`: Any, `$context`: Object)
        fun LogFormat(`$format`: String, vararg args: Any)
        fun LogFormat(`$context`: Object, `$format`: String, vararg args: Any)
        fun LogFormat(`$logType`: LogType, `$logOptions`: LogOption, `$context`: Object, `$format`: String, vararg args: Any)
        fun LogError(`$message`: Any)
        fun LogError(`$message`: Any, `$context`: Object)
        fun LogErrorFormat(`$format`: String, vararg args: Any)
        fun LogErrorFormat(`$context`: Object, `$format`: String, vararg args: Any)
        fun ClearDeveloperConsole()
        fun LogException(`$exception`: Exception)
        fun LogException(`$exception`: Exception, `$context`: Object)
        fun LogWarning(`$message`: Any)
        fun LogWarning(`$message`: Any, `$context`: Object)
        fun LogWarningFormat(`$format`: String, vararg args: Any)
        fun LogWarningFormat(`$context`: Object, `$format`: String, vararg args: Any)
        fun Assert(`$condition`: Boolean)
        fun Assert(`$condition`: Boolean, `$context`: Object)
        fun Assert(`$condition`: Boolean, `$message`: Any)
        fun Assert(`$condition`: Boolean, `$message`: String)
        fun Assert(`$condition`: Boolean, `$message`: Any, `$context`: Object)
        fun Assert(`$condition`: Boolean, `$message`: String, `$context`: Object)
        fun AssertFormat(`$condition`: Boolean, `$format`: String, vararg args: Any)
        fun AssertFormat(`$condition`: Boolean, `$context`: Object, `$format`: String, vararg args: Any)
        fun LogAssertion(`$message`: Any)
        fun LogAssertion(`$message`: Any, `$context`: Object)
        fun LogAssertionFormat(`$format`: String, vararg args: Any)
        fun LogAssertionFormat(`$context`: Object, `$format`: String, vararg args: Any)
    }
}

external interface ILogger : ILogHandler {
    var logHandler: ILogHandler
    var logEnabled: Boolean
    var filterLogType: LogType
    fun IsLogTypeAllowed(`$logType`: LogType): Boolean
    fun Log(`$logType`: LogType, `$message`: Any)
    fun Log(`$logType`: LogType, `$message`: Any, `$context`: Object)
    fun Log(`$logType`: LogType, `$tag`: String, `$message`: Any)
    fun Log(`$logType`: LogType, `$tag`: String, `$message`: Any, `$context`: Object)
    fun Log(`$message`: Any)
    fun Log(`$tag`: String, `$message`: Any)
    fun Log(`$tag`: String, `$message`: Any, `$context`: Object)
    fun LogWarning(`$tag`: String, `$message`: Any)
    fun LogWarning(`$tag`: String, `$message`: Any, `$context`: Object)
    fun LogError(`$tag`: String, `$message`: Any)
    fun LogError(`$tag`: String, `$message`: Any, `$context`: Object)
    fun LogFormat(`$logType`: LogType, `$format`: String, vararg args: Any)
    fun LogException(`$exception`: Exception)
    override fun LogFormat(`$logType`: LogType, `$context`: Object, `$format`: String, vararg args: Any)
    override fun LogException(`$exception`: Exception, `$context`: Object)
}

external interface ILogHandler {
    fun LogFormat(`$logType`: LogType, `$context`: Object, `$format`: String, vararg args: Any)
    fun LogException(`$exception`: Exception, `$context`: Object)
}

external open class Vector3 : ValueType, IFormattable, `IEquatable$1`<Vector3> {
    constructor(`$x`: Number, `$y`: Number, `$z`: Number)
    constructor(`$x`: Number, `$y`: Number)
    constructor()
    open var x: Number
    open var y: Number
    open var z: Number
    open var `var`: Any
    open val magnitude: Any
    open val sqrMagnitude: Any
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)
    open fun Set(`$newX`: Number, `$newY`: Number, `$newZ`: Number)
    open fun Scale(`$scale`: Vector3)
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Vector3): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun Normalize()
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String

    companion object {
        var kEpsilon: Number
        var kEpsilonNormalSqrt: Number
        fun Slerp(`$a`: Vector3, `$b`: Vector3, `$t`: Number): Vector3
        fun SlerpUnclamped(`$a`: Vector3, `$b`: Vector3, `$t`: Number): Vector3
        fun OrthoNormalize(`$normal`: `$Ref`<Vector3>, `$tangent`: `$Ref`<Vector3>)
        fun OrthoNormalize(`$normal`: `$Ref`<Vector3>, `$tangent`: `$Ref`<Vector3>, `$binormal`: `$Ref`<Vector3>)
        fun RotateTowards(`$current`: Vector3, `$target`: Vector3, `$maxRadiansDelta`: Number, `$maxMagnitudeDelta`: Number): Vector3
        fun Lerp(`$a`: Vector3, `$b`: Vector3, `$t`: Number): Vector3
        fun LerpUnclamped(`$a`: Vector3, `$b`: Vector3, `$t`: Number): Vector3
        fun MoveTowards(`$current`: Vector3, `$target`: Vector3, `$maxDistanceDelta`: Number): Vector3
        fun SmoothDamp(`$current`: Vector3, `$target`: Vector3, `$currentVelocity`: `$Ref`<Vector3>, `$smoothTime`: Number, `$maxSpeed`: Number): Vector3
        fun SmoothDamp(`$current`: Vector3, `$target`: Vector3, `$currentVelocity`: `$Ref`<Vector3>, `$smoothTime`: Number): Vector3
        fun SmoothDamp(`$current`: Vector3, `$target`: Vector3, `$currentVelocity`: `$Ref`<Vector3>, `$smoothTime`: Number, `$maxSpeed`: Number, `$deltaTime`: Number): Vector3
        fun Scale(`$a`: Vector3, `$b`: Vector3): Vector3
        fun Cross(`$lhs`: Vector3, `$rhs`: Vector3): Vector3
        fun Reflect(`$inDirection`: Vector3, `$inNormal`: Vector3): Vector3
        fun Normalize(`$value`: Vector3): Vector3
        fun Dot(`$lhs`: Vector3, `$rhs`: Vector3): Number
        fun Project(`$vector`: Vector3, `$onNormal`: Vector3): Vector3
        fun ProjectOnPlane(`$vector`: Vector3, `$planeNormal`: Vector3): Vector3
        fun Angle(`$from`: Vector3, `$to`: Vector3): Number
        fun SignedAngle(`$from`: Vector3, `$to`: Vector3, `$axis`: Vector3): Number
        fun Distance(`$a`: Vector3, `$b`: Vector3): Number
        fun ClampMagnitude(`$vector`: Vector3, `$maxLength`: Number): Vector3
        fun Magnitude(`$vector`: Vector3): Number
        fun SqrMagnitude(`$vector`: Vector3): Number
        fun Min(`$lhs`: Vector3, `$rhs`: Vector3): Vector3
        fun Max(`$lhs`: Vector3, `$rhs`: Vector3): Vector3
        fun op_Addition(`$a`: Vector3, `$b`: Vector3): Vector3
        fun op_Subtraction(`$a`: Vector3, `$b`: Vector3): Vector3
        fun op_UnaryNegation(`$a`: Vector3): Vector3
        fun op_Multiply(`$a`: Vector3, `$d`: Number): Vector3
        fun op_Multiply(`$d`: Number, `$a`: Vector3): Vector3
        fun op_Division(`$a`: Vector3, `$d`: Number): Vector3
        fun op_Equality(`$lhs`: Vector3, `$rhs`: Vector3): Boolean
        fun op_Inequality(`$lhs`: Vector3, `$rhs`: Vector3): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class Color : ValueType, IFormattable, `IEquatable$1`<Color> {
    constructor(`$r`: Number, `$g`: Number, `$b`: Number, `$a`: Number)
    constructor(`$r`: Number, `$g`: Number, `$b`: Number)
    constructor()
    open var r: Number
    open var g: Number
    open var b: Number
    open var a: Number
    open var `var`: Any
    open val grayscale: Any
    open val linear: Any
    open val gamma: Any
    open val maxColorComponent: Any
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Color): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)

    companion object {
        fun op_Addition(`$a`: Color, `$b`: Color): Color
        fun op_Subtraction(`$a`: Color, `$b`: Color): Color
        fun op_Multiply(`$a`: Color, `$b`: Color): Color
        fun op_Multiply(`$a`: Color, `$b`: Number): Color
        fun op_Multiply(`$b`: Number, `$a`: Color): Color
        fun op_Division(`$a`: Color, `$b`: Number): Color
        fun op_Equality(`$lhs`: Color, `$rhs`: Color): Boolean
        fun op_Inequality(`$lhs`: Color, `$rhs`: Color): Boolean
        fun Lerp(`$a`: Color, `$b`: Color, `$t`: Number): Color
        fun LerpUnclamped(`$a`: Color, `$b`: Color, `$t`: Number): Color
        fun op_Implicit(`$c`: Color): Vector4
        fun op_Implicit(`$v`: Vector4): Color
        fun RGBToHSV(`$rgbColor`: Color, `$H`: `$Ref`<Number>, `$S`: `$Ref`<Number>, `$V`: `$Ref`<Number>)
        fun HSVToRGB(`$H`: Number, `$S`: Number, `$V`: Number): Color
        fun HSVToRGB(`$H`: Number, `$S`: Number, `$V`: Number, `$hdr`: Boolean): Color
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class Object : csharp.System.Object {
    open var `var`: Any
    open var name: Any
    open var hideFlags: Any
    open fun GetInstanceID(): Number

    companion object {
        fun op_Implicit(`$exists`: Object): Boolean
        fun Instantiate(`$original`: Object, `$position`: Vector3, `$rotation`: Quaternion): Object
        fun Instantiate(`$original`: Object, `$position`: Vector3, `$rotation`: Quaternion, `$parent`: Transform): Object
        fun Instantiate(`$original`: Object): Object
        fun Instantiate(`$original`: Object, `$parent`: Transform): Object
        fun Instantiate(`$original`: Object, `$parent`: Transform, `$instantiateInWorldSpace`: Boolean): Object
        fun Instantiate(`$original`: Object, `$parent`: Transform, `$worldPositionStays`: Boolean): Object
        fun Destroy(`$obj`: Object, `$t`: Number)
        fun Destroy(`$obj`: Object)
        fun DestroyImmediate(`$obj`: Object, `$allowDestroyingAssets`: Boolean)
        fun DestroyImmediate(`$obj`: Object)
        fun FindObjectsOfType(`$type`: Type): `Array$1`<Object>
        fun FindObjectsOfType(`$type`: Type, `$includeInactive`: Boolean): `Array$1`<Object>
        fun DontDestroyOnLoad(`$target`: Object)
        fun FindObjectOfType(`$type`: Type): Object
        fun FindObjectOfType(`$type`: Type, `$includeInactive`: Boolean): Object
        fun op_Equality(`$x`: Object, `$y`: Object): Boolean
        fun op_Inequality(`$x`: Object, `$y`: Object): Boolean
    }
}

external enum class LogType {
    Error /* = 0 */,
    Assert /* = 1 */,
    Warning /* = 2 */,
    Log /* = 3 */,
    Exception /* = 4 */
}

external enum class LogOption {
    None /* = 0 */,
    NoStacktrace /* = 1 */
}

external open class Time : csharp.System.Object

external open class Transform : Component, IEnumerable {
    override var `var`: Any
    open var rotation: Quaternion
    open var localRotation: Any
    open var parent: Any
    open val root: Any
    open val childCount: Any
    open var hasChanged: Any
    open var hierarchyCapacity: Any
    open val hierarchyCount: Any
    open fun SetParent(`$p`: Transform)
    open fun SetParent(`$parent`: Transform, `$worldPositionStays`: Boolean)
    open fun SetPositionAndRotation(`$position`: Vector3, `$rotation`: Quaternion)
    open fun Translate(`$translation`: Vector3, `$relativeTo`: Space)
    open fun Translate(`$translation`: Vector3)
    open fun Translate(`$x`: Number, `$y`: Number, `$z`: Number, `$relativeTo`: Space)
    open fun Translate(`$x`: Number, `$y`: Number, `$z`: Number)
    open fun Translate(`$translation`: Vector3, `$relativeTo`: Transform)
    open fun Translate(`$x`: Number, `$y`: Number, `$z`: Number, `$relativeTo`: Transform)
    open fun Rotate(`$eulers`: Vector3, `$relativeTo`: Space)
    open fun Rotate(`$eulers`: Vector3)
    open fun Rotate(`$xAngle`: Number, `$yAngle`: Number, `$zAngle`: Number, `$relativeTo`: Space)
    open fun Rotate(`$xAngle`: Number, `$yAngle`: Number, `$zAngle`: Number)
    open fun Rotate(`$axis`: Vector3, `$angle`: Number, `$relativeTo`: Space)
    open fun Rotate(`$axis`: Vector3, `$angle`: Number)
    open fun RotateAround(`$point`: Vector3, `$axis`: Vector3, `$angle`: Number)
    open fun LookAt(`$target`: Transform, `$worldUp`: Vector3)
    open fun LookAt(`$target`: Transform)
    open fun LookAt(`$worldPosition`: Vector3, `$worldUp`: Vector3)
    open fun LookAt(`$worldPosition`: Vector3)
    open fun TransformDirection(`$direction`: Vector3): Vector3
    open fun TransformDirection(`$x`: Number, `$y`: Number, `$z`: Number): Vector3
    open fun InverseTransformDirection(`$direction`: Vector3): Vector3
    open fun InverseTransformDirection(`$x`: Number, `$y`: Number, `$z`: Number): Vector3
    open fun TransformVector(`$vector`: Vector3): Vector3
    open fun TransformVector(`$x`: Number, `$y`: Number, `$z`: Number): Vector3
    open fun InverseTransformVector(`$vector`: Vector3): Vector3
    open fun InverseTransformVector(`$x`: Number, `$y`: Number, `$z`: Number): Vector3
    open fun TransformPoint(`$position`: Vector3): Vector3
    open fun TransformPoint(`$x`: Number, `$y`: Number, `$z`: Number): Vector3
    open fun InverseTransformPoint(`$position`: Vector3): Vector3
    open fun InverseTransformPoint(`$x`: Number, `$y`: Number, `$z`: Number): Vector3
    open fun DetachChildren()
    open fun SetAsFirstSibling()
    open fun SetAsLastSibling()
    open fun SetSiblingIndex(`$index`: Number)
    open fun GetSiblingIndex(): Number
    open fun Find(`$n`: String): Transform
    open fun IsChildOf(`$parent`: Transform): Boolean
    open fun GetEnumerator(): IEnumerator
    open fun GetChild(`$index`: Number): Transform
}

external open class Component : Object {
    override var `var`: Any
    open val transform: Transform
    open val gameObject: GameObject
    open var tag: Any
    open fun GetComponent(`$type`: Type): Component
    open fun TryGetComponent(`$type`: Type, `$component`: `$Ref`<Component>): Boolean
    open fun GetComponent(`$type`: String): Component
    open fun GetComponentInChildren(`$t`: Type, `$includeInactive`: Boolean): Component
    open fun GetComponentInChildren(`$t`: Type): Component
    open fun GetComponentsInChildren(`$t`: Type, `$includeInactive`: Boolean): `Array$1`<Component>
    open fun GetComponentsInChildren(`$t`: Type): `Array$1`<Component>
    open fun GetComponentInParent(`$t`: Type, `$includeInactive`: Boolean): Component
    open fun GetComponentInParent(`$t`: Type): Component
    open fun GetComponentsInParent(`$t`: Type, `$includeInactive`: Boolean): `Array$1`<Component>
    open fun GetComponentsInParent(`$t`: Type): `Array$1`<Component>
    open fun GetComponents(`$type`: Type): `Array$1`<Component>
    open fun GetComponents(`$type`: Type, `$results`: `List$1`<Component>)
    open fun CompareTag(`$tag`: String): Boolean
    open fun SendMessageUpwards(`$methodName`: String, `$value`: Any, `$options`: SendMessageOptions)
    open fun SendMessageUpwards(`$methodName`: String, `$value`: Any)
    open fun SendMessageUpwards(`$methodName`: String)
    open fun SendMessageUpwards(`$methodName`: String, `$options`: SendMessageOptions)
    open fun SendMessage(`$methodName`: String, `$value`: Any)
    open fun SendMessage(`$methodName`: String)
    open fun SendMessage(`$methodName`: String, `$value`: Any, `$options`: SendMessageOptions)
    open fun SendMessage(`$methodName`: String, `$options`: SendMessageOptions)
    open fun BroadcastMessage(`$methodName`: String, `$parameter`: Any, `$options`: SendMessageOptions)
    open fun BroadcastMessage(`$methodName`: String, `$parameter`: Any)
    open fun BroadcastMessage(`$methodName`: String)
    open fun BroadcastMessage(`$methodName`: String, `$options`: SendMessageOptions)
}

external open class Quaternion : ValueType, IFormattable, `IEquatable$1`<Quaternion> {
    constructor(`$x`: Number, `$y`: Number, `$z`: Number, `$w`: Number)
    constructor()
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    open var `var`: Any
    open val normalized: Any
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)
    open fun Set(`$newX`: Number, `$newY`: Number, `$newZ`: Number, `$newW`: Number)
    open fun SetLookRotation(`$view`: Vector3)
    open fun SetLookRotation(`$view`: Vector3, `$up`: Vector3)
    open fun ToAngleAxis(`$angle`: `$Ref`<Number>, `$axis`: `$Ref`<Vector3>)
    open fun SetFromToRotation(`$fromDirection`: Vector3, `$toDirection`: Vector3)
    open fun Normalize()
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Quaternion): Boolean
    override fun Equals(`$obj`: Any): Boolean
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String

    companion object {
        var kEpsilon: Number
        fun FromToRotation(`$fromDirection`: Vector3, `$toDirection`: Vector3): Quaternion
        fun Inverse(`$rotation`: Quaternion): Quaternion
        fun Slerp(`$a`: Quaternion, `$b`: Quaternion, `$t`: Number): Quaternion
        fun SlerpUnclamped(`$a`: Quaternion, `$b`: Quaternion, `$t`: Number): Quaternion
        fun Lerp(`$a`: Quaternion, `$b`: Quaternion, `$t`: Number): Quaternion
        fun LerpUnclamped(`$a`: Quaternion, `$b`: Quaternion, `$t`: Number): Quaternion
        fun AngleAxis(`$angle`: Number, `$axis`: Vector3): Quaternion
        fun LookRotation(`$forward`: Vector3, `$upwards`: Vector3): Quaternion
        fun LookRotation(`$forward`: Vector3): Quaternion
        fun op_Multiply(`$lhs`: Quaternion, `$rhs`: Quaternion): Quaternion
        fun op_Multiply(`$rotation`: Quaternion, `$point`: Vector3): Vector3
        fun op_Equality(`$lhs`: Quaternion, `$rhs`: Quaternion): Boolean
        fun op_Inequality(`$lhs`: Quaternion, `$rhs`: Quaternion): Boolean
        fun Dot(`$a`: Quaternion, `$b`: Quaternion): Number
        fun Angle(`$a`: Quaternion, `$b`: Quaternion): Number
        fun Euler(`$x`: Number, `$y`: Number, `$z`: Number): Quaternion
        fun Euler(`$euler`: Vector3): Quaternion
        fun RotateTowards(`$from`: Quaternion, `$to`: Quaternion, `$maxDegreesDelta`: Number): Quaternion
        fun Normalize(`$q`: Quaternion): Quaternion
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class Matrix4x4 : ValueType, IFormattable, `IEquatable$1`<Matrix4x4> {
    constructor(`$column0`: Vector4, `$column1`: Vector4, `$column2`: Vector4, `$column3`: Vector4)
    constructor()
    open var m00: Number
    open var m10: Number
    open var m20: Number
    open var m30: Number
    open var m01: Number
    open var m11: Number
    open var m21: Number
    open var m31: Number
    open var m02: Number
    open var m12: Number
    open var m22: Number
    open var m32: Number
    open var m03: Number
    open var m13: Number
    open var m23: Number
    open var m33: Number
    open var `var`: Any
    open val rotation: Any
    open val isIdentity: Any
    open val determinant: Any
    open val decomposeProjection: Any
    open fun ValidTRS(): Boolean
    open fun SetTRS(`$pos`: Vector3, `$q`: Quaternion, `$s`: Vector3)
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Matrix4x4): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun GetColumn(`$index`: Number): Vector4
    open fun GetRow(`$index`: Number): Vector4
    open fun GetPosition(): Vector3
    open fun SetColumn(`$index`: Number, `$column`: Vector4)
    open fun SetRow(`$index`: Number, `$row`: Vector4)
    open fun MultiplyPoint(`$point`: Vector3): Vector3
    open fun MultiplyPoint3x4(`$point`: Vector3): Vector3
    open fun MultiplyVector(`$vector`: Vector3): Vector3
    open fun TransformPlane(`$plane`: Plane): Plane
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String

    companion object {
        fun Determinant(`$m`: Matrix4x4): Number
        fun TRS(`$pos`: Vector3, `$q`: Quaternion, `$s`: Vector3): Matrix4x4
        fun Inverse3DAffine(`$input`: Matrix4x4, `$result`: `$Ref`<Matrix4x4>): Boolean
        fun Inverse(`$m`: Matrix4x4): Matrix4x4
        fun Transpose(`$m`: Matrix4x4): Matrix4x4
        fun Ortho(`$left`: Number, `$right`: Number, `$bottom`: Number, `$top`: Number, `$zNear`: Number, `$zFar`: Number): Matrix4x4
        fun Perspective(`$fov`: Number, `$aspect`: Number, `$zNear`: Number, `$zFar`: Number): Matrix4x4
        fun LookAt(`$from`: Vector3, `$to`: Vector3, `$up`: Vector3): Matrix4x4
        fun Frustum(`$left`: Number, `$right`: Number, `$bottom`: Number, `$top`: Number, `$zNear`: Number, `$zFar`: Number): Matrix4x4
        fun Frustum(`$fp`: FrustumPlanes): Matrix4x4
        fun op_Multiply(`$lhs`: Matrix4x4, `$rhs`: Matrix4x4): Matrix4x4
        fun op_Multiply(`$lhs`: Matrix4x4, `$vector`: Vector4): Vector4
        fun op_Equality(`$lhs`: Matrix4x4, `$rhs`: Matrix4x4): Boolean
        fun op_Inequality(`$lhs`: Matrix4x4, `$rhs`: Matrix4x4): Boolean
        fun Scale(`$vector`: Vector3): Matrix4x4
        fun Translate(`$vector`: Vector3): Matrix4x4
        fun Rotate(`$q`: Quaternion): Matrix4x4
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external enum class Space {
    World /* = 0 */,
    Self /* = 1 */
}

external open class GameObject : Object {
    constructor(`$name`: String)
    constructor()
    constructor(`$name`: String, vararg components: Type)
    override var `var`: Any
    open val transform: Transform
    open var layer: Any
    open val activeSelf: Any
    open val activeInHierarchy: Any
    open var isStatic: Any
    open var tag: Any
    open val scene: Scene
    open val sceneCullingMask: Any
    open val gameObject: GameObject
    open fun GetComponent(`$type`: Type): Component
    open fun GetComponent(`$type`: String): Component
    open fun GetComponentInChildren(`$type`: Type, `$includeInactive`: Boolean): Component
    open fun GetComponentInChildren(`$type`: Type): Component
    open fun GetComponentInParent(`$type`: Type, `$includeInactive`: Boolean): Component
    open fun GetComponentInParent(`$type`: Type): Component
    open fun GetComponents(`$type`: Type): `Array$1`<Component>
    open fun GetComponents(`$type`: Type, `$results`: `List$1`<Component>)
    open fun GetComponentsInChildren(`$type`: Type): `Array$1`<Component>
    open fun GetComponentsInChildren(`$type`: Type, `$includeInactive`: Boolean): `Array$1`<Component>
    open fun GetComponentsInParent(`$type`: Type): `Array$1`<Component>
    open fun GetComponentsInParent(`$type`: Type, `$includeInactive`: Boolean): `Array$1`<Component>
    open fun TryGetComponent(`$type`: Type, `$component`: `$Ref`<Component>): Boolean
    open fun SendMessageUpwards(`$methodName`: String, `$options`: SendMessageOptions)
    open fun SendMessage(`$methodName`: String, `$options`: SendMessageOptions)
    open fun BroadcastMessage(`$methodName`: String, `$options`: SendMessageOptions)
    open fun AddComponent(`$componentType`: Type): Component
    open fun SetActive(`$value`: Boolean)
    open fun CompareTag(`$tag`: String): Boolean
    open fun SendMessageUpwards(`$methodName`: String, `$value`: Any, `$options`: SendMessageOptions)
    open fun SendMessageUpwards(`$methodName`: String, `$value`: Any)
    open fun SendMessageUpwards(`$methodName`: String)
    open fun SendMessage(`$methodName`: String, `$value`: Any, `$options`: SendMessageOptions)
    open fun SendMessage(`$methodName`: String, `$value`: Any)
    open fun SendMessage(`$methodName`: String)
    open fun BroadcastMessage(`$methodName`: String, `$parameter`: Any, `$options`: SendMessageOptions)
    open fun BroadcastMessage(`$methodName`: String, `$parameter`: Any)
    open fun BroadcastMessage(`$methodName`: String)

    companion object {
        fun CreatePrimitive(`$type`: PrimitiveType): GameObject
        fun FindWithTag(`$tag`: String): GameObject
        fun FindGameObjectWithTag(`$tag`: String): GameObject
        fun FindGameObjectsWithTag(`$tag`: String): `Array$1`<GameObject>
        fun Find(`$name`: String): GameObject
    }
}

external enum class SendMessageOptions {
    RequireReceiver /* = 0 */,
    DontRequireReceiver /* = 1 */
}

external enum class PrimitiveType {
    Sphere /* = 0 */,
    Capsule /* = 1 */,
    Cylinder /* = 2 */,
    Cube /* = 3 */,
    Plane /* = 4 */,
    Quad /* = 5 */
}

external enum class HideFlags {
    None /* = 0 */,
    HideInHierarchy /* = 1 */,
    HideInInspector /* = 2 */,
    DontSaveInEditor /* = 4 */,
    NotEditable /* = 8 */,
    DontSaveInBuild /* = 16 */,
    DontUnloadUnusedAsset /* = 32 */,
    DontSave /* = 52 */,
    HideAndDontSave /* = 61 */
}

external open class ParticleSystem : Component {
    open fun GetCollisionEvents(`$go`: GameObject, `$collisionEvents`: `Array$1`<ParticleCollisionEvent>): Number
    open fun GetSafeCollisionEventSize(): Number
    open fun GetCollisionEvents(`$go`: GameObject, `$collisionEvents`: `List$1`<ParticleCollisionEvent>): Number
    open fun GetSafeTriggerParticlesSize(`$type`: ParticleSystemTriggerEventType): Number
    open fun GetTriggerParticles(`$type`: ParticleSystemTriggerEventType, `$particles`: `List$1`<Particle>): Number
    open fun GetTriggerParticles(`$type`: ParticleSystemTriggerEventType, `$particles`: `List$1`<Particle>, `$colliderData`: `$Ref`<ColliderData>): Number
    open fun SetTriggerParticles(`$type`: ParticleSystemTriggerEventType, `$particles`: `List$1`<Particle>, `$offset`: Number, `$count`: Number)
    open fun SetTriggerParticles(`$type`: ParticleSystemTriggerEventType, `$particles`: `List$1`<Particle>)
    override var `var`: Any
    open val isPlaying: Any
    open val isEmitting: Any
    open val isStopped: Any
    open val isPaused: Any
    open val particleCount: Any
    open var time: Any
    open var randomSeed: Any
    open var useAutoRandomSeed: Any
    open val proceduralSimulationSupported: Any
    open val main: Any
    open val emission: Any
    open val shape: Any
    open val velocityOverLifetime: Any
    open val limitVelocityOverLifetime: Any
    open val inheritVelocity: Any
    open val lifetimeByEmitterSpeed: Any
    open val forceOverLifetime: Any
    open val colorOverLifetime: Any
    open val colorBySpeed: Any
    open val sizeOverLifetime: Any
    open val sizeBySpeed: Any
    open val rotationOverLifetime: Any
    open val rotationBySpeed: Any
    open val externalForces: Any
    open val noise: Any
    open val collision: Any
    open val trigger: Any
    open val subEmitters: Any
    open val textureSheetAnimation: Any
    open val lights: Any
    open val trails: Any
    open val customData: Any
    open fun SetParticles(`$particles`: `Array$1`<Particle>, `$size`: Number, `$offset`: Number)
    open fun SetParticles(`$particles`: `Array$1`<Particle>, `$size`: Number)
    open fun SetParticles(`$particles`: `Array$1`<Particle>)
    open fun SetParticles(`$particles`: `NativeArray$1`<Particle>, `$size`: Number, `$offset`: Number)
    open fun SetParticles(`$particles`: `NativeArray$1`<Particle>, `$size`: Number)
    open fun SetParticles(`$particles`: `NativeArray$1`<Particle>)
    open fun GetParticles(`$particles`: `Array$1`<Particle>, `$size`: Number, `$offset`: Number): Number
    open fun GetParticles(`$particles`: `Array$1`<Particle>, `$size`: Number): Number
    open fun GetParticles(`$particles`: `Array$1`<Particle>): Number
    open fun GetParticles(`$particles`: `NativeArray$1`<Particle>, `$size`: Number, `$offset`: Number): Number
    open fun GetParticles(`$particles`: `NativeArray$1`<Particle>, `$size`: Number): Number
    open fun GetParticles(`$particles`: `NativeArray$1`<Particle>): Number
    open fun SetCustomParticleData(`$customData`: `List$1`<Vector4>, `$streamIndex`: ParticleSystemCustomData)
    open fun GetCustomParticleData(`$customData`: `List$1`<Vector4>, `$streamIndex`: ParticleSystemCustomData): Number
    open fun GetPlaybackState(): PlaybackState
    open fun SetPlaybackState(`$playbackState`: PlaybackState)
    open fun GetTrails(): Trails
    open fun GetTrails(`$trailData`: `$Ref`<Trails>): Number
    open fun SetTrails(`$trailData`: Trails)
    open fun Simulate(`$t`: Number, `$withChildren`: Boolean, `$restart`: Boolean, `$fixedTimeStep`: Boolean)
    open fun Simulate(`$t`: Number, `$withChildren`: Boolean, `$restart`: Boolean)
    open fun Simulate(`$t`: Number, `$withChildren`: Boolean)
    open fun Simulate(`$t`: Number)
    open fun Play(`$withChildren`: Boolean)
    open fun Play()
    open fun Pause(`$withChildren`: Boolean)
    open fun Pause()
    open fun Stop(`$withChildren`: Boolean, `$stopBehavior`: ParticleSystemStopBehavior)
    open fun Stop(`$withChildren`: Boolean)
    open fun Stop()
    open fun Clear(`$withChildren`: Boolean)
    open fun Clear()
    open fun IsAlive(`$withChildren`: Boolean): Boolean
    open fun IsAlive(): Boolean
    open fun Emit(`$count`: Number)
    open fun Emit(`$emitParams`: EmitParams, `$count`: Number)
    open fun TriggerSubEmitter(`$subEmitterIndex`: Number)
    open fun TriggerSubEmitter(`$subEmitterIndex`: Number, `$particle`: `$Ref`<Particle>)
    open fun TriggerSubEmitter(`$subEmitterIndex`: Number, `$particles`: `List$1`<Particle>)
    open fun AllocateAxisOfRotationAttribute()
    open fun AllocateMeshIndexAttribute()
    open fun AllocateCustomDataAttribute(`$stream`: ParticleSystemCustomData)
    open class Particle : ValueType {
        open var `var`: Any
        open var remainingLifetime: Any
        open var startLifetime: Any
        open var randomSeed: Any
        open var startSize: Any
        open var rotation: Any
        open var angularVelocity: Any
        open fun GetCurrentSize(`$system`: ParticleSystem): Number
        open fun GetCurrentSize3D(`$system`: ParticleSystem): Vector3
        open fun GetCurrentColor(`$system`: ParticleSystem): Color32
        open fun SetMeshIndex(`$index`: Number)
        open fun GetMeshIndex(`$system`: ParticleSystem): Number
    }
    open class PlaybackState : ValueType
    open class Trails : ValueType {
        open var `var`: Any
        open var capacity: Any
    }
    open class EmitParams : ValueType {
        open var `var`: Any
        open var particle: Any
        open var applyShapeToPosition: Any
        open var startLifetime: Any
        open var startSize: Any
        open var rotation: Any
        open var angularVelocity: Any
        open var randomSeed: Any
        open fun ResetPosition()
        open fun ResetVelocity()
        open fun ResetAxisOfRotation()
        open fun ResetRotation()
        open fun ResetAngularVelocity()
        open fun ResetStartSize()
        open fun ResetStartColor()
        open fun ResetRandomSeed()
        open fun ResetStartLifetime()
        open fun ResetMeshIndex()
    }
    open class MainModule : ValueType {
        open var `var`: Any
        open var duration: Any
        open var loop: Any
        open var prewarm: Any
        open var startDelay: Any
        open var startDelayMultiplier: Any
        open var startLifetime: Any
        open var startLifetimeMultiplier: Any
        open var startSpeed: Any
        open var startSpeedMultiplier: Any
        open var startSize: Any
        open var startSizeMultiplier: Any
        open var startSizeX: Any
        open var startSizeXMultiplier: Any
        open var startSizeY: Any
        open var startSizeYMultiplier: Any
        open var startSizeZ: Any
        open var startSizeZMultiplier: Any
        open var startRotation: Any
        open var startRotationMultiplier: Any
        open var startRotationX: Any
        open var startRotationXMultiplier: Any
        open var startRotationY: Any
        open var startRotationYMultiplier: Any
        open var startRotationZ: Any
        open var startRotationZMultiplier: Any
        open var flipRotation: Any
        open var startColor: Any
        open var gravityModifier: Any
        open var gravityModifierMultiplier: Any
        open var simulationSpace: Any
        open var customSimulationSpace: Any
        open var simulationSpeed: Any
        open var useUnscaledTime: Any
        open var scalingMode: Any
        open var playOnAwake: Any
        open var maxParticles: Any
        open var emitterVelocityMode: Any
        open var stopAction: Any
        open var ringBufferMode: Any
        open var cullingMode: Any
    }
    open class EmissionModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var rateOverTime: Any
        open var rateOverTimeMultiplier: Any
        open var rateOverDistance: Any
        open var rateOverDistanceMultiplier: Any
        open var burstCount: Any
        open fun SetBursts(`$bursts`: `Array$1`<Burst>)
        open fun SetBursts(`$bursts`: `Array$1`<Burst>, `$size`: Number)
        open fun GetBursts(`$bursts`: `Array$1`<Burst>): Number
        open fun SetBurst(`$index`: Number, `$burst`: Burst)
        open fun GetBurst(`$index`: Number): Burst
    }
    open class ShapeModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var shapeType: Any
        open var randomDirectionAmount: Any
        open var sphericalDirectionAmount: Any
        open var randomPositionAmount: Any
        open var alignToDirection: Any
        open var radius: Any
        open var radiusMode: Any
        open var radiusSpread: Any
        open var radiusSpeed: Any
        open var radiusSpeedMultiplier: Any
        open var radiusThickness: Any
        open var angle: Any
        open var length: Any
        open var meshShapeType: Any
        open var mesh: Any
        open var meshRenderer: Any
        open var skinnedMeshRenderer: Any
        open var sprite: Any
        open var spriteRenderer: Any
        open var useMeshMaterialIndex: Any
        open var meshMaterialIndex: Any
        open var useMeshColors: Any
        open var normalOffset: Any
        open var meshSpawnMode: Any
        open var meshSpawnSpread: Any
        open var meshSpawnSpeed: Any
        open var meshSpawnSpeedMultiplier: Any
        open var arc: Any
        open var arcMode: Any
        open var arcSpread: Any
        open var arcSpeed: Any
        open var arcSpeedMultiplier: Any
        open var donutRadius: Any
        open var textureClipChannel: Any
        open var textureClipThreshold: Any
        open var textureColorAffectsParticles: Any
        open var textureAlphaAffectsParticles: Any
        open var textureBilinearFiltering: Any
        open var textureUVChannel: Any
    }
    open class VelocityOverLifetimeModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var x: Any
        open var y: Any
        open var z: Any
        open var xMultiplier: Any
        open var yMultiplier: Any
        open var zMultiplier: Any
        open var orbitalX: Any
        open var orbitalY: Any
        open var orbitalZ: Any
        open var orbitalXMultiplier: Any
        open var orbitalYMultiplier: Any
        open var orbitalZMultiplier: Any
        open var orbitalOffsetX: Any
        open var orbitalOffsetY: Any
        open var orbitalOffsetZ: Any
        open var orbitalOffsetXMultiplier: Any
        open var orbitalOffsetYMultiplier: Any
        open var orbitalOffsetZMultiplier: Any
        open var radial: Any
        open var radialMultiplier: Any
        open var speedModifier: Any
        open var speedModifierMultiplier: Any
        open var space: Any
    }
    open class LimitVelocityOverLifetimeModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var limitX: Any
        open var limitXMultiplier: Any
        open var limitY: Any
        open var limitYMultiplier: Any
        open var limitZ: Any
        open var limitZMultiplier: Any
        open var limit: Any
        open var limitMultiplier: Any
        open var dampen: Any
        open var separateAxes: Any
        open var space: Any
        open var drag: Any
        open var dragMultiplier: Any
        open var multiplyDragByParticleSize: Any
        open var multiplyDragByParticleVelocity: Any
    }
    open class InheritVelocityModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var mode: Any
        open var curve: Any
        open var curveMultiplier: Any
    }
    open class LifetimeByEmitterSpeedModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var curve: Any
        open var curveMultiplier: Any
    }
    open class ForceOverLifetimeModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var x: Any
        open var y: Any
        open var z: Any
        open var xMultiplier: Any
        open var yMultiplier: Any
        open var zMultiplier: Any
        open var space: Any
        open var randomized: Any
    }
    open class ColorOverLifetimeModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var color: Any
    }
    open class ColorBySpeedModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var color: Any
    }
    open class SizeOverLifetimeModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var size: Any
        open var sizeMultiplier: Any
        open var x: Any
        open var xMultiplier: Any
        open var y: Any
        open var yMultiplier: Any
        open var z: Any
        open var zMultiplier: Any
        open var separateAxes: Any
    }
    open class SizeBySpeedModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var size: Any
        open var sizeMultiplier: Any
        open var x: Any
        open var xMultiplier: Any
        open var y: Any
        open var yMultiplier: Any
        open var z: Any
        open var zMultiplier: Any
        open var separateAxes: Any
    }
    open class RotationOverLifetimeModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var x: Any
        open var xMultiplier: Any
        open var y: Any
        open var yMultiplier: Any
        open var z: Any
        open var zMultiplier: Any
        open var separateAxes: Any
    }
    open class RotationBySpeedModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var x: Any
        open var xMultiplier: Any
        open var y: Any
        open var yMultiplier: Any
        open var z: Any
        open var zMultiplier: Any
        open var separateAxes: Any
    }
    open class ExternalForcesModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var multiplier: Any
        open var multiplierCurve: Any
        open var influenceFilter: Any
        open var influenceMask: Any
        open val influenceCount: Any
        open fun IsAffectedBy(`$field`: ParticleSystemForceField): Boolean
        open fun AddInfluence(`$field`: ParticleSystemForceField)
        open fun RemoveInfluence(`$index`: Number)
        open fun RemoveInfluence(`$field`: ParticleSystemForceField)
        open fun RemoveAllInfluences()
        open fun SetInfluence(`$index`: Number, `$field`: ParticleSystemForceField)
        open fun GetInfluence(`$index`: Number): ParticleSystemForceField
    }
    open class NoiseModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var separateAxes: Any
        open var strength: Any
        open var strengthMultiplier: Any
        open var strengthX: Any
        open var strengthXMultiplier: Any
        open var strengthY: Any
        open var strengthYMultiplier: Any
        open var strengthZ: Any
        open var strengthZMultiplier: Any
        open var frequency: Any
        open var damping: Any
        open var octaveCount: Any
        open var octaveMultiplier: Any
        open var octaveScale: Any
        open var quality: Any
        open var scrollSpeed: Any
        open var scrollSpeedMultiplier: Any
        open var remapEnabled: Any
        open var remap: Any
        open var remapMultiplier: Any
        open var remapX: Any
        open var remapXMultiplier: Any
        open var remapY: Any
        open var remapYMultiplier: Any
        open var remapZ: Any
        open var remapZMultiplier: Any
        open var positionAmount: Any
        open var rotationAmount: Any
        open var sizeAmount: Any
    }
    open class CollisionModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var type: Any
        open var mode: Any
        open var dampen: Any
        open var dampenMultiplier: Any
        open var bounce: Any
        open var bounceMultiplier: Any
        open var lifetimeLoss: Any
        open var lifetimeLossMultiplier: Any
        open var minKillSpeed: Any
        open var maxKillSpeed: Any
        open var collidesWith: Any
        open var enableDynamicColliders: Any
        open var maxCollisionShapes: Any
        open var quality: Any
        open var voxelSize: Any
        open var radiusScale: Any
        open var sendCollisionMessages: Any
        open var colliderForce: Any
        open var multiplyColliderForceByCollisionAngle: Any
        open var multiplyColliderForceByParticleSpeed: Any
        open var multiplyColliderForceByParticleSize: Any
        open val planeCount: Any
        open fun AddPlane(`$transform`: Transform)
        open fun RemovePlane(`$index`: Number)
        open fun RemovePlane(`$transform`: Transform)
        open fun SetPlane(`$index`: Number, `$transform`: Transform)
        open fun GetPlane(`$index`: Number): Transform
    }
    open class TriggerModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var inside: Any
        open var outside: Any
        open var enter: Any
        open var exit: Any
        open var colliderQueryMode: Any
        open var radiusScale: Any
        open val colliderCount: Any
        open fun AddCollider(`$collider`: Component)
        open fun RemoveCollider(`$index`: Number)
        open fun RemoveCollider(`$collider`: Component)
        open fun SetCollider(`$index`: Number, `$collider`: Component)
        open fun GetCollider(`$index`: Number): Component
    }
    open class SubEmittersModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open val subEmittersCount: Any
        open fun AddSubEmitter(`$subEmitter`: ParticleSystem, `$type`: ParticleSystemSubEmitterType, `$properties`: ParticleSystemSubEmitterProperties, `$emitProbability`: Number)
        open fun AddSubEmitter(`$subEmitter`: ParticleSystem, `$type`: ParticleSystemSubEmitterType, `$properties`: ParticleSystemSubEmitterProperties)
        open fun RemoveSubEmitter(`$index`: Number)
        open fun RemoveSubEmitter(`$subEmitter`: ParticleSystem)
        open fun SetSubEmitterSystem(`$index`: Number, `$subEmitter`: ParticleSystem)
        open fun SetSubEmitterType(`$index`: Number, `$type`: ParticleSystemSubEmitterType)
        open fun SetSubEmitterProperties(`$index`: Number, `$properties`: ParticleSystemSubEmitterProperties)
        open fun SetSubEmitterEmitProbability(`$index`: Number, `$emitProbability`: Number)
        open fun GetSubEmitterSystem(`$index`: Number): ParticleSystem
        open fun GetSubEmitterType(`$index`: Number): ParticleSystemSubEmitterType
        open fun GetSubEmitterProperties(`$index`: Number): ParticleSystemSubEmitterProperties
        open fun GetSubEmitterEmitProbability(`$index`: Number): Number
    }
    open class TextureSheetAnimationModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var mode: Any
        open var timeMode: Any
        open var fps: Any
        open var numTilesX: Any
        open var numTilesY: Any
        open var animation: Any
        open var rowMode: Any
        open var frameOverTime: Any
        open var frameOverTimeMultiplier: Any
        open var startFrame: Any
        open var startFrameMultiplier: Any
        open var cycleCount: Any
        open var rowIndex: Any
        open var uvChannelMask: Any
        open val spriteCount: Any
        open fun AddSprite(`$sprite`: Sprite)
        open fun RemoveSprite(`$index`: Number)
        open fun SetSprite(`$index`: Number, `$sprite`: Sprite)
        open fun GetSprite(`$index`: Number): Sprite
    }
    open class LightsModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var ratio: Any
        open var useRandomDistribution: Any
        open var light: Any
        open var useParticleColor: Any
        open var sizeAffectsRange: Any
        open var alphaAffectsIntensity: Any
        open var range: Any
        open var rangeMultiplier: Any
        open var intensity: Any
        open var intensityMultiplier: Any
        open var maxLights: Any
    }
    open class TrailModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open var mode: Any
        open var ratio: Any
        open var lifetime: Any
        open var lifetimeMultiplier: Any
        open var minVertexDistance: Any
        open var textureMode: Any
        open var worldSpace: Any
        open var dieWithParticles: Any
        open var sizeAffectsWidth: Any
        open var sizeAffectsLifetime: Any
        open var inheritParticleColor: Any
        open var colorOverLifetime: Any
        open var widthOverTrail: Any
        open var widthOverTrailMultiplier: Any
        open var colorOverTrail: Any
        open var generateLightingData: Any
        open var ribbonCount: Any
        open var shadowBias: Any
        open var splitSubEmitterRibbons: Any
        open var attachRibbonsToTransform: Any
    }
    open class CustomDataModule : ValueType {
        open var `var`: Any
        open var enabled: Any
        open fun SetMode(`$stream`: ParticleSystemCustomData, `$mode`: ParticleSystemCustomDataMode)
        open fun GetMode(`$stream`: ParticleSystemCustomData): ParticleSystemCustomDataMode
        open fun SetVectorComponentCount(`$stream`: ParticleSystemCustomData, `$count`: Number)
        open fun GetVectorComponentCount(`$stream`: ParticleSystemCustomData): Number
        open fun SetVector(`$stream`: ParticleSystemCustomData, `$component`: Number, `$curve`: MinMaxCurve)
        open fun GetVector(`$stream`: ParticleSystemCustomData, `$component`: Number): MinMaxCurve
        open fun SetColor(`$stream`: ParticleSystemCustomData, `$gradient`: MinMaxGradient)
        open fun GetColor(`$stream`: ParticleSystemCustomData): MinMaxGradient
    }
    open class MinMaxCurve : ValueType {
        constructor(`$constant`: Number)
        constructor(`$multiplier`: Number, `$curve`: AnimationCurve)
        constructor(`$multiplier`: Number, `$min`: AnimationCurve, `$max`: AnimationCurve)
        constructor(`$min`: Number, `$max`: Number)
        constructor()
        open var `var`: Any
        open var mode: Any
        open var curveMultiplier: Any
        open var curveMax: Any
        open var curveMin: Any
        open var constantMax: Any
        open var constantMin: Any
        open var constant: Any
        open var curve: Any
        open fun Evaluate(`$time`: Number): Number
        open fun Evaluate(`$time`: Number, `$lerpFactor`: Number): Number

        companion object {
            fun op_Implicit(`$constant`: Number): MinMaxCurve
        }
    }
    open class MinMaxGradient : ValueType {
        constructor(`$color`: Color)
        constructor(`$gradient`: Gradient)
        constructor(`$min`: Color, `$max`: Color)
        constructor(`$min`: Gradient, `$max`: Gradient)
        constructor()
        open var `var`: Any
        open var mode: Any
        open var gradientMax: Any
        open var gradientMin: Any
        open var colorMax: Any
        open var colorMin: Any
        open var color: Any
        open var gradient: Any
        open fun Evaluate(`$time`: Number): Color
        open fun Evaluate(`$time`: Number, `$lerpFactor`: Number): Color

        companion object {
            fun op_Implicit(`$color`: Color): MinMaxGradient
            fun op_Implicit(`$gradient`: Gradient): MinMaxGradient
        }
    }
    open class Burst : ValueType {
        constructor(`$_time`: Number, `$_count`: Number)
        constructor(`$_time`: Number, `$_minCount`: Number, `$_maxCount`: Number)
        constructor(`$_time`: Number, `$_minCount`: Number, `$_maxCount`: Number, `$_cycleCount`: Number, `$_repeatInterval`: Number)
        constructor(`$_time`: Number, `$_count`: MinMaxCurve)
        constructor(`$_time`: Number, `$_count`: MinMaxCurve, `$_cycleCount`: Number, `$_repeatInterval`: Number)
        constructor()
        open var `var`: Any
        open var time: Any
        open var count: Any
        open var minCount: Any
        open var maxCount: Any
        open var cycleCount: Any
        open var repeatInterval: Any
        open var probability: Any
    }
    open class ColliderData : ValueType {
        open fun GetColliderCount(`$particleIndex`: Number): Number
        open fun GetCollider(`$particleIndex`: Number, `$colliderIndex`: Number): Component
    }

    companion object {
        fun ResetPreMappedBufferMemory()
        fun SetMaximumPreMappedBufferCounts(`$vertexBuffersCount`: Number, `$indexBuffersCount`: Number)
    }
}

external open class Color32 : ValueType, IFormattable {
    constructor(`$r`: Number, `$g`: Number, `$b`: Number, `$a`: Number)
    constructor()
    open var r: Number
    open var g: Number
    open var b: Number
    open var a: Number
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String

    companion object {
        fun op_Implicit(`$c`: Color): Color32
        fun op_Implicit(`$c`: Color32): Color
        fun Lerp(`$a`: Color32, `$b`: Color32, `$t`: Number): Color32
        fun LerpUnclamped(`$a`: Color32, `$b`: Color32, `$t`: Number): Color32
    }
}

external enum class ParticleSystemSimulationSpace {
    Local /* = 0 */,
    World /* = 1 */,
    Custom /* = 2 */
}

external enum class ParticleSystemScalingMode {
    Hierarchy /* = 0 */,
    Local /* = 1 */,
    Shape /* = 2 */
}

external open class Vector4 : ValueType, IFormattable, `IEquatable$1`<Vector4> {
    constructor(`$x`: Number, `$y`: Number, `$z`: Number, `$w`: Number)
    constructor(`$x`: Number, `$y`: Number, `$z`: Number)
    constructor(`$x`: Number, `$y`: Number)
    constructor()
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    open var `var`: Any
    open val magnitude: Any
    open val sqrMagnitude: Any
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)
    open fun Set(`$newX`: Number, `$newY`: Number, `$newZ`: Number, `$newW`: Number)
    open fun Scale(`$scale`: Vector4)
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Vector4): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun Normalize()
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
    open fun SqrMagnitude(): Number

    companion object {
        var kEpsilon: Number
        fun Lerp(`$a`: Vector4, `$b`: Vector4, `$t`: Number): Vector4
        fun LerpUnclamped(`$a`: Vector4, `$b`: Vector4, `$t`: Number): Vector4
        fun MoveTowards(`$current`: Vector4, `$target`: Vector4, `$maxDistanceDelta`: Number): Vector4
        fun Scale(`$a`: Vector4, `$b`: Vector4): Vector4
        fun Normalize(`$a`: Vector4): Vector4
        fun Dot(`$a`: Vector4, `$b`: Vector4): Number
        fun Project(`$a`: Vector4, `$b`: Vector4): Vector4
        fun Distance(`$a`: Vector4, `$b`: Vector4): Number
        fun Magnitude(`$a`: Vector4): Number
        fun Min(`$lhs`: Vector4, `$rhs`: Vector4): Vector4
        fun Max(`$lhs`: Vector4, `$rhs`: Vector4): Vector4
        fun op_Addition(`$a`: Vector4, `$b`: Vector4): Vector4
        fun op_Subtraction(`$a`: Vector4, `$b`: Vector4): Vector4
        fun op_UnaryNegation(`$a`: Vector4): Vector4
        fun op_Multiply(`$a`: Vector4, `$d`: Number): Vector4
        fun op_Multiply(`$d`: Number, `$a`: Vector4): Vector4
        fun op_Division(`$a`: Vector4, `$d`: Number): Vector4
        fun op_Equality(`$lhs`: Vector4, `$rhs`: Vector4): Boolean
        fun op_Inequality(`$lhs`: Vector4, `$rhs`: Vector4): Boolean
        fun op_Implicit(`$v`: Vector3): Vector4
        fun op_Implicit(`$v`: Vector4): Vector3
        fun op_Implicit(`$v`: Vector2): Vector4
        fun op_Implicit(`$v`: Vector4): Vector2
        fun SqrMagnitude(`$a`: Vector4): Number
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external enum class ParticleSystemCustomData {
    Custom1 /* = 0 */,
    Custom2 /* = 1 */
}

external enum class ParticleSystemStopBehavior {
    StopEmittingAndClear /* = 0 */,
    StopEmitting /* = 1 */
}

external open class Canvas : Behaviour {
    override var `var`: Any
    open var renderMode: Any
    open val isRootCanvas: Any
    open val pixelRect: Any
    open var scaleFactor: Any
    open var referencePixelsPerUnit: Any
    open var overridePixelPerfect: Any
    open var pixelPerfect: Any
    open var planeDistance: Any
    open val renderOrder: Any
    open var overrideSorting: Any
    open var sortingOrder: Any
    open var targetDisplay: Any
    open var sortingLayerID: Any
    open val cachedSortingLayerValue: Any
    open var additionalShaderChannels: Any
    open var sortingLayerName: Any
    open val rootCanvas: Any
    open var worldCamera: Any
    open var normalizedSortingGridSize: Any
    interface WillRenderCanvases {
        @nativeInvoke
        operator fun invoke()
        var Invoke: (() -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        fun add_preWillRenderCanvases(`$value`: WillRenderCanvases)
        fun remove_preWillRenderCanvases(`$value`: WillRenderCanvases)
        fun add_willRenderCanvases(`$value`: WillRenderCanvases)
        fun remove_willRenderCanvases(`$value`: WillRenderCanvases)
        fun GetDefaultCanvasMaterial(): Material
        fun GetETC1SupportedCanvasMaterial(): Material
        fun ForceUpdateCanvases()
    }
}

external open class Behaviour : Component {
    override var `var`: Any
    open var enabled: Any
    open val isActiveAndEnabled: Any
}

external enum class RenderMode {
    ScreenSpaceOverlay /* = 0 */,
    ScreenSpaceCamera /* = 1 */,
    WorldSpace /* = 2 */
}

external open class Rect : ValueType, IFormattable, `IEquatable$1`<Rect> {
    constructor(`$x`: Number, `$y`: Number, `$width`: Number, `$height`: Number)
    constructor(`$position`: Vector2, `$size`: Vector2)
    constructor(`$source`: Rect)
    constructor()
    open var `var`: Any
    open var x: Any
    open var y: Any
    open var width: Any
    open var height: Any
    open var xMin: Any
    open var yMin: Any
    open var xMax: Any
    open var yMax: Any
    open fun Set(`$x`: Number, `$y`: Number, `$width`: Number, `$height`: Number)
    open fun Contains(`$point`: Vector2): Boolean
    open fun Contains(`$point`: Vector3): Boolean
    open fun Contains(`$point`: Vector3, `$allowInverse`: Boolean): Boolean
    open fun Overlaps(`$other`: Rect): Boolean
    open fun Overlaps(`$other`: Rect, `$allowInverse`: Boolean): Boolean
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Rect): Boolean
    override fun Equals(`$obj`: Any): Boolean
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String

    companion object {
        fun MinMaxRect(`$xmin`: Number, `$ymin`: Number, `$xmax`: Number, `$ymax`: Number): Rect
        fun NormalizedToPoint(`$rectangle`: Rect, `$normalizedRectCoordinates`: Vector2): Vector2
        fun PointToNormalized(`$rectangle`: Rect, `$point`: Vector2): Vector2
        fun op_Inequality(`$lhs`: Rect, `$rhs`: Rect): Boolean
        fun op_Equality(`$lhs`: Rect, `$rhs`: Rect): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external enum class AdditionalCanvasShaderChannels {
    None /* = 0 */,
    TexCoord1 /* = 1 */,
    TexCoord2 /* = 2 */,
    TexCoord3 /* = 4 */,
    Normal /* = 8 */,
    Tangent /* = 16 */
}

external open class Vector2 : ValueType, IFormattable, `IEquatable$1`<Vector2> {
    constructor(`$x`: Number, `$y`: Number)
    constructor()
    open var x: Number
    open var y: Number
    open var `var`: Any
    open val magnitude: Any
    open val sqrMagnitude: Any
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)
    open fun Set(`$newX`: Number, `$newY`: Number)
    open fun Scale(`$scale`: Vector2)
    open fun Normalize()
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Vector2): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun SqrMagnitude(): Number

    companion object {
        var kEpsilon: Number
        var kEpsilonNormalSqrt: Number
        fun Lerp(`$a`: Vector2, `$b`: Vector2, `$t`: Number): Vector2
        fun LerpUnclamped(`$a`: Vector2, `$b`: Vector2, `$t`: Number): Vector2
        fun MoveTowards(`$current`: Vector2, `$target`: Vector2, `$maxDistanceDelta`: Number): Vector2
        fun Scale(`$a`: Vector2, `$b`: Vector2): Vector2
        fun Reflect(`$inDirection`: Vector2, `$inNormal`: Vector2): Vector2
        fun Perpendicular(`$inDirection`: Vector2): Vector2
        fun Dot(`$lhs`: Vector2, `$rhs`: Vector2): Number
        fun Angle(`$from`: Vector2, `$to`: Vector2): Number
        fun SignedAngle(`$from`: Vector2, `$to`: Vector2): Number
        fun Distance(`$a`: Vector2, `$b`: Vector2): Number
        fun ClampMagnitude(`$vector`: Vector2, `$maxLength`: Number): Vector2
        fun SqrMagnitude(`$a`: Vector2): Number
        fun Min(`$lhs`: Vector2, `$rhs`: Vector2): Vector2
        fun Max(`$lhs`: Vector2, `$rhs`: Vector2): Vector2
        fun SmoothDamp(`$current`: Vector2, `$target`: Vector2, `$currentVelocity`: `$Ref`<Vector2>, `$smoothTime`: Number, `$maxSpeed`: Number): Vector2
        fun SmoothDamp(`$current`: Vector2, `$target`: Vector2, `$currentVelocity`: `$Ref`<Vector2>, `$smoothTime`: Number): Vector2
        fun SmoothDamp(`$current`: Vector2, `$target`: Vector2, `$currentVelocity`: `$Ref`<Vector2>, `$smoothTime`: Number, `$maxSpeed`: Number, `$deltaTime`: Number): Vector2
        fun op_Addition(`$a`: Vector2, `$b`: Vector2): Vector2
        fun op_Subtraction(`$a`: Vector2, `$b`: Vector2): Vector2
        fun op_Multiply(`$a`: Vector2, `$b`: Vector2): Vector2
        fun op_Division(`$a`: Vector2, `$b`: Vector2): Vector2
        fun op_UnaryNegation(`$a`: Vector2): Vector2
        fun op_Multiply(`$a`: Vector2, `$d`: Number): Vector2
        fun op_Multiply(`$d`: Number, `$a`: Vector2): Vector2
        fun op_Division(`$a`: Vector2, `$d`: Number): Vector2
        fun op_Equality(`$lhs`: Vector2, `$rhs`: Vector2): Boolean
        fun op_Inequality(`$lhs`: Vector2, `$rhs`: Vector2): Boolean
        fun op_Implicit(`$v`: Vector3): Vector2
        fun op_Implicit(`$v`: Vector2): Vector3
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class Camera : Behaviour {
    override var `var`: Any
    open var nearClipPlane: Any
    open var farClipPlane: Any
    open var fieldOfView: Any
    open var renderingPath: Any
    open val actualRenderingPath: Any
    open var allowHDR: Any
    open var allowMSAA: Any
    open var allowDynamicResolution: Any
    open var forceIntoRenderTexture: Any
    open var orthographicSize: Any
    open var orthographic: Any
    open var opaqueSortMode: Any
    open var transparencySortMode: Any
    open var depth: Any
    open var aspect: Any
    open var cullingMask: Any
    open var eventMask: Any
    open var layerCullSpherical: Any
    open var cameraType: Any
    open var overrideSceneCullingMask: Any
    open var useOcclusionCulling: Any
    open var backgroundColor: Any
    open var clearFlags: Any
    open var depthTextureMode: Any
    open var clearStencilAfterLightingPass: Any
    open var usePhysicalProperties: Any
    open var focalLength: Any
    open var gateFit: Any
    open var rect: Any
    open var pixelRect: Any
    open val pixelWidth: Any
    open val pixelHeight: Any
    open val scaledPixelWidth: Any
    open val scaledPixelHeight: Any
    open var targetTexture: Any
    open val activeTexture: Any
    open var targetDisplay: Any
    open var useJitteredProjectionMatrixForTransparentRendering: Any
    open var scene: Any
    open val stereoEnabled: Any
    open var stereoSeparation: Any
    open var stereoConvergence: Any
    open val areVRStereoViewMatricesWithinSingleCullTolerance: Any
    open var stereoTargetEye: Any
    open val stereoActiveEye: Any
    open val sceneViewFilterMode: Any
    open val commandBufferCount: Any
    open fun Reset()
    open fun ResetTransparencySortSettings()
    open fun ResetAspect()
    open fun ResetCullingMatrix()
    open fun SetReplacementShader(`$shader`: Shader, `$replacementTag`: String)
    open fun ResetReplacementShader()
    open fun GetGateFittedFieldOfView(): Number
    open fun GetGateFittedLensShift(): Vector2
    open fun SetTargetBuffers(`$colorBuffer`: RenderBuffer, `$depthBuffer`: RenderBuffer)
    open fun SetTargetBuffers(`$colorBuffer`: `Array$1`<RenderBuffer>, `$depthBuffer`: RenderBuffer)
    open fun ResetWorldToCameraMatrix()
    open fun ResetProjectionMatrix()
    open fun CalculateObliqueMatrix(`$clipPlane`: Vector4): Matrix4x4
    //open fun WorldToScreenPoint(`$position`: Vector3, `$eye`: MonoOrStereoscopicEye): Vector3
    //open fun WorldToViewportPoint(`$position`: Vector3, `$eye`: MonoOrStereoscopicEye): Vector3
    //open fun ViewportToWorldPoint(`$position`: Vector3, `$eye`: MonoOrStereoscopicEye): Vector3
    //open fun ScreenToWorldPoint(`$position`: Vector3, `$eye`: MonoOrStereoscopicEye): Vector3
    open fun WorldToScreenPoint(`$position`: Vector3): Vector3
    open fun WorldToViewportPoint(`$position`: Vector3): Vector3
    open fun ViewportToWorldPoint(`$position`: Vector3): Vector3
    open fun ScreenToWorldPoint(`$position`: Vector3): Vector3
    open fun ScreenToViewportPoint(`$position`: Vector3): Vector3
    open fun ViewportToScreenPoint(`$position`: Vector3): Vector3
    //open fun ViewportPointToRay(`$pos`: Vector3, `$eye`: MonoOrStereoscopicEye): Ray
    open fun ViewportPointToRay(`$pos`: Vector3): Ray
    //open fun ScreenPointToRay(`$pos`: Vector3, `$eye`: MonoOrStereoscopicEye): Ray
    open fun ScreenPointToRay(`$pos`: Vector3): Ray
    //open fun CalculateFrustumCorners(`$viewport`: Rect, `$z`: Number, `$eye`: MonoOrStereoscopicEye, `$outCorners`: `Array$1`<Vector3>)
    //open fun GetStereoNonJitteredProjectionMatrix(`$eye`: StereoscopicEye): Matrix4x4
    //open fun GetStereoViewMatrix(`$eye`: StereoscopicEye): Matrix4x4
    //open fun CopyStereoDeviceProjectionMatrixToNonJittered(`$eye`: StereoscopicEye)
    //open fun GetStereoProjectionMatrix(`$eye`: StereoscopicEye): Matrix4x4
    //open fun SetStereoProjectionMatrix(`$eye`: StereoscopicEye, `$matrix`: Matrix4x4)
    open fun ResetStereoProjectionMatrices()
    //open fun SetStereoViewMatrix(`$eye`: StereoscopicEye, `$matrix`: Matrix4x4)
    open fun ResetStereoViewMatrices()
    open fun RenderToCubemap(`$cubemap`: Cubemap, `$faceMask`: Number): Boolean
    open fun RenderToCubemap(`$cubemap`: Cubemap): Boolean
    open fun RenderToCubemap(`$cubemap`: RenderTexture, `$faceMask`: Number): Boolean
    open fun RenderToCubemap(`$cubemap`: RenderTexture): Boolean
    //open fun RenderToCubemap(`$cubemap`: RenderTexture, `$faceMask`: Number, `$stereoEye`: MonoOrStereoscopicEye): Boolean
    open fun Render()
    open fun RenderWithShader(`$shader`: Shader, `$replacementTag`: String)
    open fun RenderDontRestore()
    open fun SubmitRenderRequests(`$renderRequests`: `List$1`<RenderRequest>)
    open fun CopyFrom(`$other`: Camera)
    open fun RemoveCommandBuffers(`$evt`: CameraEvent)
    open fun RemoveAllCommandBuffers()
    open fun AddCommandBuffer(`$evt`: CameraEvent, `$buffer`: CommandBuffer)
    open fun AddCommandBufferAsync(`$evt`: CameraEvent, `$buffer`: CommandBuffer, `$queueType`: ComputeQueueType)
    open fun RemoveCommandBuffer(`$evt`: CameraEvent, `$buffer`: CommandBuffer)
    open fun GetCommandBuffers(`$evt`: CameraEvent): `Array$1`<CommandBuffer>
    open fun TryGetCullingParameters(`$cullingParameters`: `$Ref`<ScriptableCullingParameters>): Boolean
    open fun TryGetCullingParameters(`$stereoAware`: Boolean, `$cullingParameters`: `$Ref`<ScriptableCullingParameters>): Boolean
    interface CameraCallback {
        @nativeInvoke
        operator fun invoke(cam: Camera)
        var Invoke: ((cam: Camera) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
    open class GateFitParameters : ValueType {
        //constructor(`$mode`: GateFitMode, `$aspect`: Number)
        constructor()
        open var `var`: Any
        open var mode: Any
        open var aspect: Any
    }
    open class RenderRequest : ValueType {
        //constructor(`$mode`: RenderRequestMode, `$rt`: RenderTexture)
        //constructor(`$mode`: RenderRequestMode, `$space`: RenderRequestOutputSpace, `$rt`: RenderTexture)
        constructor()
        open var `var`: Any
        open val isValid: Any
        open val mode: Any
        open val result: Any
        open val outputSpace: Any
    }

    companion object {
        var onPreCull: CameraCallback
        var onPreRender: CameraCallback
        var onPostRender: CameraCallback
        fun CalculateProjectionMatrixFromPhysicalProperties(`$output`: `$Ref`<Matrix4x4>, `$focalLength`: Number, `$sensorSize`: Vector2, `$lensShift`: Vector2, `$nearClip`: Number, `$farClip`: Number, `$gateFitParameters`: GateFitParameters = definedExternally)
        fun FocalLengthToFieldOfView(`$focalLength`: Number, `$sensorSize`: Number): Number
        fun FieldOfViewToFocalLength(`$fieldOfView`: Number, `$sensorSize`: Number): Number
        fun HorizontalToVerticalFieldOfView(`$horizontalFieldOfView`: Number, `$aspectRatio`: Number): Number
        fun VerticalToHorizontalFieldOfView(`$verticalFieldOfView`: Number, `$aspectRatio`: Number): Number
        fun GetAllCameras(`$cameras`: `Array$1`<Camera>): Number
        fun SetupCurrent(`$cur`: Camera)
    }
}

external open class Material : Object {
    constructor(`$shader`: Shader)
    constructor(`$source`: Material)
    constructor()
    override var `var`: Any
    open var shader: Any
    open var color: Any
    open var mainTexture: Any
    open var renderQueue: Any
    open var globalIlluminationFlags: Any
    open var doubleSidedGI: Any
    open var enableInstancing: Any
    open val passCount: Any
    open fun HasProperty(`$nameID`: Number): Boolean
    open fun HasProperty(`$name`: String): Boolean
    open fun HasFloat(`$name`: String): Boolean
    open fun HasFloat(`$nameID`: Number): Boolean
    open fun HasInt(`$name`: String): Boolean
    open fun HasInt(`$nameID`: Number): Boolean
    open fun HasInteger(`$name`: String): Boolean
    open fun HasInteger(`$nameID`: Number): Boolean
    open fun HasTexture(`$name`: String): Boolean
    open fun HasTexture(`$nameID`: Number): Boolean
    open fun HasMatrix(`$name`: String): Boolean
    open fun HasMatrix(`$nameID`: Number): Boolean
    open fun HasVector(`$name`: String): Boolean
    open fun HasVector(`$nameID`: Number): Boolean
    open fun HasColor(`$name`: String): Boolean
    open fun HasColor(`$nameID`: Number): Boolean
    open fun HasBuffer(`$name`: String): Boolean
    open fun HasBuffer(`$nameID`: Number): Boolean
    open fun HasConstantBuffer(`$name`: String): Boolean
    open fun HasConstantBuffer(`$nameID`: Number): Boolean
    open fun EnableKeyword(`$keyword`: String)
    open fun DisableKeyword(`$keyword`: String)
    open fun IsKeywordEnabled(`$keyword`: String): Boolean
    open fun EnableKeyword(`$keyword`: `$Ref`<LocalKeyword>)
    open fun DisableKeyword(`$keyword`: `$Ref`<LocalKeyword>)
    open fun SetKeyword(`$keyword`: `$Ref`<LocalKeyword>, `$value`: Boolean)
    open fun IsKeywordEnabled(`$keyword`: `$Ref`<LocalKeyword>): Boolean
    open fun SetShaderPassEnabled(`$passName`: String, `$enabled`: Boolean)
    open fun GetShaderPassEnabled(`$passName`: String): Boolean
    open fun GetPassName(`$pass`: Number): String
    open fun FindPass(`$passName`: String): Number
    open fun SetOverrideTag(`$tag`: String, `$val`: String)
    open fun GetTag(`$tag`: String, `$searchFallbacks`: Boolean, `$defaultValue`: String): String
    open fun GetTag(`$tag`: String, `$searchFallbacks`: Boolean): String
    open fun Lerp(`$start`: Material, `$end`: Material, `$t`: Number)
    open fun SetPass(`$pass`: Number): Boolean
    open fun CopyPropertiesFromMaterial(`$mat`: Material)
    open fun ComputeCRC(): Number
    open fun GetTexturePropertyNames(): `Array$1`<String>
    open fun GetTexturePropertyNameIDs(): `Array$1`<Number>
    open fun GetTexturePropertyNames(`$outNames`: `List$1`<String>)
    open fun GetTexturePropertyNameIDs(`$outNames`: `List$1`<Number>)
    open fun SetInt(`$name`: String, `$value`: Number)
    open fun SetInt(`$nameID`: Number, `$value`: Number)
    open fun SetFloat(`$name`: String, `$value`: Number)
    open fun SetFloat(`$nameID`: Number, `$value`: Number)
    open fun SetInteger(`$name`: String, `$value`: Number)
    open fun SetInteger(`$nameID`: Number, `$value`: Number)
    open fun SetColor(`$name`: String, `$value`: Color)
    open fun SetColor(`$nameID`: Number, `$value`: Color)
    open fun SetVector(`$name`: String, `$value`: Vector4)
    open fun SetVector(`$nameID`: Number, `$value`: Vector4)
    open fun SetMatrix(`$name`: String, `$value`: Matrix4x4)
    open fun SetMatrix(`$nameID`: Number, `$value`: Matrix4x4)
    open fun SetTexture(`$name`: String, `$value`: Texture)
    open fun SetTexture(`$nameID`: Number, `$value`: Texture)
    open fun SetTexture(`$name`: String, `$value`: RenderTexture, `$element`: RenderTextureSubElement)
    open fun SetTexture(`$nameID`: Number, `$value`: RenderTexture, `$element`: RenderTextureSubElement)
    open fun SetBuffer(`$name`: String, `$value`: ComputeBuffer)
    open fun SetBuffer(`$nameID`: Number, `$value`: ComputeBuffer)
    open fun SetBuffer(`$name`: String, `$value`: GraphicsBuffer)
    open fun SetBuffer(`$nameID`: Number, `$value`: GraphicsBuffer)
    open fun SetConstantBuffer(`$name`: String, `$value`: ComputeBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$nameID`: Number, `$value`: ComputeBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$name`: String, `$value`: GraphicsBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$nameID`: Number, `$value`: GraphicsBuffer, `$offset`: Number, `$size`: Number)
    open fun SetFloatArray(`$name`: String, `$values`: `List$1`<Number>)
    open fun SetFloatArray(`$nameID`: Number, `$values`: `List$1`<Number>)
    open fun SetFloatArray(`$name`: String, `$values`: `Array$1`<Number>)
    open fun SetFloatArray(`$nameID`: Number, `$values`: `Array$1`<Number>)
    open fun SetColorArray(`$name`: String, `$values`: `List$1`<Color>)
    open fun SetColorArray(`$nameID`: Number, `$values`: `List$1`<Color>)
    open fun SetColorArray(`$name`: String, `$values`: `Array$1`<Color>)
    open fun SetColorArray(`$nameID`: Number, `$values`: `Array$1`<Color>)
    open fun SetVectorArray(`$name`: String, `$values`: `List$1`<Vector4>)
    open fun SetVectorArray(`$nameID`: Number, `$values`: `List$1`<Vector4>)
    open fun SetVectorArray(`$name`: String, `$values`: `Array$1`<Vector4>)
    open fun SetVectorArray(`$nameID`: Number, `$values`: `Array$1`<Vector4>)
    open fun SetMatrixArray(`$name`: String, `$values`: `List$1`<Matrix4x4>)
    open fun SetMatrixArray(`$nameID`: Number, `$values`: `List$1`<Matrix4x4>)
    open fun SetMatrixArray(`$name`: String, `$values`: `Array$1`<Matrix4x4>)
    open fun SetMatrixArray(`$nameID`: Number, `$values`: `Array$1`<Matrix4x4>)
    open fun GetInt(`$name`: String): Number
    open fun GetInt(`$nameID`: Number): Number
    open fun GetFloat(`$name`: String): Number
    open fun GetFloat(`$nameID`: Number): Number
    open fun GetInteger(`$name`: String): Number
    open fun GetInteger(`$nameID`: Number): Number
    open fun GetColor(`$name`: String): Color
    open fun GetColor(`$nameID`: Number): Color
    open fun GetVector(`$name`: String): Vector4
    open fun GetVector(`$nameID`: Number): Vector4
    open fun GetMatrix(`$name`: String): Matrix4x4
    open fun GetMatrix(`$nameID`: Number): Matrix4x4
    open fun GetTexture(`$name`: String): Texture
    open fun GetTexture(`$nameID`: Number): Texture
    open fun GetFloatArray(`$name`: String): `Array$1`<Number>
    open fun GetFloatArray(`$nameID`: Number): `Array$1`<Number>
    open fun GetColorArray(`$name`: String): `Array$1`<Color>
    open fun GetColorArray(`$nameID`: Number): `Array$1`<Color>
    open fun GetVectorArray(`$name`: String): `Array$1`<Vector4>
    open fun GetVectorArray(`$nameID`: Number): `Array$1`<Vector4>
    open fun GetMatrixArray(`$name`: String): `Array$1`<Matrix4x4>
    open fun GetMatrixArray(`$nameID`: Number): `Array$1`<Matrix4x4>
    open fun GetFloatArray(`$name`: String, `$values`: `List$1`<Number>)
    open fun GetFloatArray(`$nameID`: Number, `$values`: `List$1`<Number>)
    open fun GetColorArray(`$name`: String, `$values`: `List$1`<Color>)
    open fun GetColorArray(`$nameID`: Number, `$values`: `List$1`<Color>)
    open fun GetVectorArray(`$name`: String, `$values`: `List$1`<Vector4>)
    open fun GetVectorArray(`$nameID`: Number, `$values`: `List$1`<Vector4>)
    open fun GetMatrixArray(`$name`: String, `$values`: `List$1`<Matrix4x4>)
    open fun GetMatrixArray(`$nameID`: Number, `$values`: `List$1`<Matrix4x4>)
    open fun SetTextureOffset(`$name`: String, `$value`: Vector2)
    open fun SetTextureOffset(`$nameID`: Number, `$value`: Vector2)
    open fun SetTextureScale(`$name`: String, `$value`: Vector2)
    open fun SetTextureScale(`$nameID`: Number, `$value`: Vector2)
    open fun GetTextureOffset(`$name`: String): Vector2
    open fun GetTextureOffset(`$nameID`: Number): Vector2
    open fun GetTextureScale(`$name`: String): Vector2
    open fun GetTextureScale(`$nameID`: Number): Vector2
}

external open class MonoBehaviour : Behaviour {
    override var `var`: Any
    open var useGUILayout: Any
    open var runInEditMode: Any
    open fun IsInvoking(): Boolean
    open fun CancelInvoke()
    open fun Invoke(`$methodName`: String, `$time`: Number)
    open fun InvokeRepeating(`$methodName`: String, `$time`: Number, `$repeatRate`: Number)
    open fun CancelInvoke(`$methodName`: String)
    open fun IsInvoking(`$methodName`: String): Boolean
    open fun StartCoroutine(`$methodName`: String): Coroutine
    open fun StartCoroutine(`$methodName`: String, `$value`: Any): Coroutine
    open fun StartCoroutine(`$routine`: IEnumerator): Coroutine
    open fun StopCoroutine(`$routine`: IEnumerator)
    open fun StopCoroutine(`$routine`: Coroutine)
    open fun StopCoroutine(`$methodName`: String)
    open fun StopAllCoroutines()

    companion object {
        fun print(`$message`: Any)
    }
}

external open class Coroutine : YieldInstruction

external open class YieldInstruction : csharp.System.Object

external interface ICanvasRaycastFilter {
    fun IsRaycastLocationValid(`$sp`: Vector2, `$eventCamera`: Camera): Boolean
}

external interface ISerializationCallbackReceiver {
    fun OnBeforeSerialize()
    fun OnAfterDeserialize()
}

external open class Animator : Behaviour {
    override var `var`: Any
    open val isOptimizable: Any
    open val isHuman: Any
    open val hasRootMotion: Any
    open val humanScale: Any
    open val isInitialized: Any
    open val deltaRotation: Any
    open var rootRotation: Any
    open var applyRootMotion: Any
    open var updateMode: Any
    open val hasTransformHierarchy: Any
    open val gravityWeight: Any
    open var bodyRotation: Any
    open var stabilizeFeet: Any
    open val layerCount: Any
    open val parameterCount: Any
    open var feetPivotActive: Any
    open val pivotWeight: Any
    open val isMatchingTarget: Any
    open var speed: Any
    open val targetRotation: Any
    open var cullingMode: Any
    open var playbackTime: Any
    open var recorderStartTime: Any
    open var recorderStopTime: Any
    open val recorderMode: Any
    open var runtimeAnimatorController: Any
    open val hasBoundPlayables: Any
    open var avatar: Any
    open val playableGraph: Any
    open var layersAffectMassCenter: Any
    open val leftFeetBottomHeight: Any
    open val rightFeetBottomHeight: Any
    open var logWarnings: Any
    open var fireEvents: Any
    open var keepAnimatorControllerStateOnDisable: Any
    open fun GetFloat(`$name`: String): Number
    open fun GetFloat(`$id`: Number): Number
    open fun SetFloat(`$name`: String, `$value`: Number)
    open fun SetFloat(`$name`: String, `$value`: Number, `$dampTime`: Number, `$deltaTime`: Number)
    open fun SetFloat(`$id`: Number, `$value`: Number)
    open fun SetFloat(`$id`: Number, `$value`: Number, `$dampTime`: Number, `$deltaTime`: Number)
    open fun GetBool(`$name`: String): Boolean
    open fun GetBool(`$id`: Number): Boolean
    open fun SetBool(`$name`: String, `$value`: Boolean)
    open fun SetBool(`$id`: Number, `$value`: Boolean)
    open fun GetInteger(`$name`: String): Number
    open fun GetInteger(`$id`: Number): Number
    open fun SetInteger(`$name`: String, `$value`: Number)
    open fun SetInteger(`$id`: Number, `$value`: Number)
    open fun SetTrigger(`$name`: String)
    open fun SetTrigger(`$id`: Number)
    open fun ResetTrigger(`$name`: String)
    open fun ResetTrigger(`$id`: Number)
    open fun IsParameterControlledByCurve(`$name`: String): Boolean
    open fun IsParameterControlledByCurve(`$id`: Number): Boolean
    open fun GetIKPosition(`$goal`: AvatarIKGoal): Vector3
    open fun SetIKPosition(`$goal`: AvatarIKGoal, `$goalPosition`: Vector3)
    open fun GetIKRotation(`$goal`: AvatarIKGoal): Quaternion
    open fun SetIKRotation(`$goal`: AvatarIKGoal, `$goalRotation`: Quaternion)
    open fun GetIKPositionWeight(`$goal`: AvatarIKGoal): Number
    open fun SetIKPositionWeight(`$goal`: AvatarIKGoal, `$value`: Number)
    open fun GetIKRotationWeight(`$goal`: AvatarIKGoal): Number
    open fun SetIKRotationWeight(`$goal`: AvatarIKGoal, `$value`: Number)
    open fun GetIKHintPosition(`$hint`: AvatarIKHint): Vector3
    open fun SetIKHintPosition(`$hint`: AvatarIKHint, `$hintPosition`: Vector3)
    open fun GetIKHintPositionWeight(`$hint`: AvatarIKHint): Number
    open fun SetIKHintPositionWeight(`$hint`: AvatarIKHint, `$value`: Number)
    open fun SetLookAtPosition(`$lookAtPosition`: Vector3)
    open fun SetLookAtWeight(`$weight`: Number)
    open fun SetLookAtWeight(`$weight`: Number, `$bodyWeight`: Number)
    open fun SetLookAtWeight(`$weight`: Number, `$bodyWeight`: Number, `$headWeight`: Number)
    open fun SetLookAtWeight(`$weight`: Number, `$bodyWeight`: Number, `$headWeight`: Number, `$eyesWeight`: Number)
    open fun SetLookAtWeight(`$weight`: Number, `$bodyWeight`: Number, `$headWeight`: Number, `$eyesWeight`: Number, `$clampWeight`: Number)
    open fun SetBoneLocalRotation(`$humanBoneId`: HumanBodyBones, `$rotation`: Quaternion)
    open fun GetBehaviours(`$fullPathHash`: Number, `$layerIndex`: Number): `Array$1`<StateMachineBehaviour>
    open fun GetLayerName(`$layerIndex`: Number): String
    open fun GetLayerIndex(`$layerName`: String): Number
    open fun GetLayerWeight(`$layerIndex`: Number): Number
    open fun SetLayerWeight(`$layerIndex`: Number, `$weight`: Number)
    open fun GetCurrentAnimatorStateInfo(`$layerIndex`: Number): AnimatorStateInfo
    open fun GetNextAnimatorStateInfo(`$layerIndex`: Number): AnimatorStateInfo
    open fun GetAnimatorTransitionInfo(`$layerIndex`: Number): AnimatorTransitionInfo
    open fun GetCurrentAnimatorClipInfoCount(`$layerIndex`: Number): Number
    open fun GetNextAnimatorClipInfoCount(`$layerIndex`: Number): Number
    open fun GetCurrentAnimatorClipInfo(`$layerIndex`: Number): `Array$1`<AnimatorClipInfo>
    open fun GetNextAnimatorClipInfo(`$layerIndex`: Number): `Array$1`<AnimatorClipInfo>
    open fun GetCurrentAnimatorClipInfo(`$layerIndex`: Number, `$clips`: `List$1`<AnimatorClipInfo>)
    open fun GetNextAnimatorClipInfo(`$layerIndex`: Number, `$clips`: `List$1`<AnimatorClipInfo>)
    open fun IsInTransition(`$layerIndex`: Number): Boolean
    open fun GetParameter(`$index`: Number): AnimatorControllerParameter
    open fun MatchTarget(`$matchPosition`: Vector3, `$matchRotation`: Quaternion, `$targetBodyPart`: AvatarTarget, `$weightMask`: MatchTargetWeightMask, `$startNormalizedTime`: Number)
    open fun MatchTarget(`$matchPosition`: Vector3, `$matchRotation`: Quaternion, `$targetBodyPart`: AvatarTarget, `$weightMask`: MatchTargetWeightMask, `$startNormalizedTime`: Number, `$targetNormalizedTime`: Number)
    open fun MatchTarget(`$matchPosition`: Vector3, `$matchRotation`: Quaternion, `$targetBodyPart`: AvatarTarget, `$weightMask`: MatchTargetWeightMask, `$startNormalizedTime`: Number, `$targetNormalizedTime`: Number, `$completeMatch`: Boolean)
    open fun InterruptMatchTarget()
    open fun InterruptMatchTarget(`$completeMatch`: Boolean)
    open fun CrossFadeInFixedTime(`$stateName`: String, `$fixedTransitionDuration`: Number)
    open fun CrossFadeInFixedTime(`$stateName`: String, `$fixedTransitionDuration`: Number, `$layer`: Number)
    open fun CrossFadeInFixedTime(`$stateName`: String, `$fixedTransitionDuration`: Number, `$layer`: Number, `$fixedTimeOffset`: Number)
    open fun CrossFadeInFixedTime(`$stateName`: String, `$fixedTransitionDuration`: Number, `$layer`: Number, `$fixedTimeOffset`: Number, `$normalizedTransitionTime`: Number)
    open fun CrossFadeInFixedTime(`$stateHashName`: Number, `$fixedTransitionDuration`: Number, `$layer`: Number, `$fixedTimeOffset`: Number)
    open fun CrossFadeInFixedTime(`$stateHashName`: Number, `$fixedTransitionDuration`: Number, `$layer`: Number)
    open fun CrossFadeInFixedTime(`$stateHashName`: Number, `$fixedTransitionDuration`: Number)
    open fun CrossFadeInFixedTime(`$stateHashName`: Number, `$fixedTransitionDuration`: Number, `$layer`: Number, `$fixedTimeOffset`: Number, `$normalizedTransitionTime`: Number)
    open fun WriteDefaultValues()
    open fun CrossFade(`$stateName`: String, `$normalizedTransitionDuration`: Number, `$layer`: Number, `$normalizedTimeOffset`: Number)
    open fun CrossFade(`$stateName`: String, `$normalizedTransitionDuration`: Number, `$layer`: Number)
    open fun CrossFade(`$stateName`: String, `$normalizedTransitionDuration`: Number)
    open fun CrossFade(`$stateName`: String, `$normalizedTransitionDuration`: Number, `$layer`: Number, `$normalizedTimeOffset`: Number, `$normalizedTransitionTime`: Number)
    open fun CrossFade(`$stateHashName`: Number, `$normalizedTransitionDuration`: Number, `$layer`: Number, `$normalizedTimeOffset`: Number, `$normalizedTransitionTime`: Number)
    open fun CrossFade(`$stateHashName`: Number, `$normalizedTransitionDuration`: Number, `$layer`: Number, `$normalizedTimeOffset`: Number)
    open fun CrossFade(`$stateHashName`: Number, `$normalizedTransitionDuration`: Number, `$layer`: Number)
    open fun CrossFade(`$stateHashName`: Number, `$normalizedTransitionDuration`: Number)
    open fun PlayInFixedTime(`$stateName`: String, `$layer`: Number)
    open fun PlayInFixedTime(`$stateName`: String)
    open fun PlayInFixedTime(`$stateName`: String, `$layer`: Number, `$fixedTime`: Number)
    open fun PlayInFixedTime(`$stateNameHash`: Number, `$layer`: Number, `$fixedTime`: Number)
    open fun PlayInFixedTime(`$stateNameHash`: Number, `$layer`: Number)
    open fun PlayInFixedTime(`$stateNameHash`: Number)
    open fun Play(`$stateName`: String, `$layer`: Number)
    open fun Play(`$stateName`: String)
    open fun Play(`$stateName`: String, `$layer`: Number, `$normalizedTime`: Number)
    open fun Play(`$stateNameHash`: Number, `$layer`: Number, `$normalizedTime`: Number)
    open fun Play(`$stateNameHash`: Number, `$layer`: Number)
    open fun Play(`$stateNameHash`: Number)
    open fun SetTarget(`$targetIndex`: AvatarTarget, `$targetNormalizedTime`: Number)
    open fun GetBoneTransform(`$humanBoneId`: HumanBodyBones): Transform
    open fun StartPlayback()
    open fun StopPlayback()
    open fun StartRecording(`$frameCount`: Number)
    open fun StopRecording()
    open fun HasState(`$layerIndex`: Number, `$stateID`: Number): Boolean
    open fun Update(`$deltaTime`: Number)
    open fun Rebind()
    open fun ApplyBuiltinRootMotion()

    companion object {
        fun StringToHash(`$name`: String): Number
    }
}

external open class TouchScreenKeyboard : csharp.System.Object {
    constructor(`$text`: String, `$keyboardType`: TouchScreenKeyboardType, `$autocorrection`: Boolean, `$multiline`: Boolean, `$secure`: Boolean, `$alert`: Boolean, `$textPlaceholder`: String, `$characterLimit`: Number)
    constructor()
    open var `var`: Any
    open var text: Any
    open var active: Any
    open val status: Any
    open var characterLimit: Any
    open val canGetSelection: Any
    open val canSetSelection: Any
    open var selection: Any
    open val type: Any
    open var targetDisplay: Any
    open class Android : csharp.System.Object

    companion object {
        fun Open(`$text`: String, `$keyboardType`: TouchScreenKeyboardType, `$autocorrection`: Boolean, `$multiline`: Boolean, `$secure`: Boolean, `$alert`: Boolean, `$textPlaceholder`: String, `$characterLimit`: Number): TouchScreenKeyboard
        fun Open(`$text`: String, `$keyboardType`: TouchScreenKeyboardType, `$autocorrection`: Boolean, `$multiline`: Boolean, `$secure`: Boolean, `$alert`: Boolean, `$textPlaceholder`: String): TouchScreenKeyboard
        fun Open(`$text`: String, `$keyboardType`: TouchScreenKeyboardType, `$autocorrection`: Boolean, `$multiline`: Boolean, `$secure`: Boolean, `$alert`: Boolean): TouchScreenKeyboard
        fun Open(`$text`: String, `$keyboardType`: TouchScreenKeyboardType, `$autocorrection`: Boolean, `$multiline`: Boolean, `$secure`: Boolean): TouchScreenKeyboard
        fun Open(`$text`: String, `$keyboardType`: TouchScreenKeyboardType, `$autocorrection`: Boolean, `$multiline`: Boolean): TouchScreenKeyboard
        fun Open(`$text`: String, `$keyboardType`: TouchScreenKeyboardType, `$autocorrection`: Boolean): TouchScreenKeyboard
        fun Open(`$text`: String, `$keyboardType`: TouchScreenKeyboardType): TouchScreenKeyboard
        fun Open(`$text`: String): TouchScreenKeyboard
    }
}

external enum class TouchScreenKeyboardType {
    Default /* = 0 */,
    ASCIICapable /* = 1 */,
    NumbersAndPunctuation /* = 2 */,
    URL /* = 3 */,
    NumberPad /* = 4 */,
    PhonePad /* = 5 */,
    NamePhonePad /* = 6 */,
    EmailAddress /* = 7 */,
    NintendoNetworkAccount /* = 8 */,
    Social /* = 9 */,
    Search /* = 10 */,
    DecimalPad /* = 11 */,
    OneTimeCode /* = 12 */
}

external open class Event : csharp.System.Object {
    constructor()
    constructor(`$displayIndex`: Number)
    constructor(`$other`: Event)
    open var `var`: Any
    open val rawType: Any
    open var pointerType: Any
    open var button: Any
    open var modifiers: Any
    open var pressure: Any
    open var clickCount: Any
    open var character: Any
    open var keyCode: Any
    open var displayIndex: Any
    open var type: Any
    open var commandName: Any
    open var shift: Any
    open var control: Any
    open var alt: Any
    open var command: Any
    open var capsLock: Any
    open var numeric: Any
    open val functionKey: Any
    open val isKey: Any
    open val isMouse: Any
    open val isScrollWheel: Any
    open fun GetTypeForControl(`$controlID`: Number): EventType
    open fun Use()

    companion object {
        fun PopEvent(`$outEvent`: Event): Boolean
        fun GetEventCount(): Number
        fun KeyboardEvent(`$key`: String): Event
    }
}

external interface AndroidJavaRunnable {
    @nativeInvoke
    operator fun invoke()
    var Invoke: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external open class AndroidJavaException : Exception, ISerializable, _Exception {
    open var `var`: Any
    open val StackTrace: Any
}

external open class AndroidJavaObject : csharp.System.Object, IDisposable {
    constructor(`$className`: String, `$args`: `Array$1`<String>)
    constructor(`$className`: String, `$args`: `Array$1`<AndroidJavaObject>)
    constructor(`$className`: String, `$args`: `Array$1`<AndroidJavaClass>)
    constructor(`$className`: String, `$args`: `Array$1`<AndroidJavaProxy>)
    constructor(`$className`: String, `$args`: `Array$1`<AndroidJavaRunnable>)
    constructor(`$className`: String, vararg args: Any)
    constructor()
    open fun Dispose()
    open fun Call(`$methodName`: String, vararg args: Any)
    open fun CallStatic(`$methodName`: String, vararg args: Any)
    open fun GetRawObject(): IntPtr
    open fun GetRawClass(): IntPtr
    open fun CloneReference(): AndroidJavaObject
}

external open class AndroidJavaClass : AndroidJavaObject, IDisposable {
    constructor(`$className`: String)
    constructor(`$className`: String, `$args`: `Array$1`<String>)
    constructor(`$className`: String, `$args`: `Array$1`<AndroidJavaObject>)
    constructor(`$className`: String, `$args`: `Array$1`<AndroidJavaClass>)
    constructor(`$className`: String, `$args`: `Array$1`<AndroidJavaProxy>)
    constructor(`$className`: String, `$args`: `Array$1`<AndroidJavaRunnable>)
    constructor(`$className`: String, vararg args: Any)
    constructor()
}

external open class AndroidJavaProxy : csharp.System.Object

external open class jvalue : ValueType {
    open var z: Boolean
    open var b: Number
    open var c: Number
    open var s: Number
    open var i: Number
    open var j: Any
    open var f: Number
    open var d: Number
    open var l: IntPtr
}

external open class AndroidJNIHelper : csharp.System.Object {
    companion object {
        fun GetConstructorID(`$javaClass`: IntPtr): IntPtr
        fun GetConstructorID(`$javaClass`: IntPtr, `$signature`: String): IntPtr
        fun GetMethodID(`$javaClass`: IntPtr, `$methodName`: String): IntPtr
        fun GetMethodID(`$javaClass`: IntPtr, `$methodName`: String, `$signature`: String): IntPtr
        fun GetMethodID(`$javaClass`: IntPtr, `$methodName`: String, `$signature`: String, `$isStatic`: Boolean): IntPtr
        fun GetFieldID(`$javaClass`: IntPtr, `$fieldName`: String): IntPtr
        fun GetFieldID(`$javaClass`: IntPtr, `$fieldName`: String, `$signature`: String): IntPtr
        fun GetFieldID(`$javaClass`: IntPtr, `$fieldName`: String, `$signature`: String, `$isStatic`: Boolean): IntPtr
        fun CreateJavaRunnable(`$jrunnable`: AndroidJavaRunnable): IntPtr
        fun CreateJavaProxy(`$proxy`: AndroidJavaProxy): IntPtr
        fun ConvertToJNIArray(`$array`: Array): IntPtr
        fun CreateJNIArgArray(`$args`: `Array$1`<Any>): `Array$1`<jvalue>
        fun DeleteJNIArgArray(`$args`: `Array$1`<Any>, `$jniArgs`: `Array$1`<jvalue>)
        fun GetConstructorID(`$jclass`: IntPtr, `$args`: `Array$1`<Any>): IntPtr
        fun GetMethodID(`$jclass`: IntPtr, `$methodName`: String, `$args`: `Array$1`<Any>, `$isStatic`: Boolean): IntPtr
        fun GetSignature(`$obj`: Any): String
        fun GetSignature(`$args`: `Array$1`<Any>): String
    }
}

external open class AndroidJNI : csharp.System.Object {
    companion object {
        fun AttachCurrentThread(): Number
        fun DetachCurrentThread(): Number
        fun GetVersion(): Number
        fun FindClass(`$name`: String): IntPtr
        fun FromReflectedMethod(`$refMethod`: IntPtr): IntPtr
        fun FromReflectedField(`$refField`: IntPtr): IntPtr
        fun ToReflectedMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$isStatic`: Boolean): IntPtr
        fun ToReflectedField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$isStatic`: Boolean): IntPtr
        fun GetSuperclass(`$clazz`: IntPtr): IntPtr
        fun IsAssignableFrom(`$clazz1`: IntPtr, `$clazz2`: IntPtr): Boolean
        fun Throw(`$obj`: IntPtr): Number
        fun ThrowNew(`$clazz`: IntPtr, `$message`: String): Number
        fun ExceptionOccurred(): IntPtr
        fun ExceptionDescribe()
        fun ExceptionClear()
        fun FatalError(`$message`: String)
        fun PushLocalFrame(`$capacity`: Number): Number
        fun PopLocalFrame(`$ptr`: IntPtr): IntPtr
        fun NewGlobalRef(`$obj`: IntPtr): IntPtr
        fun DeleteGlobalRef(`$obj`: IntPtr)
        fun NewWeakGlobalRef(`$obj`: IntPtr): IntPtr
        fun DeleteWeakGlobalRef(`$obj`: IntPtr)
        fun NewLocalRef(`$obj`: IntPtr): IntPtr
        fun DeleteLocalRef(`$obj`: IntPtr)
        fun IsSameObject(`$obj1`: IntPtr, `$obj2`: IntPtr): Boolean
        fun EnsureLocalCapacity(`$capacity`: Number): Number
        fun AllocObject(`$clazz`: IntPtr): IntPtr
        fun NewObject(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): IntPtr
        fun GetObjectClass(`$obj`: IntPtr): IntPtr
        fun IsInstanceOf(`$obj`: IntPtr, `$clazz`: IntPtr): Boolean
        fun GetMethodID(`$clazz`: IntPtr, `$name`: String, `$sig`: String): IntPtr
        fun GetFieldID(`$clazz`: IntPtr, `$name`: String, `$sig`: String): IntPtr
        fun GetStaticMethodID(`$clazz`: IntPtr, `$name`: String, `$sig`: String): IntPtr
        fun GetStaticFieldID(`$clazz`: IntPtr, `$name`: String, `$sig`: String): IntPtr
        fun NewString(`$chars`: String): IntPtr
        fun NewString(`$chars`: `Array$1`<Number>): IntPtr
        fun NewStringUTF(`$bytes`: String): IntPtr
        fun GetStringChars(`$str`: IntPtr): String
        fun GetStringLength(`$str`: IntPtr): Number
        fun GetStringUTFLength(`$str`: IntPtr): Number
        fun GetStringUTFChars(`$str`: IntPtr): String
        fun CallStringMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): String
        fun CallObjectMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): IntPtr
        fun CallIntMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallBooleanMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Boolean
        fun CallShortMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallSByteMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallCharMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallFloatMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallDoubleMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallLongMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Any
        fun CallVoidMethod(`$obj`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>)
        fun GetStringField(`$obj`: IntPtr, `$fieldID`: IntPtr): String
        fun GetObjectField(`$obj`: IntPtr, `$fieldID`: IntPtr): IntPtr
        fun GetBooleanField(`$obj`: IntPtr, `$fieldID`: IntPtr): Boolean
        fun GetSByteField(`$obj`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetCharField(`$obj`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetShortField(`$obj`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetIntField(`$obj`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetLongField(`$obj`: IntPtr, `$fieldID`: IntPtr): Any
        fun GetFloatField(`$obj`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetDoubleField(`$obj`: IntPtr, `$fieldID`: IntPtr): Number
        fun SetStringField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: String)
        fun SetObjectField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: IntPtr)
        fun SetBooleanField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: Boolean)
        fun SetSByteField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetCharField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetShortField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetIntField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetLongField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: Any)
        fun SetFloatField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetDoubleField(`$obj`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun CallStaticStringMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): String
        fun CallStaticObjectMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): IntPtr
        fun CallStaticIntMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallStaticBooleanMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Boolean
        fun CallStaticShortMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallStaticSByteMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallStaticCharMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallStaticFloatMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallStaticDoubleMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Number
        fun CallStaticLongMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>): Any
        fun CallStaticVoidMethod(`$clazz`: IntPtr, `$methodID`: IntPtr, `$args`: `Array$1`<jvalue>)
        fun GetStaticStringField(`$clazz`: IntPtr, `$fieldID`: IntPtr): String
        fun GetStaticObjectField(`$clazz`: IntPtr, `$fieldID`: IntPtr): IntPtr
        fun GetStaticBooleanField(`$clazz`: IntPtr, `$fieldID`: IntPtr): Boolean
        fun GetStaticSByteField(`$clazz`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetStaticCharField(`$clazz`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetStaticShortField(`$clazz`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetStaticIntField(`$clazz`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetStaticLongField(`$clazz`: IntPtr, `$fieldID`: IntPtr): Any
        fun GetStaticFloatField(`$clazz`: IntPtr, `$fieldID`: IntPtr): Number
        fun GetStaticDoubleField(`$clazz`: IntPtr, `$fieldID`: IntPtr): Number
        fun SetStaticStringField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: String)
        fun SetStaticObjectField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: IntPtr)
        fun SetStaticBooleanField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: Boolean)
        fun SetStaticSByteField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetStaticCharField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetStaticShortField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetStaticIntField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetStaticLongField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: Any)
        fun SetStaticFloatField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun SetStaticDoubleField(`$clazz`: IntPtr, `$fieldID`: IntPtr, `$val`: Number)
        fun ToBooleanArray(`$array`: `Array$1`<Boolean>): IntPtr
        fun ToSByteArray(`$array`: `Array$1`<Number>): IntPtr
        fun ToCharArray(`$array`: `Array$1`<Number>): IntPtr
        fun ToShortArray(`$array`: `Array$1`<Number>): IntPtr
        fun ToIntArray(`$array`: `Array$1`<Number>): IntPtr
        fun ToLongArray(`$array`: `Array$1`<Any>): IntPtr
        fun ToFloatArray(`$array`: `Array$1`<Number>): IntPtr
        fun ToDoubleArray(`$array`: `Array$1`<Number>): IntPtr
        fun ToObjectArray(`$array`: `Array$1`<IntPtr>, `$arrayClass`: IntPtr): IntPtr
        fun ToObjectArray(`$array`: `Array$1`<IntPtr>): IntPtr
        fun FromBooleanArray(`$array`: IntPtr): `Array$1`<Boolean>
        fun FromSByteArray(`$array`: IntPtr): `Array$1`<Number>
        fun FromCharArray(`$array`: IntPtr): `Array$1`<Number>
        fun FromShortArray(`$array`: IntPtr): `Array$1`<Number>
        fun FromIntArray(`$array`: IntPtr): `Array$1`<Number>
        fun FromLongArray(`$array`: IntPtr): `Array$1`<Any>
        fun FromFloatArray(`$array`: IntPtr): `Array$1`<Number>
        fun FromDoubleArray(`$array`: IntPtr): `Array$1`<Number>
        fun FromObjectArray(`$array`: IntPtr): `Array$1`<IntPtr>
        fun GetArrayLength(`$array`: IntPtr): Number
        fun NewBooleanArray(`$size`: Number): IntPtr
        fun NewSByteArray(`$size`: Number): IntPtr
        fun NewCharArray(`$size`: Number): IntPtr
        fun NewShortArray(`$size`: Number): IntPtr
        fun NewIntArray(`$size`: Number): IntPtr
        fun NewLongArray(`$size`: Number): IntPtr
        fun NewFloatArray(`$size`: Number): IntPtr
        fun NewDoubleArray(`$size`: Number): IntPtr
        fun NewObjectArray(`$size`: Number, `$clazz`: IntPtr, `$obj`: IntPtr): IntPtr
        fun GetBooleanArrayElement(`$array`: IntPtr, `$index`: Number): Boolean
        fun GetSByteArrayElement(`$array`: IntPtr, `$index`: Number): Number
        fun GetCharArrayElement(`$array`: IntPtr, `$index`: Number): Number
        fun GetShortArrayElement(`$array`: IntPtr, `$index`: Number): Number
        fun GetIntArrayElement(`$array`: IntPtr, `$index`: Number): Number
        fun GetLongArrayElement(`$array`: IntPtr, `$index`: Number): Any
        fun GetFloatArrayElement(`$array`: IntPtr, `$index`: Number): Number
        fun GetDoubleArrayElement(`$array`: IntPtr, `$index`: Number): Number
        fun GetObjectArrayElement(`$array`: IntPtr, `$index`: Number): IntPtr
        fun SetBooleanArrayElement(`$array`: IntPtr, `$index`: Number, `$val`: Boolean)
        fun SetSByteArrayElement(`$array`: IntPtr, `$index`: Number, `$val`: Number)
        fun SetCharArrayElement(`$array`: IntPtr, `$index`: Number, `$val`: Number)
        fun SetShortArrayElement(`$array`: IntPtr, `$index`: Number, `$val`: Number)
        fun SetIntArrayElement(`$array`: IntPtr, `$index`: Number, `$val`: Number)
        fun SetLongArrayElement(`$array`: IntPtr, `$index`: Number, `$val`: Any)
        fun SetFloatArrayElement(`$array`: IntPtr, `$index`: Number, `$val`: Number)
        fun SetDoubleArrayElement(`$array`: IntPtr, `$index`: Number, `$val`: Number)
        fun SetObjectArrayElement(`$array`: IntPtr, `$index`: Number, `$obj`: IntPtr)
    }
}

external open class AnimationInfo : ValueType

external enum class AnimatorUpdateMode {
    Normal /* = 0 */,
    AnimatePhysics /* = 1 */,
    UnscaledTime /* = 2 */
}

external enum class AvatarIKGoal {
    LeftFoot /* = 0 */,
    RightFoot /* = 1 */,
    LeftHand /* = 2 */,
    RightHand /* = 3 */
}

external enum class AvatarIKHint {
    LeftKnee /* = 0 */,
    RightKnee /* = 1 */,
    LeftElbow /* = 2 */,
    RightElbow /* = 3 */
}

external enum class HumanBodyBones {
    Hips /* = 0 */,
    LeftUpperLeg /* = 1 */,
    RightUpperLeg /* = 2 */,
    LeftLowerLeg /* = 3 */,
    RightLowerLeg /* = 4 */,
    LeftFoot /* = 5 */,
    RightFoot /* = 6 */,
    Spine /* = 7 */,
    Chest /* = 8 */,
    UpperChest /* = 54 */,
    Neck /* = 9 */,
    Head /* = 10 */,
    LeftShoulder /* = 11 */,
    RightShoulder /* = 12 */,
    LeftUpperArm /* = 13 */,
    RightUpperArm /* = 14 */,
    LeftLowerArm /* = 15 */,
    RightLowerArm /* = 16 */,
    LeftHand /* = 17 */,
    RightHand /* = 18 */,
    LeftToes /* = 19 */,
    RightToes /* = 20 */,
    LeftEye /* = 21 */,
    RightEye /* = 22 */,
    Jaw /* = 23 */,
    LeftThumbProximal /* = 24 */,
    LeftThumbIntermediate /* = 25 */,
    LeftThumbDistal /* = 26 */,
    LeftIndexProximal /* = 27 */,
    LeftIndexIntermediate /* = 28 */,
    LeftIndexDistal /* = 29 */,
    LeftMiddleProximal /* = 30 */,
    LeftMiddleIntermediate /* = 31 */,
    LeftMiddleDistal /* = 32 */,
    LeftRingProximal /* = 33 */,
    LeftRingIntermediate /* = 34 */,
    LeftRingDistal /* = 35 */,
    LeftLittleProximal /* = 36 */,
    LeftLittleIntermediate /* = 37 */,
    LeftLittleDistal /* = 38 */,
    RightThumbProximal /* = 39 */,
    RightThumbIntermediate /* = 40 */,
    RightThumbDistal /* = 41 */,
    RightIndexProximal /* = 42 */,
    RightIndexIntermediate /* = 43 */,
    RightIndexDistal /* = 44 */,
    RightMiddleProximal /* = 45 */,
    RightMiddleIntermediate /* = 46 */,
    RightMiddleDistal /* = 47 */,
    RightRingProximal /* = 48 */,
    RightRingIntermediate /* = 49 */,
    RightRingDistal /* = 50 */,
    RightLittleProximal /* = 51 */,
    RightLittleIntermediate /* = 52 */,
    RightLittleDistal /* = 53 */,
    LastBone /* = 55 */
}

external open class StateMachineBehaviour : ScriptableObject {
    open fun OnStateEnter(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number)
    open fun OnStateUpdate(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number)
    open fun OnStateExit(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number)
    open fun OnStateMove(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number)
    open fun OnStateIK(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number)
    open fun OnStateMachineEnter(`$animator`: Animator, `$stateMachinePathHash`: Number)
    open fun OnStateMachineExit(`$animator`: Animator, `$stateMachinePathHash`: Number)
    open fun OnStateEnter(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number, `$controller`: AnimatorControllerPlayable)
    open fun OnStateUpdate(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number, `$controller`: AnimatorControllerPlayable)
    open fun OnStateExit(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number, `$controller`: AnimatorControllerPlayable)
    open fun OnStateMove(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number, `$controller`: AnimatorControllerPlayable)
    open fun OnStateIK(`$animator`: Animator, `$stateInfo`: AnimatorStateInfo, `$layerIndex`: Number, `$controller`: AnimatorControllerPlayable)
    open fun OnStateMachineEnter(`$animator`: Animator, `$stateMachinePathHash`: Number, `$controller`: AnimatorControllerPlayable)
    open fun OnStateMachineExit(`$animator`: Animator, `$stateMachinePathHash`: Number, `$controller`: AnimatorControllerPlayable)
}

external open class ScriptableObject : Object {
    companion object {
        fun CreateInstance(`$className`: String): ScriptableObject
        fun CreateInstance(`$type`: Type): ScriptableObject
    }
}

external open class AnimatorStateInfo : ValueType {
    open var `var`: Any
    open val fullPathHash: Any
    open val shortNameHash: Any
    open val normalizedTime: Any
    open val length: Any
    open val speed: Any
    open val speedMultiplier: Any
    open val tagHash: Any
    open val loop: Any
    open fun IsName(`$name`: String): Boolean
    open fun IsTag(`$tag`: String): Boolean
}

external open class AnimatorTransitionInfo : ValueType {
    open var `var`: Any
    open val fullPathHash: Any
    open val nameHash: Any
    open val userNameHash: Any
    open val durationUnit: Any
    open val duration: Any
    open val normalizedTime: Any
    open val anyState: Any
    open fun IsName(`$name`: String): Boolean
    open fun IsUserName(`$name`: String): Boolean
}

external open class AnimatorClipInfo : ValueType {
    open var `var`: Any
    open val clip: Any
    open val weight: Any
}

external open class AnimatorControllerParameter : csharp.System.Object {
    open var `var`: Any
    open var name: Any
    open val nameHash: Any
    open var type: Any
    open var defaultFloat: Any
    open var defaultInt: Any
    open var defaultBool: Any
}

external enum class AvatarTarget {
    Root /* = 0 */,
    Body /* = 1 */,
    LeftFoot /* = 2 */,
    RightFoot /* = 3 */,
    LeftHand /* = 4 */,
    RightHand /* = 5 */
}

external open class MatchTargetWeightMask : ValueType {
    constructor(`$positionXYZWeight`: Vector3, `$rotationWeight`: Number)
    constructor()
    open var `var`: Any
    open var rotationWeight: Any
}

external enum class AnimatorCullingMode {
    AlwaysAnimate /* = 0 */,
    CullUpdateTransforms /* = 1 */,
    CullCompletely /* = 2 */,
    BasedOnRenderers /* = 1 */
}

external enum class AnimatorRecorderMode {
    Offline /* = 0 */,
    Playback /* = 1 */,
    Record /* = 2 */
}

external open class RuntimeAnimatorController : Object

external open class Avatar : Object {
    override var `var`: Any
    open val isValid: Any
    open val isHuman: Any
    open val humanDescription: Any
}

external interface IAnimationClipSource {
    fun GetAnimationClips(`$results`: `List$1`<AnimationClip>)
}

external open class AnimationClip : Motion {
    override var `var`: Any
    open val length: Any
    open var frameRate: Any
    open var wrapMode: Any
    open var localBounds: Any
    //open var legacy: Any
    open val humanMotion: Any
    open val empty: Any
    open val hasGenericRootTransform: Any
    open val hasMotionFloatCurves: Any
    open val hasMotionCurves: Any
    open val hasRootCurves: Any
    open fun SampleAnimation(`$go`: GameObject, `$time`: Number)
    open fun SetCurve(`$relativePath`: String, `$type`: Type, `$propertyName`: String, `$curve`: AnimationCurve)
    open fun EnsureQuaternionContinuity()
    open fun ClearCurves()
    open fun AddEvent(`$evt`: AnimationEvent)
}

external open class Motion : Object {
    override var `var`: Any
    open val averageDuration: Any
    open val averageAngularSpeed: Any
    open val apparentSpeed: Any
    open val isLooping: Any
    open val legacy: Any
    open val isHumanMotion: Any
}

external open class SharedBetweenAnimatorsAttribute : Attribute, _Attribute

external enum class PlayMode {
    StopSameLayer /* = 0 */,
    StopAll /* = 4 */
}

external enum class QueueMode {
    CompleteOthers /* = 0 */,
    PlayNow /* = 2 */
}

external enum class AnimationBlendMode {
    Blend /* = 0 */,
    Additive /* = 1 */
}

external enum class AnimationPlayMode {
    Stop /* = 0 */,
    Queue /* = 1 */,
    Mix /* = 2 */
}

external enum class AnimationCullingType {
    AlwaysAnimate /* = 0 */,
    BasedOnRenderers /* = 1 */,
    BasedOnClipBounds /* = 2 */,
    BasedOnUserBounds /* = 3 */
}

external open class Animation : Behaviour, IEnumerable {
    override var `var`: Any
    open var clip: Any
    open var playAutomatically: Any
    open var wrapMode: Any
    open val isPlaying: Any
    open var animatePhysics: Any
    open var cullingType: Any
    open var localBounds: Any
    open fun Stop()
    open fun Stop(`$name`: String)
    open fun Rewind()
    open fun Rewind(`$name`: String)
    open fun Sample()
    open fun IsPlaying(`$name`: String): Boolean
    open fun get_Item(`$name`: String): AnimationState
    open fun Play(): Boolean
    open fun Play(`$mode`: PlayMode): Boolean
    open fun Play(`$animation`: String): Boolean
    open fun Play(`$animation`: String, `$mode`: PlayMode): Boolean
    open fun CrossFade(`$animation`: String)
    open fun CrossFade(`$animation`: String, `$fadeLength`: Number)
    open fun CrossFade(`$animation`: String, `$fadeLength`: Number, `$mode`: PlayMode)
    open fun Blend(`$animation`: String)
    open fun Blend(`$animation`: String, `$targetWeight`: Number)
    open fun Blend(`$animation`: String, `$targetWeight`: Number, `$fadeLength`: Number)
    open fun CrossFadeQueued(`$animation`: String): AnimationState
    open fun CrossFadeQueued(`$animation`: String, `$fadeLength`: Number): AnimationState
    open fun CrossFadeQueued(`$animation`: String, `$fadeLength`: Number, `$queue`: QueueMode): AnimationState
    open fun CrossFadeQueued(`$animation`: String, `$fadeLength`: Number, `$queue`: QueueMode, `$mode`: PlayMode): AnimationState
    open fun PlayQueued(`$animation`: String): AnimationState
    open fun PlayQueued(`$animation`: String, `$queue`: QueueMode): AnimationState
    open fun PlayQueued(`$animation`: String, `$queue`: QueueMode, `$mode`: PlayMode): AnimationState
    open fun AddClip(`$clip`: AnimationClip, `$newName`: String)
    open fun AddClip(`$clip`: AnimationClip, `$newName`: String, `$firstFrame`: Number, `$lastFrame`: Number)
    open fun AddClip(`$clip`: AnimationClip, `$newName`: String, `$firstFrame`: Number, `$lastFrame`: Number, `$addLoopFrame`: Boolean)
    open fun RemoveClip(`$clip`: AnimationClip)
    open fun RemoveClip(`$clipName`: String)
    open fun GetClipCount(): Number
    open fun SyncLayer(`$layer`: Number)
    open fun GetEnumerator(): IEnumerator
    open fun GetClip(`$name`: String): AnimationClip
}

external enum class WrapMode {
    Once /* = 1 */,
    Loop /* = 2 */,
    PingPong /* = 4 */,
    Default /* = 0 */,
    ClampForever /* = 8 */,
    Clamp /* = 1 */
}

external open class AnimationState : TrackedReference {
    open var `var`: Any
    open var enabled: Any
    open var weight: Any
    open var wrapMode: Any
    open var time: Any
    open var normalizedTime: Any
    open var speed: Any
    open var normalizedSpeed: Any
    open val length: Any
    open var layer: Any
    open val clip: Any
    open var name: Any
    open var blendMode: Any
    open fun AddMixingTransform(`$mix`: Transform)
    open fun AddMixingTransform(`$mix`: Transform, `$recursive`: Boolean)
    open fun RemoveMixingTransform(`$mix`: Transform)
}

external open class TrackedReference : csharp.System.Object {
    companion object {
        fun op_Equality(`$x`: TrackedReference, `$y`: TrackedReference): Boolean
        fun op_Inequality(`$x`: TrackedReference, `$y`: TrackedReference): Boolean
        fun op_Implicit(`$exists`: TrackedReference): Boolean
    }
}

external open class Bounds : ValueType, IFormattable, `IEquatable$1`<Bounds> {
    constructor(`$center`: Vector3, `$size`: Vector3)
    constructor()
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Bounds): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun SetMinMax(`$min`: Vector3, `$max`: Vector3)
    open fun Encapsulate(`$point`: Vector3)
    open fun Encapsulate(`$bounds`: Bounds)
    open fun Expand(`$amount`: Number)
    open fun Expand(`$amount`: Vector3)
    open fun Intersects(`$bounds`: Bounds): Boolean
    open fun IntersectRay(`$ray`: Ray): Boolean
    open fun IntersectRay(`$ray`: Ray, `$distance`: `$Ref`<Number>): Boolean
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
    open fun Contains(`$point`: Vector3): Boolean
    open fun SqrDistance(`$point`: Vector3): Number
    open fun ClosestPoint(`$point`: Vector3): Vector3

    companion object {
        fun op_Equality(`$lhs`: Bounds, `$rhs`: Bounds): Boolean
        fun op_Inequality(`$lhs`: Bounds, `$rhs`: Bounds): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class AnimationEvent : csharp.System.Object {
    open var `var`: Any
    open var stringParameter: Any
    open var floatParameter: Any
    open var intParameter: Any
    open var objectReferenceParameter: Any
    open var functionName: Any
    open var time: Any
    open var messageOptions: Any
    open val isFiredByLegacy: Any
    open val isFiredByAnimator: Any
    open val animationState: Any
    open val animatorStateInfo: Any
    open val animatorClipInfo: Any
}

external open class AnimationCurve : csharp.System.Object, `IEquatable$1`<AnimationCurve> {
    constructor(vararg keys: Keyframe)
    constructor()
    open var `var`: Any
    open val length: Any
    open var preWrapMode: Any
    open var postWrapMode: Any
    open fun Evaluate(`$time`: Number): Number
    open fun AddKey(`$time`: Number, `$value`: Number): Number
    open fun AddKey(`$key`: Keyframe): Number
    open fun MoveKey(`$index`: Number, `$key`: Keyframe): Number
    open fun RemoveKey(`$index`: Number)
    open fun get_Item(`$index`: Number): Keyframe
    open fun SmoothTangents(`$index`: Number, `$weight`: Number)
    override fun Equals(`$o`: Any): Boolean
    open fun Equals(`$other`: AnimationCurve): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun Constant(`$timeStart`: Number, `$timeEnd`: Number, `$value`: Number): AnimationCurve
        fun Linear(`$timeStart`: Number, `$valueStart`: Number, `$timeEnd`: Number, `$valueEnd`: Number): AnimationCurve
        fun EaseInOut(`$timeStart`: Number, `$valueStart`: Number, `$timeEnd`: Number, `$valueEnd`: Number): AnimationCurve
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external enum class AnimatorControllerParameterType {
    Float /* = 1 */,
    Int /* = 3 */,
    Bool /* = 4 */,
    Trigger /* = 9 */
}

external enum class DurationUnit {
    Fixed /* = 0 */,
    Normalized /* = 1 */
}

external open class AnimatorOverrideController : RuntimeAnimatorController {
    constructor()
    constructor(`$controller`: RuntimeAnimatorController)
    override var `var`: Any
    open var runtimeAnimatorController: Any
    open val overridesCount: Any
    open fun get_Item(`$name`: String): AnimationClip
    open fun set_Item(`$name`: String, `$value`: AnimationClip)
    open fun get_Item(`$clip`: AnimationClip): AnimationClip
    open fun set_Item(`$clip`: AnimationClip, `$value`: AnimationClip)
    open fun GetOverrides(`$overrides`: `List$1`<`KeyValuePair$2`<AnimationClip, AnimationClip>>)
    open fun ApplyOverrides(`$overrides`: `IList$1`<`KeyValuePair$2`<AnimationClip, AnimationClip>>)
}

external open class AnimationClipPair : csharp.System.Object

external open class AnimatorUtility : csharp.System.Object {
    companion object {
        fun OptimizeTransformHierarchy(`$go`: GameObject, `$exposedTransforms`: `Array$1`<String>)
        fun DeoptimizeTransformHierarchy(`$go`: GameObject)
    }
}

external enum class BodyDof {
    SpineFrontBack /* = 0 */,
    SpineLeftRight /* = 1 */,
    SpineRollLeftRight /* = 2 */,
    ChestFrontBack /* = 3 */,
    ChestLeftRight /* = 4 */,
    ChestRollLeftRight /* = 5 */,
    UpperChestFrontBack /* = 6 */,
    UpperChestLeftRight /* = 7 */,
    UpperChestRollLeftRight /* = 8 */,
    LastBodyDof /* = 9 */
}

external enum class HeadDof {
    NeckFrontBack /* = 0 */,
    NeckLeftRight /* = 1 */,
    NeckRollLeftRight /* = 2 */,
    HeadFrontBack /* = 3 */,
    HeadLeftRight /* = 4 */,
    HeadRollLeftRight /* = 5 */,
    LeftEyeDownUp /* = 6 */,
    LeftEyeInOut /* = 7 */,
    RightEyeDownUp /* = 8 */,
    RightEyeInOut /* = 9 */,
    JawDownUp /* = 10 */,
    JawLeftRight /* = 11 */,
    LastHeadDof /* = 12 */
}

external enum class LegDof {
    UpperLegFrontBack /* = 0 */,
    UpperLegInOut /* = 1 */,
    UpperLegRollInOut /* = 2 */,
    LegCloseOpen /* = 3 */,
    LegRollInOut /* = 4 */,
    FootCloseOpen /* = 5 */,
    FootInOut /* = 6 */,
    ToesUpDown /* = 7 */,
    LastLegDof /* = 8 */
}

external enum class ArmDof {
    ShoulderDownUp /* = 0 */,
    ShoulderFrontBack /* = 1 */,
    ArmDownUp /* = 2 */,
    ArmFrontBack /* = 3 */,
    ArmRollInOut /* = 4 */,
    ForeArmCloseOpen /* = 5 */,
    ForeArmRollInOut /* = 6 */,
    HandDownUp /* = 7 */,
    HandInOut /* = 8 */,
    LastArmDof /* = 9 */
}

external enum class FingerDof {
    ProximalDownUp /* = 0 */,
    ProximalInOut /* = 1 */,
    IntermediateCloseOpen /* = 2 */,
    DistalCloseOpen /* = 3 */,
    LastFingerDof /* = 4 */
}

external enum class HumanPartDof {
    Body /* = 0 */,
    Head /* = 1 */,
    LeftLeg /* = 2 */,
    RightLeg /* = 3 */,
    LeftArm /* = 4 */,
    RightArm /* = 5 */,
    LeftThumb /* = 6 */,
    LeftIndex /* = 7 */,
    LeftMiddle /* = 8 */,
    LeftRing /* = 9 */,
    LeftLittle /* = 10 */,
    RightThumb /* = 11 */,
    RightIndex /* = 12 */,
    RightMiddle /* = 13 */,
    RightRing /* = 14 */,
    RightLittle /* = 15 */,
    LastHumanPartDof /* = 16 */
}

external open class HumanDescription : ValueType {
    open var human: `Array$1`<HumanBone>
    open var skeleton: `Array$1`<SkeletonBone>
    open var `var`: Any
    open var upperArmTwist: Any
    open var lowerArmTwist: Any
    open var upperLegTwist: Any
    open var lowerLegTwist: Any
    open var armStretch: Any
    open var legStretch: Any
    open var feetSpacing: Any
    open var hasTranslationDoF: Any
}

external open class SkeletonBone : ValueType {
    open var name: String
    open var position: Vector3
    open var rotation: Quaternion
    open var scale: Vector3
}

external open class HumanLimit : ValueType {
    open var `var`: Any
    open var useDefaultValues: Any
    open var axisLength: Any
}

external open class HumanBone : ValueType {
    open var limit: HumanLimit
    open var `var`: Any
    open var boneName: Any
    open var humanName: Any
}

external open class AvatarBuilder : csharp.System.Object {
    companion object {
        fun BuildHumanAvatar(`$go`: GameObject, `$humanDescription`: HumanDescription): Avatar
        fun BuildGenericAvatar(`$go`: GameObject, `$rootMotionTransformName`: String): Avatar
    }
}

external enum class AvatarMaskBodyPart {
    Root /* = 0 */,
    Body /* = 1 */,
    Head /* = 2 */,
    LeftLeg /* = 3 */,
    RightLeg /* = 4 */,
    LeftArm /* = 5 */,
    RightArm /* = 6 */,
    LeftFingers /* = 7 */,
    RightFingers /* = 8 */,
    LeftFootIK /* = 9 */,
    RightFootIK /* = 10 */,
    LeftHandIK /* = 11 */,
    RightHandIK /* = 12 */,
    LastBodyPart /* = 13 */
}

external open class AvatarMask : Object {
    override var `var`: Any
    open var transformCount: Any
    open fun GetHumanoidBodyPartActive(`$index`: AvatarMaskBodyPart): Boolean
    open fun SetHumanoidBodyPartActive(`$index`: AvatarMaskBodyPart, `$value`: Boolean)
    open fun AddTransformPath(`$transform`: Transform)
    open fun AddTransformPath(`$transform`: Transform, `$recursive`: Boolean)
    open fun RemoveTransformPath(`$transform`: Transform)
    open fun RemoveTransformPath(`$transform`: Transform, `$recursive`: Boolean)
    open fun GetTransformPath(`$index`: Number): String
    open fun SetTransformPath(`$index`: Number, `$path`: String)
    open fun GetTransformActive(`$index`: Number): Boolean
    open fun SetTransformActive(`$index`: Number, `$value`: Boolean)
}

external open class HumanPose : ValueType {
    open var bodyPosition: Vector3
    open var bodyRotation: Quaternion
    open var muscles: `Array$1`<Number>
}

external open class HumanPoseHandler : csharp.System.Object, IDisposable {
    constructor(`$avatar`: Avatar, `$root`: Transform)
    constructor(`$avatar`: Avatar, `$jointPaths`: `Array$1`<String>)
    constructor()
    open fun Dispose()
    open fun GetHumanPose(`$humanPose`: `$Ref`<HumanPose>)
    open fun SetHumanPose(`$humanPose`: `$Ref`<HumanPose>)
    open fun GetInternalHumanPose(`$humanPose`: `$Ref`<HumanPose>)
    open fun SetInternalHumanPose(`$humanPose`: `$Ref`<HumanPose>)
    open fun GetInternalAvatarPose(`$avatarPose`: `NativeArray$1`<Number>)
    open fun SetInternalAvatarPose(`$avatarPose`: `NativeArray$1`<Number>)
}

external open class HumanTrait : csharp.System.Object {
    companion object {
        fun MuscleFromBone(`$i`: Number, `$dofIndex`: Number): Number
        fun BoneFromMuscle(`$i`: Number): Number
        fun RequiredBone(`$i`: Number): Boolean
        fun GetMuscleDefaultMin(`$i`: Number): Number
        fun GetMuscleDefaultMax(`$i`: Number): Number
        fun GetBoneDefaultHierarchyMass(`$i`: Number): Number
        fun GetParentBone(`$i`: Number): Number
    }
}

external enum class AssetBundleLoadResult {
    Success /* = 0 */,
    Cancelled /* = 1 */,
    NotMatchingCrc /* = 2 */,
    FailedCache /* = 3 */,
    NotValidAssetBundle /* = 4 */,
    NoSerializedData /* = 5 */,
    NotCompatible /* = 6 */,
    AlreadyLoaded /* = 7 */,
    FailedRead /* = 8 */,
    FailedDecompression /* = 9 */,
    FailedWrite /* = 10 */,
    FailedDeleteRecompressionTarget /* = 11 */,
    RecompressionTargetIsLoaded /* = 12 */,
    RecompressionTargetExistsButNotArchive /* = 13 */
}

external open class AssetBundle : Object {
    override var `var`: Any
    open val isStreamedSceneAssetBundle: Any
    open fun Contains(`$name`: String): Boolean
    open fun LoadAsset(`$name`: String): Object
    open fun LoadAsset(`$name`: String, `$type`: Type): Object
    open fun LoadAssetAsync(`$name`: String): AssetBundleRequest
    open fun LoadAssetAsync(`$name`: String, `$type`: Type): AssetBundleRequest
    open fun LoadAssetWithSubAssets(`$name`: String): `Array$1`<Object>
    open fun LoadAssetWithSubAssets(`$name`: String, `$type`: Type): `Array$1`<Object>
    open fun LoadAssetWithSubAssetsAsync(`$name`: String): AssetBundleRequest
    open fun LoadAssetWithSubAssetsAsync(`$name`: String, `$type`: Type): AssetBundleRequest
    open fun LoadAllAssets(): `Array$1`<Object>
    open fun LoadAllAssets(`$type`: Type): `Array$1`<Object>
    open fun LoadAllAssetsAsync(): AssetBundleRequest
    open fun LoadAllAssetsAsync(`$type`: Type): AssetBundleRequest
    open fun Unload(`$unloadAllLoadedObjects`: Boolean)
    open fun UnloadAsync(`$unloadAllLoadedObjects`: Boolean): AsyncOperation
    open fun GetAllAssetNames(): `Array$1`<String>
    open fun GetAllScenePaths(): `Array$1`<String>

    companion object {
        fun UnloadAllAssetBundles(`$unloadAllObjects`: Boolean)
        fun GetAllLoadedAssetBundles(): `IEnumerable$1`<AssetBundle>
        fun LoadFromFileAsync(`$path`: String): AssetBundleCreateRequest
        fun LoadFromFileAsync(`$path`: String, `$crc`: Number): AssetBundleCreateRequest
        fun LoadFromFileAsync(`$path`: String, `$crc`: Number, `$offset`: Any): AssetBundleCreateRequest
        fun LoadFromFile(`$path`: String): AssetBundle
        fun LoadFromFile(`$path`: String, `$crc`: Number): AssetBundle
        fun LoadFromFile(`$path`: String, `$crc`: Number, `$offset`: Any): AssetBundle
        fun LoadFromMemoryAsync(`$binary`: `Array$1`<Number>): AssetBundleCreateRequest
        fun LoadFromMemoryAsync(`$binary`: `Array$1`<Number>, `$crc`: Number): AssetBundleCreateRequest
        fun LoadFromMemory(`$binary`: `Array$1`<Number>): AssetBundle
        fun LoadFromMemory(`$binary`: `Array$1`<Number>, `$crc`: Number): AssetBundle
        fun LoadFromStreamAsync(`$stream`: Stream, `$crc`: Number, `$managedReadBufferSize`: Number): AssetBundleCreateRequest
        fun LoadFromStreamAsync(`$stream`: Stream, `$crc`: Number): AssetBundleCreateRequest
        fun LoadFromStreamAsync(`$stream`: Stream): AssetBundleCreateRequest
        fun LoadFromStream(`$stream`: Stream, `$crc`: Number, `$managedReadBufferSize`: Number): AssetBundle
        fun LoadFromStream(`$stream`: Stream, `$crc`: Number): AssetBundle
        fun LoadFromStream(`$stream`: Stream): AssetBundle
        fun SetAssetBundleDecryptKey(`$password`: String)
        fun RecompressAssetBundleAsync(`$inputPath`: String, `$outputPath`: String, `$method`: BuildCompression, `$expectedCRC`: Number = definedExternally, `$priority`: ThreadPriority = definedExternally): AssetBundleRecompressOperation
    }
}

external open class AssetBundleCreateRequest : AsyncOperation {
    override var `var`: Any
    open val assetBundle: Any
}

external open class AsyncOperation : YieldInstruction {
    open var `var`: Any
    open val isDone: Any
    open val progress: Any
    open var priority: Any
    open var allowSceneActivation: Any
    open fun add_completed(`$value`: `Action$1`<AsyncOperation>)
    open fun remove_completed(`$value`: `Action$1`<AsyncOperation>)
}

external open class AssetBundleRequest : ResourceRequest {
    override var `var`: Any
    override val asset: Any
}

external open class ResourceRequest : AsyncOperation {
    override var `var`: Any
    open val asset: Any
}

external open class AssetBundleRecompressOperation : AsyncOperation {
    override var `var`: Any
    open val humanReadableResult: Any
    open val inputPath: Any
    open val outputPath: Any
    open val result: Any
    open val success: Any
}

external open class BuildCompression : ValueType {
    open var `var`: Any
    open val compression: Any
    open val level: Any
    open val blockSize: Any
    open val enableProtect: Any

    companion object {
        var Uncompressed: BuildCompression
        var LZ4: BuildCompression
        var LZMA: BuildCompression
        var UncompressedRuntime: BuildCompression
        var LZ4Runtime: BuildCompression
    }
}

external enum class ThreadPriority {
    Low /* = 0 */,
    BelowNormal /* = 1 */,
    Normal /* = 2 */,
    High /* = 4 */
}

external open class AssetBundleManifest : Object {
    open fun GetAllAssetBundles(): `Array$1`<String>
    open fun GetAllAssetBundlesWithVariant(): `Array$1`<String>
    open fun GetAssetBundleHash(`$assetBundleName`: String): Hash128
    open fun GetDirectDependencies(`$assetBundleName`: String): `Array$1`<String>
    open fun GetAllDependencies(`$assetBundleName`: String): `Array$1`<String>
}

external open class Hash128 : ValueType, IComparable, `IComparable$1`<Hash128>, `IEquatable$1`<Hash128> {
    constructor(`$u32_0`: Number, `$u32_1`: Number, `$u32_2`: Number, `$u32_3`: Number)
    constructor(`$u64_0`: Any, `$u64_1`: Any)
    constructor()
    open var `var`: Any
    open val isValid: Any
    open fun CompareTo(`$rhs`: Hash128): Number
    open fun Append(`$data`: String)
    open fun Append(`$val`: Number)
    override fun Equals(`$obj`: Any): Boolean
    open fun Equals(`$obj`: Hash128): Boolean
    open fun CompareTo(`$obj`: Any): Number

    companion object {
        fun Parse(`$hashString`: String): Hash128
        fun Compute(`$data`: String): Hash128
        fun Compute(`$val`: Number): Hash128
        fun op_Equality(`$hash1`: Hash128, `$hash2`: Hash128): Boolean
        fun op_Inequality(`$hash1`: Hash128, `$hash2`: Hash128): Boolean
        fun op_LessThan(`$x`: Hash128, `$y`: Hash128): Boolean
        fun op_GreaterThan(`$x`: Hash128, `$y`: Hash128): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external enum class CompressionType {
    None /* = 0 */,
    Lzma /* = 1 */,
    Lz4 /* = 2 */,
    Lz4HC /* = 3 */
}

external enum class CompressionLevel {
    None /* = 0 */,
    Fastest /* = 1 */,
    Fast /* = 2 */,
    Normal /* = 3 */,
    High /* = 4 */,
    Maximum /* = 5 */
}

external open class AudioSettings : csharp.System.Object {
    interface AudioConfigurationChangeHandler {
        @nativeInvoke
        operator fun invoke(deviceWasChanged: Boolean)
        var Invoke: ((deviceWasChanged: Boolean) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
    open class Mobile : csharp.System.Object {
        companion object {
            fun add_OnMuteStateChanged(`$value`: `Action$1`<Boolean>)
            fun remove_OnMuteStateChanged(`$value`: `Action$1`<Boolean>)
            fun StartAudioOutput()
            fun StopAudioOutput()
        }
    }

    companion object {
        fun GetDSPBufferSize(`$bufferLength`: `$Ref`<Number>, `$numBuffers`: `$Ref`<Number>)
        fun GetSpatializerPluginNames(): `Array$1`<String>
        fun GetSpatializerPluginName(): String
        fun SetSpatializerPluginName(`$pluginName`: String)
        fun GetConfiguration(): AudioConfiguration
        fun Reset(`$config`: AudioConfiguration): Boolean
        fun add_OnAudioConfigurationChanged(`$value`: AudioConfigurationChangeHandler)
        fun remove_OnAudioConfigurationChanged(`$value`: AudioConfigurationChangeHandler)
    }
}

external enum class AudioSpeakerMode {
    Raw /* = 0 */,
    Mono /* = 1 */,
    Stereo /* = 2 */,
    Quad /* = 3 */,
    Surround /* = 4 */,
    Mode5point1 /* = 5 */,
    Mode7point1 /* = 6 */,
    Prologic /* = 7 */
}

external open class AudioConfiguration : ValueType {
    open var speakerMode: AudioSpeakerMode
    open var dspBufferSize: Number
    open var sampleRate: Number
    open var numRealVoices: Number
    open var numVirtualVoices: Number
}

external open class AudioSource : AudioBehaviour {
    override var `var`: Any
    open var volume: Any
    open var pitch: Any
    open var time: Any
    open var timeSamples: Any
    open var clip: Any
    open var outputAudioMixerGroup: Any
    open var gamepadSpeakerOutputType: Any
    open val isPlaying: Any
    open val isVirtual: Any
    open var loop: Any
    open var ignoreListenerVolume: Any
    open var playOnAwake: Any
    open var ignoreListenerPause: Any
    open var velocityUpdateMode: Any
    open var panStereo: Any
    open var spatialBlend: Any
    open var spatialize: Any
    open var spatializePostEffects: Any
    open var reverbZoneMix: Any
    open var bypassEffects: Any
    open var bypassListenerEffects: Any
    open var bypassReverbZones: Any
    open var dopplerLevel: Any
    open var spread: Any
    open var priority: Any
    open var mute: Any
    open var minDistance: Any
    open var maxDistance: Any
    open var rolloffMode: Any
    open fun PlayOnGamepad(`$slot`: Number): Boolean
    open fun DisableGamepadOutput(): Boolean
    open fun SetGamepadSpeakerMixLevel(`$slot`: Number, `$mixLevel`: Number): Boolean
    open fun SetGamepadSpeakerMixLevelDefault(`$slot`: Number): Boolean
    open fun SetGamepadSpeakerRestrictedAudio(`$slot`: Number, `$restricted`: Boolean): Boolean
    open fun Play()
    open fun Play(`$delay`: Any)
    open fun PlayDelayed(`$delay`: Number)
    open fun PlayScheduled(`$time`: Number)
    open fun PlayOneShot(`$clip`: AudioClip)
    open fun PlayOneShot(`$clip`: AudioClip, `$volumeScale`: Number)
    open fun SetScheduledStartTime(`$time`: Number)
    open fun SetScheduledEndTime(`$time`: Number)
    open fun Stop()
    open fun Pause()
    open fun UnPause()
    open fun SetCustomCurve(`$type`: AudioSourceCurveType, `$curve`: AnimationCurve)
    open fun GetCustomCurve(`$type`: AudioSourceCurveType): AnimationCurve
    open fun GetOutputData(`$samples`: `Array$1`<Number>, `$channel`: Number)
    open fun GetSpectrumData(`$samples`: `Array$1`<Number>, `$channel`: Number, `$window`: FFTWindow)
    open fun SetSpatializerFloat(`$index`: Number, `$value`: Number): Boolean
    open fun GetSpatializerFloat(`$index`: Number, `$value`: `$Ref`<Number>): Boolean
    open fun GetAmbisonicDecoderFloat(`$index`: Number, `$value`: `$Ref`<Number>): Boolean
    open fun SetAmbisonicDecoderFloat(`$index`: Number, `$value`: Number): Boolean

    companion object {
        fun GamepadSpeakerSupportsOutputType(`$outputType`: GamepadSpeakerOutputType): Boolean
        fun PlayClipAtPoint(`$clip`: AudioClip, `$position`: Vector3)
        fun PlayClipAtPoint(`$clip`: AudioClip, `$position`: Vector3, `$volume`: Number)
    }
}

external open class AudioBehaviour : Behaviour

external open class AudioClip : Object {
    override var `var`: Any
    open val length: Any
    open val samples: Any
    open val channels: Any
    open val frequency: Any
    open val loadType: Any
    open val preloadAudioData: Any
    open val ambisonic: Any
    open val loadInBackground: Any
    open val loadState: Any
    open fun LoadAudioData(): Boolean
    open fun UnloadAudioData(): Boolean
    open fun GetData(`$data`: `Array$1`<Number>, `$offsetSamples`: Number): Boolean
    open fun SetData(`$data`: `Array$1`<Number>, `$offsetSamples`: Number): Boolean
    interface PCMReaderCallback {
        @nativeInvoke
        operator fun invoke(data: `Array$1`<Number>)
        var Invoke: ((data: `Array$1`<Number>) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PCMSetPositionCallback {
        @nativeInvoke
        operator fun invoke(position: Number)
        var Invoke: ((position: Number) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        fun Create(`$name`: String, `$lengthSamples`: Number, `$channels`: Number, `$frequency`: Number, `$stream`: Boolean): AudioClip
        fun Create(`$name`: String, `$lengthSamples`: Number, `$channels`: Number, `$frequency`: Number, `$stream`: Boolean, `$pcmreadercallback`: PCMReaderCallback): AudioClip
        fun Create(`$name`: String, `$lengthSamples`: Number, `$channels`: Number, `$frequency`: Number, `$stream`: Boolean, `$pcmreadercallback`: PCMReaderCallback, `$pcmsetpositioncallback`: PCMSetPositionCallback): AudioClip
    }
}

external enum class GamepadSpeakerOutputType {
    Speaker /* = 0 */,
    Vibration /* = 1 */,
    SecondaryVibration /* = 2 */
}

external enum class AudioVelocityUpdateMode {
    Auto /* = 0 */,
    Fixed /* = 1 */,
    Dynamic /* = 2 */
}

external enum class AudioSourceCurveType {
    CustomRolloff /* = 0 */,
    SpatialBlend /* = 1 */,
    ReverbZoneMix /* = 2 */,
    Spread /* = 3 */
}

external enum class AudioRolloffMode {
    Logarithmic /* = 0 */,
    Linear /* = 1 */,
    Custom /* = 2 */
}

external enum class FFTWindow {
    Rectangular /* = 0 */,
    Triangle /* = 1 */,
    Hamming /* = 2 */,
    Hanning /* = 3 */,
    Blackman /* = 4 */,
    BlackmanHarris /* = 5 */
}

external open class AudioLowPassFilter : Behaviour {
    override var `var`: Any
    open var customCutoffCurve: Any
    open var cutoffFrequency: Any
    open var lowpassResonanceQ: Any
}

external open class AudioHighPassFilter : Behaviour {
    override var `var`: Any
    open var cutoffFrequency: Any
    open var highpassResonanceQ: Any
}

external open class AudioReverbFilter : Behaviour {
    override var `var`: Any
    open var reverbPreset: Any
    open var dryLevel: Any
    open var room: Any
    open var roomHF: Any
    open var decayTime: Any
    open var decayHFRatio: Any
    open var reflectionsLevel: Any
    open var reflectionsDelay: Any
    open var reverbLevel: Any
    open var reverbDelay: Any
    open var diffusion: Any
    open var density: Any
    open var hfReference: Any
    open var roomLF: Any
    open var lfReference: Any
}

external enum class AudioReverbPreset {
    Off /* = 0 */,
    Generic /* = 1 */,
    PaddedCell /* = 2 */,
    Room /* = 3 */,
    Bathroom /* = 4 */,
    Livingroom /* = 5 */,
    Stoneroom /* = 6 */,
    Auditorium /* = 7 */,
    Concerthall /* = 8 */,
    Cave /* = 9 */,
    Arena /* = 10 */,
    Hangar /* = 11 */,
    CarpetedHallway /* = 12 */,
    Hallway /* = 13 */,
    StoneCorridor /* = 14 */,
    Alley /* = 15 */,
    Forest /* = 16 */,
    City /* = 17 */,
    Mountains /* = 18 */,
    Quarry /* = 19 */,
    Plain /* = 20 */,
    ParkingLot /* = 21 */,
    SewerPipe /* = 22 */,
    Underwater /* = 23 */,
    Drugged /* = 24 */,
    Dizzy /* = 25 */,
    Psychotic /* = 26 */,
    User /* = 27 */
}

external enum class AudioDataLoadState {
    Unloaded /* = 0 */,
    Loading /* = 1 */,
    Loaded /* = 2 */,
    Failed /* = 3 */
}

external enum class AudioCompressionFormat {
    PCM /* = 0 */,
    Vorbis /* = 1 */,
    ADPCM /* = 2 */,
    MP3 /* = 3 */,
    VAG /* = 4 */,
    HEVAG /* = 5 */,
    XMA /* = 6 */,
    AAC /* = 7 */,
    GCADPCM /* = 8 */,
    ATRAC9 /* = 9 */
}

external enum class AudioClipLoadType {
    DecompressOnLoad /* = 0 */,
    CompressedInMemory /* = 1 */,
    Streaming /* = 2 */
}

external open class AudioListener : AudioBehaviour {
    override var `var`: Any
    open var velocityUpdateMode: Any

    companion object {
        fun GetOutputData(`$samples`: `Array$1`<Number>, `$channel`: Number)
        fun GetSpectrumData(`$samples`: `Array$1`<Number>, `$channel`: Number, `$window`: FFTWindow)
    }
}

external open class AudioReverbZone : Behaviour {
    override var `var`: Any
    open var minDistance: Any
    open var maxDistance: Any
    open var reverbPreset: Any
    open var room: Any
    open var roomHF: Any
    open var roomLF: Any
    open var decayTime: Any
    open var decayHFRatio: Any
    open var reflections: Any
    open var reflectionsDelay: Any
    open var reverb: Any
    open var reverbDelay: Any
    open var HFReference: Any
    open var LFReference: Any
    open var diffusion: Any
    open var density: Any
}

external open class AudioDistortionFilter : Behaviour {
    override var `var`: Any
    open var distortionLevel: Any
}

external open class AudioEchoFilter : Behaviour {
    override var `var`: Any
    open var delay: Any
    open var decayRatio: Any
    open var dryMix: Any
    open var wetMix: Any
}

external open class AudioChorusFilter : Behaviour {
    override var `var`: Any
    open var dryMix: Any
    open var delay: Any
    open var rate: Any
    open var depth: Any
}

external open class Microphone : csharp.System.Object {
    companion object {
        fun Start(`$deviceName`: String, `$loop`: Boolean, `$lengthSec`: Number, `$frequency`: Number): AudioClip
        fun End(`$deviceName`: String)
        fun IsRecording(`$deviceName`: String): Boolean
        fun GetPosition(`$deviceName`: String): Number
        fun GetDeviceCaps(`$deviceName`: String, `$minFreq`: `$Ref`<Number>, `$maxFreq`: `$Ref`<Number>)
    }
}

external open class AudioRenderer : csharp.System.Object {
    companion object {
        fun Start(): Boolean
        fun Stop(): Boolean
        fun GetSampleCountForCaptureFrame(): Number
        fun Render(`$buffer`: `NativeArray$1`<Number>): Boolean
    }
}

external enum class WebCamFlags {
    FrontFacing /* = 1 */,
    AutoFocusPointSupported /* = 2 */
}

external enum class WebCamKind {
    WideAngle /* = 1 */,
    Telephoto /* = 2 */,
    ColorAndDepth /* = 3 */,
    UltraWideAngle /* = 4 */
}

external open class WebCamDevice : ValueType {
    open var `var`: Any
    open val name: Any
    open val isFrontFacing: Any
    open val kind: Any
    open val depthCameraName: Any
    open val isAutoFocusPointSupported: Any
}

external open class Resolution : ValueType {
    open var `var`: Any
    open var width: Any
    open var height: Any
    open var refreshRate: Any
}

external open class WebCamTexture : Texture {
    constructor(`$deviceName`: String, `$requestedWidth`: Number, `$requestedHeight`: Number, `$requestedFPS`: Number)
    constructor(`$deviceName`: String, `$requestedWidth`: Number, `$requestedHeight`: Number)
    constructor(`$deviceName`: String)
    constructor(`$requestedWidth`: Number, `$requestedHeight`: Number, `$requestedFPS`: Number)
    constructor(`$requestedWidth`: Number, `$requestedHeight`: Number)
    constructor()
    override var `var`: Any
    open val isPlaying: Any
    open var deviceName: Any
    open var requestedFPS: Any
    open var requestedWidth: Any
    open var requestedHeight: Any
    open val videoRotationAngle: Any
    open val videoVerticallyMirrored: Any
    open val didUpdateThisFrame: Any
    open val isDepth: Any
    open fun Play()
    open fun Pause()
    open fun Stop()
    open fun GetPixel(`$x`: Number, `$y`: Number): Color
    open fun GetPixels(): `Array$1`<Color>
    open fun GetPixels(`$x`: Number, `$y`: Number, `$blockWidth`: Number, `$blockHeight`: Number): `Array$1`<Color>
    open fun GetPixels32(): `Array$1`<Color32>
    open fun GetPixels32(`$colors`: `Array$1`<Color32>): `Array$1`<Color32>
}

external open class Texture : Object {
    override var `var`: Any
    open val mipmapCount: Any
    open val graphicsFormat: Any
    open var width: Any
    open var height: Any
    open var dimension: Any
    open val isReadable: Any
    open var wrapMode: Any
    open var wrapModeU: Any
    open var wrapModeV: Any
    open var wrapModeW: Any
    open var filterMode: Any
    open var anisoLevel: Any
    open var mipMapBias: Any
    open val updateCount: Any
    open fun GetNativeTexturePtr(): IntPtr
    open fun IncrementUpdateCount()

    companion object {
        var GenerateAllMips: Number
        fun SetGlobalAnisotropicFilteringLimits(`$forcedMin`: Number, `$globalMax`: Number)
        fun SetStreamingTextureMaterialDebugProperties()
    }
}

external open class ClothSphereColliderPair : ValueType {
    constructor(`$a`: SphereCollider)
    constructor(`$a`: SphereCollider, `$b`: SphereCollider)
    constructor()
    open var `var`: Any
    open var first: Any
    open var second: Any
}

external open class SphereCollider : Collider {
    override var `var`: Any
    open var radius: Any
}

external open class Collider : Component {
    override var `var`: Any
    open var enabled: Any
    open val attachedRigidbody: Any
    open val attachedArticulationBody: Any
    open var isTrigger: Any
    open var contactOffset: Any
    open val bounds: Any
    open var hasModifiableContacts: Any
    open var sharedMaterial: Any
    open var material: Any
    open fun ClosestPoint(`$position`: Vector3): Vector3
    open fun Raycast(`$ray`: Ray, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number): Boolean
    open fun ClosestPointOnBounds(`$position`: Vector3): Vector3
}

external open class ClothSkinningCoefficient : ValueType {
    open var maxDistance: Number
    open var collisionSphereDistance: Number
}

external open class Cloth : Component {
    override var `var`: Any
    open var sleepThreshold: Any
    open var bendingStiffness: Any
    open var stretchingStiffness: Any
    open var damping: Any
    open var useGravity: Any
    open var enabled: Any
    open var friction: Any
    open var collisionMassScale: Any
    open var enableContinuousCollision: Any
    open var useVirtualParticles: Any
    open var worldVelocityScale: Any
    open var worldAccelerationScale: Any
    open var clothSolverFrequency: Any
    open var useTethers: Any
    open var stiffnessFrequency: Any
    open var selfCollisionDistance: Any
    open var selfCollisionStiffness: Any
    open fun ClearTransformMotion()
    open fun GetSelfAndInterCollisionIndices(`$indices`: `List$1`<Number>)
    open fun SetSelfAndInterCollisionIndices(`$indices`: `List$1`<Number>)
    open fun GetVirtualParticleIndices(`$indicesOutList`: `List$1`<Number>)
    open fun SetVirtualParticleIndices(`$indicesIn`: `List$1`<Number>)
    open fun GetVirtualParticleWeights(`$weightsOutList`: `List$1`<Vector3>)
    open fun SetVirtualParticleWeights(`$weights`: `List$1`<Vector3>)
    open fun SetEnabledFading(`$enabled`: Boolean, `$interpolationTime`: Number)
    open fun SetEnabledFading(`$enabled`: Boolean)
}

external open class CapsuleCollider : Collider {
    override var `var`: Any
    open var radius: Any
    open var height: Any
    open var direction: Any
}

external enum class ClusterInputType {
    Button /* = 0 */,
    Axis /* = 1 */,
    Tracker /* = 2 */,
    CustomProvidedInput /* = 3 */
}

external open class ClusterSerialization : csharp.System.Object {
    companion object {
        fun SaveTimeManagerState(`$buffer`: `NativeArray$1`<Number>): Number
        fun RestoreTimeManagerState(`$buffer`: `NativeArray$1`<Number>): Boolean
        fun SaveInputManagerState(`$buffer`: `NativeArray$1`<Number>): Number
        fun RestoreInputManagerState(`$buffer`: `NativeArray$1`<Number>): Boolean
        fun SaveClusterInputState(`$buffer`: `NativeArray$1`<Number>): Number
        fun RestoreClusterInputState(`$buffer`: `NativeArray$1`<Number>): Boolean
    }
}

external enum class RuntimePlatform {
    OSXEditor /* = 0 */,
    OSXPlayer /* = 1 */,
    WindowsPlayer /* = 2 */,
    OSXWebPlayer /* = 3 */,
    OSXDashboardPlayer /* = 4 */,
    WindowsWebPlayer /* = 5 */,
    WindowsEditor /* = 7 */,
    IPhonePlayer /* = 8 */,
    XBOX360 /* = 10 */,
    PS3 /* = 9 */,
    Android /* = 11 */,
    NaCl /* = 12 */,
    FlashPlayer /* = 15 */,
    LinuxPlayer /* = 13 */,
    LinuxEditor /* = 16 */,
    WebGLPlayer /* = 17 */,
    MetroPlayerX86 /* = 18 */,
    WSAPlayerX86 /* = 18 */,
    MetroPlayerX64 /* = 19 */,
    WSAPlayerX64 /* = 19 */,
    MetroPlayerARM /* = 20 */,
    WSAPlayerARM /* = 20 */,
    WP8Player /* = 21 */,
    BB10Player /* = 22 */,
    BlackBerryPlayer /* = 22 */,
    TizenPlayer /* = 23 */,
    PSP2 /* = 24 */,
    PS4 /* = 25 */,
    PSM /* = 26 */,
    XboxOne /* = 27 */,
    SamsungTVPlayer /* = 28 */,
    WiiU /* = 30 */,
    tvOS /* = 31 */,
    Switch /* = 32 */,
    Lumin /* = 33 */,
    Stadia /* = 34 */,
    CloudRendering /* = 35 */,
    GameCoreScarlett /* = 36 */,
    GameCoreXboxSeries /* = 36 */,
    GameCoreXboxOne /* = 37 */,
    PS5 /* = 38 */,
    EmbeddedLinuxArm64 /* = 39 */,
    EmbeddedLinuxArm32 /* = 40 */,
    EmbeddedLinuxX64 /* = 41 */,
    EmbeddedLinuxX86 /* = 42 */,
    LinuxServer /* = 43 */,
    WindowsServer /* = 44 */,
    OSXServer /* = 45 */
}

external enum class SystemLanguage {
    Afrikaans /* = 0 */,
    Arabic /* = 1 */,
    Basque /* = 2 */,
    Belarusian /* = 3 */,
    Bulgarian /* = 4 */,
    Catalan /* = 5 */,
    Chinese /* = 6 */,
    Czech /* = 7 */,
    Danish /* = 8 */,
    Dutch /* = 9 */,
    English /* = 10 */,
    Estonian /* = 11 */,
    Faroese /* = 12 */,
    Finnish /* = 13 */,
    French /* = 14 */,
    German /* = 15 */,
    Greek /* = 16 */,
    Hebrew /* = 17 */,
    Hugarian /* = 18 */,
    Icelandic /* = 19 */,
    Indonesian /* = 20 */,
    Italian /* = 21 */,
    Japanese /* = 22 */,
    Korean /* = 23 */,
    Latvian /* = 24 */,
    Lithuanian /* = 25 */,
    Norwegian /* = 26 */,
    Polish /* = 27 */,
    Portuguese /* = 28 */,
    Romanian /* = 29 */,
    Russian /* = 30 */,
    SerboCroatian /* = 31 */,
    Slovak /* = 32 */,
    Slovenian /* = 33 */,
    Spanish /* = 34 */,
    Swedish /* = 35 */,
    Thai /* = 36 */,
    Turkish /* = 37 */,
    Ukrainian /* = 38 */,
    Vietnamese /* = 39 */,
    ChineseSimplified /* = 40 */,
    ChineseTraditional /* = 41 */,
    Unknown /* = 42 */,
    Hungarian /* = 18 */
}

external open class SortingLayer : ValueType {
    open var `var`: Any
    open val id: Any
    open val name: Any
    open val value: Any

    companion object {
        fun GetLayerValueFromID(`$id`: Number): Number
        fun GetLayerValueFromName(`$name`: String): Number
        fun NameToID(`$name`: String): Number
        fun IDToName(`$id`: Number): String
        fun IsValid(`$id`: Number): Boolean
    }
}

external enum class WeightedMode {
    None /* = 0 */,
    In /* = 1 */,
    Out /* = 2 */,
    Both /* = 3 */
}

external open class Keyframe : ValueType {
    constructor(`$time`: Number, `$value`: Number)
    constructor(`$time`: Number, `$value`: Number, `$inTangent`: Number, `$outTangent`: Number)
    constructor(`$time`: Number, `$value`: Number, `$inTangent`: Number, `$outTangent`: Number, `$inWeight`: Number, `$outWeight`: Number)
    constructor()
    open var `var`: Any
    open var time: Any
    open var value: Any
    open var inTangent: Any
    open var outTangent: Any
    open var inWeight: Any
    open var outWeight: Any
    open var weightedMode: Any
}

external open class Application : csharp.System.Object {
    interface AdvertisingIdentifierCallback {
        @nativeInvoke
        operator fun invoke(advertisingId: String, trackingEnabled: Boolean, errorMsg: String)
        var Invoke: ((advertisingId: String, trackingEnabled: Boolean, errorMsg: String) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LowMemoryCallback {
        @nativeInvoke
        operator fun invoke()
        var Invoke: (() -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogCallback {
        @nativeInvoke
        operator fun invoke(condition: String, stackTrace: String, type: LogType)
        var Invoke: ((condition: String, stackTrace: String, type: LogType) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        fun Quit(`$exitCode`: Number)
        fun Quit()
        fun Unload()
        fun CanStreamedLevelBeLoaded(`$levelIndex`: Number): Boolean
        fun CanStreamedLevelBeLoaded(`$levelName`: String): Boolean
        fun IsPlaying(`$obj`: Object): Boolean
        fun GetBuildTags(): `Array$1`<String>
        fun SetBuildTags(`$buildTags`: `Array$1`<String>)
        fun HasProLicense(): Boolean
        fun RequestAdvertisingIdentifierAsync(`$delegateMethod`: AdvertisingIdentifierCallback): Boolean
        fun OpenURL(`$url`: String)
        fun GetStackTraceLogType(`$logType`: LogType): StackTraceLogType
        fun SetStackTraceLogType(`$logType`: LogType, `$stackTraceType`: StackTraceLogType)
        fun RequestUserAuthorization(`$mode`: UserAuthorization): AsyncOperation
        fun HasUserAuthorization(`$mode`: UserAuthorization): Boolean
        fun add_lowMemory(`$value`: LowMemoryCallback)
        fun remove_lowMemory(`$value`: LowMemoryCallback)
        fun add_logMessageReceived(`$value`: LogCallback)
        fun remove_logMessageReceived(`$value`: LogCallback)
        fun add_logMessageReceivedThreaded(`$value`: LogCallback)
        fun remove_logMessageReceivedThreaded(`$value`: LogCallback)
        fun add_onBeforeRender(`$value`: UnityAction)
        fun remove_onBeforeRender(`$value`: UnityAction)
        fun add_focusChanged(`$value`: `Action$1`<Boolean>)
        fun remove_focusChanged(`$value`: `Action$1`<Boolean>)
        fun add_deepLinkActivated(`$value`: `Action$1`<String>)
        fun remove_deepLinkActivated(`$value`: `Action$1`<String>)
        fun add_wantsToQuit(`$value`: `Func$1`<Boolean>)
        fun remove_wantsToQuit(`$value`: `Func$1`<Boolean>)
        fun add_quitting(`$value`: Action)
        fun remove_quitting(`$value`: Action)
        fun add_unloading(`$value`: Action)
        fun remove_unloading(`$value`: Action)
    }
}

external enum class ApplicationInstallMode {
    Unknown /* = 0 */,
    Store /* = 1 */,
    DeveloperBuild /* = 2 */,
    Adhoc /* = 3 */,
    Enterprise /* = 4 */,
    Editor /* = 5 */
}

external enum class ApplicationSandboxType {
    Unknown /* = 0 */,
    NotSandboxed /* = 1 */,
    Sandboxed /* = 2 */,
    SandboxBroken /* = 3 */
}

external enum class StackTraceLogType {
    None /* = 0 */,
    ScriptOnly /* = 1 */,
    Full /* = 2 */
}

external enum class UserAuthorization {
    WebCam /* = 1 */,
    Microphone /* = 2 */
}

external enum class NetworkReachability {
    NotReachable /* = 0 */,
    ReachableViaCarrierDataNetwork /* = 1 */,
    ReachableViaLocalAreaNetwork /* = 2 */
}

external enum class AudioType {
    UNKNOWN /* = 0 */,
    ACC /* = 1 */,
    AIFF /* = 2 */,
    IT /* = 10 */,
    MOD /* = 12 */,
    MPEG /* = 13 */,
    OGGVORBIS /* = 14 */,
    S3M /* = 17 */,
    WAV /* = 20 */,
    XM /* = 21 */,
    XMA /* = 22 */,
    VAG /* = 23 */,
    AUDIOQUEUE /* = 24 */
}

external open class CachedAssetBundle : ValueType {
    constructor(`$name`: String, `$hash`: Hash128)
    constructor()
    open var `var`: Any
    open var name: Any
}

external open class Cache : ValueType, `IEquatable$1`<Cache> {
    open var `var`: Any
    open val valid: Any
    open val ready: Any
    open val readOnly: Any
    open val path: Any
    open val index: Any
    open val spaceFree: Any
    open var maximumAvailableStorageSpace: Any
    open val spaceOccupied: Any
    open var expirationDelay: Any
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Cache): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun ClearCache(): Boolean
    open fun ClearCache(`$expiration`: Number): Boolean

    companion object {
        fun op_Equality(`$lhs`: Cache, `$rhs`: Cache): Boolean
        fun op_Inequality(`$lhs`: Cache, `$rhs`: Cache): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external enum class RenderingPath {
    UsePlayerSettings /* = -1 */,
    VertexLit /* = 0 */,
    Forward /* = 1 */,
    DeferredLighting /* = 2 */,
    DeferredShading /* = 3 */
}

external enum class TransparencySortMode {
    Default /* = 0 */,
    Perspective /* = 1 */,
    Orthographic /* = 2 */,
    CustomAxis /* = 3 */
}

external enum class CameraType {
    Game /* = 1 */,
    SceneView /* = 2 */,
    Preview /* = 4 */,
    VR /* = 8 */,
    Reflection /* = 16 */
}

external enum class CameraClearFlags {
    Skybox /* = 1 */,
    Color /* = 2 */,
    SolidColor /* = 2 */,
    Depth /* = 3 */,
    Nothing /* = 4 */
}

external enum class DepthTextureMode {
    None /* = 0 */,
    Depth /* = 1 */,
    DepthNormals /* = 2 */,
    MotionVectors /* = 4 */
}

external open class Shader : Object {
    override var `var`: Any
    open var maximumLOD: Any
    open val isSupported: Any
    open val keywordSpace: Any
    open val renderQueue: Any
    open val passCount: Any
    open val subshaderCount: Any
    open fun GetDependency(`$name`: String): Shader
    open fun GetPassCountInSubshader(`$subshaderIndex`: Number): Number
    open fun FindPassTagValue(`$passIndex`: Number, `$tagName`: ShaderTagId): ShaderTagId
    open fun FindPassTagValue(`$subshaderIndex`: Number, `$passIndex`: Number, `$tagName`: ShaderTagId): ShaderTagId
    open fun FindSubshaderTagValue(`$subshaderIndex`: Number, `$tagName`: ShaderTagId): ShaderTagId
    open fun GetPropertyCount(): Number
    open fun FindPropertyIndex(`$propertyName`: String): Number
    open fun GetPropertyName(`$propertyIndex`: Number): String
    open fun GetPropertyNameId(`$propertyIndex`: Number): Number
    open fun GetPropertyType(`$propertyIndex`: Number): ShaderPropertyType
    open fun GetPropertyDescription(`$propertyIndex`: Number): String
    open fun GetPropertyFlags(`$propertyIndex`: Number): ShaderPropertyFlags
    open fun GetPropertyAttributes(`$propertyIndex`: Number): `Array$1`<String>
    open fun GetPropertyDefaultFloatValue(`$propertyIndex`: Number): Number
    open fun GetPropertyDefaultVectorValue(`$propertyIndex`: Number): Vector4
    open fun GetPropertyRangeLimits(`$propertyIndex`: Number): Vector2
    open fun GetPropertyTextureDimension(`$propertyIndex`: Number): TextureDimension
    open fun GetPropertyTextureDefaultName(`$propertyIndex`: Number): String
    open fun FindTextureStack(`$propertyIndex`: Number, `$stackName`: `$Ref`<String>, `$layerIndex`: `$Ref`<Number>): Boolean

    companion object {
        fun Find(`$name`: String): Shader
        fun EnableKeyword(`$keyword`: String)
        fun DisableKeyword(`$keyword`: String)
        fun IsKeywordEnabled(`$keyword`: String): Boolean
        fun EnableKeyword(`$keyword`: `$Ref`<GlobalKeyword>)
        fun DisableKeyword(`$keyword`: `$Ref`<GlobalKeyword>)
        fun SetKeyword(`$keyword`: `$Ref`<GlobalKeyword>, `$value`: Boolean)
        fun IsKeywordEnabled(`$keyword`: `$Ref`<GlobalKeyword>): Boolean
        fun WarmupAllShaders()
        fun PropertyToID(`$name`: String): Number
        fun SetGlobalInt(`$name`: String, `$value`: Number)
        fun SetGlobalInt(`$nameID`: Number, `$value`: Number)
        fun SetGlobalFloat(`$name`: String, `$value`: Number)
        fun SetGlobalFloat(`$nameID`: Number, `$value`: Number)
        fun SetGlobalInteger(`$name`: String, `$value`: Number)
        fun SetGlobalInteger(`$nameID`: Number, `$value`: Number)
        fun SetGlobalVector(`$name`: String, `$value`: Vector4)
        fun SetGlobalVector(`$nameID`: Number, `$value`: Vector4)
        fun SetGlobalColor(`$name`: String, `$value`: Color)
        fun SetGlobalColor(`$nameID`: Number, `$value`: Color)
        fun SetGlobalMatrix(`$name`: String, `$value`: Matrix4x4)
        fun SetGlobalMatrix(`$nameID`: Number, `$value`: Matrix4x4)
        fun SetGlobalTexture(`$name`: String, `$value`: Texture)
        fun SetGlobalTexture(`$nameID`: Number, `$value`: Texture)
        fun SetGlobalTexture(`$name`: String, `$value`: RenderTexture, `$element`: RenderTextureSubElement)
        fun SetGlobalTexture(`$nameID`: Number, `$value`: RenderTexture, `$element`: RenderTextureSubElement)
        fun SetGlobalBuffer(`$name`: String, `$value`: ComputeBuffer)
        fun SetGlobalBuffer(`$nameID`: Number, `$value`: ComputeBuffer)
        fun SetGlobalBuffer(`$name`: String, `$value`: GraphicsBuffer)
        fun SetGlobalBuffer(`$nameID`: Number, `$value`: GraphicsBuffer)
        fun SetGlobalConstantBuffer(`$name`: String, `$value`: ComputeBuffer, `$offset`: Number, `$size`: Number)
        fun SetGlobalConstantBuffer(`$nameID`: Number, `$value`: ComputeBuffer, `$offset`: Number, `$size`: Number)
        fun SetGlobalConstantBuffer(`$name`: String, `$value`: GraphicsBuffer, `$offset`: Number, `$size`: Number)
        fun SetGlobalConstantBuffer(`$nameID`: Number, `$value`: GraphicsBuffer, `$offset`: Number, `$size`: Number)
        fun SetGlobalFloatArray(`$name`: String, `$values`: `List$1`<Number>)
        fun SetGlobalFloatArray(`$nameID`: Number, `$values`: `List$1`<Number>)
        fun SetGlobalFloatArray(`$name`: String, `$values`: `Array$1`<Number>)
        fun SetGlobalFloatArray(`$nameID`: Number, `$values`: `Array$1`<Number>)
        fun SetGlobalVectorArray(`$name`: String, `$values`: `List$1`<Vector4>)
        fun SetGlobalVectorArray(`$nameID`: Number, `$values`: `List$1`<Vector4>)
        fun SetGlobalVectorArray(`$name`: String, `$values`: `Array$1`<Vector4>)
        fun SetGlobalVectorArray(`$nameID`: Number, `$values`: `Array$1`<Vector4>)
        fun SetGlobalMatrixArray(`$name`: String, `$values`: `List$1`<Matrix4x4>)
        fun SetGlobalMatrixArray(`$nameID`: Number, `$values`: `List$1`<Matrix4x4>)
        fun SetGlobalMatrixArray(`$name`: String, `$values`: `Array$1`<Matrix4x4>)
        fun SetGlobalMatrixArray(`$nameID`: Number, `$values`: `Array$1`<Matrix4x4>)
        fun GetGlobalInt(`$name`: String): Number
        fun GetGlobalInt(`$nameID`: Number): Number
        fun GetGlobalFloat(`$name`: String): Number
        fun GetGlobalFloat(`$nameID`: Number): Number
        fun GetGlobalInteger(`$name`: String): Number
        fun GetGlobalInteger(`$nameID`: Number): Number
        fun GetGlobalVector(`$name`: String): Vector4
        fun GetGlobalVector(`$nameID`: Number): Vector4
        fun GetGlobalColor(`$name`: String): Color
        fun GetGlobalColor(`$nameID`: Number): Color
        fun GetGlobalMatrix(`$name`: String): Matrix4x4
        fun GetGlobalMatrix(`$nameID`: Number): Matrix4x4
        fun GetGlobalTexture(`$name`: String): Texture
        fun GetGlobalTexture(`$nameID`: Number): Texture
        fun GetGlobalFloatArray(`$name`: String): `Array$1`<Number>
        fun GetGlobalFloatArray(`$nameID`: Number): `Array$1`<Number>
        fun GetGlobalVectorArray(`$name`: String): `Array$1`<Vector4>
        fun GetGlobalVectorArray(`$nameID`: Number): `Array$1`<Vector4>
        fun GetGlobalMatrixArray(`$name`: String): `Array$1`<Matrix4x4>
        fun GetGlobalMatrixArray(`$nameID`: Number): `Array$1`<Matrix4x4>
        fun GetGlobalFloatArray(`$name`: String, `$values`: `List$1`<Number>)
        fun GetGlobalFloatArray(`$nameID`: Number, `$values`: `List$1`<Number>)
        fun GetGlobalVectorArray(`$name`: String, `$values`: `List$1`<Vector4>)
        fun GetGlobalVectorArray(`$nameID`: Number, `$values`: `List$1`<Vector4>)
        fun GetGlobalMatrixArray(`$name`: String, `$values`: `List$1`<Matrix4x4>)
        fun GetGlobalMatrixArray(`$nameID`: Number, `$values`: `List$1`<Matrix4x4>)
    }
}

external open class RenderTexture : Texture {
    constructor(`$desc`: RenderTextureDescriptor)
    constructor(`$textureToCopy`: RenderTexture)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: DefaultFormat)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: GraphicsFormat)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: GraphicsFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: GraphicsFormat, `$depthStencilFormat`: GraphicsFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: GraphicsFormat, `$depthStencilFormat`: GraphicsFormat)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: RenderTextureFormat, `$readWrite`: RenderTextureReadWrite)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: RenderTextureFormat)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: RenderTextureFormat, `$mipCount`: Number)
    constructor()
    override var `var`: Any
    override var width: Any
    override var height: Any
    override var dimension: Any
    //open var graphicsFormat: Any
    open var useMipMap: Any
    open val sRGB: Any
    open var vrUsage: Any
    open var memorylessMode: Any
    open var format: Any
    open var stencilFormat: Any
    open var depthStencilFormat: Any
    open var autoGenerateMips: Any
    open var volumeDepth: Any
    open var antiAliasing: Any
    open var bindTextureMS: Any
    open var enableRandomWrite: Any
    open var useDynamicScale: Any
    open var isPowerOfTwo: Any
    open val colorBuffer: Any
    open val depthBuffer: Any
    open var depth: Any
    open var descriptor: Any
    open fun GetNativeDepthBufferPtr(): IntPtr
    open fun DiscardContents(`$discardColor`: Boolean, `$discardDepth`: Boolean)
    open fun DiscardContents()
    open fun ResolveAntiAliasedSurface()
    open fun ResolveAntiAliasedSurface(`$target`: RenderTexture)
    open fun SetGlobalShaderProperty(`$propertyName`: String)
    open fun Create(): Boolean
    open fun Release()
    open fun IsCreated(): Boolean
    open fun GenerateMips()
    //open fun ConvertToEquirect(`$equirect`: RenderTexture, `$eye`: MonoOrStereoscopicEye = definedExternally)

    companion object {
        fun SupportsStencil(`$rt`: RenderTexture): Boolean
        fun ReleaseTemporary(`$temp`: RenderTexture)
        fun GetTemporary(`$desc`: RenderTextureDescriptor): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: GraphicsFormat, `$antiAliasing`: Number, `$memorylessMode`: RenderTextureMemoryless, `$vrUsage`: VRTextureUsage, `$useDynamicScale`: Boolean): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: GraphicsFormat, `$antiAliasing`: Number, `$memorylessMode`: RenderTextureMemoryless, `$vrUsage`: VRTextureUsage): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: GraphicsFormat, `$antiAliasing`: Number, `$memorylessMode`: RenderTextureMemoryless): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: GraphicsFormat, `$antiAliasing`: Number): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: GraphicsFormat): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: RenderTextureFormat, `$readWrite`: RenderTextureReadWrite, `$antiAliasing`: Number, `$memorylessMode`: RenderTextureMemoryless, `$vrUsage`: VRTextureUsage, `$useDynamicScale`: Boolean): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: RenderTextureFormat, `$readWrite`: RenderTextureReadWrite, `$antiAliasing`: Number, `$memorylessMode`: RenderTextureMemoryless, `$vrUsage`: VRTextureUsage): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: RenderTextureFormat, `$readWrite`: RenderTextureReadWrite, `$antiAliasing`: Number, `$memorylessMode`: RenderTextureMemoryless): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: RenderTextureFormat, `$readWrite`: RenderTextureReadWrite, `$antiAliasing`: Number): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: RenderTextureFormat, `$readWrite`: RenderTextureReadWrite): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number, `$format`: RenderTextureFormat): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number, `$depthBuffer`: Number): RenderTexture
        fun GetTemporary(`$width`: Number, `$height`: Number): RenderTexture
    }
}

external open class RenderBuffer : ValueType {
    open fun GetNativeRenderBufferPtr(): IntPtr
}

external open class Ray : ValueType, IFormattable {
    constructor(`$origin`: Vector3, `$direction`: Vector3)
    constructor()
    open fun GetPoint(`$distance`: Number): Vector3
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
}

external enum class StereoTargetEyeMask {
    None /* = 0 */,
    Left /* = 1 */,
    Right /* = 2 */,
    Both /* = 3 */
}

external open class Cubemap : Texture {
    constructor(`$width`: Number, `$format`: DefaultFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$format`: TextureFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags, `$mipCount`: Number)
    constructor(`$width`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean)
    constructor()
    override var `var`: Any
    open val format: Any
    override val isReadable: Any
    open val streamingMipmaps: Any
    open val streamingMipmapsPriority: Any
    open var requestedMipmapLevel: Any
    open val desiredMipmapLevel: Any
    open val loadingMipmapLevel: Any
    open val loadedMipmapLevel: Any
    open fun UpdateExternalTexture(`$nativeTexture`: IntPtr)
    open fun SmoothEdges(`$smoothRegionWidthInPixels`: Number)
    open fun SmoothEdges()
    open fun GetPixels(`$face`: CubemapFace, `$miplevel`: Number): `Array$1`<Color>
    open fun GetPixels(`$face`: CubemapFace): `Array$1`<Color>
    open fun SetPixels(`$colors`: `Array$1`<Color>, `$face`: CubemapFace, `$miplevel`: Number)
    open fun SetPixels(`$colors`: `Array$1`<Color>, `$face`: CubemapFace)
    open fun ClearRequestedMipmapLevel()
    open fun IsRequestedMipmapLevelLoaded(): Boolean
    open fun SetPixel(`$face`: CubemapFace, `$x`: Number, `$y`: Number, `$color`: Color)
    open fun SetPixel(`$face`: CubemapFace, `$x`: Number, `$y`: Number, `$color`: Color, `$mip`: Number)
    open fun GetPixel(`$face`: CubemapFace, `$x`: Number, `$y`: Number): Color
    open fun GetPixel(`$face`: CubemapFace, `$x`: Number, `$y`: Number, `$mip`: Number): Color
    open fun Apply(`$updateMipmaps`: Boolean, `$makeNoLongerReadable`: Boolean)
    open fun Apply(`$updateMipmaps`: Boolean)
    open fun Apply()

    companion object {
        fun CreateExternalTexture(`$width`: Number, `$format`: TextureFormat, `$mipmap`: Boolean, `$nativeTex`: IntPtr): Cubemap
    }
}

external open class BoundingSphere : ValueType {
    constructor(`$pos`: Vector3, `$rad`: Number)
    constructor(`$packedSphere`: Vector4)
    constructor()
    open var position: Vector3
    open var radius: Number
}

external open class CullingGroupEvent : ValueType {
    open var `var`: Any
    open val index: Any
    open val isVisible: Any
    open val wasVisible: Any
    open val hasBecomeVisible: Any
    open val hasBecomeInvisible: Any
    open val currentDistance: Any
    open val previousDistance: Any
}

external open class CullingGroup : csharp.System.Object, IDisposable {
    open var `var`: Any
    open var onStateChanged: Any
    open var enabled: Any
    open var targetCamera: Any
    open fun Dispose()
    open fun SetBoundingSpheres(`$array`: `Array$1`<BoundingSphere>)
    open fun SetBoundingSphereCount(`$count`: Number)
    open fun EraseSwapBack(`$index`: Number)
    open fun QueryIndices(`$visible`: Boolean, `$result`: `Array$1`<Number>, `$firstIndex`: Number): Number
    open fun QueryIndices(`$distanceIndex`: Number, `$result`: `Array$1`<Number>, `$firstIndex`: Number): Number
    open fun QueryIndices(`$visible`: Boolean, `$distanceIndex`: Number, `$result`: `Array$1`<Number>, `$firstIndex`: Number): Number
    open fun IsVisible(`$index`: Number): Boolean
    open fun GetDistance(`$index`: Number): Number
    open fun SetBoundingDistances(`$distances`: `Array$1`<Number>)
    open fun SetDistanceReferencePoint(`$point`: Vector3)
    open fun SetDistanceReferencePoint(`$transform`: Transform)
    interface StateChanged {
        @nativeInvoke
        operator fun invoke(sphere: CullingGroupEvent)
        var Invoke: ((sphere: CullingGroupEvent) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
}

external open class FlareLayer : Behaviour

external open class ReflectionProbe : Behaviour {
    override var `var`: Any
    open var nearClipPlane: Any
    open var farClipPlane: Any
    open var intensity: Any
    open val bounds: Any
    open var hdr: Any
    open var renderDynamicObjects: Any
    open var shadowDistance: Any
    open var resolution: Any
    open var cullingMask: Any
    open var clearFlags: Any
    open var backgroundColor: Any
    open var blendDistance: Any
    open var boxProjection: Any
    open var mode: Any
    open var importance: Any
    open var refreshMode: Any
    open var timeSlicingMode: Any
    open var bakedTexture: Any
    open var customBakedTexture: Any
    open var realtimeTexture: Any
    open val texture: Any
    open fun Reset()
    open fun RenderProbe(): Number
    open fun RenderProbe(`$targetTexture`: RenderTexture): Number
    open fun IsFinishedRendering(`$renderId`: Number): Boolean

    companion object {
        fun BlendCubemap(`$src`: Texture, `$dst`: Texture, `$blend`: Number, `$target`: RenderTexture): Boolean
        fun UpdateCachedState()
        //fun add_reflectionProbeChanged(`$value`: `Action$2`<ReflectionProbe, ReflectionProbeEvent>)
        //fun remove_reflectionProbeChanged(`$value`: `Action$2`<ReflectionProbe, ReflectionProbeEvent>)
        fun add_defaultReflectionSet(`$value`: `Action$1`<Cubemap>)
        fun remove_defaultReflectionSet(`$value`: `Action$1`<Cubemap>)
        fun add_defaultReflectionTexture(`$value`: `Action$1`<Texture>)
        fun remove_defaultReflectionTexture(`$value`: `Action$1`<Texture>)
    }
}

external open class CrashReport : csharp.System.Object {
    open var time: Date
    open var text: String
    open fun Remove()

    companion object {
        fun RemoveAll()
    }
}

external open class ExposedPropertyResolver : ValueType

external interface IExposedPropertyTable {
    fun SetReferenceValue(`$id`: PropertyName, `$value`: Object)
    fun GetReferenceValue(`$id`: PropertyName, `$idValid`: `$Ref`<Boolean>): Object
    fun ClearReferenceValue(`$id`: PropertyName)
}

external open class PropertyName : ValueType, `IEquatable$1`<PropertyName> {
    constructor(`$name`: String)
    constructor(`$other`: PropertyName)
    constructor(`$id`: Number)
    constructor()
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: PropertyName): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun IsNullOrEmpty(`$prop`: PropertyName): Boolean
        fun op_Equality(`$lhs`: PropertyName, `$rhs`: PropertyName): Boolean
        fun op_Inequality(`$lhs`: PropertyName, `$rhs`: PropertyName): Boolean
        fun op_Implicit(`$name`: String): PropertyName
        fun op_Implicit(`$id`: Number): PropertyName
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class BoundsInt : ValueType, IFormattable, `IEquatable$1`<BoundsInt> {
    constructor(`$xMin`: Number, `$yMin`: Number, `$zMin`: Number, `$sizeX`: Number, `$sizeY`: Number, `$sizeZ`: Number)
    constructor(`$position`: Vector3Int, `$size`: Vector3Int)
    constructor()
    open var `var`: Any
    open var x: Any
    open var y: Any
    open var z: Any
    open var xMin: Any
    open var yMin: Any
    open var zMin: Any
    open var xMax: Any
    open var yMax: Any
    open var zMax: Any
    open val allPositionsWithin: Any
    open fun SetMinMax(`$minPosition`: Vector3Int, `$maxPosition`: Vector3Int)
    open fun ClampToBounds(`$bounds`: BoundsInt)
    open fun Contains(`$position`: Vector3Int): Boolean
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: BoundsInt): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open class PositionEnumerator : ValueType, `IEnumerator$1`<Vector3Int>, IEnumerator, IDisposable {
        constructor(`$min`: Vector3Int, `$max`: Vector3Int)
        constructor()
        open fun GetEnumerator(): PositionEnumerator
        open fun MoveNext(): Boolean
        open fun Reset()
    }

    companion object {
        fun op_Equality(`$lhs`: BoundsInt, `$rhs`: BoundsInt): Boolean
        fun op_Inequality(`$lhs`: BoundsInt, `$rhs`: BoundsInt): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class Vector3Int : ValueType, IFormattable, `IEquatable$1`<Vector3Int> {
    constructor(`$x`: Number, `$y`: Number)
    constructor(`$x`: Number, `$y`: Number, `$z`: Number)
    constructor()
    open var `var`: Any
    open var x: Any
    open var y: Any
    open var z: Any
    open val magnitude: Any
    open val sqrMagnitude: Any
    open fun Set(`$x`: Number, `$y`: Number, `$z`: Number)
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)
    open fun Scale(`$scale`: Vector3Int)
    open fun Clamp(`$min`: Vector3Int, `$max`: Vector3Int)
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Vector3Int): Boolean
    override fun Equals(`$obj`: Any): Boolean
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String

    companion object {
        fun Distance(`$a`: Vector3Int, `$b`: Vector3Int): Number
        fun Min(`$lhs`: Vector3Int, `$rhs`: Vector3Int): Vector3Int
        fun Max(`$lhs`: Vector3Int, `$rhs`: Vector3Int): Vector3Int
        fun Scale(`$a`: Vector3Int, `$b`: Vector3Int): Vector3Int
        fun op_Implicit(`$v`: Vector3Int): Vector3
        fun op_Explicit(`$v`: Vector3Int): Vector2Int
        fun FloorToInt(`$v`: Vector3): Vector3Int
        fun CeilToInt(`$v`: Vector3): Vector3Int
        fun RoundToInt(`$v`: Vector3): Vector3Int
        fun op_Addition(`$a`: Vector3Int, `$b`: Vector3Int): Vector3Int
        fun op_Subtraction(`$a`: Vector3Int, `$b`: Vector3Int): Vector3Int
        fun op_Multiply(`$a`: Vector3Int, `$b`: Vector3Int): Vector3Int
        fun op_UnaryNegation(`$a`: Vector3Int): Vector3Int
        fun op_Multiply(`$a`: Vector3Int, `$b`: Number): Vector3Int
        fun op_Multiply(`$a`: Number, `$b`: Vector3Int): Vector3Int
        fun op_Division(`$a`: Vector3Int, `$b`: Number): Vector3Int
        fun op_Equality(`$lhs`: Vector3Int, `$rhs`: Vector3Int): Boolean
        fun op_Inequality(`$lhs`: Vector3Int, `$rhs`: Vector3Int): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class GeometryUtility : csharp.System.Object {
    companion object {
        fun CalculateFrustumPlanes(`$camera`: Camera): `Array$1`<Plane>
        fun CalculateFrustumPlanes(`$worldToProjectionMatrix`: Matrix4x4): `Array$1`<Plane>
        fun CalculateFrustumPlanes(`$camera`: Camera, `$planes`: `Array$1`<Plane>)
        fun CalculateFrustumPlanes(`$worldToProjectionMatrix`: Matrix4x4, `$planes`: `Array$1`<Plane>)
        fun CalculateBounds(`$positions`: `Array$1`<Vector3>, `$transform`: Matrix4x4): Bounds
        fun TryCreatePlaneFromPolygon(`$vertices`: `Array$1`<Vector3>, `$plane`: `$Ref`<Plane>): Boolean
        fun TestPlanesAABB(`$planes`: `Array$1`<Plane>, `$bounds`: Bounds): Boolean
    }
}

external open class Plane : ValueType, IFormattable {
    constructor(`$inNormal`: Vector3, `$inPoint`: Vector3)
    constructor(`$inNormal`: Vector3, `$d`: Number)
    constructor(`$a`: Vector3, `$b`: Vector3, `$c`: Vector3)
    constructor()
    open var `var`: Any
    open var distance: Any
    open val flipped: Any
    open fun SetNormalAndPosition(`$inNormal`: Vector3, `$inPoint`: Vector3)
    open fun Set3Points(`$a`: Vector3, `$b`: Vector3, `$c`: Vector3)
    open fun Flip()
    open fun Translate(`$translation`: Vector3)
    open fun ClosestPointOnPlane(`$point`: Vector3): Vector3
    open fun GetDistanceToPoint(`$point`: Vector3): Number
    open fun GetSide(`$point`: Vector3): Boolean
    open fun SameSide(`$inPt0`: Vector3, `$inPt1`: Vector3): Boolean
    open fun Raycast(`$ray`: Ray, `$enter`: `$Ref`<Number>): Boolean
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String

    companion object {
        fun Translate(`$plane`: Plane, `$translation`: Vector3): Plane
    }
}

external open class Ray2D : ValueType, IFormattable {
    constructor(`$origin`: Vector2, `$direction`: Vector2)
    constructor()
    open fun GetPoint(`$distance`: Number): Vector2
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
}

external open class RectInt : ValueType, IFormattable, `IEquatable$1`<RectInt> {
    constructor(`$xMin`: Number, `$yMin`: Number, `$width`: Number, `$height`: Number)
    constructor(`$position`: Vector2Int, `$size`: Vector2Int)
    constructor()
    open var `var`: Any
    open var x: Any
    open var y: Any
    open var width: Any
    open var height: Any
    open var xMin: Any
    open var yMin: Any
    open var xMax: Any
    open var yMax: Any
    open val allPositionsWithin: Any
    open fun SetMinMax(`$minPosition`: Vector2Int, `$maxPosition`: Vector2Int)
    open fun ClampToBounds(`$bounds`: RectInt)
    open fun Contains(`$position`: Vector2Int): Boolean
    open fun Overlaps(`$other`: RectInt): Boolean
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
    open fun Equals(`$other`: RectInt): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open class PositionEnumerator : ValueType, `IEnumerator$1`<Vector2Int>, IEnumerator, IDisposable {
        constructor(`$min`: Vector2Int, `$max`: Vector2Int)
        constructor()
        //open fun GetEnumerator(): _csharp_CSharp_UnityEngine_RectInt_PositionEnumerator
        open fun MoveNext(): Boolean
        open fun Reset()
    }

    companion object {
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class Vector2Int : ValueType, IFormattable, `IEquatable$1`<Vector2Int> {
    constructor(`$x`: Number, `$y`: Number)
    constructor()
    open var `var`: Any
    open var x: Any
    open var y: Any
    open val magnitude: Any
    open val sqrMagnitude: Any
    open fun Set(`$x`: Number, `$y`: Number)
    open fun get_Item(`$index`: Number): Number
    open fun set_Item(`$index`: Number, `$value`: Number)
    open fun Scale(`$scale`: Vector2Int)
    open fun Clamp(`$min`: Vector2Int, `$max`: Vector2Int)
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: Vector2Int): Boolean
    override fun Equals(`$obj`: Any): Boolean
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String

    companion object {
        fun Distance(`$a`: Vector2Int, `$b`: Vector2Int): Number
        fun Min(`$lhs`: Vector2Int, `$rhs`: Vector2Int): Vector2Int
        fun Max(`$lhs`: Vector2Int, `$rhs`: Vector2Int): Vector2Int
        fun Scale(`$a`: Vector2Int, `$b`: Vector2Int): Vector2Int
        fun op_Implicit(`$v`: Vector2Int): Vector2
        fun op_Explicit(`$v`: Vector2Int): Vector3Int
        fun FloorToInt(`$v`: Vector2): Vector2Int
        fun CeilToInt(`$v`: Vector2): Vector2Int
        fun RoundToInt(`$v`: Vector2): Vector2Int
        fun op_UnaryNegation(`$v`: Vector2Int): Vector2Int
        fun op_Addition(`$a`: Vector2Int, `$b`: Vector2Int): Vector2Int
        fun op_Subtraction(`$a`: Vector2Int, `$b`: Vector2Int): Vector2Int
        fun op_Multiply(`$a`: Vector2Int, `$b`: Vector2Int): Vector2Int
        fun op_Multiply(`$a`: Number, `$b`: Vector2Int): Vector2Int
        fun op_Multiply(`$a`: Vector2Int, `$b`: Number): Vector2Int
        fun op_Division(`$a`: Vector2Int, `$b`: Number): Vector2Int
        fun op_Equality(`$lhs`: Vector2Int, `$rhs`: Vector2Int): Boolean
        fun op_Inequality(`$lhs`: Vector2Int, `$rhs`: Vector2Int): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class RectOffset : csharp.System.Object, IFormattable {
    constructor()
    constructor(`$left`: Number, `$right`: Number, `$top`: Number, `$bottom`: Number)
    open var `var`: Any
    open var left: Any
    open var right: Any
    open var top: Any
    open var bottom: Any
    open val horizontal: Any
    open val vertical: Any
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun ToString(`$format`: String, `$formatProvider`: IFormatProvider): String
    open fun Add(`$rect`: Rect): Rect
    open fun Remove(`$rect`: Rect): Rect
}

external open class DynamicGI : csharp.System.Object {
    companion object {
        fun SetEmissive(`$renderer`: Renderer, `$color`: Color)
        fun SetEnvironmentData(`$input`: `Array$1`<Number>)
        fun UpdateEnvironment()
    }
}

external open class Renderer : Component {
    open fun UpdateGIMaterials()
    override var `var`: Any
    open var bounds: Any
    open var localBounds: Any
    open var enabled: Any
    open val isVisible: Any
    open var shadowCastingMode: Any
    open var receiveShadows: Any
    open var forceRenderingOff: Any
    open var staticShadowCaster: Any
    open var motionVectorGenerationMode: Any
    open var lightProbeUsage: Any
    open var reflectionProbeUsage: Any
    open var renderingLayerMask: Any
    open var rendererPriority: Any
    open var rayTracingMode: Any
    open var sortingLayerName: Any
    open var sortingLayerID: Any
    open var sortingOrder: Any
    open var allowOcclusionWhenDynamic: Any
    open val isPartOfStaticBatch: Any
    open var lightProbeProxyVolumeOverride: Any
    open var probeAnchor: Any
    open var lightmapIndex: Any
    open var realtimeLightmapIndex: Any
    open var material: Any
    open var sharedMaterial: Any
    open fun ResetBounds()
    open fun ResetLocalBounds()
    open fun HasPropertyBlock(): Boolean
    open fun SetPropertyBlock(`$properties`: MaterialPropertyBlock)
    open fun SetPropertyBlock(`$properties`: MaterialPropertyBlock, `$materialIndex`: Number)
    open fun GetPropertyBlock(`$properties`: MaterialPropertyBlock)
    open fun GetPropertyBlock(`$properties`: MaterialPropertyBlock, `$materialIndex`: Number)
    open fun GetMaterials(`$m`: `List$1`<Material>)
    open fun GetSharedMaterials(`$m`: `List$1`<Material>)
    open fun GetClosestReflectionProbes(`$result`: `List$1`<ReflectionProbeBlendInfo>)
}

external open class LightingSettings : Object {
    override var `var`: Any
    open var bakedGI: Any
    open var realtimeGI: Any
    open var realtimeEnvironmentLighting: Any
    open var autoGenerate: Any
    open var mixedBakeMode: Any
    open var albedoBoost: Any
    open var indirectScale: Any
    open var lightmapper: Any
    open var lightmapMaxSize: Any
    open var lightmapResolution: Any
    open var lightmapPadding: Any
    open var lightmapCompression: Any
    open var ao: Any
    open var aoMaxDistance: Any
    open var aoExponentIndirect: Any
    open var aoExponentDirect: Any
    open var extractAO: Any
    open var directionalityMode: Any
    open var exportTrainingData: Any
    open var trainingDataDestination: Any
    open var indirectResolution: Any
    open var finalGather: Any
    open var finalGatherRayCount: Any
    open var finalGatherFiltering: Any
    open var sampling: Any
    open var directSampleCount: Any
    open var indirectSampleCount: Any
    open var maxBounces: Any
    open var minBounces: Any
    open var prioritizeView: Any
    open var filteringMode: Any
    open var denoiserTypeDirect: Any
    open var denoiserTypeIndirect: Any
    open var denoiserTypeAO: Any
    open var filterTypeDirect: Any
    open var filterTypeIndirect: Any
    open var filterTypeAO: Any
    open var filteringGaussRadiusDirect: Any
    open var filteringGaussRadiusIndirect: Any
    open var filteringGaussRadiusAO: Any
    open var filteringAtrousPositionSigmaDirect: Any
    open var filteringAtrousPositionSigmaIndirect: Any
    open var filteringAtrousPositionSigmaAO: Any
    open var environmentSampleCount: Any
    open var lightProbeSampleCountMultiplier: Any
}

external enum class MixedLightingMode {
    IndirectOnly /* = 0 */,
    Shadowmask /* = 2 */,
    Subtractive /* = 1 */
}

external enum class LightmapCompression {
    None /* = 0 */,
    LowQuality /* = 1 */,
    NormalQuality /* = 2 */,
    HighQuality /* = 3 */
}

external enum class LightmapsMode {
    NonDirectional /* = 0 */,
    CombinedDirectional /* = 1 */,
    SeparateDirectional /* = 2 */,
    Single /* = 0 */,
    Dual /* = 1 */,
    Directional /* = 2 */
}

external open class Gizmos : csharp.System.Object {
    companion object {
        fun DrawLine(`$from`: Vector3, `$to`: Vector3)
        fun DrawWireSphere(`$center`: Vector3, `$radius`: Number)
        fun DrawSphere(`$center`: Vector3, `$radius`: Number)
        fun DrawWireCube(`$center`: Vector3, `$size`: Vector3)
        fun DrawCube(`$center`: Vector3, `$size`: Vector3)
        fun DrawMesh(`$mesh`: Mesh, `$submeshIndex`: Number, `$position`: Vector3, `$rotation`: Quaternion, `$scale`: Vector3)
        fun DrawWireMesh(`$mesh`: Mesh, `$submeshIndex`: Number, `$position`: Vector3, `$rotation`: Quaternion, `$scale`: Vector3)
        fun DrawIcon(`$center`: Vector3, `$name`: String, `$allowScaling`: Boolean)
        fun DrawIcon(`$center`: Vector3, `$name`: String, `$allowScaling`: Boolean, `$tint`: Color)
        fun DrawGUITexture(`$screenRect`: Rect, `$texture`: Texture, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number, `$mat`: Material)
        fun DrawFrustum(`$center`: Vector3, `$fov`: Number, `$maxRange`: Number, `$minRange`: Number, `$aspect`: Number)
        fun DrawRay(`$r`: Ray)
        fun DrawRay(`$from`: Vector3, `$direction`: Vector3)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3)
        fun DrawMesh(`$mesh`: Mesh)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$scale`: Vector3)
        fun DrawMesh(`$mesh`: Mesh, `$submeshIndex`: Number, `$position`: Vector3, `$rotation`: Quaternion)
        fun DrawMesh(`$mesh`: Mesh, `$submeshIndex`: Number, `$position`: Vector3)
        fun DrawMesh(`$mesh`: Mesh, `$submeshIndex`: Number)
        fun DrawWireMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion)
        fun DrawWireMesh(`$mesh`: Mesh, `$position`: Vector3)
        fun DrawWireMesh(`$mesh`: Mesh)
        fun DrawWireMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$scale`: Vector3)
        fun DrawWireMesh(`$mesh`: Mesh, `$submeshIndex`: Number, `$position`: Vector3, `$rotation`: Quaternion)
        fun DrawWireMesh(`$mesh`: Mesh, `$submeshIndex`: Number, `$position`: Vector3)
        fun DrawWireMesh(`$mesh`: Mesh, `$submeshIndex`: Number)
        fun DrawIcon(`$center`: Vector3, `$name`: String)
        fun DrawGUITexture(`$screenRect`: Rect, `$texture`: Texture)
        fun DrawGUITexture(`$screenRect`: Rect, `$texture`: Texture, `$mat`: Material)
        fun DrawGUITexture(`$screenRect`: Rect, `$texture`: Texture, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number)
    }
}

external open class Mesh : Object {
    override var `var`: Any
    open var indexFormat: Any
    open val vertexBufferCount: Any
    open var vertexBufferTarget: Any
    open var indexBufferTarget: Any
    open val blendShapeCount: Any
    open val isReadable: Any
    open val vertexCount: Any
    open var subMeshCount: Any
    open var bounds: Any
    open val vertexAttributeCount: Any
    open fun SetIndexBufferParams(`$indexCount`: Number, `$format`: IndexFormat)
    open fun GetVertexAttribute(`$index`: Number): VertexAttributeDescriptor
    open fun HasVertexAttribute(`$attr`: VertexAttribute): Boolean
    open fun GetVertexAttributeDimension(`$attr`: VertexAttribute): Number
    open fun GetVertexAttributeFormat(`$attr`: VertexAttribute): VertexAttributeFormat
    open fun GetVertexAttributeStream(`$attr`: VertexAttribute): Number
    open fun GetVertexAttributeOffset(`$attr`: VertexAttribute): Number
    open fun GetVertexBufferStride(`$stream`: Number): Number
    open fun GetNativeVertexBufferPtr(`$index`: Number): IntPtr
    open fun GetNativeIndexBufferPtr(): IntPtr
    open fun ClearBlendShapes()
    open fun GetBlendShapeName(`$shapeIndex`: Number): String
    open fun GetBlendShapeIndex(`$blendShapeName`: String): Number
    open fun GetBlendShapeFrameCount(`$shapeIndex`: Number): Number
    open fun GetBlendShapeFrameWeight(`$shapeIndex`: Number, `$frameIndex`: Number): Number
    open fun GetBlendShapeFrameVertices(`$shapeIndex`: Number, `$frameIndex`: Number, `$deltaVertices`: `Array$1`<Vector3>, `$deltaNormals`: `Array$1`<Vector3>, `$deltaTangents`: `Array$1`<Vector3>)
    open fun AddBlendShapeFrame(`$shapeName`: String, `$frameWeight`: Number, `$deltaVertices`: `Array$1`<Vector3>, `$deltaNormals`: `Array$1`<Vector3>, `$deltaTangents`: `Array$1`<Vector3>)
    open fun SetBoneWeights(`$bonesPerVertex`: `NativeArray$1`<Number>, `$weights`: `NativeArray$1`<BoneWeight1>)
    open fun GetAllBoneWeights(): `NativeArray$1`<BoneWeight1>
    open fun GetBonesPerVertex(): `NativeArray$1`<Number>
    open fun SetSubMesh(`$index`: Number, `$desc`: SubMeshDescriptor, `$flags`: MeshUpdateFlags = definedExternally)
    open fun GetSubMesh(`$index`: Number): SubMeshDescriptor
    open fun MarkModified()
    open fun GetUVDistributionMetric(`$uvSetIndex`: Number): Number
    open fun GetVertices(`$vertices`: `List$1`<Vector3>)
    open fun SetVertices(`$inVertices`: `List$1`<Vector3>)
    open fun SetVertices(`$inVertices`: `List$1`<Vector3>, `$start`: Number, `$length`: Number)
    open fun SetVertices(`$inVertices`: `List$1`<Vector3>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetVertices(`$inVertices`: `Array$1`<Vector3>)
    open fun SetVertices(`$inVertices`: `Array$1`<Vector3>, `$start`: Number, `$length`: Number)
    open fun SetVertices(`$inVertices`: `Array$1`<Vector3>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun GetNormals(`$normals`: `List$1`<Vector3>)
    open fun SetNormals(`$inNormals`: `List$1`<Vector3>)
    open fun SetNormals(`$inNormals`: `List$1`<Vector3>, `$start`: Number, `$length`: Number)
    open fun SetNormals(`$inNormals`: `List$1`<Vector3>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetNormals(`$inNormals`: `Array$1`<Vector3>)
    open fun SetNormals(`$inNormals`: `Array$1`<Vector3>, `$start`: Number, `$length`: Number)
    open fun SetNormals(`$inNormals`: `Array$1`<Vector3>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun GetTangents(`$tangents`: `List$1`<Vector4>)
    open fun SetTangents(`$inTangents`: `List$1`<Vector4>)
    open fun SetTangents(`$inTangents`: `List$1`<Vector4>, `$start`: Number, `$length`: Number)
    open fun SetTangents(`$inTangents`: `List$1`<Vector4>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetTangents(`$inTangents`: `Array$1`<Vector4>)
    open fun SetTangents(`$inTangents`: `Array$1`<Vector4>, `$start`: Number, `$length`: Number)
    open fun SetTangents(`$inTangents`: `Array$1`<Vector4>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun GetColors(`$colors`: `List$1`<Color>)
    open fun SetColors(`$inColors`: `List$1`<Color>)
    open fun SetColors(`$inColors`: `List$1`<Color>, `$start`: Number, `$length`: Number)
    open fun SetColors(`$inColors`: `List$1`<Color>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetColors(`$inColors`: `Array$1`<Color>)
    open fun SetColors(`$inColors`: `Array$1`<Color>, `$start`: Number, `$length`: Number)
    open fun SetColors(`$inColors`: `Array$1`<Color>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun GetColors(`$colors`: `List$1`<Color32>)
    open fun SetColors(`$inColors`: `List$1`<Color32>)
    open fun SetColors(`$inColors`: `List$1`<Color32>, `$start`: Number, `$length`: Number)
    open fun SetColors(`$inColors`: `List$1`<Color32>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetColors(`$inColors`: `Array$1`<Color32>)
    open fun SetColors(`$inColors`: `Array$1`<Color32>, `$start`: Number, `$length`: Number)
    open fun SetColors(`$inColors`: `Array$1`<Color32>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector2>)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector3>)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector4>)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector2>, `$start`: Number, `$length`: Number)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector2>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector3>, `$start`: Number, `$length`: Number)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector3>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector4>, `$start`: Number, `$length`: Number)
    open fun SetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector4>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector2>)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector3>)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector4>)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector2>, `$start`: Number, `$length`: Number)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector2>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector3>, `$start`: Number, `$length`: Number)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector3>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector4>, `$start`: Number, `$length`: Number)
    open fun SetUVs(`$channel`: Number, `$uvs`: `Array$1`<Vector4>, `$start`: Number, `$length`: Number, `$flags`: MeshUpdateFlags)
    open fun GetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector2>)
    open fun GetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector3>)
    open fun GetUVs(`$channel`: Number, `$uvs`: `List$1`<Vector4>)
    open fun GetVertexAttributes(): `Array$1`<VertexAttributeDescriptor>
    open fun GetVertexAttributes(`$attributes`: `Array$1`<VertexAttributeDescriptor>): Number
    open fun GetVertexAttributes(`$attributes`: `List$1`<VertexAttributeDescriptor>): Number
    open fun SetVertexBufferParams(`$vertexCount`: Number, vararg attributes: VertexAttributeDescriptor)
    open fun SetVertexBufferParams(`$vertexCount`: Number, `$attributes`: `NativeArray$1`<VertexAttributeDescriptor>)
    open fun GetVertexBuffer(`$index`: Number): GraphicsBuffer
    open fun GetIndexBuffer(): GraphicsBuffer
    open fun GetTriangles(`$submesh`: Number): `Array$1`<Number>
    open fun GetTriangles(`$submesh`: Number, `$applyBaseVertex`: Boolean): `Array$1`<Number>
    open fun GetTriangles(`$triangles`: `List$1`<Number>, `$submesh`: Number)
    open fun GetTriangles(`$triangles`: `List$1`<Number>, `$submesh`: Number, `$applyBaseVertex`: Boolean)
    open fun GetIndices(`$submesh`: Number): `Array$1`<Number>
    open fun GetIndices(`$submesh`: Number, `$applyBaseVertex`: Boolean): `Array$1`<Number>
    open fun GetIndices(`$indices`: `List$1`<Number>, `$submesh`: Number)
    open fun GetIndices(`$indices`: `List$1`<Number>, `$submesh`: Number, `$applyBaseVertex`: Boolean)
    open fun GetIndexStart(`$submesh`: Number): Number
    open fun GetIndexCount(`$submesh`: Number): Number
    open fun GetBaseVertex(`$submesh`: Number): Number
    open fun SetTriangles(`$triangles`: `Array$1`<Number>, `$submesh`: Number)
    open fun SetTriangles(`$triangles`: `Array$1`<Number>, `$submesh`: Number, `$calculateBounds`: Boolean)
    open fun SetTriangles(`$triangles`: `Array$1`<Number>, `$submesh`: Number, `$calculateBounds`: Boolean, `$baseVertex`: Number)
    open fun SetTriangles(`$triangles`: `Array$1`<Number>, `$trianglesStart`: Number, `$trianglesLength`: Number, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally, `$baseVertex`: Number = definedExternally)
    open fun SetTriangles(`$triangles`: `Array$1`<Number>, `$trianglesStart`: Number, `$trianglesLength`: Number, `$submesh`: Number)
    open fun SetTriangles(`$triangles`: `Array$1`<Number>, `$trianglesStart`: Number, `$trianglesLength`: Number, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally)
    open fun SetTriangles(`$triangles`: `List$1`<Number>, `$submesh`: Number)
    open fun SetTriangles(`$triangles`: `List$1`<Number>, `$submesh`: Number, `$calculateBounds`: Boolean)
    open fun SetTriangles(`$triangles`: `List$1`<Number>, `$submesh`: Number, `$calculateBounds`: Boolean, `$baseVertex`: Number)
    open fun SetTriangles(`$triangles`: `List$1`<Number>, `$trianglesStart`: Number, `$trianglesLength`: Number, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally, `$baseVertex`: Number = definedExternally)
    open fun SetTriangles(`$triangles`: `List$1`<Number>, `$trianglesStart`: Number, `$trianglesLength`: Number, `$submesh`: Number)
    open fun SetTriangles(`$triangles`: `List$1`<Number>, `$trianglesStart`: Number, `$trianglesLength`: Number, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally)
    open fun SetIndices(`$indices`: `Array$1`<Number>, `$topology`: MeshTopology, `$submesh`: Number)
    open fun SetIndices(`$indices`: `Array$1`<Number>, `$topology`: MeshTopology, `$submesh`: Number, `$calculateBounds`: Boolean)
    open fun SetIndices(`$indices`: `Array$1`<Number>, `$topology`: MeshTopology, `$submesh`: Number, `$calculateBounds`: Boolean, `$baseVertex`: Number)
    open fun SetIndices(`$indices`: `Array$1`<Number>, `$indicesStart`: Number, `$indicesLength`: Number, `$topology`: MeshTopology, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally, `$baseVertex`: Number = definedExternally)
    open fun SetIndices(`$indices`: `Array$1`<Number>, `$indicesStart`: Number, `$indicesLength`: Number, `$topology`: MeshTopology, `$submesh`: Number)
    open fun SetIndices(`$indices`: `Array$1`<Number>, `$indicesStart`: Number, `$indicesLength`: Number, `$topology`: MeshTopology, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally)
    open fun SetIndices(`$indices`: `List$1`<Number>, `$topology`: MeshTopology, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally, `$baseVertex`: Number = definedExternally)
    open fun SetIndices(`$indices`: `List$1`<Number>, `$topology`: MeshTopology, `$submesh`: Number)
    open fun SetIndices(`$indices`: `List$1`<Number>, `$topology`: MeshTopology, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally)
    open fun SetIndices(`$indices`: `List$1`<Number>, `$indicesStart`: Number, `$indicesLength`: Number, `$topology`: MeshTopology, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally, `$baseVertex`: Number = definedExternally)
    open fun SetIndices(`$indices`: `List$1`<Number>, `$indicesStart`: Number, `$indicesLength`: Number, `$topology`: MeshTopology, `$submesh`: Number)
    open fun SetIndices(`$indices`: `List$1`<Number>, `$indicesStart`: Number, `$indicesLength`: Number, `$topology`: MeshTopology, `$submesh`: Number, `$calculateBounds`: Boolean = definedExternally)
    open fun SetSubMeshes(`$desc`: `Array$1`<SubMeshDescriptor>, `$start`: Number, `$count`: Number, `$flags`: MeshUpdateFlags = definedExternally)
    open fun SetSubMeshes(`$desc`: `Array$1`<SubMeshDescriptor>, `$start`: Number, `$count`: Number)
    open fun SetSubMeshes(`$desc`: `Array$1`<SubMeshDescriptor>, `$flags`: MeshUpdateFlags = definedExternally)
    open fun SetSubMeshes(`$desc`: `Array$1`<SubMeshDescriptor>)
    open fun SetSubMeshes(`$desc`: `List$1`<SubMeshDescriptor>, `$start`: Number, `$count`: Number, `$flags`: MeshUpdateFlags = definedExternally)
    open fun SetSubMeshes(`$desc`: `List$1`<SubMeshDescriptor>, `$start`: Number, `$count`: Number)
    open fun SetSubMeshes(`$desc`: `List$1`<SubMeshDescriptor>, `$flags`: MeshUpdateFlags = definedExternally)
    open fun SetSubMeshes(`$desc`: `List$1`<SubMeshDescriptor>)
    open fun GetBindposes(`$bindposes`: `List$1`<Matrix4x4>)
    open fun GetBoneWeights(`$boneWeights`: `List$1`<BoneWeight>)
    open fun Clear(`$keepVertexLayout`: Boolean)
    open fun Clear()
    open fun RecalculateBounds()
    open fun RecalculateNormals()
    open fun RecalculateTangents()
    open fun RecalculateBounds(`$flags`: MeshUpdateFlags)
    open fun RecalculateNormals(`$flags`: MeshUpdateFlags)
    open fun RecalculateTangents(`$flags`: MeshUpdateFlags)
    open fun RecalculateUVDistributionMetric(`$uvSetIndex`: Number, `$uvAreaThreshold`: Number = definedExternally)
    open fun RecalculateUVDistributionMetrics(`$uvAreaThreshold`: Number = definedExternally)
    open fun MarkDynamic()
    open fun UploadMeshData(`$markNoLongerReadable`: Boolean)
    open fun Optimize()
    open fun OptimizeIndexBuffers()
    open fun OptimizeReorderVertexBuffer()
    open fun GetTopology(`$submesh`: Number): MeshTopology
    open fun CombineMeshes(`$combine`: `Array$1`<CombineInstance>, `$mergeSubMeshes`: Boolean, `$useMatrices`: Boolean, `$hasLightmapData`: Boolean)
    open fun CombineMeshes(`$combine`: `Array$1`<CombineInstance>, `$mergeSubMeshes`: Boolean, `$useMatrices`: Boolean)
    open fun CombineMeshes(`$combine`: `Array$1`<CombineInstance>, `$mergeSubMeshes`: Boolean)
    open fun CombineMeshes(`$combine`: `Array$1`<CombineInstance>)
    open class MeshDataArray : ValueType, IDisposable {
        open var `var`: Any
        open val Length: Any
        open fun get_Item(`$index`: Number): MeshData
        open fun Dispose()
    }
    open class MeshData : ValueType {
        open var `var`: Any
        open val vertexCount: Any
        open val vertexBufferCount: Any
        open val indexFormat: Any
        open var subMeshCount: Any
        open fun GetVertexBufferStride(`$stream`: Number): Number
        open fun HasVertexAttribute(`$attr`: VertexAttribute): Boolean
        open fun GetVertexAttributeDimension(`$attr`: VertexAttribute): Number
        open fun GetVertexAttributeFormat(`$attr`: VertexAttribute): VertexAttributeFormat
        open fun GetVertexAttributeStream(`$attr`: VertexAttribute): Number
        open fun GetVertexAttributeOffset(`$attr`: VertexAttribute): Number
        open fun GetVertices(`$outVertices`: `NativeArray$1`<Vector3>)
        open fun GetNormals(`$outNormals`: `NativeArray$1`<Vector3>)
        open fun GetTangents(`$outTangents`: `NativeArray$1`<Vector4>)
        open fun GetColors(`$outColors`: `NativeArray$1`<Color>)
        open fun GetColors(`$outColors`: `NativeArray$1`<Color32>)
        open fun GetUVs(`$channel`: Number, `$outUVs`: `NativeArray$1`<Vector2>)
        open fun GetUVs(`$channel`: Number, `$outUVs`: `NativeArray$1`<Vector3>)
        open fun GetUVs(`$channel`: Number, `$outUVs`: `NativeArray$1`<Vector4>)
        open fun SetVertexBufferParams(`$vertexCount`: Number, vararg attributes: VertexAttributeDescriptor)
        open fun SetVertexBufferParams(`$vertexCount`: Number, `$attributes`: `NativeArray$1`<VertexAttributeDescriptor>)
        open fun SetIndexBufferParams(`$indexCount`: Number, `$format`: IndexFormat)
        open fun GetIndices(`$outIndices`: `NativeArray$1`<Number>, `$submesh`: Number, `$applyBaseVertex`: Boolean = definedExternally)
        open fun GetSubMesh(`$index`: Number): SubMeshDescriptor
        open fun SetSubMesh(`$index`: Number, `$desc`: SubMeshDescriptor, `$flags`: MeshUpdateFlags = definedExternally)
    }

    companion object {
        fun AcquireReadOnlyMeshData(`$mesh`: Mesh): MeshDataArray
        fun AcquireReadOnlyMeshData(`$meshes`: `Array$1`<Mesh>): MeshDataArray
        fun AcquireReadOnlyMeshData(`$meshes`: `List$1`<Mesh>): MeshDataArray
        fun AllocateWritableMeshData(`$meshCount`: Number): MeshDataArray
        fun ApplyAndDisposeWritableMeshData(`$data`: MeshDataArray, `$mesh`: Mesh, `$flags`: MeshUpdateFlags = definedExternally)
        fun ApplyAndDisposeWritableMeshData(`$data`: MeshDataArray, `$meshes`: `Array$1`<Mesh>, `$flags`: MeshUpdateFlags = definedExternally)
        fun ApplyAndDisposeWritableMeshData(`$data`: MeshDataArray, `$meshes`: `List$1`<Mesh>, `$flags`: MeshUpdateFlags = definedExternally)
    }
}

external open class BeforeRenderOrderAttribute : Attribute, _Attribute {
    constructor(`$order`: Number)
    constructor()
    open var `var`: Any
    open val order: Any
}

external open class BillboardAsset : Object {
    override var `var`: Any
    open var width: Any
    open var height: Any
    open var bottom: Any
    open val imageCount: Any
    open val vertexCount: Any
    open val indexCount: Any
    open var material: Any
    open fun GetImageTexCoords(`$imageTexCoords`: `List$1`<Vector4>)
    open fun GetImageTexCoords(): `Array$1`<Vector4>
    open fun SetImageTexCoords(`$imageTexCoords`: `List$1`<Vector4>)
    open fun SetImageTexCoords(`$imageTexCoords`: `Array$1`<Vector4>)
    open fun GetVertices(`$vertices`: `List$1`<Vector2>)
    open fun GetVertices(): `Array$1`<Vector2>
    open fun SetVertices(`$vertices`: `List$1`<Vector2>)
    open fun SetVertices(`$vertices`: `Array$1`<Vector2>)
    open fun GetIndices(`$indices`: `List$1`<Number>)
    open fun GetIndices(): `Array$1`<Number>
    open fun SetIndices(`$indices`: `List$1`<Number>)
    open fun SetIndices(`$indices`: `Array$1`<Number>)
}

external open class BillboardRenderer : Renderer {
    override var `var`: Any
    open var billboard: Any
}

external open class CustomRenderTextureManager : csharp.System.Object {
    companion object {
        fun add_textureLoaded(`$value`: `Action$1`<CustomRenderTexture>)
        fun remove_textureLoaded(`$value`: `Action$1`<CustomRenderTexture>)
        fun add_textureUnloaded(`$value`: `Action$1`<CustomRenderTexture>)
        fun remove_textureUnloaded(`$value`: `Action$1`<CustomRenderTexture>)
        fun GetAllCustomRenderTextures(`$currentCustomRenderTextures`: `List$1`<CustomRenderTexture>)
        fun add_updateTriggered(`$value`: `Action$2`<CustomRenderTexture, Number>)
        fun remove_updateTriggered(`$value`: `Action$2`<CustomRenderTexture, Number>)
        fun add_initializeTriggered(`$value`: `Action$1`<CustomRenderTexture>)
        fun remove_initializeTriggered(`$value`: `Action$1`<CustomRenderTexture>)
    }
}

external open class CustomRenderTexture : RenderTexture {
    constructor(`$width`: Number, `$height`: Number, `$format`: RenderTextureFormat, `$readWrite`: RenderTextureReadWrite)
    constructor(`$width`: Number, `$height`: Number, `$format`: RenderTextureFormat)
    constructor(`$width`: Number, `$height`: Number)
    constructor(`$width`: Number, `$height`: Number, `$defaultFormat`: DefaultFormat)
    constructor(`$width`: Number, `$height`: Number, `$format`: GraphicsFormat)
    constructor(`$desc`: RenderTextureDescriptor)
    constructor(`$textureToCopy`: RenderTexture)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: DefaultFormat)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: GraphicsFormat)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: GraphicsFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: GraphicsFormat, `$depthStencilFormat`: GraphicsFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: GraphicsFormat, `$depthStencilFormat`: GraphicsFormat)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: RenderTextureFormat, `$readWrite`: RenderTextureReadWrite)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: RenderTextureFormat)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: RenderTextureFormat, `$mipCount`: Number)
    constructor()
    override var `var`: Any
    open var material: Any
    open var initializationMaterial: Any
    open var initializationTexture: Any
    open var initializationSource: Any
    open var initializationColor: Any
    open var updateMode: Any
    open var initializationMode: Any
    open var updateZoneSpace: Any
    open var shaderPass: Any
    open var cubemapFaceMask: Any
    open var doubleBuffered: Any
    open var wrapUpdateZones: Any
    open var updatePeriod: Any
    open fun Update(`$count`: Number)
    open fun Update()
    open fun Initialize()
    open fun ClearUpdateZones()
    open fun GetUpdateZones(`$updateZones`: `List$1`<CustomRenderTextureUpdateZone>)
    open fun GetDoubleBufferRenderTexture(): RenderTexture
    open fun EnsureDoubleBufferConsistency()
    open fun SetUpdateZones(`$updateZones`: `Array$1`<CustomRenderTextureUpdateZone>)
}

external open class Display : csharp.System.Object {
    open var `var`: Any
    open val renderingWidth: Any
    open val renderingHeight: Any
    open val systemWidth: Any
    open val systemHeight: Any
    open val colorBuffer: Any
    open val depthBuffer: Any
    open val active: Any
    open val requiresBlitToBackbuffer: Any
    open val requiresSrgbBlitToBackbuffer: Any
    open fun Activate()
    open fun Activate(`$width`: Number, `$height`: Number, `$refreshRate`: Number)
    open fun SetParams(`$width`: Number, `$height`: Number, `$x`: Number, `$y`: Number)
    open fun SetRenderingResolution(`$w`: Number, `$h`: Number)
    interface DisplaysUpdatedDelegate {
        @nativeInvoke
        operator fun invoke()
        var Invoke: (() -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        var displays: `Array$1`<Display>
        fun RelativeMouseAt(`$inputMouseCoordinates`: Vector3): Vector3
        fun add_onDisplaysUpdated(`$value`: DisplaysUpdatedDelegate)
        fun remove_onDisplaysUpdated(`$value`: DisplaysUpdatedDelegate)
    }
}

external enum class FullScreenMode {
    ExclusiveFullScreen /* = 0 */,
    FullScreenWindow /* = 1 */,
    MaximizedWindow /* = 2 */,
    Windowed /* = 3 */
}

external open class RefreshRate : ValueType, `IEquatable$1`<RefreshRate> {
    open var numerator: Number
    open var denominator: Number
    open var `var`: Any
    open val value: Any
    open fun Equals(`$other`: RefreshRate): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class DisplayInfo : ValueType, `IEquatable$1`<DisplayInfo> {
    open var width: Number
    open var height: Number
    open var refreshRate: RefreshRate
    open var workArea: RectInt
    open var name: String
    open fun Equals(`$other`: DisplayInfo): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class SleepTimeout : csharp.System.Object {
    companion object {
        var NeverSleep: Number
        var SystemSetting: Number
    }
}

external open class Screen : csharp.System.Object {
    companion object {
        fun SetResolution(`$width`: Number, `$height`: Number, `$fullscreenMode`: FullScreenMode, `$preferredRefreshRate`: Number)
        fun SetResolution(`$width`: Number, `$height`: Number, `$fullscreenMode`: FullScreenMode)
        fun SetResolution(`$width`: Number, `$height`: Number, `$fullscreen`: Boolean, `$preferredRefreshRate`: Number)
        fun SetResolution(`$width`: Number, `$height`: Number, `$fullscreen`: Boolean)
        fun GetDisplayLayout(`$displayLayout`: `List$1`<DisplayInfo>)
        fun MoveMainWindowTo(`$display`: `$Ref`<DisplayInfo>, `$position`: Vector2Int): AsyncOperation
    }
}

external enum class ScreenOrientation {
    Unknown /* = 0 */,
    Landscape /* = 3 */,
    Portrait /* = 1 */,
    PortraitUpsideDown /* = 2 */,
    LandscapeLeft /* = 3 */,
    LandscapeRight /* = 4 */,
    AutoRotation /* = 5 */
}

external enum class ComputeBufferMode {
    Immutable /* = 0 */,
    Dynamic /* = 1 */,
    Circular /* = 2 */,
    StreamOut /* = 3 */,
    SubUpdates /* = 4 */
}

external open class Graphics : csharp.System.Object {
    companion object {
        fun ClearRandomWriteTargets()
        fun ExecuteCommandBuffer(`$buffer`: CommandBuffer)
        fun ExecuteCommandBufferAsync(`$buffer`: CommandBuffer, `$queueType`: ComputeQueueType)
        fun SetRenderTarget(`$rt`: RenderTexture, `$mipLevel`: Number, `$face`: CubemapFace, `$depthSlice`: Number)
        fun SetRenderTarget(`$colorBuffer`: RenderBuffer, `$depthBuffer`: RenderBuffer, `$mipLevel`: Number, `$face`: CubemapFace, `$depthSlice`: Number)
        fun SetRenderTarget(`$colorBuffers`: `Array$1`<RenderBuffer>, `$depthBuffer`: RenderBuffer)
        fun SetRenderTarget(`$setup`: RenderTargetSetup)
        fun SetRandomWriteTarget(`$index`: Number, `$uav`: RenderTexture)
        fun SetRandomWriteTarget(`$index`: Number, `$uav`: ComputeBuffer, `$preserveCounterValue`: Boolean)
        fun SetRandomWriteTarget(`$index`: Number, `$uav`: GraphicsBuffer, `$preserveCounterValue`: Boolean)
        fun CopyTexture(`$src`: Texture, `$dst`: Texture)
        fun CopyTexture(`$src`: Texture, `$srcElement`: Number, `$dst`: Texture, `$dstElement`: Number)
        fun CopyTexture(`$src`: Texture, `$srcElement`: Number, `$srcMip`: Number, `$dst`: Texture, `$dstElement`: Number, `$dstMip`: Number)
        fun CopyTexture(`$src`: Texture, `$srcElement`: Number, `$srcMip`: Number, `$srcX`: Number, `$srcY`: Number, `$srcWidth`: Number, `$srcHeight`: Number, `$dst`: Texture, `$dstElement`: Number, `$dstMip`: Number, `$dstX`: Number, `$dstY`: Number)
        fun ConvertTexture(`$src`: Texture, `$dst`: Texture): Boolean
        fun ConvertTexture(`$src`: Texture, `$srcElement`: Number, `$dst`: Texture, `$dstElement`: Number): Boolean
        fun CreateAsyncGraphicsFence(`$stage`: SynchronisationStage): GraphicsFence
        fun CreateAsyncGraphicsFence(): GraphicsFence
        fun CreateGraphicsFence(`$fenceType`: GraphicsFenceType, `$stage`: SynchronisationStageFlags): GraphicsFence
        fun WaitOnAsyncGraphicsFence(`$fence`: GraphicsFence)
        fun WaitOnAsyncGraphicsFence(`$fence`: GraphicsFence, `$stage`: SynchronisationStage)
        fun CopyBuffer(`$source`: GraphicsBuffer, `$dest`: GraphicsBuffer)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$sourceRect`: Rect, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number, `$color`: Color, `$mat`: Material, `$pass`: Number)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$sourceRect`: Rect, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number, `$mat`: Material, `$pass`: Number)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number, `$mat`: Material, `$pass`: Number)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$mat`: Material, `$pass`: Number)
        fun RenderMesh(`$rparams`: `$Ref`<RenderParams>, `$mesh`: Mesh, `$submeshIndex`: Number, `$objectToWorld`: Matrix4x4, `$prevObjectToWorld`: `Nullable$1`<Matrix4x4> = definedExternally)
        fun RenderMeshIndirect(`$rparams`: `$Ref`<RenderParams>, `$mesh`: Mesh, `$commandBuffer`: GraphicsBuffer, `$commandCount`: Number = definedExternally, `$startCommand`: Number = definedExternally)
        fun RenderMeshPrimitives(`$rparams`: `$Ref`<RenderParams>, `$mesh`: Mesh, `$submeshIndex`: Number, `$instanceCount`: Number = definedExternally)
        fun RenderPrimitives(`$rparams`: `$Ref`<RenderParams>, `$topology`: MeshTopology, `$vertexCount`: Number, `$instanceCount`: Number = definedExternally)
        fun RenderPrimitivesIndexed(`$rparams`: `$Ref`<RenderParams>, `$topology`: MeshTopology, `$indexBuffer`: GraphicsBuffer, `$indexCount`: Number, `$startIndex`: Number = definedExternally, `$instanceCount`: Number = definedExternally)
        fun RenderPrimitivesIndirect(`$rparams`: `$Ref`<RenderParams>, `$topology`: MeshTopology, `$commandBuffer`: GraphicsBuffer, `$commandCount`: Number = definedExternally, `$startCommand`: Number = definedExternally)
        fun RenderPrimitivesIndexedIndirect(`$rparams`: `$Ref`<RenderParams>, `$topology`: MeshTopology, `$indexBuffer`: GraphicsBuffer, `$commandBuffer`: GraphicsBuffer, `$commandCount`: Number = definedExternally, `$startCommand`: Number = definedExternally)
        fun DrawMeshNow(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$materialIndex`: Number)
        fun DrawMeshNow(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$materialIndex`: Number)
        fun DrawMeshNow(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion)
        fun DrawMeshNow(`$mesh`: Mesh, `$matrix`: Matrix4x4)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: Boolean, `$receiveShadows`: Boolean, `$useLightProbes`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$probeAnchor`: Transform, `$useLightProbes`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: Boolean, `$receiveShadows`: Boolean, `$useLightProbes`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$probeAnchor`: Transform, `$lightProbeUsage`: LightProbeUsage, `$lightProbeProxyVolume`: LightProbeProxyVolume)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>, `$count`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number, `$camera`: Camera, `$lightProbeUsage`: LightProbeUsage, `$lightProbeProxyVolume`: LightProbeProxyVolume)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `List$1`<Matrix4x4>, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number, `$camera`: Camera, `$lightProbeUsage`: LightProbeUsage, `$lightProbeProxyVolume`: LightProbeProxyVolume)
        fun DrawMeshInstancedProcedural(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$bounds`: Bounds, `$count`: Number, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally, `$camera`: Camera = definedExternally, `$lightProbeUsage`: LightProbeUsage = definedExternally, `$lightProbeProxyVolume`: LightProbeProxyVolume = definedExternally)
        fun DrawMeshInstancedIndirect(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$bounds`: Bounds, `$bufferWithArgs`: ComputeBuffer, `$argsOffset`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number, `$camera`: Camera, `$lightProbeUsage`: LightProbeUsage, `$lightProbeProxyVolume`: LightProbeProxyVolume)
        fun DrawMeshInstancedIndirect(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$bounds`: Bounds, `$bufferWithArgs`: GraphicsBuffer, `$argsOffset`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number, `$camera`: Camera, `$lightProbeUsage`: LightProbeUsage, `$lightProbeProxyVolume`: LightProbeProxyVolume)
        fun DrawProceduralNow(`$topology`: MeshTopology, `$vertexCount`: Number, `$instanceCount`: Number = definedExternally)
        fun DrawProceduralNow(`$topology`: MeshTopology, `$indexBuffer`: GraphicsBuffer, `$indexCount`: Number, `$instanceCount`: Number = definedExternally)
        fun DrawProceduralIndirectNow(`$topology`: MeshTopology, `$bufferWithArgs`: ComputeBuffer, `$argsOffset`: Number = definedExternally)
        fun DrawProceduralIndirectNow(`$topology`: MeshTopology, `$indexBuffer`: GraphicsBuffer, `$bufferWithArgs`: ComputeBuffer, `$argsOffset`: Number = definedExternally)
        fun DrawProceduralIndirectNow(`$topology`: MeshTopology, `$bufferWithArgs`: GraphicsBuffer, `$argsOffset`: Number = definedExternally)
        fun DrawProceduralIndirectNow(`$topology`: MeshTopology, `$indexBuffer`: GraphicsBuffer, `$bufferWithArgs`: GraphicsBuffer, `$argsOffset`: Number = definedExternally)
        fun DrawProcedural(`$material`: Material, `$bounds`: Bounds, `$topology`: MeshTopology, `$vertexCount`: Number, `$instanceCount`: Number = definedExternally, `$camera`: Camera = definedExternally, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally)
        fun DrawProcedural(`$material`: Material, `$bounds`: Bounds, `$topology`: MeshTopology, `$indexBuffer`: GraphicsBuffer, `$indexCount`: Number, `$instanceCount`: Number = definedExternally, `$camera`: Camera = definedExternally, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally)
        fun DrawProceduralIndirect(`$material`: Material, `$bounds`: Bounds, `$topology`: MeshTopology, `$bufferWithArgs`: ComputeBuffer, `$argsOffset`: Number = definedExternally, `$camera`: Camera = definedExternally, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally)
        fun DrawProceduralIndirect(`$material`: Material, `$bounds`: Bounds, `$topology`: MeshTopology, `$bufferWithArgs`: GraphicsBuffer, `$argsOffset`: Number = definedExternally, `$camera`: Camera = definedExternally, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally)
        fun DrawProceduralIndirect(`$material`: Material, `$bounds`: Bounds, `$topology`: MeshTopology, `$indexBuffer`: GraphicsBuffer, `$bufferWithArgs`: ComputeBuffer, `$argsOffset`: Number = definedExternally, `$camera`: Camera = definedExternally, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally)
        fun DrawProceduralIndirect(`$material`: Material, `$bounds`: Bounds, `$topology`: MeshTopology, `$indexBuffer`: GraphicsBuffer, `$bufferWithArgs`: GraphicsBuffer, `$argsOffset`: Number = definedExternally, `$camera`: Camera = definedExternally, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally)
        fun Blit(`$source`: Texture, `$dest`: RenderTexture)
        fun Blit(`$source`: Texture, `$dest`: RenderTexture, `$sourceDepthSlice`: Number, `$destDepthSlice`: Number)
        fun Blit(`$source`: Texture, `$dest`: RenderTexture, `$scale`: Vector2, `$offset`: Vector2)
        fun Blit(`$source`: Texture, `$dest`: RenderTexture, `$scale`: Vector2, `$offset`: Vector2, `$sourceDepthSlice`: Number, `$destDepthSlice`: Number)
        fun Blit(`$source`: Texture, `$dest`: RenderTexture, `$mat`: Material, `$pass`: Number)
        fun Blit(`$source`: Texture, `$dest`: RenderTexture, `$mat`: Material, `$pass`: Number, `$destDepthSlice`: Number)
        fun Blit(`$source`: Texture, `$dest`: RenderTexture, `$mat`: Material)
        fun Blit(`$source`: Texture, `$mat`: Material, `$pass`: Number)
        fun Blit(`$source`: Texture, `$mat`: Material, `$pass`: Number, `$destDepthSlice`: Number)
        fun Blit(`$source`: Texture, `$mat`: Material)
        fun BlitMultiTap(`$source`: Texture, `$dest`: RenderTexture, `$mat`: Material, vararg offsets: Vector2)
        fun BlitMultiTap(`$source`: Texture, `$dest`: RenderTexture, `$mat`: Material, `$destDepthSlice`: Number, vararg offsets: Vector2)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: Boolean, `$receiveShadows`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$position`: Vector3, `$rotation`: Quaternion, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$probeAnchor`: Transform)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: Boolean, `$receiveShadows`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$probeAnchor`: Transform)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$probeAnchor`: Transform, `$useLightProbes`: Boolean)
        fun DrawMesh(`$mesh`: Mesh, `$matrix`: Matrix4x4, `$material`: Material, `$layer`: Number, `$camera`: Camera, `$submeshIndex`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$probeAnchor`: Transform, `$lightProbeUsage`: LightProbeUsage)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>, `$count`: Number)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>, `$count`: Number, `$properties`: MaterialPropertyBlock)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>, `$count`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>, `$count`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>, `$count`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>, `$count`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number, `$camera`: Camera)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `Array$1`<Matrix4x4>, `$count`: Number, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number, `$camera`: Camera, `$lightProbeUsage`: LightProbeUsage)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `List$1`<Matrix4x4>)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `List$1`<Matrix4x4>, `$properties`: MaterialPropertyBlock)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `List$1`<Matrix4x4>, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `List$1`<Matrix4x4>, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `List$1`<Matrix4x4>, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `List$1`<Matrix4x4>, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number, `$camera`: Camera)
        fun DrawMeshInstanced(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$matrices`: `List$1`<Matrix4x4>, `$properties`: MaterialPropertyBlock, `$castShadows`: ShadowCastingMode, `$receiveShadows`: Boolean, `$layer`: Number, `$camera`: Camera, `$lightProbeUsage`: LightProbeUsage)
        fun DrawMeshInstancedIndirect(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$bounds`: Bounds, `$bufferWithArgs`: ComputeBuffer, `$argsOffset`: Number = definedExternally, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally, `$camera`: Camera = definedExternally, `$lightProbeUsage`: LightProbeUsage = definedExternally)
        fun DrawMeshInstancedIndirect(`$mesh`: Mesh, `$submeshIndex`: Number, `$material`: Material, `$bounds`: Bounds, `$bufferWithArgs`: GraphicsBuffer, `$argsOffset`: Number = definedExternally, `$properties`: MaterialPropertyBlock = definedExternally, `$castShadows`: ShadowCastingMode = definedExternally, `$receiveShadows`: Boolean = definedExternally, `$layer`: Number = definedExternally, `$camera`: Camera = definedExternally, `$lightProbeUsage`: LightProbeUsage = definedExternally)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$sourceRect`: Rect, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number, `$color`: Color, `$mat`: Material)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$sourceRect`: Rect, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number, `$color`: Color)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$sourceRect`: Rect, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number, `$mat`: Material)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$sourceRect`: Rect, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number, `$mat`: Material)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$leftBorder`: Number, `$rightBorder`: Number, `$topBorder`: Number, `$bottomBorder`: Number)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture, `$mat`: Material)
        fun DrawTexture(`$screenRect`: Rect, `$texture`: Texture)
        fun SetRenderTarget(`$rt`: RenderTexture)
        fun SetRenderTarget(`$rt`: RenderTexture, `$mipLevel`: Number)
        fun SetRenderTarget(`$rt`: RenderTexture, `$mipLevel`: Number, `$face`: CubemapFace)
        fun SetRenderTarget(`$colorBuffer`: RenderBuffer, `$depthBuffer`: RenderBuffer)
        fun SetRenderTarget(`$colorBuffer`: RenderBuffer, `$depthBuffer`: RenderBuffer, `$mipLevel`: Number)
        fun SetRenderTarget(`$colorBuffer`: RenderBuffer, `$depthBuffer`: RenderBuffer, `$mipLevel`: Number, `$face`: CubemapFace)
        fun SetRandomWriteTarget(`$index`: Number, `$uav`: ComputeBuffer)
        fun SetRandomWriteTarget(`$index`: Number, `$uav`: GraphicsBuffer)
    }
}

external enum class ColorGamut {
    sRGB /* = 0 */,
    Rec709 /* = 1 */,
    Rec2020 /* = 2 */,
    DisplayP3 /* = 3 */,
    HDR10 /* = 4 */,
    DolbyHDR /* = 5 */
}

external enum class CubemapFace {
    Unknown /* = -1 */,
    PositiveX /* = 0 */,
    NegativeX /* = 1 */,
    PositiveY /* = 2 */,
    NegativeY /* = 3 */,
    PositiveZ /* = 4 */,
    NegativeZ /* = 5 */
}

external open class RenderTargetSetup : ValueType {
    constructor(`$color`: `Array$1`<RenderBuffer>, `$depth`: RenderBuffer, `$mip`: Number, `$face`: CubemapFace, `$colorLoad`: `Array$1`<RenderBufferLoadAction>, `$colorStore`: `Array$1`<RenderBufferStoreAction>, `$depthLoad`: RenderBufferLoadAction, `$depthStore`: RenderBufferStoreAction)
    constructor(`$color`: RenderBuffer, `$depth`: RenderBuffer)
    constructor(`$color`: RenderBuffer, `$depth`: RenderBuffer, `$mipLevel`: Number)
    constructor(`$color`: RenderBuffer, `$depth`: RenderBuffer, `$mipLevel`: Number, `$face`: CubemapFace)
    constructor(`$color`: RenderBuffer, `$depth`: RenderBuffer, `$mipLevel`: Number, `$face`: CubemapFace, `$depthSlice`: Number)
    constructor(`$color`: `Array$1`<RenderBuffer>, `$depth`: RenderBuffer)
    constructor(`$color`: `Array$1`<RenderBuffer>, `$depth`: RenderBuffer, `$mipLevel`: Number)
    constructor(`$color`: `Array$1`<RenderBuffer>, `$depth`: RenderBuffer, `$mip`: Number, `$face`: CubemapFace)
    constructor()
    open var color: `Array$1`<RenderBuffer>
    open var depth: RenderBuffer
    open var mipLevel: Number
    open var cubemapFace: CubemapFace
    open var depthSlice: Number
    open var colorLoad: `Array$1`<RenderBufferLoadAction>
    open var colorStore: `Array$1`<RenderBufferStoreAction>
    open var depthLoad: RenderBufferLoadAction
    open var depthStore: RenderBufferStoreAction
}

external open class ComputeBuffer : csharp.System.Object, IDisposable {
    constructor(`$count`: Number, `$stride`: Number)
    constructor(`$count`: Number, `$stride`: Number, `$type`: ComputeBufferType)
    constructor(`$count`: Number, `$stride`: Number, `$type`: ComputeBufferType, `$usage`: ComputeBufferMode)
    constructor()
    open var `var`: Any
    open val count: Any
    open var stride: Any
    open fun Dispose()
    open fun Release()
    open fun IsValid(): Boolean
    open fun SetData(`$data`: Array)
    open fun SetData(`$data`: Array, `$managedBufferStartIndex`: Number, `$computeBufferStartIndex`: Number, `$count`: Number)
    open fun GetData(`$data`: Array)
    open fun GetData(`$data`: Array, `$managedBufferStartIndex`: Number, `$computeBufferStartIndex`: Number, `$count`: Number)
    open fun SetCounterValue(`$counterValue`: Number)
    open fun GetNativeBufferPtr(): IntPtr

    companion object {
        fun CopyCount(`$src`: ComputeBuffer, `$dst`: ComputeBuffer, `$dstOffsetBytes`: Number)
    }
}

external open class GraphicsBuffer : csharp.System.Object, IDisposable {
    constructor(`$target`: Target, `$count`: Number, `$stride`: Number)
    constructor()
    open var `var`: Any
    open val count: Any
    open val stride: Any
    open var target: Any
    open fun Dispose()
    open fun Release()
    open fun IsValid(): Boolean
    open fun SetData(`$data`: Array)
    open fun SetData(`$data`: Array, `$managedBufferStartIndex`: Number, `$graphicsBufferStartIndex`: Number, `$count`: Number)
    open fun GetData(`$data`: Array)
    open fun GetData(`$data`: Array, `$managedBufferStartIndex`: Number, `$computeBufferStartIndex`: Number, `$count`: Number)
    open fun GetNativeBufferPtr(): IntPtr
    open fun SetCounterValue(`$counterValue`: Number)
    open class IndirectDrawArgs : ValueType {
        open var `var`: Any
        open var vertexCountPerInstance: Any
        open var instanceCount: Any
        open var startVertex: Any
        open var startInstance: Any

        companion object {
            var size: Number
        }
    }
    open class IndirectDrawIndexedArgs : ValueType {
        open var `var`: Any
        open var indexCountPerInstance: Any
        open var instanceCount: Any
        open var startIndex: Any
        open var baseVertexIndex: Any
        open var startInstance: Any

        companion object {
            var size: Number
        }
    }

    companion object {
        fun CopyCount(`$src`: ComputeBuffer, `$dst`: ComputeBuffer, `$dstOffsetBytes`: Number)
        fun CopyCount(`$src`: GraphicsBuffer, `$dst`: ComputeBuffer, `$dstOffsetBytes`: Number)
        fun CopyCount(`$src`: ComputeBuffer, `$dst`: GraphicsBuffer, `$dstOffsetBytes`: Number)
        fun CopyCount(`$src`: GraphicsBuffer, `$dst`: GraphicsBuffer, `$dstOffsetBytes`: Number)
    }
}

external open class RenderParams : ValueType {
    constructor(`$mat`: Material)
    constructor()
    open var `var`: Any
    open var layer: Any
    open var renderingLayerMask: Any
    open var rendererPriority: Any
    open var worldBounds: Any
    open var camera: Any
    open var motionVectorMode: Any
    open var reflectionProbeUsage: Any
    open var material: Any
    open var matProps: Any
    open var shadowCastingMode: Any
    open var receiveShadows: Any
    open var lightProbeUsage: Any
    open var lightProbeProxyVolume: Any
}

external enum class MeshTopology {
    Triangles /* = 0 */,
    Quads /* = 2 */,
    Lines /* = 3 */,
    LineStrip /* = 4 */,
    Points /* = 5 */
}

external open class MaterialPropertyBlock : csharp.System.Object {
    open var `var`: Any
    open val isEmpty: Any
    open fun Clear()
    open fun SetInt(`$name`: String, `$value`: Number)
    open fun SetInt(`$nameID`: Number, `$value`: Number)
    open fun SetFloat(`$name`: String, `$value`: Number)
    open fun SetFloat(`$nameID`: Number, `$value`: Number)
    open fun SetInteger(`$name`: String, `$value`: Number)
    open fun SetInteger(`$nameID`: Number, `$value`: Number)
    open fun SetVector(`$name`: String, `$value`: Vector4)
    open fun SetVector(`$nameID`: Number, `$value`: Vector4)
    open fun SetColor(`$name`: String, `$value`: Color)
    open fun SetColor(`$nameID`: Number, `$value`: Color)
    open fun SetMatrix(`$name`: String, `$value`: Matrix4x4)
    open fun SetMatrix(`$nameID`: Number, `$value`: Matrix4x4)
    open fun SetBuffer(`$name`: String, `$value`: ComputeBuffer)
    open fun SetBuffer(`$nameID`: Number, `$value`: ComputeBuffer)
    open fun SetBuffer(`$name`: String, `$value`: GraphicsBuffer)
    open fun SetBuffer(`$nameID`: Number, `$value`: GraphicsBuffer)
    open fun SetTexture(`$name`: String, `$value`: Texture)
    open fun SetTexture(`$nameID`: Number, `$value`: Texture)
    open fun SetTexture(`$name`: String, `$value`: RenderTexture, `$element`: RenderTextureSubElement)
    open fun SetTexture(`$nameID`: Number, `$value`: RenderTexture, `$element`: RenderTextureSubElement)
    open fun SetConstantBuffer(`$name`: String, `$value`: ComputeBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$nameID`: Number, `$value`: ComputeBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$name`: String, `$value`: GraphicsBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$nameID`: Number, `$value`: GraphicsBuffer, `$offset`: Number, `$size`: Number)
    open fun SetFloatArray(`$name`: String, `$values`: `List$1`<Number>)
    open fun SetFloatArray(`$nameID`: Number, `$values`: `List$1`<Number>)
    open fun SetFloatArray(`$name`: String, `$values`: `Array$1`<Number>)
    open fun SetFloatArray(`$nameID`: Number, `$values`: `Array$1`<Number>)
    open fun SetVectorArray(`$name`: String, `$values`: `List$1`<Vector4>)
    open fun SetVectorArray(`$nameID`: Number, `$values`: `List$1`<Vector4>)
    open fun SetVectorArray(`$name`: String, `$values`: `Array$1`<Vector4>)
    open fun SetVectorArray(`$nameID`: Number, `$values`: `Array$1`<Vector4>)
    open fun SetMatrixArray(`$name`: String, `$values`: `List$1`<Matrix4x4>)
    open fun SetMatrixArray(`$nameID`: Number, `$values`: `List$1`<Matrix4x4>)
    open fun SetMatrixArray(`$name`: String, `$values`: `Array$1`<Matrix4x4>)
    open fun SetMatrixArray(`$nameID`: Number, `$values`: `Array$1`<Matrix4x4>)
    open fun HasProperty(`$name`: String): Boolean
    open fun HasProperty(`$nameID`: Number): Boolean
    open fun HasInt(`$name`: String): Boolean
    open fun HasInt(`$nameID`: Number): Boolean
    open fun HasFloat(`$name`: String): Boolean
    open fun HasFloat(`$nameID`: Number): Boolean
    open fun HasInteger(`$name`: String): Boolean
    open fun HasInteger(`$nameID`: Number): Boolean
    open fun HasTexture(`$name`: String): Boolean
    open fun HasTexture(`$nameID`: Number): Boolean
    open fun HasMatrix(`$name`: String): Boolean
    open fun HasMatrix(`$nameID`: Number): Boolean
    open fun HasVector(`$name`: String): Boolean
    open fun HasVector(`$nameID`: Number): Boolean
    open fun HasColor(`$name`: String): Boolean
    open fun HasColor(`$nameID`: Number): Boolean
    open fun HasBuffer(`$name`: String): Boolean
    open fun HasBuffer(`$nameID`: Number): Boolean
    open fun HasConstantBuffer(`$name`: String): Boolean
    open fun HasConstantBuffer(`$nameID`: Number): Boolean
    open fun GetFloat(`$name`: String): Number
    open fun GetFloat(`$nameID`: Number): Number
    open fun GetInt(`$name`: String): Number
    open fun GetInt(`$nameID`: Number): Number
    open fun GetInteger(`$name`: String): Number
    open fun GetInteger(`$nameID`: Number): Number
    open fun GetVector(`$name`: String): Vector4
    open fun GetVector(`$nameID`: Number): Vector4
    open fun GetColor(`$name`: String): Color
    open fun GetColor(`$nameID`: Number): Color
    open fun GetMatrix(`$name`: String): Matrix4x4
    open fun GetMatrix(`$nameID`: Number): Matrix4x4
    open fun GetTexture(`$name`: String): Texture
    open fun GetTexture(`$nameID`: Number): Texture
    open fun GetFloatArray(`$name`: String): `Array$1`<Number>
    open fun GetFloatArray(`$nameID`: Number): `Array$1`<Number>
    open fun GetVectorArray(`$name`: String): `Array$1`<Vector4>
    open fun GetVectorArray(`$nameID`: Number): `Array$1`<Vector4>
    open fun GetMatrixArray(`$name`: String): `Array$1`<Matrix4x4>
    open fun GetMatrixArray(`$nameID`: Number): `Array$1`<Matrix4x4>
    open fun GetFloatArray(`$name`: String, `$values`: `List$1`<Number>)
    open fun GetFloatArray(`$nameID`: Number, `$values`: `List$1`<Number>)
    open fun GetVectorArray(`$name`: String, `$values`: `List$1`<Vector4>)
    open fun GetVectorArray(`$nameID`: Number, `$values`: `List$1`<Vector4>)
    open fun GetMatrixArray(`$name`: String, `$values`: `List$1`<Matrix4x4>)
    open fun GetMatrixArray(`$nameID`: Number, `$values`: `List$1`<Matrix4x4>)
    open fun CopySHCoefficientArraysFrom(`$lightProbes`: `List$1`<SphericalHarmonicsL2>)
    open fun CopySHCoefficientArraysFrom(`$lightProbes`: `Array$1`<SphericalHarmonicsL2>)
    open fun CopySHCoefficientArraysFrom(`$lightProbes`: `List$1`<SphericalHarmonicsL2>, `$sourceStart`: Number, `$destStart`: Number, `$count`: Number)
    open fun CopySHCoefficientArraysFrom(`$lightProbes`: `Array$1`<SphericalHarmonicsL2>, `$sourceStart`: Number, `$destStart`: Number, `$count`: Number)
    open fun CopyProbeOcclusionArrayFrom(`$occlusionProbes`: `List$1`<Vector4>)
    open fun CopyProbeOcclusionArrayFrom(`$occlusionProbes`: `Array$1`<Vector4>)
    open fun CopyProbeOcclusionArrayFrom(`$occlusionProbes`: `List$1`<Vector4>, `$sourceStart`: Number, `$destStart`: Number, `$count`: Number)
    open fun CopyProbeOcclusionArrayFrom(`$occlusionProbes`: `Array$1`<Vector4>, `$sourceStart`: Number, `$destStart`: Number, `$count`: Number)
}

external open class LightProbeProxyVolume : Behaviour {
    override var `var`: Any
    open val boundsGlobal: Any
    open var probeDensity: Any
    open var gridResolutionX: Any
    open var gridResolutionY: Any
    open var gridResolutionZ: Any
    open var boundingBoxMode: Any
    open var resolutionMode: Any
    open var probePositionMode: Any
    open var refreshMode: Any
    open var qualityMode: Any
    open var dataFormat: Any
    open fun Update()
}

external open class GL : csharp.System.Object {
    companion object {
        var TRIANGLES: Number
        var TRIANGLE_STRIP: Number
        var QUADS: Number
        var LINES: Number
        var LINE_STRIP: Number
        fun Vertex3(`$x`: Number, `$y`: Number, `$z`: Number)
        fun Vertex(`$v`: Vector3)
        fun TexCoord3(`$x`: Number, `$y`: Number, `$z`: Number)
        fun TexCoord(`$v`: Vector3)
        fun TexCoord2(`$x`: Number, `$y`: Number)
        fun MultiTexCoord3(`$unit`: Number, `$x`: Number, `$y`: Number, `$z`: Number)
        fun MultiTexCoord(`$unit`: Number, `$v`: Vector3)
        fun MultiTexCoord2(`$unit`: Number, `$x`: Number, `$y`: Number)
        fun Color(`$c`: Color)
        fun Flush()
        fun RenderTargetBarrier()
        fun MultMatrix(`$m`: Matrix4x4)
        fun PushMatrix()
        fun PopMatrix()
        fun LoadIdentity()
        fun LoadOrtho()
        fun LoadPixelMatrix()
        fun LoadProjectionMatrix(`$mat`: Matrix4x4)
        fun InvalidateState()
        fun GetGPUProjectionMatrix(`$proj`: Matrix4x4, `$renderIntoTexture`: Boolean): Matrix4x4
        fun LoadPixelMatrix(`$left`: Number, `$right`: Number, `$bottom`: Number, `$top`: Number)
        fun IssuePluginEvent(`$callback`: IntPtr, `$eventID`: Number)
        fun Begin(`$mode`: Number)
        fun End()
        fun Clear(`$clearDepth`: Boolean, `$clearColor`: Boolean, `$backgroundColor`: Color, `$depth`: Number)
        fun Clear(`$clearDepth`: Boolean, `$clearColor`: Boolean, `$backgroundColor`: Color)
        fun Viewport(`$pixelRect`: Rect)
        fun ClearWithSkybox(`$clearDepth`: Boolean, `$camera`: Camera)
    }
}

external open class ScalableBufferManager : csharp.System.Object {
    companion object {
        fun ResizeBuffers(`$widthScale`: Number, `$heightScale`: Number)
    }
}

external open class FrameTiming : ValueType {
    open var cpuTimePresentCalled: Any
    open var cpuFrameTime: Number
    open var cpuTimeFrameComplete: Any
    open var gpuFrameTime: Number
    open var heightScale: Number
    open var widthScale: Number
    open var syncInterval: Number
}

external open class FrameTimingManager : csharp.System.Object {
    companion object {
        fun CaptureFrameTimings()
        fun GetLatestTimings(`$numFrames`: Number, `$timings`: `Array$1`<FrameTiming>): Number
        fun GetVSyncsPerSecond(): Number
        fun GetGpuTimerFrequency(): Any
        fun GetCpuTimerFrequency(): Any
    }
}

external open class LightmapData : csharp.System.Object

external open class Texture2D : Texture {
    open fun EncodeToTGA(): `Array$1`<Number>
    open fun EncodeToPNG(): `Array$1`<Number>
    open fun EncodeToJPG(`$quality`: Number): `Array$1`<Number>
    open fun EncodeToJPG(): `Array$1`<Number>
    //open fun EncodeToEXR(`$flags`: EXRFlags): `Array$1`<Number>
    open fun EncodeToEXR(): `Array$1`<Number>
    open fun LoadImage(`$data`: `Array$1`<Number>, `$markNonReadable`: Boolean): Boolean
    open fun LoadImage(`$data`: `Array$1`<Number>): Boolean
    constructor(`$width`: Number, `$height`: Number, `$format`: DefaultFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$height`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$height`: Number, `$format`: GraphicsFormat, `$mipCount`: Number, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$height`: Number, `$textureFormat`: TextureFormat, `$mipCount`: Number, `$linear`: Boolean)
    constructor(`$width`: Number, `$height`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean, `$linear`: Boolean)
    constructor(`$width`: Number, `$height`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean)
    constructor(`$width`: Number, `$height`: Number)
    constructor()
    override var `var`: Any
    open val format: Any
    override val isReadable: Any
    open val vtOnly: Any
    open val streamingMipmaps: Any
    open val streamingMipmapsPriority: Any
    open var requestedMipmapLevel: Any
    open var minimumMipmapLevel: Any
    open val calculatedMipmapLevel: Any
    open val desiredMipmapLevel: Any
    open val loadingMipmapLevel: Any
    open val loadedMipmapLevel: Any
    open var alphaIsTransparency: Any
    open fun Compress(`$highQuality`: Boolean)
    open fun ClearRequestedMipmapLevel()
    open fun IsRequestedMipmapLevelLoaded(): Boolean
    open fun ClearMinimumMipmapLevel()
    open fun UpdateExternalTexture(`$nativeTex`: IntPtr)
    open fun GetRawTextureData(): `Array$1`<Number>
    open fun GetPixels(`$x`: Number, `$y`: Number, `$blockWidth`: Number, `$blockHeight`: Number, `$miplevel`: Number): `Array$1`<Color>
    open fun GetPixels(`$x`: Number, `$y`: Number, `$blockWidth`: Number, `$blockHeight`: Number): `Array$1`<Color>
    open fun GetPixels32(`$miplevel`: Number): `Array$1`<Color32>
    open fun GetPixels32(): `Array$1`<Color32>
    open fun PackTextures(`$textures`: `Array$1`<Texture2D>, `$padding`: Number, `$maximumAtlasSize`: Number, `$makeNoLongerReadable`: Boolean): `Array$1`<Rect>
    open fun PackTextures(`$textures`: `Array$1`<Texture2D>, `$padding`: Number, `$maximumAtlasSize`: Number): `Array$1`<Rect>
    open fun PackTextures(`$textures`: `Array$1`<Texture2D>, `$padding`: Number): `Array$1`<Rect>
    open fun SetPixel(`$x`: Number, `$y`: Number, `$color`: Color)
    open fun SetPixel(`$x`: Number, `$y`: Number, `$color`: Color, `$mipLevel`: Number)
    open fun SetPixels(`$x`: Number, `$y`: Number, `$blockWidth`: Number, `$blockHeight`: Number, `$colors`: `Array$1`<Color>, `$miplevel`: Number)
    open fun SetPixels(`$x`: Number, `$y`: Number, `$blockWidth`: Number, `$blockHeight`: Number, `$colors`: `Array$1`<Color>)
    open fun SetPixels(`$colors`: `Array$1`<Color>, `$miplevel`: Number)
    open fun SetPixels(`$colors`: `Array$1`<Color>)
    open fun GetPixel(`$x`: Number, `$y`: Number): Color
    open fun GetPixel(`$x`: Number, `$y`: Number, `$mipLevel`: Number): Color
    open fun GetPixelBilinear(`$u`: Number, `$v`: Number): Color
    open fun GetPixelBilinear(`$u`: Number, `$v`: Number, `$mipLevel`: Number): Color
    open fun LoadRawTextureData(`$data`: IntPtr, `$size`: Number)
    open fun LoadRawTextureData(`$data`: `Array$1`<Number>)
    open fun Apply(`$updateMipmaps`: Boolean, `$makeNoLongerReadable`: Boolean)
    open fun Apply(`$updateMipmaps`: Boolean)
    open fun Apply()
    open fun Reinitialize(`$width`: Number, `$height`: Number): Boolean
    open fun Reinitialize(`$width`: Number, `$height`: Number, `$format`: TextureFormat, `$hasMipMap`: Boolean): Boolean
    open fun Reinitialize(`$width`: Number, `$height`: Number, `$format`: GraphicsFormat, `$hasMipMap`: Boolean): Boolean
    open fun ReadPixels(`$source`: Rect, `$destX`: Number, `$destY`: Number, `$recalculateMipMaps`: Boolean)
    open fun ReadPixels(`$source`: Rect, `$destX`: Number, `$destY`: Number)
    open fun SetPixels32(`$colors`: `Array$1`<Color32>, `$miplevel`: Number)
    open fun SetPixels32(`$colors`: `Array$1`<Color32>)
    open fun SetPixels32(`$x`: Number, `$y`: Number, `$blockWidth`: Number, `$blockHeight`: Number, `$colors`: `Array$1`<Color32>, `$miplevel`: Number)
    open fun SetPixels32(`$x`: Number, `$y`: Number, `$blockWidth`: Number, `$blockHeight`: Number, `$colors`: `Array$1`<Color32>)
    open fun GetPixels(`$miplevel`: Number): `Array$1`<Color>
    open fun GetPixels(): `Array$1`<Color>

    companion object {
        fun CreateExternalTexture(`$width`: Number, `$height`: Number, `$format`: TextureFormat, `$mipChain`: Boolean, `$linear`: Boolean, `$nativeTex`: IntPtr): Texture2D
        fun GenerateAtlas(`$sizes`: `Array$1`<Vector2>, `$padding`: Number, `$atlasSize`: Number, `$results`: `List$1`<Rect>): Boolean
    }
}

external open class LightmapSettings : Object

external open class LightProbes : Object {
    override var `var`: Any
    open val count: Any
    open val cellCount: Any

    companion object {
        fun add_tetrahedralizationCompleted(`$value`: Action)
        fun remove_tetrahedralizationCompleted(`$value`: Action)
        fun add_needsRetetrahedralization(`$value`: Action)
        fun remove_needsRetetrahedralization(`$value`: Action)
        fun Tetrahedralize()
        fun TetrahedralizeAsync()
        fun GetInterpolatedProbe(`$position`: Vector3, `$renderer`: Renderer, `$probe`: `$Ref`<SphericalHarmonicsL2>)
        fun CalculateInterpolatedLightAndOcclusionProbes(`$positions`: `Array$1`<Vector3>, `$lightProbes`: `Array$1`<SphericalHarmonicsL2>, `$occlusionProbes`: `Array$1`<Vector4>)
        fun CalculateInterpolatedLightAndOcclusionProbes(`$positions`: `List$1`<Vector3>, `$lightProbes`: `List$1`<SphericalHarmonicsL2>, `$occlusionProbes`: `List$1`<Vector4>)
    }
}

external enum class LightmapsModeLegacy {
    Single /* = 0 */,
    Dual /* = 1 */,
    Directional /* = 2 */
}

external enum class ColorSpace {
    Uninitialized /* = -1 */,
    Gamma /* = 0 */,
    Linear /* = 1 */
}

external enum class D3DHDRDisplayBitDepth {
    D3DHDRDisplayBitDepth10 /* = 0 */,
    D3DHDRDisplayBitDepth16 /* = 1 */
}

external open class HDROutputSettings : csharp.System.Object {
    open var `var`: Any
    open val active: Any
    open val available: Any
    open var automaticHDRTonemapping: Any
    open val displayColorGamut: Any
    open val format: Any
    open val graphicsFormat: Any
    open var paperWhiteNits: Any
    open val maxFullFrameToneMapLuminance: Any
    open val maxToneMapLuminance: Any
    open val minToneMapLuminance: Any
    open val HDRModeChangeRequested: Any
    open fun RequestHDRModeChange(`$enabled`: Boolean)

    companion object {
        var displays: `Array$1`<HDROutputSettings>
    }
}

external enum class RenderTextureFormat {
    ARGB32 /* = 0 */,
    Depth /* = 1 */,
    ARGBHalf /* = 2 */,
    Shadowmap /* = 3 */,
    RGB565 /* = 4 */,
    ARGB4444 /* = 5 */,
    ARGB1555 /* = 6 */,
    Default /* = 7 */,
    ARGB2101010 /* = 8 */,
    DefaultHDR /* = 9 */,
    ARGB64 /* = 10 */,
    ARGBFloat /* = 11 */,
    RGFloat /* = 12 */,
    RGHalf /* = 13 */,
    RFloat /* = 14 */,
    RHalf /* = 15 */,
    R8 /* = 16 */,
    ARGBInt /* = 17 */,
    RGInt /* = 18 */,
    RInt /* = 19 */,
    BGRA32 /* = 20 */,
    RGB111110Float /* = 22 */,
    RG32 /* = 23 */,
    RGBAUShort /* = 24 */,
    RG16 /* = 25 */,
    BGRA10101010_XR /* = 26 */,
    BGR101010_XR /* = 27 */,
    R16 /* = 28 */
}

external enum class MotionVectorGenerationMode {
    Camera /* = 0 */,
    Object /* = 1 */,
    ForceNoMotion /* = 2 */
}

external open class QualitySettings : Object {
    companion object {
        fun IncreaseLevel(`$applyExpensiveChanges`: Boolean)
        fun DecreaseLevel(`$applyExpensiveChanges`: Boolean)
        fun SetQualityLevel(`$index`: Number)
        fun IncreaseLevel()
        fun DecreaseLevel()
        fun SetLODSettings(`$lodBias`: Number, `$maximumLODLevel`: Number, `$setDirty`: Boolean = definedExternally)
        fun GetRenderPipelineAssetAt(`$index`: Number): RenderPipelineAsset
        fun GetQualityLevel(): Number
        fun GetQualitySettings(): Object
        fun SetQualityLevel(`$index`: Number, `$applyExpensiveChanges`: Boolean)
    }
}

external enum class QualityLevel {
    Fastest /* = 0 */,
    Fast /* = 1 */,
    Simple /* = 2 */,
    Good /* = 3 */,
    Beautiful /* = 4 */,
    Fantastic /* = 5 */
}

external enum class ShadowQuality {
    Disable /* = 0 */,
    HardOnly /* = 1 */,
    All /* = 2 */
}

external enum class ShadowProjection {
    CloseFit /* = 0 */,
    StableFit /* = 1 */
}

external enum class ShadowResolution {
    Low /* = 0 */,
    Medium /* = 1 */,
    High /* = 2 */,
    VeryHigh /* = 3 */
}

external enum class ShadowmaskMode {
    Shadowmask /* = 0 */,
    DistanceShadowmask /* = 1 */
}

external enum class AnisotropicFiltering {
    Disable /* = 0 */,
    Enable /* = 1 */,
    ForceEnable /* = 2 */
}

external enum class BlendWeights {
    OneBone /* = 1 */,
    TwoBones /* = 2 */,
    FourBones /* = 4 */
}

external enum class SkinWeights {
    OneBone /* = 1 */,
    TwoBones /* = 2 */,
    FourBones /* = 4 */,
    Unlimited /* = 255 */
}

external open class RendererExtensions : csharp.System.Object {
    companion object {
        fun UpdateGIMaterials(`$renderer`: Renderer)
    }
}

external open class ImageEffectTransformsToLDR : Attribute, _Attribute

external open class ImageEffectAllowedInSceneView : Attribute, _Attribute

external open class ImageEffectOpaque : Attribute, _Attribute

external open class ImageEffectAfterScale : Attribute, _Attribute

external open class ImageEffectUsesCommandBuffer : Attribute, _Attribute

external open class BoneWeight1 : ValueType, `IEquatable$1`<BoneWeight1> {
    open var `var`: Any
    open var weight: Any
    open var boneIndex: Any
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: BoneWeight1): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun op_Equality(`$lhs`: BoneWeight1, `$rhs`: BoneWeight1): Boolean
        fun op_Inequality(`$lhs`: BoneWeight1, `$rhs`: BoneWeight1): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class BoneWeight : ValueType, `IEquatable$1`<BoneWeight> {
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: BoneWeight): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun op_Equality(`$lhs`: BoneWeight, `$rhs`: BoneWeight): Boolean
        fun op_Inequality(`$lhs`: BoneWeight, `$rhs`: BoneWeight): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class CombineInstance : ValueType {
    open var `var`: Any
    open var mesh: Any
    open var subMeshIndex: Any
}

external open class Projector : Behaviour {
    override var `var`: Any
    open var nearClipPlane: Any
    open var farClipPlane: Any
    open var fieldOfView: Any
    open var aspectRatio: Any
    open var orthographic: Any
    open var orthographicSize: Any
    open var ignoreLayers: Any
    open var material: Any
}

external enum class TexGenMode {
    None /* = 0 */,
    SphereMap /* = 1 */,
    Object /* = 2 */,
    EyeLinear /* = 3 */,
    CubeReflect /* = 4 */,
    CubeNormal /* = 5 */
}

external open class TrailRenderer : Renderer {
    override var `var`: Any
    open var time: Any
    open var startWidth: Any
    open var endWidth: Any
    open var widthMultiplier: Any
    open var autodestruct: Any
    open var emitting: Any
    open var numCornerVertices: Any
    open var numCapVertices: Any
    open var minVertexDistance: Any
    open var startColor: Any
    open var endColor: Any
    open val positionCount: Any
    open var shadowBias: Any
    open var generateLightingData: Any
    open var textureMode: Any
    open var alignment: Any
    open var widthCurve: Any
    open var colorGradient: Any
    open fun SetPosition(`$index`: Number, `$position`: Vector3)
    open fun GetPosition(`$index`: Number): Vector3
    open fun Clear()
    open fun BakeMesh(`$mesh`: Mesh, `$useTransform`: Boolean = definedExternally)
    open fun BakeMesh(`$mesh`: Mesh)
    open fun BakeMesh(`$mesh`: Mesh, `$camera`: Camera, `$useTransform`: Boolean = definedExternally)
    open fun BakeMesh(`$mesh`: Mesh, `$camera`: Camera)
    open fun GetPositions(`$positions`: `Array$1`<Vector3>): Number
    open fun SetPositions(`$positions`: `Array$1`<Vector3>)
    open fun AddPosition(`$position`: Vector3)
    open fun AddPositions(`$positions`: `Array$1`<Vector3>)
    open fun SetPositions(`$positions`: `NativeArray$1`<Vector3>)
    open fun SetPositions(`$positions`: `NativeSlice$1`<Vector3>)
    open fun GetPositions(`$positions`: `NativeArray$1`<Vector3>): Number
    open fun GetPositions(`$positions`: `NativeSlice$1`<Vector3>): Number
    open fun AddPositions(`$positions`: `NativeArray$1`<Vector3>)
    open fun AddPositions(`$positions`: `NativeSlice$1`<Vector3>)
}

external enum class LineTextureMode {
    Stretch /* = 0 */,
    Tile /* = 1 */,
    DistributePerSegment /* = 2 */,
    RepeatPerSegment /* = 3 */
}

external enum class LineAlignment {
    View /* = 0 */,
    Local /* = 1 */,
    TransformZ /* = 1 */
}

external open class Gradient : csharp.System.Object, `IEquatable$1`<Gradient> {
    open var `var`: Any
    open var mode: Any
    open fun Evaluate(`$time`: Number): Color
    open fun SetKeys(`$colorKeys`: `Array$1`<GradientColorKey>, `$alphaKeys`: `Array$1`<GradientAlphaKey>)
    override fun Equals(`$o`: Any): Boolean
    open fun Equals(`$other`: Gradient): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class LineRenderer : Renderer {
    override var `var`: Any
    open var startWidth: Any
    open var endWidth: Any
    open var widthMultiplier: Any
    open var numCornerVertices: Any
    open var numCapVertices: Any
    open var useWorldSpace: Any
    open var loop: Any
    open var startColor: Any
    open var endColor: Any
    open var positionCount: Any
    open var shadowBias: Any
    open var generateLightingData: Any
    open var textureMode: Any
    open var alignment: Any
    open var widthCurve: Any
    open var colorGradient: Any
    open fun SetPosition(`$index`: Number, `$position`: Vector3)
    open fun GetPosition(`$index`: Number): Vector3
    open fun Simplify(`$tolerance`: Number)
    open fun BakeMesh(`$mesh`: Mesh, `$useTransform`: Boolean = definedExternally)
    open fun BakeMesh(`$mesh`: Mesh)
    open fun BakeMesh(`$mesh`: Mesh, `$camera`: Camera, `$useTransform`: Boolean = definedExternally)
    open fun BakeMesh(`$mesh`: Mesh, `$camera`: Camera)
    open fun GetPositions(`$positions`: `Array$1`<Vector3>): Number
    open fun SetPositions(`$positions`: `Array$1`<Vector3>)
    open fun SetPositions(`$positions`: `NativeArray$1`<Vector3>)
    open fun SetPositions(`$positions`: `NativeSlice$1`<Vector3>)
    open fun GetPositions(`$positions`: `NativeArray$1`<Vector3>): Number
    open fun GetPositions(`$positions`: `NativeSlice$1`<Vector3>): Number
}

external open class RenderSettings : Object

external enum class FogMode {
    Linear /* = 1 */,
    Exponential /* = 2 */,
    ExponentialSquared /* = 3 */
}

external open class Light : Behaviour {
    override var `var`: Any
    open var type: Any
    open var shape: Any
    open var spotAngle: Any
    open var innerSpotAngle: Any
    open var color: Any
    open var colorTemperature: Any
    open var useColorTemperature: Any
    open var intensity: Any
    open var bounceIntensity: Any
    open var useBoundingSphereOverride: Any
    open var useViewFrustumForShadowCasterCull: Any
    open var shadowCustomResolution: Any
    open var shadowBias: Any
    open var shadowNormalBias: Any
    open var shadowNearPlane: Any
    open var useShadowMatrixOverride: Any
    open var range: Any
    open var flare: Any
    open var bakingOutput: Any
    open var cullingMask: Any
    open var renderingLayerMask: Any
    open var lightShadowCasterMode: Any
    open var shadowRadius: Any
    open var shadowAngle: Any
    open var shadows: Any
    open var shadowStrength: Any
    open var shadowResolution: Any
    open var cookieSize: Any
    open var cookie: Any
    open var renderMode: Any
    open var lightmapBakeType: Any
    open val commandBufferCount: Any
    open fun Reset()
    open fun SetLightDirty()
    open fun AddCommandBuffer(`$evt`: LightEvent, `$buffer`: CommandBuffer)
    open fun AddCommandBuffer(`$evt`: LightEvent, `$buffer`: CommandBuffer, `$shadowPassMask`: ShadowMapPass)
    open fun AddCommandBufferAsync(`$evt`: LightEvent, `$buffer`: CommandBuffer, `$queueType`: ComputeQueueType)
    open fun AddCommandBufferAsync(`$evt`: LightEvent, `$buffer`: CommandBuffer, `$shadowPassMask`: ShadowMapPass, `$queueType`: ComputeQueueType)
    open fun RemoveCommandBuffer(`$evt`: LightEvent, `$buffer`: CommandBuffer)
    open fun RemoveCommandBuffers(`$evt`: LightEvent)
    open fun RemoveAllCommandBuffers()
    open fun GetCommandBuffers(`$evt`: LightEvent): `Array$1`<CommandBuffer>

    companion object {
        fun GetLights(`$type`: LightType, `$layer`: Number): `Array$1`<Light>
    }
}

external enum class MaterialGlobalIlluminationFlags {
    None /* = 0 */,
    RealtimeEmissive /* = 1 */,
    BakedEmissive /* = 2 */,
    EmissiveIsBlack /* = 4 */,
    AnyEmissive /* = 3 */
}

external open class OcclusionPortal : Component {
    override var `var`: Any
    open var open: Any
}

external open class OcclusionArea : Component

external open class Flare : Object

external open class LensFlare : Behaviour {
    override var `var`: Any
    open var brightness: Any
    open var fadeSpeed: Any
    open var color: Any
    open var flare: Any
}

external open class LightBakingOutput : ValueType {
    open var probeOcclusionLightIndex: Number
    open var occlusionMaskChannel: Number
    open var lightmapBakeType: LightmapBakeType
    open var mixedLightingMode: MixedLightingMode
    open var isBaked: Boolean
}

external enum class LightmapBakeType {
    Realtime /* = 4 */,
    Baked /* = 2 */,
    Mixed /* = 1 */
}

external enum class LightShadowCasterMode {
    Default /* = 0 */,
    NonLightmappedOnly /* = 1 */,
    Everything /* = 2 */
}

external enum class LightType {
    Spot /* = 0 */,
    Directional /* = 1 */,
    Point /* = 2 */,
    Area /* = 3 */,
    Rectangle /* = 3 */,
    Disc /* = 4 */
}

external enum class LightShape {
    Cone /* = 0 */,
    Pyramid /* = 1 */,
    Box /* = 2 */
}

external enum class LightShadows {
    None /* = 0 */,
    Hard /* = 1 */,
    Soft /* = 2 */
}

external enum class LightRenderMode {
    Auto /* = 0 */,
    ForcePixel /* = 1 */,
    ForceVertex /* = 2 */
}

external enum class LightmappingMode {
    Realtime /* = 4 */,
    Baked /* = 2 */,
    Mixed /* = 1 */
}

external open class Skybox : Behaviour {
    override var `var`: Any
    open var material: Any
}

external open class MeshFilter : Component {
    override var `var`: Any
    open var sharedMesh: Any
    open var mesh: Any
}

external enum class ComputeBufferType {
    Default /* = 0 */,
    Raw /* = 1 */,
    Append /* = 2 */,
    Counter /* = 4 */,
    Constant /* = 8 */,
    Structured /* = 16 */,
    DrawIndirect /* = 256 */,
    IndirectArguments /* = 256 */,
    GPUMemory /* = 512 */
}

external enum class ReceiveGI {
    Lightmaps /* = 1 */,
    LightProbes /* = 2 */
}

external enum class ShadowObjectsFilter {
    AllObjects /* = 0 */,
    DynamicOnly /* = 1 */,
    StaticOnly /* = 2 */
}

external enum class SkinQuality {
    Auto /* = 0 */,
    Bone1 /* = 1 */,
    Bone2 /* = 2 */,
    Bone4 /* = 4 */
}

external enum class FilterMode {
    Point /* = 0 */,
    Bilinear /* = 1 */,
    Trilinear /* = 2 */
}

external enum class TextureWrapMode {
    Repeat /* = 0 */,
    Clamp /* = 1 */,
    Mirror /* = 2 */,
    MirrorOnce /* = 3 */
}

external enum class NPOTSupport {
    None /* = 0 */,
    Restricted /* = 1 */,
    Full /* = 2 */
}

external enum class TextureFormat {
    Alpha8 /* = 1 */,
    ARGB4444 /* = 2 */,
    RGB24 /* = 3 */,
    RGBA32 /* = 4 */,
    ARGB32 /* = 5 */,
    RGB565 /* = 7 */,
    R16 /* = 9 */,
    DXT1 /* = 10 */,
    DXT5 /* = 12 */,
    RGBA4444 /* = 13 */,
    BGRA32 /* = 14 */,
    RHalf /* = 15 */,
    RGHalf /* = 16 */,
    RGBAHalf /* = 17 */,
    RFloat /* = 18 */,
    RGFloat /* = 19 */,
    RGBAFloat /* = 20 */,
    YUY2 /* = 21 */,
    RGB9e5Float /* = 22 */,
    BC4 /* = 26 */,
    BC5 /* = 27 */,
    BC6H /* = 24 */,
    BC7 /* = 25 */,
    DXT1Crunched /* = 28 */,
    DXT5Crunched /* = 29 */,
    PVRTC_RGB2 /* = 30 */,
    PVRTC_RGBA2 /* = 31 */,
    PVRTC_RGB4 /* = 32 */,
    PVRTC_RGBA4 /* = 33 */,
    ETC_RGB4 /* = 34 */,
    ATC_RGB4 /* = -127 */,
    ATC_RGBA8 /* = -127 */,
    EAC_R /* = 41 */,
    EAC_R_SIGNED /* = 42 */,
    EAC_RG /* = 43 */,
    EAC_RG_SIGNED /* = 44 */,
    ETC2_RGB /* = 45 */,
    ETC2_RGBA1 /* = 46 */,
    ETC2_RGBA8 /* = 47 */,
    ASTC_4x4 /* = 48 */,
    ASTC_5x5 /* = 49 */,
    ASTC_6x6 /* = 50 */,
    ASTC_8x8 /* = 51 */,
    ASTC_10x10 /* = 52 */,
    ASTC_12x12 /* = 53 */,
    ETC_RGB4_3DS /* = 60 */,
    ETC_RGBA8_3DS /* = 61 */,
    RG16 /* = 62 */,
    R8 /* = 63 */,
    ETC_RGB4Crunched /* = 64 */,
    ETC2_RGBA8Crunched /* = 65 */,
    ASTC_HDR_4x4 /* = 66 */,
    ASTC_HDR_5x5 /* = 67 */,
    ASTC_HDR_6x6 /* = 68 */,
    ASTC_HDR_8x8 /* = 69 */,
    ASTC_HDR_10x10 /* = 70 */,
    ASTC_HDR_12x12 /* = 71 */,
    RG32 /* = 72 */,
    RGB48 /* = 73 */,
    RGBA64 /* = 74 */,
    ASTC_RGB_4x4 /* = 48 */,
    ASTC_RGB_5x5 /* = 49 */,
    ASTC_RGB_6x6 /* = 50 */,
    ASTC_RGB_8x8 /* = 51 */,
    ASTC_RGB_10x10 /* = 52 */,
    ASTC_RGB_12x12 /* = 53 */,
    ASTC_RGBA_4x4 /* = 54 */,
    ASTC_RGBA_5x5 /* = 55 */,
    ASTC_RGBA_6x6 /* = 56 */,
    ASTC_RGBA_8x8 /* = 57 */,
    ASTC_RGBA_10x10 /* = 58 */,
    ASTC_RGBA_12x12 /* = 59 */,
    PVRTC_2BPP_RGB /* = -127 */,
    PVRTC_2BPP_RGBA /* = -127 */,
    PVRTC_4BPP_RGB /* = -127 */,
    PVRTC_4BPP_RGBA /* = -127 */
}

external enum class VRTextureUsage {
    None /* = 0 */,
    OneEye /* = 1 */,
    TwoEyes /* = 2 */,
    DeviceSpecific /* = 3 */
}

external enum class RenderTextureCreationFlags {
    MipMap /* = 1 */,
    AutoGenerateMips /* = 2 */,
    SRGB /* = 4 */,
    EyeTexture /* = 8 */,
    EnableRandomWrite /* = 16 */,
    CreatedFromScript /* = 32 */,
    AllowVerticalFlip /* = 128 */,
    NoResolvedColorSurface /* = 256 */,
    DynamicallyScalable /* = 1024 */,
    BindMS /* = 2048 */
}

external enum class RenderTextureReadWrite {
    Default /* = 0 */,
    Linear /* = 1 */,
    sRGB /* = 2 */
}

external enum class RenderTextureMemoryless {
    None /* = 0 */,
    Color /* = 1 */,
    Depth /* = 2 */,
    MSAA /* = 4 */
}

external enum class HDRDisplaySupportFlags {
    None /* = 0 */,
    Supported /* = 1 */,
    RuntimeSwitchable /* = 2 */,
    AutomaticTonemapping /* = 4 */
}

external enum class CustomRenderTextureInitializationSource {
    TextureAndColor /* = 0 */,
    Material /* = 1 */
}

external enum class CustomRenderTextureUpdateMode {
    OnLoad /* = 0 */,
    Realtime /* = 1 */,
    OnDemand /* = 2 */
}

external enum class CustomRenderTextureUpdateZoneSpace {
    Normalized /* = 0 */,
    Pixel /* = 1 */
}

external open class SkinnedMeshRenderer : Renderer {
    override var `var`: Any
    open var quality: Any
    open var updateWhenOffscreen: Any
    open var forceMatrixRecalculationPerRender: Any
    open var rootBone: Any
    open var sharedMesh: Any
    open var skinnedMotionVectors: Any
    open var vertexBufferTarget: Any
    open fun GetBlendShapeWeight(`$index`: Number): Number
    open fun SetBlendShapeWeight(`$index`: Number, `$value`: Number)
    open fun BakeMesh(`$mesh`: Mesh)
    open fun BakeMesh(`$mesh`: Mesh, `$useScale`: Boolean)
    open fun GetVertexBuffer(): GraphicsBuffer
    open fun GetPreviousVertexBuffer(): GraphicsBuffer
}

external open class LightProbeGroup : Behaviour {
    override var `var`: Any
    open var dering: Any
}

external open class LineUtility : csharp.System.Object {
    companion object {
        fun Simplify(`$points`: `List$1`<Vector3>, `$tolerance`: Number, `$pointsToKeep`: `List$1`<Number>)
        fun Simplify(`$points`: `List$1`<Vector3>, `$tolerance`: Number, `$simplifiedPoints`: `List$1`<Vector3>)
        fun Simplify(`$points`: `List$1`<Vector2>, `$tolerance`: Number, `$pointsToKeep`: `List$1`<Number>)
        fun Simplify(`$points`: `List$1`<Vector2>, `$tolerance`: Number, `$simplifiedPoints`: `List$1`<Vector2>)
    }
}

external enum class LODFadeMode {
    None /* = 0 */,
    CrossFade /* = 1 */,
    SpeedTree /* = 2 */
}

external open class LOD : ValueType {
    constructor(`$screenRelativeTransitionHeight`: Number, `$renderers`: `Array$1`<Renderer>)
    constructor()
    open var screenRelativeTransitionHeight: Number
    open var fadeTransitionWidth: Number
    open var renderers: `Array$1`<Renderer>
}

external open class LODGroup : Component {
    override var `var`: Any
    open var size: Any
    open val lodCount: Any
    open var fadeMode: Any
    open var animateCrossFading: Any
    open var enabled: Any
    open fun RecalculateBounds()
    open fun GetLODs(): `Array$1`<LOD>
    open fun SetLODs(`$lods`: `Array$1`<LOD>)
    open fun ForceLOD(`$index`: Number)
}

external open class Texture3D : Texture {
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: DefaultFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$textureFormat`: TextureFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$textureFormat`: TextureFormat, `$mipCount`: Number, `$nativeTex`: IntPtr)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean, `$nativeTex`: IntPtr)
    constructor()
    override var `var`: Any
    open val depth: Any
    open val format: Any
    override val isReadable: Any
    open fun UpdateExternalTexture(`$nativeTex`: IntPtr)
    open fun GetPixels(`$miplevel`: Number): `Array$1`<Color>
    open fun GetPixels(): `Array$1`<Color>
    open fun GetPixels32(`$miplevel`: Number): `Array$1`<Color32>
    open fun GetPixels32(): `Array$1`<Color32>
    open fun SetPixels(`$colors`: `Array$1`<Color>, `$miplevel`: Number)
    open fun SetPixels(`$colors`: `Array$1`<Color>)
    open fun SetPixels32(`$colors`: `Array$1`<Color32>, `$miplevel`: Number)
    open fun SetPixels32(`$colors`: `Array$1`<Color32>)
    open fun Apply(`$updateMipmaps`: Boolean, `$makeNoLongerReadable`: Boolean)
    open fun Apply(`$updateMipmaps`: Boolean)
    open fun Apply()
    open fun SetPixel(`$x`: Number, `$y`: Number, `$z`: Number, `$color`: Color)
    open fun SetPixel(`$x`: Number, `$y`: Number, `$z`: Number, `$color`: Color, `$mipLevel`: Number)
    open fun GetPixel(`$x`: Number, `$y`: Number, `$z`: Number): Color
    open fun GetPixel(`$x`: Number, `$y`: Number, `$z`: Number, `$mipLevel`: Number): Color
    open fun GetPixelBilinear(`$u`: Number, `$v`: Number, `$w`: Number): Color
    open fun GetPixelBilinear(`$u`: Number, `$v`: Number, `$w`: Number, `$mipLevel`: Number): Color

    companion object {
        fun CreateExternalTexture(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: TextureFormat, `$mipChain`: Boolean, `$nativeTex`: IntPtr): Texture3D
    }
}

external open class Texture2DArray : Texture {
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: DefaultFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$textureFormat`: TextureFormat, `$mipCount`: Number, `$linear`: Boolean)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean, `$linear`: Boolean)
    constructor(`$width`: Number, `$height`: Number, `$depth`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean)
    constructor()
    override var `var`: Any
    open val depth: Any
    open val format: Any
    override val isReadable: Any
    open fun GetPixels(`$arrayElement`: Number, `$miplevel`: Number): `Array$1`<Color>
    open fun GetPixels(`$arrayElement`: Number): `Array$1`<Color>
    open fun GetPixels32(`$arrayElement`: Number, `$miplevel`: Number): `Array$1`<Color32>
    open fun GetPixels32(`$arrayElement`: Number): `Array$1`<Color32>
    open fun SetPixels(`$colors`: `Array$1`<Color>, `$arrayElement`: Number, `$miplevel`: Number)
    open fun SetPixels(`$colors`: `Array$1`<Color>, `$arrayElement`: Number)
    open fun SetPixels32(`$colors`: `Array$1`<Color32>, `$arrayElement`: Number, `$miplevel`: Number)
    open fun SetPixels32(`$colors`: `Array$1`<Color32>, `$arrayElement`: Number)
    open fun Apply(`$updateMipmaps`: Boolean, `$makeNoLongerReadable`: Boolean)
    open fun Apply(`$updateMipmaps`: Boolean)
    open fun Apply()
}

external open class CubemapArray : Texture {
    constructor(`$width`: Number, `$cubemapCount`: Number, `$format`: DefaultFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$cubemapCount`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags)
    constructor(`$width`: Number, `$cubemapCount`: Number, `$format`: GraphicsFormat, `$flags`: TextureCreationFlags, `$mipCount`: Number)
    constructor(`$width`: Number, `$cubemapCount`: Number, `$textureFormat`: TextureFormat, `$mipCount`: Number, `$linear`: Boolean)
    constructor(`$width`: Number, `$cubemapCount`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean, `$linear`: Boolean)
    constructor(`$width`: Number, `$cubemapCount`: Number, `$textureFormat`: TextureFormat, `$mipChain`: Boolean)
    constructor()
    override var `var`: Any
    open val cubemapCount: Any
    open val format: Any
    override val isReadable: Any
    open fun GetPixels(`$face`: CubemapFace, `$arrayElement`: Number, `$miplevel`: Number): `Array$1`<Color>
    open fun GetPixels(`$face`: CubemapFace, `$arrayElement`: Number): `Array$1`<Color>
    open fun GetPixels32(`$face`: CubemapFace, `$arrayElement`: Number, `$miplevel`: Number): `Array$1`<Color32>
    open fun GetPixels32(`$face`: CubemapFace, `$arrayElement`: Number): `Array$1`<Color32>
    open fun SetPixels(`$colors`: `Array$1`<Color>, `$face`: CubemapFace, `$arrayElement`: Number, `$miplevel`: Number)
    open fun SetPixels(`$colors`: `Array$1`<Color>, `$face`: CubemapFace, `$arrayElement`: Number)
    open fun SetPixels32(`$colors`: `Array$1`<Color32>, `$face`: CubemapFace, `$arrayElement`: Number, `$miplevel`: Number)
    open fun SetPixels32(`$colors`: `Array$1`<Color32>, `$face`: CubemapFace, `$arrayElement`: Number)
    open fun Apply(`$updateMipmaps`: Boolean, `$makeNoLongerReadable`: Boolean)
    open fun Apply(`$updateMipmaps`: Boolean)
    open fun Apply()
}

external open class SparseTexture : Texture {
    constructor(`$width`: Number, `$height`: Number, `$format`: DefaultFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$format`: GraphicsFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$textureFormat`: TextureFormat, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$textureFormat`: TextureFormat, `$mipCount`: Number, `$linear`: Boolean)
    constructor()
    override var `var`: Any
    open val tileWidth: Any
    open val tileHeight: Any
    open val isCreated: Any
    open fun UpdateTile(`$tileX`: Number, `$tileY`: Number, `$miplevel`: Number, `$data`: `Array$1`<Color32>)
    open fun UpdateTileRaw(`$tileX`: Number, `$tileY`: Number, `$miplevel`: Number, `$data`: `Array$1`<Number>)
    open fun UnloadTile(`$tileX`: Number, `$tileY`: Number, `$miplevel`: Number)
}

external open class RenderTextureDescriptor : ValueType {
    constructor(`$width`: Number, `$height`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: RenderTextureFormat)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: RenderTextureFormat, `$depthBufferBits`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: GraphicsFormat, `$depthBufferBits`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: RenderTextureFormat, `$depthBufferBits`: Number, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: GraphicsFormat, `$depthBufferBits`: Number, `$mipCount`: Number)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: GraphicsFormat, `$depthStencilFormat`: GraphicsFormat)
    constructor(`$width`: Number, `$height`: Number, `$colorFormat`: GraphicsFormat, `$depthStencilFormat`: GraphicsFormat, `$mipCount`: Number)
    constructor()
    open var `var`: Any
    open var width: Any
    open var height: Any
    open var msaaSamples: Any
    open var volumeDepth: Any
    open var mipCount: Any
    open var graphicsFormat: Any
    open var stencilFormat: Any
    open var depthStencilFormat: Any
    open var colorFormat: Any
    open var sRGB: Any
    open var depthBufferBits: Any
    open var dimension: Any
    open var shadowSamplingMode: Any
    open var vrUsage: Any
    open val flags: Any
    open var memoryless: Any
    open var useMipMap: Any
    open var autoGenerateMips: Any
    open var enableRandomWrite: Any
    open var bindMS: Any
    open var useDynamicScale: Any
}

external open class CustomRenderTextureUpdateZone : ValueType {
    open var updateZoneCenter: Vector3
    open var updateZoneSize: Vector3
    open var rotation: Number
    open var passIndex: Number
    open var needSwap: Boolean
}

external enum class FullScreenMovieControlMode {
    Full /* = 0 */,
    Minimal /* = 1 */,
    CancelOnInput /* = 2 */,
    Hidden /* = 3 */
}

external enum class FullScreenMovieScalingMode {
    None /* = 0 */,
    AspectFit /* = 1 */,
    AspectFill /* = 2 */,
    Fill /* = 3 */
}

external enum class AndroidActivityIndicatorStyle {
    DontShow /* = -1 */,
    Large /* = 0 */,
    InversedLarge /* = 1 */,
    Small /* = 2 */,
    InversedSmall /* = 3 */
}

external open class HashUtilities : csharp.System.Object {
    companion object {
        fun AppendHash(`$inHash`: `$Ref`<Hash128>, `$outHash`: `$Ref`<Hash128>)
        fun QuantisedMatrixHash(`$value`: `$Ref`<Matrix4x4>, `$hash`: `$Ref`<Hash128>)
        fun QuantisedVectorHash(`$value`: `$Ref`<Vector3>, `$hash`: `$Ref`<Hash128>)
        fun ComputeHash128(`$value`: `Array$1`<Number>, `$hash`: `$Ref`<Hash128>)
    }
}

external open class HashUnsafeUtilities : csharp.System.Object

external enum class CursorMode {
    Auto /* = 0 */,
    ForceSoftware /* = 1 */
}

external enum class CursorLockMode {
    None /* = 0 */,
    Locked /* = 1 */,
    Confined /* = 2 */
}

external open class Cursor : csharp.System.Object {
    companion object {
        fun SetCursor(`$texture`: Texture2D, `$hotspot`: Vector2, `$cursorMode`: CursorMode)
    }
}

external enum class KeyCode {
    None /* = 0 */,
    Backspace /* = 8 */,
    Delete /* = 127 */,
    Tab /* = 9 */,
    Clear /* = 12 */,
    Return /* = 13 */,
    Pause /* = 19 */,
    Escape /* = 27 */,
    Space /* = 32 */,
    Keypad0 /* = 256 */,
    Keypad1 /* = 257 */,
    Keypad2 /* = 258 */,
    Keypad3 /* = 259 */,
    Keypad4 /* = 260 */,
    Keypad5 /* = 261 */,
    Keypad6 /* = 262 */,
    Keypad7 /* = 263 */,
    Keypad8 /* = 264 */,
    Keypad9 /* = 265 */,
    KeypadPeriod /* = 266 */,
    KeypadDivide /* = 267 */,
    KeypadMultiply /* = 268 */,
    KeypadMinus /* = 269 */,
    KeypadPlus /* = 270 */,
    KeypadEnter /* = 271 */,
    KeypadEquals /* = 272 */,
    UpArrow /* = 273 */,
    DownArrow /* = 274 */,
    RightArrow /* = 275 */,
    LeftArrow /* = 276 */,
    Insert /* = 277 */,
    Home /* = 278 */,
    End /* = 279 */,
    PageUp /* = 280 */,
    PageDown /* = 281 */,
    F1 /* = 282 */,
    F2 /* = 283 */,
    F3 /* = 284 */,
    F4 /* = 285 */,
    F5 /* = 286 */,
    F6 /* = 287 */,
    F7 /* = 288 */,
    F8 /* = 289 */,
    F9 /* = 290 */,
    F10 /* = 291 */,
    F11 /* = 292 */,
    F12 /* = 293 */,
    F13 /* = 294 */,
    F14 /* = 295 */,
    F15 /* = 296 */,
    Alpha0 /* = 48 */,
    Alpha1 /* = 49 */,
    Alpha2 /* = 50 */,
    Alpha3 /* = 51 */,
    Alpha4 /* = 52 */,
    Alpha5 /* = 53 */,
    Alpha6 /* = 54 */,
    Alpha7 /* = 55 */,
    Alpha8 /* = 56 */,
    Alpha9 /* = 57 */,
    Exclaim /* = 33 */,
    DoubleQuote /* = 34 */,
    Hash /* = 35 */,
    Dollar /* = 36 */,
    Percent /* = 37 */,
    Ampersand /* = 38 */,
    Quote /* = 39 */,
    LeftParen /* = 40 */,
    RightParen /* = 41 */,
    Asterisk /* = 42 */,
    Plus /* = 43 */,
    Comma /* = 44 */,
    Minus /* = 45 */,
    Period /* = 46 */,
    Slash /* = 47 */,
    Colon /* = 58 */,
    Semicolon /* = 59 */,
    Less /* = 60 */,
    Equals /* = 61 */,
    Greater /* = 62 */,
    Question /* = 63 */,
    At /* = 64 */,
    LeftBracket /* = 91 */,
    Backslash /* = 92 */,
    RightBracket /* = 93 */,
    Caret /* = 94 */,
    Underscore /* = 95 */,
    BackQuote /* = 96 */,
    A /* = 97 */,
    B /* = 98 */,
    C /* = 99 */,
    D /* = 100 */,
    E /* = 101 */,
    F /* = 102 */,
    G /* = 103 */,
    H /* = 104 */,
    I /* = 105 */,
    J /* = 106 */,
    K /* = 107 */,
    L /* = 108 */,
    M /* = 109 */,
    N /* = 110 */,
    O /* = 111 */,
    P /* = 112 */,
    Q /* = 113 */,
    R /* = 114 */,
    S /* = 115 */,
    T /* = 116 */,
    U /* = 117 */,
    V /* = 118 */,
    W /* = 119 */,
    X /* = 120 */,
    Y /* = 121 */,
    Z /* = 122 */,
    LeftCurlyBracket /* = 123 */,
    Pipe /* = 124 */,
    RightCurlyBracket /* = 125 */,
    Tilde /* = 126 */,
    Numlock /* = 300 */,
    CapsLock /* = 301 */,
    ScrollLock /* = 302 */,
    RightShift /* = 303 */,
    LeftShift /* = 304 */,
    RightControl /* = 305 */,
    LeftControl /* = 306 */,
    RightAlt /* = 307 */,
    LeftAlt /* = 308 */,
    LeftMeta /* = 310 */,
    LeftCommand /* = 310 */,
    LeftApple /* = 310 */,
    LeftWindows /* = 311 */,
    RightMeta /* = 309 */,
    RightCommand /* = 309 */,
    RightApple /* = 309 */,
    RightWindows /* = 312 */,
    AltGr /* = 313 */,
    Help /* = 315 */,
    Print /* = 316 */,
    SysReq /* = 317 */,
    Break /* = 318 */,
    Menu /* = 319 */,
    Mouse0 /* = 323 */,
    Mouse1 /* = 324 */,
    Mouse2 /* = 325 */,
    Mouse3 /* = 326 */,
    Mouse4 /* = 327 */,
    Mouse5 /* = 328 */,
    Mouse6 /* = 329 */,
    JoystickButton0 /* = 330 */,
    JoystickButton1 /* = 331 */,
    JoystickButton2 /* = 332 */,
    JoystickButton3 /* = 333 */,
    JoystickButton4 /* = 334 */,
    JoystickButton5 /* = 335 */,
    JoystickButton6 /* = 336 */,
    JoystickButton7 /* = 337 */,
    JoystickButton8 /* = 338 */,
    JoystickButton9 /* = 339 */,
    JoystickButton10 /* = 340 */,
    JoystickButton11 /* = 341 */,
    JoystickButton12 /* = 342 */,
    JoystickButton13 /* = 343 */,
    JoystickButton14 /* = 344 */,
    JoystickButton15 /* = 345 */,
    JoystickButton16 /* = 346 */,
    JoystickButton17 /* = 347 */,
    JoystickButton18 /* = 348 */,
    JoystickButton19 /* = 349 */,
    Joystick1Button0 /* = 350 */,
    Joystick1Button1 /* = 351 */,
    Joystick1Button2 /* = 352 */,
    Joystick1Button3 /* = 353 */,
    Joystick1Button4 /* = 354 */,
    Joystick1Button5 /* = 355 */,
    Joystick1Button6 /* = 356 */,
    Joystick1Button7 /* = 357 */,
    Joystick1Button8 /* = 358 */,
    Joystick1Button9 /* = 359 */,
    Joystick1Button10 /* = 360 */,
    Joystick1Button11 /* = 361 */,
    Joystick1Button12 /* = 362 */,
    Joystick1Button13 /* = 363 */,
    Joystick1Button14 /* = 364 */,
    Joystick1Button15 /* = 365 */,
    Joystick1Button16 /* = 366 */,
    Joystick1Button17 /* = 367 */,
    Joystick1Button18 /* = 368 */,
    Joystick1Button19 /* = 369 */,
    Joystick2Button0 /* = 370 */,
    Joystick2Button1 /* = 371 */,
    Joystick2Button2 /* = 372 */,
    Joystick2Button3 /* = 373 */,
    Joystick2Button4 /* = 374 */,
    Joystick2Button5 /* = 375 */,
    Joystick2Button6 /* = 376 */,
    Joystick2Button7 /* = 377 */,
    Joystick2Button8 /* = 378 */,
    Joystick2Button9 /* = 379 */,
    Joystick2Button10 /* = 380 */,
    Joystick2Button11 /* = 381 */,
    Joystick2Button12 /* = 382 */,
    Joystick2Button13 /* = 383 */,
    Joystick2Button14 /* = 384 */,
    Joystick2Button15 /* = 385 */,
    Joystick2Button16 /* = 386 */,
    Joystick2Button17 /* = 387 */,
    Joystick2Button18 /* = 388 */,
    Joystick2Button19 /* = 389 */,
    Joystick3Button0 /* = 390 */,
    Joystick3Button1 /* = 391 */,
    Joystick3Button2 /* = 392 */,
    Joystick3Button3 /* = 393 */,
    Joystick3Button4 /* = 394 */,
    Joystick3Button5 /* = 395 */,
    Joystick3Button6 /* = 396 */,
    Joystick3Button7 /* = 397 */,
    Joystick3Button8 /* = 398 */,
    Joystick3Button9 /* = 399 */,
    Joystick3Button10 /* = 400 */,
    Joystick3Button11 /* = 401 */,
    Joystick3Button12 /* = 402 */,
    Joystick3Button13 /* = 403 */,
    Joystick3Button14 /* = 404 */,
    Joystick3Button15 /* = 405 */,
    Joystick3Button16 /* = 406 */,
    Joystick3Button17 /* = 407 */,
    Joystick3Button18 /* = 408 */,
    Joystick3Button19 /* = 409 */,
    Joystick4Button0 /* = 410 */,
    Joystick4Button1 /* = 411 */,
    Joystick4Button2 /* = 412 */,
    Joystick4Button3 /* = 413 */,
    Joystick4Button4 /* = 414 */,
    Joystick4Button5 /* = 415 */,
    Joystick4Button6 /* = 416 */,
    Joystick4Button7 /* = 417 */,
    Joystick4Button8 /* = 418 */,
    Joystick4Button9 /* = 419 */,
    Joystick4Button10 /* = 420 */,
    Joystick4Button11 /* = 421 */,
    Joystick4Button12 /* = 422 */,
    Joystick4Button13 /* = 423 */,
    Joystick4Button14 /* = 424 */,
    Joystick4Button15 /* = 425 */,
    Joystick4Button16 /* = 426 */,
    Joystick4Button17 /* = 427 */,
    Joystick4Button18 /* = 428 */,
    Joystick4Button19 /* = 429 */,
    Joystick5Button0 /* = 430 */,
    Joystick5Button1 /* = 431 */,
    Joystick5Button2 /* = 432 */,
    Joystick5Button3 /* = 433 */,
    Joystick5Button4 /* = 434 */,
    Joystick5Button5 /* = 435 */,
    Joystick5Button6 /* = 436 */,
    Joystick5Button7 /* = 437 */,
    Joystick5Button8 /* = 438 */,
    Joystick5Button9 /* = 439 */,
    Joystick5Button10 /* = 440 */,
    Joystick5Button11 /* = 441 */,
    Joystick5Button12 /* = 442 */,
    Joystick5Button13 /* = 443 */,
    Joystick5Button14 /* = 444 */,
    Joystick5Button15 /* = 445 */,
    Joystick5Button16 /* = 446 */,
    Joystick5Button17 /* = 447 */,
    Joystick5Button18 /* = 448 */,
    Joystick5Button19 /* = 449 */,
    Joystick6Button0 /* = 450 */,
    Joystick6Button1 /* = 451 */,
    Joystick6Button2 /* = 452 */,
    Joystick6Button3 /* = 453 */,
    Joystick6Button4 /* = 454 */,
    Joystick6Button5 /* = 455 */,
    Joystick6Button6 /* = 456 */,
    Joystick6Button7 /* = 457 */,
    Joystick6Button8 /* = 458 */,
    Joystick6Button9 /* = 459 */,
    Joystick6Button10 /* = 460 */,
    Joystick6Button11 /* = 461 */,
    Joystick6Button12 /* = 462 */,
    Joystick6Button13 /* = 463 */,
    Joystick6Button14 /* = 464 */,
    Joystick6Button15 /* = 465 */,
    Joystick6Button16 /* = 466 */,
    Joystick6Button17 /* = 467 */,
    Joystick6Button18 /* = 468 */,
    Joystick6Button19 /* = 469 */,
    Joystick7Button0 /* = 470 */,
    Joystick7Button1 /* = 471 */,
    Joystick7Button2 /* = 472 */,
    Joystick7Button3 /* = 473 */,
    Joystick7Button4 /* = 474 */,
    Joystick7Button5 /* = 475 */,
    Joystick7Button6 /* = 476 */,
    Joystick7Button7 /* = 477 */,
    Joystick7Button8 /* = 478 */,
    Joystick7Button9 /* = 479 */,
    Joystick7Button10 /* = 480 */,
    Joystick7Button11 /* = 481 */,
    Joystick7Button12 /* = 482 */,
    Joystick7Button13 /* = 483 */,
    Joystick7Button14 /* = 484 */,
    Joystick7Button15 /* = 485 */,
    Joystick7Button16 /* = 486 */,
    Joystick7Button17 /* = 487 */,
    Joystick7Button18 /* = 488 */,
    Joystick7Button19 /* = 489 */,
    Joystick8Button0 /* = 490 */,
    Joystick8Button1 /* = 491 */,
    Joystick8Button2 /* = 492 */,
    Joystick8Button3 /* = 493 */,
    Joystick8Button4 /* = 494 */,
    Joystick8Button5 /* = 495 */,
    Joystick8Button6 /* = 496 */,
    Joystick8Button7 /* = 497 */,
    Joystick8Button8 /* = 498 */,
    Joystick8Button9 /* = 499 */,
    Joystick8Button10 /* = 500 */,
    Joystick8Button11 /* = 501 */,
    Joystick8Button12 /* = 502 */,
    Joystick8Button13 /* = 503 */,
    Joystick8Button14 /* = 504 */,
    Joystick8Button15 /* = 505 */,
    Joystick8Button16 /* = 506 */,
    Joystick8Button17 /* = 507 */,
    Joystick8Button18 /* = 508 */,
    Joystick8Button19 /* = 509 */
}

external enum class iPhoneScreenOrientation {
    Unknown /* = 0 */,
    Portrait /* = 1 */,
    PortraitUpsideDown /* = 2 */,
    LandscapeLeft /* = 3 */,
    LandscapeRight /* = 4 */,
    AutoRotation /* = 5 */,
    Landscape /* = 6 */
}

external enum class iPhoneNetworkReachability {
    NotReachable /* = 0 */,
    ReachableViaCarrierDataNetwork /* = 1 */,
    ReachableViaWiFiNetwork /* = 2 */
}

external enum class iPhoneGeneration {
    Unknown /* = 0 */,
    iPhone /* = 1 */,
    iPhone3G /* = 2 */,
    iPhone3GS /* = 3 */,
    iPodTouch1Gen /* = 4 */,
    iPodTouch2Gen /* = 5 */,
    iPodTouch3Gen /* = 6 */,
    iPad1Gen /* = 7 */,
    iPhone4 /* = 8 */,
    iPodTouch4Gen /* = 9 */,
    iPad2Gen /* = 10 */,
    iPhone4S /* = 11 */,
    iPad3Gen /* = 12 */,
    iPhone5 /* = 13 */,
    iPodTouch5Gen /* = 14 */,
    iPadMini1Gen /* = 15 */,
    iPad4Gen /* = 16 */,
    iPhone5C /* = 17 */,
    iPhone5S /* = 18 */,
    iPhoneUnknown /* = 19 */,
    iPadUnknown /* = 20 */,
    iPodTouchUnknown /* = 21 */
}

external enum class iPhoneTouchPhase {
    Began /* = 0 */,
    Moved /* = 1 */,
    Stationary /* = 2 */,
    Ended /* = 3 */,
    Canceled /* = 4 */
}

external enum class iPhoneMovieControlMode {
    Full /* = 0 */,
    Minimal /* = 1 */,
    CancelOnTouch /* = 2 */,
    Hidden /* = 3 */,
    VolumeOnly /* = 4 */
}

external enum class iPhoneMovieScalingMode {
    None /* = 0 */,
    AspectFit /* = 1 */,
    AspectFill /* = 2 */,
    Fill /* = 3 */
}

external enum class iPhoneKeyboardType {
    Default /* = 0 */,
    ASCIICapable /* = 1 */,
    NumbersAndPunctuation /* = 2 */,
    URL /* = 3 */,
    NumberPad /* = 4 */,
    PhonePad /* = 5 */,
    NamePhonePad /* = 6 */,
    EmailAddress /* = 7 */
}

external enum class iPhoneOrientation {
    Unknown /* = 0 */,
    Portrait /* = 1 */,
    PortraitUpsideDown /* = 2 */,
    LandscapeLeft /* = 3 */,
    LandscapeRight /* = 4 */,
    FaceUp /* = 5 */,
    FaceDown /* = 6 */
}

external enum class iOSActivityIndicatorStyle {
    DontShow /* = 0 */,
    WhiteLarge /* = 1 */,
    White /* = 2 */,
    Gray /* = 3 */
}

external enum class CalendarIdentifier {
    GregorianCalendar /* = 0 */,
    BuddhistCalendar /* = 1 */,
    ChineseCalendar /* = 2 */,
    HebrewCalendar /* = 3 */,
    IslamicCalendar /* = 4 */,
    IslamicCivilCalendar /* = 5 */,
    JapaneseCalendar /* = 6 */,
    RepublicOfChinaCalendar /* = 7 */,
    PersianCalendar /* = 8 */,
    IndianCalendar /* = 9 */,
    ISO8601Calendar /* = 10 */
}

external enum class CalendarUnit {
    Era /* = 0 */,
    Year /* = 1 */,
    Month /* = 2 */,
    Day /* = 3 */,
    Hour /* = 4 */,
    Minute /* = 5 */,
    Second /* = 6 */,
    Week /* = 7 */,
    Weekday /* = 8 */,
    WeekdayOrdinal /* = 9 */,
    Quarter /* = 10 */
}

external enum class RemoteNotificationType {
    None /* = 0 */,
    Badge /* = 1 */,
    Sound /* = 2 */,
    Alert /* = 3 */
}

external open class Logger : csharp.System.Object, ILogger, ILogHandler {
    constructor(`$logHandler`: ILogHandler)
    constructor()
    open var `var`: Any
    override var logHandler: ILogHandler
    override var logEnabled: Boolean
    override var filterLogType: LogType
    override fun IsLogTypeAllowed(`$logType`: LogType): Boolean
    override fun Log(`$logType`: LogType, `$message`: Any)
    override fun Log(`$logType`: LogType, `$message`: Any, `$context`: Object)
    override fun Log(`$logType`: LogType, `$tag`: String, `$message`: Any)
    override fun Log(`$logType`: LogType, `$tag`: String, `$message`: Any, `$context`: Object)
    override fun Log(`$message`: Any)
    override fun Log(`$tag`: String, `$message`: Any)
    override fun Log(`$tag`: String, `$message`: Any, `$context`: Object)
    override fun LogWarning(`$tag`: String, `$message`: Any)
    override fun LogWarning(`$tag`: String, `$message`: Any, `$context`: Object)
    override fun LogError(`$tag`: String, `$message`: Any)
    override fun LogError(`$tag`: String, `$message`: Any, `$context`: Object)
    override fun LogException(`$exception`: Exception)
    override fun LogException(`$exception`: Exception, `$context`: Object)
    override fun LogFormat(`$logType`: LogType, `$format`: String, vararg args: Any)
    override fun LogFormat(`$logType`: LogType, `$context`: Object, `$format`: String, vararg args: Any)
}

external open class ColorUtility : csharp.System.Object {
    companion object {
        fun TryParseHtmlString(`$htmlString`: String, `$color`: `$Ref`<Color>): Boolean
        fun ToHtmlStringRGB(`$color`: Color): String
        fun ToHtmlStringRGBA(`$color`: Color): String
    }
}

external open class GradientColorKey : ValueType {
    constructor(`$col`: Color, `$time`: Number)
    constructor()
    open var color: Color
    open var time: Number
}

external open class GradientAlphaKey : ValueType {
    constructor(`$alpha`: Number, `$time`: Number)
    constructor()
    open var alpha: Number
    open var time: Number
}

external enum class GradientMode {
    Blend /* = 0 */,
    Fixed /* = 1 */
}

external open class FrustumPlanes : ValueType {
    open var left: Number
    open var right: Number
    open var bottom: Number
    open var top: Number
    open var zNear: Number
    open var zFar: Number
}

external open class Mathf : ValueType {
    companion object {
        var PI: Number
        var Infinity: Number
        var NegativeInfinity: Number
        var Deg2Rad: Number
        var Rad2Deg: Number
        var Epsilon: Number
        fun ClosestPowerOfTwo(`$value`: Number): Number
        fun IsPowerOfTwo(`$value`: Number): Boolean
        fun NextPowerOfTwo(`$value`: Number): Number
        fun GammaToLinearSpace(`$value`: Number): Number
        fun LinearToGammaSpace(`$value`: Number): Number
        fun CorrelatedColorTemperatureToRGB(`$kelvin`: Number): Color
        fun FloatToHalf(`$val`: Number): Number
        fun HalfToFloat(`$val`: Number): Number
        fun PerlinNoise(`$x`: Number, `$y`: Number): Number
        fun Sin(`$f`: Number): Number
        fun Cos(`$f`: Number): Number
        fun Tan(`$f`: Number): Number
        fun Asin(`$f`: Number): Number
        fun Acos(`$f`: Number): Number
        fun Atan(`$f`: Number): Number
        fun Atan2(`$y`: Number, `$x`: Number): Number
        fun Sqrt(`$f`: Number): Number
        fun Abs(`$f`: Number): Number
        fun Abs(`$value`: Number): Number
        fun Min(`$a`: Number, `$b`: Number): Number
        fun Min(vararg values: Number): Number
        fun Max(`$a`: Number, `$b`: Number): Number
        fun Max(vararg values: Number): Number
        fun Pow(`$f`: Number, `$p`: Number): Number
        fun Exp(`$power`: Number): Number
        fun Log(`$f`: Number, `$p`: Number): Number
        fun Log(`$f`: Number): Number
        fun Log10(`$f`: Number): Number
        fun Ceil(`$f`: Number): Number
        fun Floor(`$f`: Number): Number
        fun Round(`$f`: Number): Number
        fun CeilToInt(`$f`: Number): Number
        fun FloorToInt(`$f`: Number): Number
        fun RoundToInt(`$f`: Number): Number
        fun Sign(`$f`: Number): Number
        fun Clamp(`$value`: Number, `$min`: Number, `$max`: Number): Number
        fun Clamp01(`$value`: Number): Number
        fun Lerp(`$a`: Number, `$b`: Number, `$t`: Number): Number
        fun LerpUnclamped(`$a`: Number, `$b`: Number, `$t`: Number): Number
        fun LerpAngle(`$a`: Number, `$b`: Number, `$t`: Number): Number
        fun MoveTowards(`$current`: Number, `$target`: Number, `$maxDelta`: Number): Number
        fun MoveTowardsAngle(`$current`: Number, `$target`: Number, `$maxDelta`: Number): Number
        fun SmoothStep(`$from`: Number, `$to`: Number, `$t`: Number): Number
        fun Gamma(`$value`: Number, `$absmax`: Number, `$gamma`: Number): Number
        fun Approximately(`$a`: Number, `$b`: Number): Boolean
        fun SmoothDamp(`$current`: Number, `$target`: Number, `$currentVelocity`: `$Ref`<Number>, `$smoothTime`: Number, `$maxSpeed`: Number): Number
        fun SmoothDamp(`$current`: Number, `$target`: Number, `$currentVelocity`: `$Ref`<Number>, `$smoothTime`: Number): Number
        fun SmoothDamp(`$current`: Number, `$target`: Number, `$currentVelocity`: `$Ref`<Number>, `$smoothTime`: Number, `$maxSpeed`: Number, `$deltaTime`: Number): Number
        fun SmoothDampAngle(`$current`: Number, `$target`: Number, `$currentVelocity`: `$Ref`<Number>, `$smoothTime`: Number, `$maxSpeed`: Number): Number
        fun SmoothDampAngle(`$current`: Number, `$target`: Number, `$currentVelocity`: `$Ref`<Number>, `$smoothTime`: Number): Number
        fun SmoothDampAngle(`$current`: Number, `$target`: Number, `$currentVelocity`: `$Ref`<Number>, `$smoothTime`: Number, `$maxSpeed`: Number, `$deltaTime`: Number): Number
        fun Repeat(`$t`: Number, `$length`: Number): Number
        fun PingPong(`$t`: Number, `$length`: Number): Number
        fun InverseLerp(`$a`: Number, `$b`: Number, `$value`: Number): Number
        fun DeltaAngle(`$current`: Number, `$target`: Number): Number
    }
}

external enum class RPCMode {

}

external enum class ConnectionTesterStatus {

}

external enum class NetworkConnectionError {

}

external enum class NetworkDisconnection {

}

external enum class MasterServerEvent {

}

external enum class NetworkStateSynchronization {

}

external enum class NetworkPeerType {

}

external enum class NetworkLogLevel {

}

external open class Ping : csharp.System.Object {
    constructor(`$address`: String)
    constructor()
    open var `var`: Any
    open val isDone: Any
    open val time: Any
    open val ip: Any
    open fun DestroyPing()
}

external open class PlayerPrefsException : Exception, ISerializable, _Exception {
    constructor(`$error`: String)
    constructor()
}

external open class PlayerPrefs : csharp.System.Object {
    companion object {
        fun SetInt(`$key`: String, `$value`: Number)
        fun GetInt(`$key`: String, `$defaultValue`: Number): Number
        fun GetInt(`$key`: String): Number
        fun SetFloat(`$key`: String, `$value`: Number)
        fun GetFloat(`$key`: String, `$defaultValue`: Number): Number
        fun GetFloat(`$key`: String): Number
        fun SetString(`$key`: String, `$value`: String)
        fun GetString(`$key`: String, `$defaultValue`: String): String
        fun GetString(`$key`: String): String
        fun HasKey(`$key`: String): Boolean
        fun DeleteKey(`$key`: String)
        fun DeleteAll()
        fun Save()
    }
}

external open class PropertyAttribute : Attribute, _Attribute {
    open var `var`: Any
    open var order: Any
}

external open class ContextMenuItemAttribute : PropertyAttribute, _Attribute {
    constructor(`$name`: String, `$function`: String)
    constructor()
    open var name: String
    open var function: String
}

external open class InspectorNameAttribute : PropertyAttribute, _Attribute {
    constructor(`$displayName`: String)
    constructor()
    open var displayName: String
}

external open class TooltipAttribute : PropertyAttribute, _Attribute {
    constructor(`$tooltip`: String)
    constructor()
    open var tooltip: String
}

external open class SpaceAttribute : PropertyAttribute, _Attribute {
    constructor()
    constructor(`$height`: Number)
    open var height: Number
}

external open class HeaderAttribute : PropertyAttribute, _Attribute {
    constructor(`$header`: String)
    constructor()
    open var header: String
}

external open class RangeAttribute : PropertyAttribute, _Attribute {
    constructor(`$min`: Number, `$max`: Number)
    constructor()
    open var min: Number
    open var max: Number
}

external open class MinAttribute : PropertyAttribute, _Attribute {
    constructor(`$min`: Number)
    constructor()
    open var min: Number
}

external open class MultilineAttribute : PropertyAttribute, _Attribute {
    constructor()
    constructor(`$lines`: Number)
    open var lines: Number
}

external open class TextAreaAttribute : PropertyAttribute, _Attribute {
    constructor()
    constructor(`$minLines`: Number, `$maxLines`: Number)
    open var minLines: Number
    open var maxLines: Number
}

external open class ColorUsageAttribute : PropertyAttribute, _Attribute {
    constructor(`$showAlpha`: Boolean)
    constructor(`$showAlpha`: Boolean, `$hdr`: Boolean)
    constructor()
    open var showAlpha: Boolean
    open var hdr: Boolean
}

external open class GradientUsageAttribute : PropertyAttribute, _Attribute {
    constructor(`$hdr`: Boolean)
    constructor(`$hdr`: Boolean, `$colorSpace`: ColorSpace)
    constructor()
    open var hdr: Boolean
    open var colorSpace: ColorSpace
}

external open class DelayedAttribute : PropertyAttribute, _Attribute

external open class NonReorderableAttribute : PropertyAttribute, _Attribute

external open class Random : csharp.System.Object {
    open class State : ValueType

    companion object {
        fun InitState(`$seed`: Number)
        fun Range(`$minInclusive`: Number, `$maxInclusive`: Number): Number
        fun Range(`$minInclusive`: Number, `$maxExclusive`: Number): Number
        fun ColorHSV(): Color
        fun ColorHSV(`$hueMin`: Number, `$hueMax`: Number): Color
        fun ColorHSV(`$hueMin`: Number, `$hueMax`: Number, `$saturationMin`: Number, `$saturationMax`: Number): Color
        fun ColorHSV(`$hueMin`: Number, `$hueMax`: Number, `$saturationMin`: Number, `$saturationMax`: Number, `$valueMin`: Number, `$valueMax`: Number): Color
        fun ColorHSV(`$hueMin`: Number, `$hueMax`: Number, `$saturationMin`: Number, `$saturationMax`: Number, `$valueMin`: Number, `$valueMax`: Number, `$alphaMin`: Number, `$alphaMax`: Number): Color
    }
}

external open class IconAttribute : Attribute, _Attribute {
    constructor(`$path`: String)
    constructor()
    open var `var`: Any
    open val path: Any
}

external open class ResourcesAPI : csharp.System.Object

external open class Resources : csharp.System.Object {
    companion object {
        fun FindObjectsOfTypeAll(`$type`: Type): `Array$1`<Object>
        fun Load(`$path`: String): Object
        fun Load(`$path`: String, `$systemTypeInstance`: Type): Object
        fun LoadAsync(`$path`: String): ResourceRequest
        fun LoadAsync(`$path`: String, `$type`: Type): ResourceRequest
        fun LoadAll(`$path`: String, `$systemTypeInstance`: Type): `Array$1`<Object>
        fun LoadAll(`$path`: String): `Array$1`<Object>
        fun GetBuiltinResource(`$type`: Type, `$path`: String): Object
        fun UnloadAsset(`$assetToUnload`: Object)
        fun UnloadUnusedAssets(): AsyncOperation
        fun InstanceIDToObject(`$instanceID`: Number): Object
        fun InstanceIDToObjectList(`$instanceIDs`: `NativeArray$1`<Number>, `$objects`: `List$1`<Object>)
    }
}

external open class DisallowMultipleComponent : Attribute, _Attribute

external open class RequireComponent : Attribute, _Attribute {
    constructor(`$requiredComponent`: Type)
    constructor(`$requiredComponent`: Type, `$requiredComponent2`: Type)
    constructor(`$requiredComponent`: Type, `$requiredComponent2`: Type, `$requiredComponent3`: Type)
    constructor()
    open var m_Type0: Type
    open var m_Type1: Type
    open var m_Type2: Type
}

external open class AddComponentMenu : Attribute, _Attribute {
    constructor(`$menuName`: String)
    constructor(`$menuName`: String, `$order`: Number)
    constructor()
    open var `var`: Any
    open val componentMenu: Any
    open val componentOrder: Any
}

external open class CreateAssetMenuAttribute : Attribute, _Attribute {
    open var `var`: Any
    open var menuName: Any
    open var fileName: Any
    open var order: Any
}

external open class ContextMenu : Attribute, _Attribute {
    constructor(`$itemName`: String)
    constructor(`$itemName`: String, `$isValidateFunction`: Boolean)
    constructor(`$itemName`: String, `$isValidateFunction`: Boolean, `$priority`: Number)
    constructor()
    open var menuItem: String
    open var validate: Boolean
    open var priority: Number
}

external open class ExecuteInEditMode : Attribute, _Attribute

external open class ExecuteAlways : Attribute, _Attribute

external open class HideInInspector : Attribute, _Attribute

external open class HelpURLAttribute : Attribute, _Attribute {
    constructor(`$url`: String)
    constructor()
    open var `var`: Any
    open val URL: URL
}

external open class DefaultExecutionOrder : Attribute, _Attribute {
    constructor(`$order`: Number)
    constructor()
    open var `var`: Any
    open val order: Any
}

external open class AssemblyIsEditorAssembly : Attribute, _Attribute

external open class ExcludeFromPresetAttribute : Attribute, _Attribute

external open class CustomYieldInstruction : csharp.System.Object, IEnumerator {
    open var `var`: Any
    open val keepWaiting: Any
    open val Current: Any
    open fun MoveNext(): Boolean
    open fun Reset()
}

external open class ExcludeFromObjectFactoryAttribute : Attribute, _Attribute

external open class LayerMask : ValueType {
    open var `var`: Any
    open var value: Any

    companion object {
        fun op_Implicit(`$mask`: LayerMask): Number
        fun op_Implicit(`$intVal`: Number): LayerMask
        fun LayerToName(`$layer`: Number): String
        fun NameToLayer(`$layerName`: String): Number
        fun GetMask(vararg layerNames: String): Number
    }
}

external open class RangeInt : ValueType {
    constructor(`$start`: Number, `$length`: Number)
    constructor()
    open var start: Number
    open var length: Number
    open var `var`: Any
    open val end: Any
}

external enum class RuntimeInitializeLoadType {
    AfterSceneLoad /* = 0 */,
    BeforeSceneLoad /* = 1 */,
    AfterAssembliesLoaded /* = 2 */,
    BeforeSplashScreen /* = 3 */,
    SubsystemRegistration /* = 4 */
}

external open class RuntimeInitializeOnLoadMethodAttribute : PreserveAttribute, _Attribute {
    constructor()
    constructor(`$loadType`: RuntimeInitializeLoadType)
    open var `var`: Any
    open val loadType: Any
}

external open class SelectionBaseAttribute : Attribute, _Attribute

external open class StackTraceUtility : csharp.System.Object {
    companion object {
        fun ExtractStackTrace(): String
        fun ExtractStringFromException(`$exception`: Any): String
    }
}

external open class UnityException : SystemException, ISerializable, _Exception {
    constructor()
    constructor(`$message`: String)
    constructor(`$message`: String, `$innerException`: Exception)
}

external open class MissingComponentException : SystemException, ISerializable, _Exception {
    constructor()
    constructor(`$message`: String)
    constructor(`$message`: String, `$innerException`: Exception)
}

external open class UnassignedReferenceException : SystemException, ISerializable, _Exception {
    constructor()
    constructor(`$message`: String)
    constructor(`$message`: String, `$innerException`: Exception)
}

external open class MissingReferenceException : SystemException, ISerializable, _Exception {
    constructor()
    constructor(`$message`: String)
    constructor(`$message`: String, `$innerException`: Exception)
}

external open class TextAsset : Object {
    constructor()
    constructor(`$text`: String)
    override var `var`: Any
    open val text: Any
    open val dataSize: Any
}

external open class UnityAPICompatibilityVersionAttribute : Attribute, _Attribute {
    constructor(`$version`: String, `$checkOnlyUnityVersion`: Boolean)
    constructor(`$version`: String, `$configurationAssembliesHashes`: `Array$1`<String>)
    constructor()
    open var `var`: Any
    open val version: Any
}

external open class WaitForEndOfFrame : YieldInstruction

external open class WaitForFixedUpdate : YieldInstruction

external open class WaitForSeconds : YieldInstruction {
    constructor(`$seconds`: Number)
    constructor()
}

external open class WaitForSecondsRealtime : CustomYieldInstruction, IEnumerator {
    constructor(`$time`: Number)
    constructor()
    override var `var`: Any
    open var waitTime: Any
    override val keepWaiting: Any
}

external open class WaitUntil : CustomYieldInstruction, IEnumerator {
    constructor(`$predicate`: `Func$1`<Boolean>)
    constructor()
    override var `var`: Any
    override val keepWaiting: Any
}

external open class WaitWhile : CustomYieldInstruction, IEnumerator {
    constructor(`$predicate`: `Func$1`<Boolean>)
    constructor()
    override var `var`: Any
    override val keepWaiting: Any
}

external open class Security : csharp.System.Object

external open class Types : csharp.System.Object

external open class SerializeField : Attribute, _Attribute

external open class SerializeReference : Attribute, _Attribute

external open class PreferBinarySerialization : Attribute, _Attribute

external open class ComputeShader : Object {
    override var `var`: Any
    open val keywordSpace: Any
    open fun FindKernel(`$name`: String): Number
    open fun HasKernel(`$name`: String): Boolean
    open fun SetFloat(`$nameID`: Number, `$val`: Number)
    open fun SetInt(`$nameID`: Number, `$val`: Number)
    open fun SetVector(`$nameID`: Number, `$val`: Vector4)
    open fun SetMatrix(`$nameID`: Number, `$val`: Matrix4x4)
    open fun SetVectorArray(`$nameID`: Number, `$values`: `Array$1`<Vector4>)
    open fun SetMatrixArray(`$nameID`: Number, `$values`: `Array$1`<Matrix4x4>)
    open fun SetTexture(`$kernelIndex`: Number, `$nameID`: Number, `$texture`: Texture, `$mipLevel`: Number)
    open fun SetTextureFromGlobal(`$kernelIndex`: Number, `$nameID`: Number, `$globalTextureNameID`: Number)
    open fun SetBuffer(`$kernelIndex`: Number, `$nameID`: Number, `$buffer`: ComputeBuffer)
    open fun SetBuffer(`$kernelIndex`: Number, `$nameID`: Number, `$buffer`: GraphicsBuffer)
    open fun GetKernelThreadGroupSizes(`$kernelIndex`: Number, `$x`: `$Ref`<Number>, `$y`: `$Ref`<Number>, `$z`: `$Ref`<Number>)
    open fun Dispatch(`$kernelIndex`: Number, `$threadGroupsX`: Number, `$threadGroupsY`: Number, `$threadGroupsZ`: Number)
    open fun EnableKeyword(`$keyword`: String)
    open fun DisableKeyword(`$keyword`: String)
    open fun IsKeywordEnabled(`$keyword`: String): Boolean
    open fun EnableKeyword(`$keyword`: `$Ref`<LocalKeyword>)
    open fun DisableKeyword(`$keyword`: `$Ref`<LocalKeyword>)
    open fun SetKeyword(`$keyword`: `$Ref`<LocalKeyword>, `$value`: Boolean)
    open fun IsKeywordEnabled(`$keyword`: `$Ref`<LocalKeyword>): Boolean
    open fun IsSupported(`$kernelIndex`: Number): Boolean
    open fun SetFloat(`$name`: String, `$val`: Number)
    open fun SetInt(`$name`: String, `$val`: Number)
    open fun SetVector(`$name`: String, `$val`: Vector4)
    open fun SetMatrix(`$name`: String, `$val`: Matrix4x4)
    open fun SetVectorArray(`$name`: String, `$values`: `Array$1`<Vector4>)
    open fun SetMatrixArray(`$name`: String, `$values`: `Array$1`<Matrix4x4>)
    open fun SetFloats(`$name`: String, vararg values: Number)
    open fun SetFloats(`$nameID`: Number, vararg values: Number)
    open fun SetInts(`$name`: String, vararg values: Number)
    open fun SetInts(`$nameID`: Number, vararg values: Number)
    open fun SetBool(`$name`: String, `$val`: Boolean)
    open fun SetBool(`$nameID`: Number, `$val`: Boolean)
    open fun SetTexture(`$kernelIndex`: Number, `$nameID`: Number, `$texture`: Texture)
    open fun SetTexture(`$kernelIndex`: Number, `$name`: String, `$texture`: Texture)
    open fun SetTexture(`$kernelIndex`: Number, `$name`: String, `$texture`: Texture, `$mipLevel`: Number)
    open fun SetTexture(`$kernelIndex`: Number, `$nameID`: Number, `$texture`: RenderTexture, `$mipLevel`: Number, `$element`: RenderTextureSubElement)
    open fun SetTexture(`$kernelIndex`: Number, `$name`: String, `$texture`: RenderTexture, `$mipLevel`: Number, `$element`: RenderTextureSubElement)
    open fun SetTextureFromGlobal(`$kernelIndex`: Number, `$name`: String, `$globalTextureName`: String)
    open fun SetBuffer(`$kernelIndex`: Number, `$name`: String, `$buffer`: ComputeBuffer)
    open fun SetBuffer(`$kernelIndex`: Number, `$name`: String, `$buffer`: GraphicsBuffer)
    open fun SetConstantBuffer(`$nameID`: Number, `$buffer`: ComputeBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$name`: String, `$buffer`: ComputeBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$nameID`: Number, `$buffer`: GraphicsBuffer, `$offset`: Number, `$size`: Number)
    open fun SetConstantBuffer(`$name`: String, `$buffer`: GraphicsBuffer, `$offset`: Number, `$size`: Number)
    open fun DispatchIndirect(`$kernelIndex`: Number, `$argsBuffer`: ComputeBuffer, `$argsOffset`: Number)
    open fun DispatchIndirect(`$kernelIndex`: Number, `$argsBuffer`: ComputeBuffer)
    open fun DispatchIndirect(`$kernelIndex`: Number, `$argsBuffer`: GraphicsBuffer, `$argsOffset`: Number)
    open fun DispatchIndirect(`$kernelIndex`: Number, `$argsBuffer`: GraphicsBuffer)
}

external open class ShaderVariantCollection : Object {
    override var `var`: Any
    open val shaderCount: Any
    open val variantCount: Any
    open val isWarmedUp: Any
    open fun Clear()
    open fun WarmUp()
    open fun Add(`$variant`: ShaderVariant): Boolean
    open fun Remove(`$variant`: ShaderVariant): Boolean
    open fun Contains(`$variant`: ShaderVariant): Boolean
    open class ShaderVariant : ValueType {
        constructor(`$shader`: Shader, `$passType`: PassType, vararg keywords: String)
        constructor()
        open var shader: Shader
        open var passType: PassType
        open var keywords: `Array$1`<String>
    }
}

external enum class SnapAxis {
    None /* = 0 */,
    X /* = 1 */,
    Y /* = 2 */,
    Z /* = 4 */,
    All /* = 7 */
}

external open class Snapping : csharp.System.Object {
    companion object {
        fun Snap(`$val`: Number, `$snap`: Number): Number
        fun Snap(`$val`: Vector2, `$snap`: Vector2): Vector2
        fun Snap(`$val`: Vector3, `$snap`: Vector3, `$axis`: SnapAxis = definedExternally): Vector3
    }
}

external open class StaticBatchingUtility : csharp.System.Object {
    companion object {
        fun Combine(`$staticBatchRoot`: GameObject)
        fun Combine(`$gos`: `Array$1`<GameObject>, `$staticBatchRoot`: GameObject)
    }
}

external enum class BatteryStatus {
    Unknown /* = 0 */,
    Charging /* = 1 */,
    Discharging /* = 2 */,
    NotCharging /* = 3 */,
    Full /* = 4 */
}

external enum class OperatingSystemFamily {
    Other /* = 0 */,
    MacOSX /* = 1 */,
    Windows /* = 2 */,
    Linux /* = 3 */
}

external enum class DeviceType {
    Unknown /* = 0 */,
    Handheld /* = 1 */,
    Console /* = 2 */,
    Desktop /* = 3 */
}

external open class SystemInfo : csharp.System.Object {
    companion object {
        var unsupportedIdentifier: String
        fun SupportsRenderTextureFormat(`$format`: RenderTextureFormat): Boolean
        fun SupportsBlendingOnRenderTextureFormat(`$format`: RenderTextureFormat): Boolean
        fun SupportsRandomWriteOnRenderTextureFormat(`$format`: RenderTextureFormat): Boolean
        fun SupportsTextureFormat(`$format`: TextureFormat): Boolean
        fun SupportsVertexAttributeFormat(`$format`: VertexAttributeFormat, `$dimension`: Number): Boolean
        fun IsFormatSupported(`$format`: GraphicsFormat, `$usage`: FormatUsage): Boolean
        fun GetCompatibleFormat(`$format`: GraphicsFormat, `$usage`: FormatUsage): GraphicsFormat
        fun GetGraphicsFormat(`$format`: DefaultFormat): GraphicsFormat
        fun GetRenderTextureSupportedMSAASampleCount(`$desc`: RenderTextureDescriptor): Number
    }
}

external open class UnityEventQueueSystem : csharp.System.Object {
    companion object {
        fun GenerateEventIdForPayload(`$eventPayloadName`: String): String
        fun GetGlobalEventQueue(): IntPtr
    }
}

external open class Pose : ValueType, `IEquatable$1`<Pose> {
    constructor(`$position`: Vector3, `$rotation`: Quaternion)
    constructor()
    open var position: Vector3
    open var rotation: Quaternion
    override fun ToString(): String
    open fun ToString(`$format`: String): String
    open fun GetTransformedBy(`$lhs`: Pose): Pose
    open fun GetTransformedBy(`$lhs`: Transform): Pose
    override fun Equals(`$obj`: Any): Boolean
    open fun Equals(`$other`: Pose): Boolean

    companion object {
        fun op_Equality(`$a`: Pose, `$b`: Pose): Boolean
        fun op_Inequality(`$a`: Pose, `$b`: Pose): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class FrameDebugger : csharp.System.Object

external enum class DrivenTransformProperties {
    None /* = 0 */,
    All /* = -1 */,
    AnchoredPositionX /* = 2 */,
    AnchoredPositionY /* = 4 */,
    AnchoredPositionZ /* = 8 */,
    Rotation /* = 16 */,
    ScaleX /* = 32 */,
    ScaleY /* = 64 */,
    ScaleZ /* = 128 */,
    AnchorMinX /* = 256 */,
    AnchorMinY /* = 512 */,
    AnchorMaxX /* = 1024 */,
    AnchorMaxY /* = 2048 */,
    SizeDeltaX /* = 4096 */,
    SizeDeltaY /* = 8192 */,
    PivotX /* = 16384 */,
    PivotY /* = 32768 */,
    AnchoredPosition /* = 6 */,
    AnchoredPosition3D /* = 14 */,
    Scale /* = 224 */,
    AnchorMin /* = 768 */,
    AnchorMax /* = 3072 */,
    Anchors /* = 3840 */,
    SizeDelta /* = 12288 */,
    Pivot /* = 49152 */
}

external open class DrivenRectTransformTracker : ValueType {
    open fun Add(`$driver`: Object, `$rectTransform`: RectTransform, `$drivenProperties`: DrivenTransformProperties)
    open fun Clear()

    companion object {
        fun StopRecordingUndo()
        fun StartRecordingUndo()
    }
}

external open class RectTransform : Transform, IEnumerable {
    override var `var`: Any
    open val rect: Any
    open val drivenByObject: Any
    open fun ForceUpdateRectTransforms()
    open fun GetLocalCorners(`$fourCornersArray`: `Array$1`<Vector3>)
    open fun GetWorldCorners(`$fourCornersArray`: `Array$1`<Vector3>)
    //open fun SetInsetAndSizeFromParentEdge(`$edge`: Edge, `$inset`: Number, `$size`: Number)
    //open fun SetSizeWithCurrentAnchors(`$axis`: Axis, `$size`: Number)
    interface ReapplyDrivenProperties {
        @nativeInvoke
        operator fun invoke(driven: RectTransform)
        var Invoke: ((driven: RectTransform) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        fun add_reapplyDrivenProperties(`$value`: ReapplyDrivenProperties)
        fun remove_reapplyDrivenProperties(`$value`: ReapplyDrivenProperties)
    }
}

external enum class SpriteDrawMode {
    Simple /* = 0 */,
    Sliced /* = 1 */,
    Tiled /* = 2 */
}

external enum class SpriteTileMode {
    Continuous /* = 0 */,
    Adaptive /* = 1 */
}

external enum class SpriteMaskInteraction {
    None /* = 0 */,
    VisibleInsideMask /* = 1 */,
    VisibleOutsideMask /* = 2 */
}

external open class SpriteRenderer : Renderer {
    override var `var`: Any
    open var sprite: Any
    open var drawMode: Any
    open var adaptiveModeThreshold: Any
    open var tileMode: Any
    open var color: Any
    open var maskInteraction: Any
    open var flipX: Any
    open var flipY: Any
    open var spriteSortPoint: Any
    open fun RegisterSpriteChangeCallback(`$callback`: `UnityAction$1`<SpriteRenderer>)
    open fun UnregisterSpriteChangeCallback(`$callback`: `UnityAction$1`<SpriteRenderer>)
}

external open class Sprite : Object {
    override var `var`: Any
    open val bounds: Any
    open val rect: Any
    open val pixelsPerUnit: Any
    open val spriteAtlasTextureScale: Any
    open val isUsingPlaceholder: Any
    open val packed: Any
    open val packingMode: Any
    open val packingRotation: Any
    open val textureRect: Any
    open fun GetPhysicsShapeCount(): Number
    open fun GetPhysicsShapePointCount(`$shapeIdx`: Number): Number
    open fun GetPhysicsShape(`$shapeIdx`: Number, `$physicsShape`: `List$1`<Vector2>): Number
    open fun OverridePhysicsShape(`$physicsShapes`: `IList$1`<`Array$1`<Vector2>>)
    open fun OverrideGeometry(`$vertices`: `Array$1`<Vector2>, `$triangles`: `Array$1`<Number>)

    companion object {
        fun Create(`$texture`: Texture2D, `$rect`: Rect, `$pivot`: Vector2, `$pixelsPerUnit`: Number, `$extrude`: Number, `$meshType`: SpriteMeshType, `$border`: Vector4, `$generateFallbackPhysicsShape`: Boolean): Sprite
        fun Create(`$texture`: Texture2D, `$rect`: Rect, `$pivot`: Vector2, `$pixelsPerUnit`: Number, `$extrude`: Number, `$meshType`: SpriteMeshType, `$border`: Vector4): Sprite
        fun Create(`$texture`: Texture2D, `$rect`: Rect, `$pivot`: Vector2, `$pixelsPerUnit`: Number, `$extrude`: Number, `$meshType`: SpriteMeshType): Sprite
        fun Create(`$texture`: Texture2D, `$rect`: Rect, `$pivot`: Vector2, `$pixelsPerUnit`: Number, `$extrude`: Number): Sprite
        fun Create(`$texture`: Texture2D, `$rect`: Rect, `$pivot`: Vector2, `$pixelsPerUnit`: Number): Sprite
        fun Create(`$texture`: Texture2D, `$rect`: Rect, `$pivot`: Vector2): Sprite
    }
}

external enum class SpriteSortPoint {
    Center /* = 0 */,
    Pivot /* = 1 */
}

external enum class SpriteMeshType {
    FullRect /* = 0 */,
    Tight /* = 1 */
}

external enum class SpriteAlignment {
    Center /* = 0 */,
    TopLeft /* = 1 */,
    TopCenter /* = 2 */,
    TopRight /* = 3 */,
    LeftCenter /* = 4 */,
    RightCenter /* = 5 */,
    BottomLeft /* = 6 */,
    BottomCenter /* = 7 */,
    BottomRight /* = 8 */,
    Custom /* = 9 */
}

external enum class SpritePackingMode {
    Tight /* = 0 */,
    Rectangle /* = 1 */
}

external enum class SpritePackingRotation {
    None /* = 0 */,
    FlipHorizontal /* = 1 */,
    FlipVertical /* = 2 */,
    Rotate180 /* = 3 */,
    Any /* = 15 */
}

external open class SecondarySpriteTexture : ValueType {
    open var name: String
    open var texture: Texture2D
}

external open class Social : csharp.System.Object {
    companion object {
        fun LoadUsers(`$userIDs`: `Array$1`<String>, `$callback`: `Action$1`<`Array$1`<IUserProfile>>)
        fun ReportProgress(`$achievementID`: String, `$progress`: Number, `$callback`: `Action$1`<Boolean>)
        fun LoadAchievementDescriptions(`$callback`: `Action$1`<`Array$1`<IAchievementDescription>>)
        fun LoadAchievements(`$callback`: `Action$1`<`Array$1`<IAchievement>>)
        fun ReportScore(`$score`: Any, `$board`: String, `$callback`: `Action$1`<Boolean>)
        fun LoadScores(`$leaderboardID`: String, `$callback`: `Action$1`<`Array$1`<IScore>>)
        fun CreateLeaderboard(): ILeaderboard
        fun CreateAchievement(): IAchievement
        fun ShowAchievementsUI()
        fun ShowLeaderboardUI()
    }
}

external open class Grid : GridLayout {
    override var `var`: Any
    //open var cellLayout: Any
    //open var cellSwizzle: Any
    open fun GetCellCenterLocal(`$position`: Vector3Int): Vector3
    open fun GetCellCenterWorld(`$position`: Vector3Int): Vector3

    companion object {
        //fun Swizzle(`$swizzle`: CellSwizzle, `$position`: Vector3): Vector3
        //fun InverseSwizzle(`$swizzle`: CellSwizzle, `$position`: Vector3): Vector3
    }
}

external open class GridLayout : Behaviour {
    override var `var`: Any
    open val cellLayout: Any
    open val cellSwizzle: Any
    open fun GetBoundsLocal(`$cellPosition`: Vector3Int): Bounds
    open fun GetBoundsLocal(`$origin`: Vector3, `$size`: Vector3): Bounds
    open fun CellToLocal(`$cellPosition`: Vector3Int): Vector3
    open fun LocalToCell(`$localPosition`: Vector3): Vector3Int
    open fun CellToLocalInterpolated(`$cellPosition`: Vector3): Vector3
    open fun LocalToCellInterpolated(`$localPosition`: Vector3): Vector3
    open fun CellToWorld(`$cellPosition`: Vector3Int): Vector3
    open fun WorldToCell(`$worldPosition`: Vector3): Vector3Int
    open fun LocalToWorld(`$localPosition`: Vector3): Vector3
    open fun WorldToLocal(`$worldPosition`: Vector3): Vector3
    open fun GetLayoutCellCenter(): Vector3
}

external enum class EventType {
    MouseDown /* = 0 */,
    MouseUp /* = 1 */,
    MouseMove /* = 2 */,
    MouseDrag /* = 3 */,
    KeyDown /* = 4 */,
    KeyUp /* = 5 */,
    ScrollWheel /* = 6 */,
    Repaint /* = 7 */,
    Layout /* = 8 */,
    DragUpdated /* = 9 */,
    DragPerform /* = 10 */,
    DragExited /* = 15 */,
    Ignore /* = 11 */,
    Used /* = 12 */,
    ValidateCommand /* = 13 */,
    ExecuteCommand /* = 14 */,
    ContextClick /* = 16 */,
    MouseEnterWindow /* = 20 */,
    MouseLeaveWindow /* = 21 */,
    TouchDown /* = 30 */,
    TouchUp /* = 31 */,
    TouchMove /* = 32 */,
    TouchEnter /* = 33 */,
    TouchLeave /* = 34 */,
    TouchStationary /* = 35 */,
    mouseDown /* = 0 */,
    mouseUp /* = 1 */,
    mouseMove /* = 2 */,
    mouseDrag /* = 3 */,
    keyDown /* = 4 */,
    keyUp /* = 5 */,
    scrollWheel /* = 6 */,
    repaint /* = 7 */,
    layout /* = 8 */,
    dragUpdated /* = 9 */,
    dragPerform /* = 10 */,
    ignore /* = 11 */,
    used /* = 12 */
}

external enum class PointerType {
    Mouse /* = 0 */,
    Touch /* = 1 */,
    Pen /* = 2 */
}

external enum class EventModifiers {
    None /* = 0 */,
    Shift /* = 1 */,
    Control /* = 2 */,
    Alt /* = 4 */,
    Command /* = 8 */,
    Numeric /* = 16 */,
    CapsLock /* = 32 */,
    FunctionKey /* = 64 */
}

external open class GUI : csharp.System.Object {
    interface WindowFunction {
        @nativeInvoke
        operator fun invoke(id: Number)
        var Invoke: ((id: Number) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
    open class Scope : csharp.System.Object, IDisposable {
        open fun Dispose()
    }

    companion object {
        fun SetNextControlName(`$name`: String)
        fun GetNameOfFocusedControl(): String
        fun FocusControl(`$name`: String)
        fun DragWindow(`$position`: Rect)
        fun BringWindowToFront(`$windowID`: Number)
        fun BringWindowToBack(`$windowID`: Number)
        fun FocusWindow(`$windowID`: Number)
        fun UnfocusWindow()
        fun Label(`$position`: Rect, `$text`: String)
        fun Label(`$position`: Rect, `$image`: Texture)
        fun Label(`$position`: Rect, `$content`: GUIContent)
        fun Label(`$position`: Rect, `$text`: String, `$style`: GUIStyle)
        fun Label(`$position`: Rect, `$image`: Texture, `$style`: GUIStyle)
        fun Label(`$position`: Rect, `$content`: GUIContent, `$style`: GUIStyle)
        fun DrawTexture(`$position`: Rect, `$image`: Texture)
        fun DrawTexture(`$position`: Rect, `$image`: Texture, `$scaleMode`: ScaleMode)
        fun DrawTexture(`$position`: Rect, `$image`: Texture, `$scaleMode`: ScaleMode, `$alphaBlend`: Boolean)
        fun DrawTexture(`$position`: Rect, `$image`: Texture, `$scaleMode`: ScaleMode, `$alphaBlend`: Boolean, `$imageAspect`: Number)
        fun DrawTexture(`$position`: Rect, `$image`: Texture, `$scaleMode`: ScaleMode, `$alphaBlend`: Boolean, `$imageAspect`: Number, `$color`: Color, `$borderWidth`: Number, `$borderRadius`: Number)
        fun DrawTexture(`$position`: Rect, `$image`: Texture, `$scaleMode`: ScaleMode, `$alphaBlend`: Boolean, `$imageAspect`: Number, `$color`: Color, `$borderWidths`: Vector4, `$borderRadius`: Number)
        fun DrawTexture(`$position`: Rect, `$image`: Texture, `$scaleMode`: ScaleMode, `$alphaBlend`: Boolean, `$imageAspect`: Number, `$color`: Color, `$borderWidths`: Vector4, `$borderRadiuses`: Vector4)
        fun DrawTextureWithTexCoords(`$position`: Rect, `$image`: Texture, `$texCoords`: Rect)
        fun DrawTextureWithTexCoords(`$position`: Rect, `$image`: Texture, `$texCoords`: Rect, `$alphaBlend`: Boolean)
        fun Box(`$position`: Rect, `$text`: String)
        fun Box(`$position`: Rect, `$image`: Texture)
        fun Box(`$position`: Rect, `$content`: GUIContent)
        fun Box(`$position`: Rect, `$text`: String, `$style`: GUIStyle)
        fun Box(`$position`: Rect, `$image`: Texture, `$style`: GUIStyle)
        fun Box(`$position`: Rect, `$content`: GUIContent, `$style`: GUIStyle)
        fun Button(`$position`: Rect, `$text`: String): Boolean
        fun Button(`$position`: Rect, `$image`: Texture): Boolean
        fun Button(`$position`: Rect, `$content`: GUIContent): Boolean
        fun Button(`$position`: Rect, `$text`: String, `$style`: GUIStyle): Boolean
        fun Button(`$position`: Rect, `$image`: Texture, `$style`: GUIStyle): Boolean
        fun Button(`$position`: Rect, `$content`: GUIContent, `$style`: GUIStyle): Boolean
        fun RepeatButton(`$position`: Rect, `$text`: String): Boolean
        fun RepeatButton(`$position`: Rect, `$image`: Texture): Boolean
        fun RepeatButton(`$position`: Rect, `$content`: GUIContent): Boolean
        fun RepeatButton(`$position`: Rect, `$text`: String, `$style`: GUIStyle): Boolean
        fun RepeatButton(`$position`: Rect, `$image`: Texture, `$style`: GUIStyle): Boolean
        fun RepeatButton(`$position`: Rect, `$content`: GUIContent, `$style`: GUIStyle): Boolean
        fun TextField(`$position`: Rect, `$text`: String): String
        fun TextField(`$position`: Rect, `$text`: String, `$maxLength`: Number): String
        fun TextField(`$position`: Rect, `$text`: String, `$style`: GUIStyle): String
        fun TextField(`$position`: Rect, `$text`: String, `$maxLength`: Number, `$style`: GUIStyle): String
        fun PasswordField(`$position`: Rect, `$password`: String, `$maskChar`: Number): String
        fun PasswordField(`$position`: Rect, `$password`: String, `$maskChar`: Number, `$maxLength`: Number): String
        fun PasswordField(`$position`: Rect, `$password`: String, `$maskChar`: Number, `$style`: GUIStyle): String
        fun PasswordField(`$position`: Rect, `$password`: String, `$maskChar`: Number, `$maxLength`: Number, `$style`: GUIStyle): String
        fun TextArea(`$position`: Rect, `$text`: String): String
        fun TextArea(`$position`: Rect, `$text`: String, `$maxLength`: Number): String
        fun TextArea(`$position`: Rect, `$text`: String, `$style`: GUIStyle): String
        fun TextArea(`$position`: Rect, `$text`: String, `$maxLength`: Number, `$style`: GUIStyle): String
        fun Toggle(`$position`: Rect, `$value`: Boolean, `$text`: String): Boolean
        fun Toggle(`$position`: Rect, `$value`: Boolean, `$image`: Texture): Boolean
        fun Toggle(`$position`: Rect, `$value`: Boolean, `$content`: GUIContent): Boolean
        fun Toggle(`$position`: Rect, `$value`: Boolean, `$text`: String, `$style`: GUIStyle): Boolean
        fun Toggle(`$position`: Rect, `$value`: Boolean, `$image`: Texture, `$style`: GUIStyle): Boolean
        fun Toggle(`$position`: Rect, `$value`: Boolean, `$content`: GUIContent, `$style`: GUIStyle): Boolean
        fun Toggle(`$position`: Rect, `$id`: Number, `$value`: Boolean, `$content`: GUIContent, `$style`: GUIStyle): Boolean
        fun Toolbar(`$position`: Rect, `$selected`: Number, `$texts`: `Array$1`<String>): Number
        fun Toolbar(`$position`: Rect, `$selected`: Number, `$images`: `Array$1`<Texture>): Number
        fun Toolbar(`$position`: Rect, `$selected`: Number, `$contents`: `Array$1`<GUIContent>): Number
        fun Toolbar(`$position`: Rect, `$selected`: Number, `$texts`: `Array$1`<String>, `$style`: GUIStyle): Number
        fun Toolbar(`$position`: Rect, `$selected`: Number, `$images`: `Array$1`<Texture>, `$style`: GUIStyle): Number
        fun Toolbar(`$position`: Rect, `$selected`: Number, `$contents`: `Array$1`<GUIContent>, `$style`: GUIStyle): Number
        //fun Toolbar(`$position`: Rect, `$selected`: Number, `$contents`: `Array$1`<GUIContent>, `$style`: GUIStyle, `$buttonSize`: ToolbarButtonSize): Number
        fun SelectionGrid(`$position`: Rect, `$selected`: Number, `$texts`: `Array$1`<String>, `$xCount`: Number): Number
        fun SelectionGrid(`$position`: Rect, `$selected`: Number, `$images`: `Array$1`<Texture>, `$xCount`: Number): Number
        fun SelectionGrid(`$position`: Rect, `$selected`: Number, `$content`: `Array$1`<GUIContent>, `$xCount`: Number): Number
        fun SelectionGrid(`$position`: Rect, `$selected`: Number, `$texts`: `Array$1`<String>, `$xCount`: Number, `$style`: GUIStyle): Number
        fun SelectionGrid(`$position`: Rect, `$selected`: Number, `$images`: `Array$1`<Texture>, `$xCount`: Number, `$style`: GUIStyle): Number
        fun SelectionGrid(`$position`: Rect, `$selected`: Number, `$contents`: `Array$1`<GUIContent>, `$xCount`: Number, `$style`: GUIStyle): Number
        fun HorizontalSlider(`$position`: Rect, `$value`: Number, `$leftValue`: Number, `$rightValue`: Number): Number
        fun HorizontalSlider(`$position`: Rect, `$value`: Number, `$leftValue`: Number, `$rightValue`: Number, `$slider`: GUIStyle, `$thumb`: GUIStyle): Number
        fun HorizontalSlider(`$position`: Rect, `$value`: Number, `$leftValue`: Number, `$rightValue`: Number, `$slider`: GUIStyle, `$thumb`: GUIStyle, `$thumbExtent`: GUIStyle): Number
        fun VerticalSlider(`$position`: Rect, `$value`: Number, `$topValue`: Number, `$bottomValue`: Number): Number
        fun VerticalSlider(`$position`: Rect, `$value`: Number, `$topValue`: Number, `$bottomValue`: Number, `$slider`: GUIStyle, `$thumb`: GUIStyle): Number
        fun VerticalSlider(`$position`: Rect, `$value`: Number, `$topValue`: Number, `$bottomValue`: Number, `$slider`: GUIStyle, `$thumb`: GUIStyle, `$thumbExtent`: GUIStyle): Number
        fun Slider(`$position`: Rect, `$value`: Number, `$size`: Number, `$start`: Number, `$end`: Number, `$slider`: GUIStyle, `$thumb`: GUIStyle, `$horiz`: Boolean, `$id`: Number, `$thumbExtent`: GUIStyle = definedExternally): Number
        fun HorizontalScrollbar(`$position`: Rect, `$value`: Number, `$size`: Number, `$leftValue`: Number, `$rightValue`: Number): Number
        fun HorizontalScrollbar(`$position`: Rect, `$value`: Number, `$size`: Number, `$leftValue`: Number, `$rightValue`: Number, `$style`: GUIStyle): Number
        fun VerticalScrollbar(`$position`: Rect, `$value`: Number, `$size`: Number, `$topValue`: Number, `$bottomValue`: Number): Number
        fun VerticalScrollbar(`$position`: Rect, `$value`: Number, `$size`: Number, `$topValue`: Number, `$bottomValue`: Number, `$style`: GUIStyle): Number
        fun BeginClip(`$position`: Rect, `$scrollOffset`: Vector2, `$renderOffset`: Vector2, `$resetOffset`: Boolean)
        fun BeginGroup(`$position`: Rect)
        fun BeginGroup(`$position`: Rect, `$text`: String)
        fun BeginGroup(`$position`: Rect, `$image`: Texture)
        fun BeginGroup(`$position`: Rect, `$content`: GUIContent)
        fun BeginGroup(`$position`: Rect, `$style`: GUIStyle)
        fun BeginGroup(`$position`: Rect, `$text`: String, `$style`: GUIStyle)
        fun BeginGroup(`$position`: Rect, `$image`: Texture, `$style`: GUIStyle)
        fun BeginGroup(`$position`: Rect, `$content`: GUIContent, `$style`: GUIStyle)
        fun EndGroup()
        fun BeginClip(`$position`: Rect)
        fun EndClip()
        fun BeginScrollView(`$position`: Rect, `$scrollPosition`: Vector2, `$viewRect`: Rect): Vector2
        fun BeginScrollView(`$position`: Rect, `$scrollPosition`: Vector2, `$viewRect`: Rect, `$alwaysShowHorizontal`: Boolean, `$alwaysShowVertical`: Boolean): Vector2
        fun BeginScrollView(`$position`: Rect, `$scrollPosition`: Vector2, `$viewRect`: Rect, `$horizontalScrollbar`: GUIStyle, `$verticalScrollbar`: GUIStyle): Vector2
        fun BeginScrollView(`$position`: Rect, `$scrollPosition`: Vector2, `$viewRect`: Rect, `$alwaysShowHorizontal`: Boolean, `$alwaysShowVertical`: Boolean, `$horizontalScrollbar`: GUIStyle, `$verticalScrollbar`: GUIStyle): Vector2
        fun EndScrollView()
        fun EndScrollView(`$handleScrollWheel`: Boolean)
        fun ScrollTo(`$position`: Rect)
        fun ScrollTowards(`$position`: Rect, `$maxDelta`: Number): Boolean
        fun Window(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$text`: String): Rect
        fun Window(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$image`: Texture): Rect
        fun Window(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$content`: GUIContent): Rect
        fun Window(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$text`: String, `$style`: GUIStyle): Rect
        fun Window(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$image`: Texture, `$style`: GUIStyle): Rect
        fun Window(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$title`: GUIContent, `$style`: GUIStyle): Rect
        fun ModalWindow(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$text`: String): Rect
        fun ModalWindow(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$image`: Texture): Rect
        fun ModalWindow(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$content`: GUIContent): Rect
        fun ModalWindow(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$text`: String, `$style`: GUIStyle): Rect
        fun ModalWindow(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$image`: Texture, `$style`: GUIStyle): Rect
        fun ModalWindow(`$id`: Number, `$clientRect`: Rect, `$func`: WindowFunction, `$content`: GUIContent, `$style`: GUIStyle): Rect
        fun DragWindow()
    }
}

external open class GUISkin : ScriptableObject {
    override var `var`: Any
    open var font: Any
    open var box: Any
    open var label: Any
    open var textField: Any
    open var textArea: Any
    open var button: Any
    open var toggle: Any
    open var window: Any
    open var horizontalSlider: Any
    open var horizontalSliderThumb: Any
    open var verticalSlider: Any
    open var verticalSliderThumb: Any
    open var horizontalScrollbar: Any
    open var horizontalScrollbarThumb: Any
    open var horizontalScrollbarLeftButton: Any
    open var horizontalScrollbarRightButton: Any
    open var verticalScrollbar: Any
    open var verticalScrollbarThumb: Any
    open var verticalScrollbarUpButton: Any
    open var verticalScrollbarDownButton: Any
    open var scrollView: Any
    open val settings: Any
    open fun GetStyle(`$styleName`: String): GUIStyle
    open fun FindStyle(`$styleName`: String): GUIStyle
    open fun GetEnumerator(): IEnumerator
}

external open class GUIContent : csharp.System.Object {
    constructor()
    constructor(`$text`: String)
    constructor(`$image`: Texture)
    constructor(`$text`: String, `$image`: Texture)
    constructor(`$text`: String, `$tooltip`: String)
    constructor(`$image`: Texture, `$tooltip`: String)
    constructor(`$text`: String, `$image`: Texture, `$tooltip`: String)
    constructor(`$src`: GUIContent)
    open var `var`: Any
    open var text: Any
    open var image: Any
    open var tooltip: Any

    companion object {
        var none: GUIContent
    }
}

external open class GUIStyle : csharp.System.Object {
    constructor()
    constructor(`$other`: GUIStyle)
    open var `var`: Any
    open var font: Any
    open var imagePosition: Any
    open var alignment: Any
    open var wordWrap: Any
    open var clipping: Any
    open var fixedWidth: Any
    open var fixedHeight: Any
    open var stretchWidth: Any
    open var stretchHeight: Any
    open var fontSize: Any
    open var fontStyle: Any
    open var richText: Any
    open var name: Any
    open var normal: Any
    open var hover: Any
    open var active: Any
    open var onNormal: Any
    open var onHover: Any
    open var onActive: Any
    open var focused: Any
    open var onFocused: Any
    open var border: Any
    open var margin: Any
    open var padding: Any
    open var overflow: Any
    open val lineHeight: Any
    open val isHeightDependantOnWidth: Any
    open fun Draw(`$position`: Rect, `$isHover`: Boolean, `$isActive`: Boolean, `$on`: Boolean, `$hasKeyboardFocus`: Boolean)
    open fun Draw(`$position`: Rect, `$text`: String, `$isHover`: Boolean, `$isActive`: Boolean, `$on`: Boolean, `$hasKeyboardFocus`: Boolean)
    open fun Draw(`$position`: Rect, `$image`: Texture, `$isHover`: Boolean, `$isActive`: Boolean, `$on`: Boolean, `$hasKeyboardFocus`: Boolean)
    open fun Draw(`$position`: Rect, `$content`: GUIContent, `$isHover`: Boolean, `$isActive`: Boolean, `$on`: Boolean, `$hasKeyboardFocus`: Boolean)
    open fun Draw(`$position`: Rect, `$content`: GUIContent, `$controlID`: Number)
    open fun Draw(`$position`: Rect, `$content`: GUIContent, `$controlID`: Number, `$on`: Boolean)
    open fun Draw(`$position`: Rect, `$content`: GUIContent, `$controlID`: Number, `$on`: Boolean, `$hover`: Boolean)
    open fun DrawCursor(`$position`: Rect, `$content`: GUIContent, `$controlID`: Number, `$character`: Number)
    open fun DrawWithTextSelection(`$position`: Rect, `$content`: GUIContent, `$controlID`: Number, `$firstSelectedCharacter`: Number, `$lastSelectedCharacter`: Number)
    open fun GetCursorPixelPosition(`$position`: Rect, `$content`: GUIContent, `$cursorStringIndex`: Number): Vector2
    open fun GetCursorStringIndex(`$position`: Rect, `$content`: GUIContent, `$cursorPixelPosition`: Vector2): Number
    open fun CalcSize(`$content`: GUIContent): Vector2
    open fun CalcScreenSize(`$contentSize`: Vector2): Vector2
    open fun CalcHeight(`$content`: GUIContent, `$width`: Number): Number
    open fun CalcMinMaxWidth(`$content`: GUIContent, `$minWidth`: `$Ref`<Number>, `$maxWidth`: `$Ref`<Number>)

    companion object {
        fun op_Implicit(`$str`: String): GUIStyle
    }
}

external enum class ScaleMode {
    StretchToFill /* = 0 */,
    ScaleAndCrop /* = 1 */,
    ScaleToFit /* = 2 */
}

external enum class FocusType {
    Native /* = 0 */,
    Keyboard /* = 1 */,
    Passive /* = 2 */
}

external open class GUILayout : csharp.System.Object {
    companion object {
        fun Label(`$image`: Texture, vararg options: GUILayoutOption)
        fun Label(`$text`: String, vararg options: GUILayoutOption)
        fun Label(`$content`: GUIContent, vararg options: GUILayoutOption)
        fun Label(`$image`: Texture, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun Label(`$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun Label(`$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun Box(`$image`: Texture, vararg options: GUILayoutOption)
        fun Box(`$text`: String, vararg options: GUILayoutOption)
        fun Box(`$content`: GUIContent, vararg options: GUILayoutOption)
        fun Box(`$image`: Texture, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun Box(`$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun Box(`$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun Button(`$image`: Texture, vararg options: GUILayoutOption): Boolean
        fun Button(`$text`: String, vararg options: GUILayoutOption): Boolean
        fun Button(`$content`: GUIContent, vararg options: GUILayoutOption): Boolean
        fun Button(`$image`: Texture, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun Button(`$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun Button(`$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun RepeatButton(`$image`: Texture, vararg options: GUILayoutOption): Boolean
        fun RepeatButton(`$text`: String, vararg options: GUILayoutOption): Boolean
        fun RepeatButton(`$content`: GUIContent, vararg options: GUILayoutOption): Boolean
        fun RepeatButton(`$image`: Texture, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun RepeatButton(`$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun RepeatButton(`$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun TextField(`$text`: String, vararg options: GUILayoutOption): String
        fun TextField(`$text`: String, `$maxLength`: Number, vararg options: GUILayoutOption): String
        fun TextField(`$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption): String
        fun TextField(`$text`: String, `$maxLength`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): String
        fun PasswordField(`$password`: String, `$maskChar`: Number, vararg options: GUILayoutOption): String
        fun PasswordField(`$password`: String, `$maskChar`: Number, `$maxLength`: Number, vararg options: GUILayoutOption): String
        fun PasswordField(`$password`: String, `$maskChar`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): String
        fun PasswordField(`$password`: String, `$maskChar`: Number, `$maxLength`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): String
        fun TextArea(`$text`: String, vararg options: GUILayoutOption): String
        fun TextArea(`$text`: String, `$maxLength`: Number, vararg options: GUILayoutOption): String
        fun TextArea(`$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption): String
        fun TextArea(`$text`: String, `$maxLength`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): String
        fun Toggle(`$value`: Boolean, `$image`: Texture, vararg options: GUILayoutOption): Boolean
        fun Toggle(`$value`: Boolean, `$text`: String, vararg options: GUILayoutOption): Boolean
        fun Toggle(`$value`: Boolean, `$content`: GUIContent, vararg options: GUILayoutOption): Boolean
        fun Toggle(`$value`: Boolean, `$image`: Texture, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun Toggle(`$value`: Boolean, `$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun Toggle(`$value`: Boolean, `$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption): Boolean
        fun Toolbar(`$selected`: Number, `$texts`: `Array$1`<String>, vararg options: GUILayoutOption): Number
        fun Toolbar(`$selected`: Number, `$images`: `Array$1`<Texture>, vararg options: GUILayoutOption): Number
        fun Toolbar(`$selected`: Number, `$contents`: `Array$1`<GUIContent>, vararg options: GUILayoutOption): Number
        fun Toolbar(`$selected`: Number, `$texts`: `Array$1`<String>, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        fun Toolbar(`$selected`: Number, `$images`: `Array$1`<Texture>, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        //fun Toolbar(`$selected`: Number, `$texts`: `Array$1`<String>, `$style`: GUIStyle, `$buttonSize`: ToolbarButtonSize, vararg options: GUILayoutOption): Number
        //fun Toolbar(`$selected`: Number, `$images`: `Array$1`<Texture>, `$style`: GUIStyle, `$buttonSize`: ToolbarButtonSize, vararg options: GUILayoutOption): Number
        fun Toolbar(`$selected`: Number, `$contents`: `Array$1`<GUIContent>, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        //fun Toolbar(`$selected`: Number, `$contents`: `Array$1`<GUIContent>, `$style`: GUIStyle, `$buttonSize`: ToolbarButtonSize, vararg options: GUILayoutOption): Number
        fun Toolbar(`$selected`: Number, `$contents`: `Array$1`<GUIContent>, `$enabled`: `Array$1`<Boolean>, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        //fun Toolbar(`$selected`: Number, `$contents`: `Array$1`<GUIContent>, `$enabled`: `Array$1`<Boolean>, `$style`: GUIStyle, `$buttonSize`: ToolbarButtonSize, vararg options: GUILayoutOption): Number
        fun SelectionGrid(`$selected`: Number, `$texts`: `Array$1`<String>, `$xCount`: Number, vararg options: GUILayoutOption): Number
        fun SelectionGrid(`$selected`: Number, `$images`: `Array$1`<Texture>, `$xCount`: Number, vararg options: GUILayoutOption): Number
        fun SelectionGrid(`$selected`: Number, `$content`: `Array$1`<GUIContent>, `$xCount`: Number, vararg options: GUILayoutOption): Number
        fun SelectionGrid(`$selected`: Number, `$texts`: `Array$1`<String>, `$xCount`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        fun SelectionGrid(`$selected`: Number, `$images`: `Array$1`<Texture>, `$xCount`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        fun SelectionGrid(`$selected`: Number, `$contents`: `Array$1`<GUIContent>, `$xCount`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        fun HorizontalSlider(`$value`: Number, `$leftValue`: Number, `$rightValue`: Number, vararg options: GUILayoutOption): Number
        fun HorizontalSlider(`$value`: Number, `$leftValue`: Number, `$rightValue`: Number, `$slider`: GUIStyle, `$thumb`: GUIStyle, vararg options: GUILayoutOption): Number
        fun VerticalSlider(`$value`: Number, `$leftValue`: Number, `$rightValue`: Number, vararg options: GUILayoutOption): Number
        fun VerticalSlider(`$value`: Number, `$leftValue`: Number, `$rightValue`: Number, `$slider`: GUIStyle, `$thumb`: GUIStyle, vararg options: GUILayoutOption): Number
        fun HorizontalScrollbar(`$value`: Number, `$size`: Number, `$leftValue`: Number, `$rightValue`: Number, vararg options: GUILayoutOption): Number
        fun HorizontalScrollbar(`$value`: Number, `$size`: Number, `$leftValue`: Number, `$rightValue`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        fun VerticalScrollbar(`$value`: Number, `$size`: Number, `$topValue`: Number, `$bottomValue`: Number, vararg options: GUILayoutOption): Number
        fun VerticalScrollbar(`$value`: Number, `$size`: Number, `$topValue`: Number, `$bottomValue`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): Number
        fun Space(`$pixels`: Number)
        fun FlexibleSpace()
        fun BeginHorizontal(vararg options: GUILayoutOption)
        fun BeginHorizontal(`$style`: GUIStyle, vararg options: GUILayoutOption)
        fun BeginHorizontal(`$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun BeginHorizontal(`$image`: Texture, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun BeginHorizontal(`$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun EndHorizontal()
        fun BeginVertical(vararg options: GUILayoutOption)
        fun BeginVertical(`$style`: GUIStyle, vararg options: GUILayoutOption)
        fun BeginVertical(`$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun BeginVertical(`$image`: Texture, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun BeginVertical(`$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption)
        fun EndVertical()
        fun BeginArea(`$screenRect`: Rect)
        fun BeginArea(`$screenRect`: Rect, `$text`: String)
        fun BeginArea(`$screenRect`: Rect, `$image`: Texture)
        fun BeginArea(`$screenRect`: Rect, `$content`: GUIContent)
        fun BeginArea(`$screenRect`: Rect, `$style`: GUIStyle)
        fun BeginArea(`$screenRect`: Rect, `$text`: String, `$style`: GUIStyle)
        fun BeginArea(`$screenRect`: Rect, `$image`: Texture, `$style`: GUIStyle)
        fun BeginArea(`$screenRect`: Rect, `$content`: GUIContent, `$style`: GUIStyle)
        fun EndArea()
        fun BeginScrollView(`$scrollPosition`: Vector2, vararg options: GUILayoutOption): Vector2
        fun BeginScrollView(`$scrollPosition`: Vector2, `$alwaysShowHorizontal`: Boolean, `$alwaysShowVertical`: Boolean, vararg options: GUILayoutOption): Vector2
        fun BeginScrollView(`$scrollPosition`: Vector2, `$horizontalScrollbar`: GUIStyle, `$verticalScrollbar`: GUIStyle, vararg options: GUILayoutOption): Vector2
        fun BeginScrollView(`$scrollPosition`: Vector2, `$style`: GUIStyle): Vector2
        fun BeginScrollView(`$scrollPosition`: Vector2, `$style`: GUIStyle, vararg options: GUILayoutOption): Vector2
        fun BeginScrollView(`$scrollPosition`: Vector2, `$alwaysShowHorizontal`: Boolean, `$alwaysShowVertical`: Boolean, `$horizontalScrollbar`: GUIStyle, `$verticalScrollbar`: GUIStyle, vararg options: GUILayoutOption): Vector2
        fun BeginScrollView(`$scrollPosition`: Vector2, `$alwaysShowHorizontal`: Boolean, `$alwaysShowVertical`: Boolean, `$horizontalScrollbar`: GUIStyle, `$verticalScrollbar`: GUIStyle, `$background`: GUIStyle, vararg options: GUILayoutOption): Vector2
        fun EndScrollView()
        fun Window(`$id`: Number, `$screenRect`: Rect, `$func`: WindowFunction, `$text`: String, vararg options: GUILayoutOption): Rect
        fun Window(`$id`: Number, `$screenRect`: Rect, `$func`: WindowFunction, `$image`: Texture, vararg options: GUILayoutOption): Rect
        fun Window(`$id`: Number, `$screenRect`: Rect, `$func`: WindowFunction, `$content`: GUIContent, vararg options: GUILayoutOption): Rect
        fun Window(`$id`: Number, `$screenRect`: Rect, `$func`: WindowFunction, `$text`: String, `$style`: GUIStyle, vararg options: GUILayoutOption): Rect
        fun Window(`$id`: Number, `$screenRect`: Rect, `$func`: WindowFunction, `$image`: Texture, `$style`: GUIStyle, vararg options: GUILayoutOption): Rect
        fun Window(`$id`: Number, `$screenRect`: Rect, `$func`: WindowFunction, `$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption): Rect
        fun Width(`$width`: Number): GUILayoutOption
        fun MinWidth(`$minWidth`: Number): GUILayoutOption
        fun MaxWidth(`$maxWidth`: Number): GUILayoutOption
        fun Height(`$height`: Number): GUILayoutOption
        fun MinHeight(`$minHeight`: Number): GUILayoutOption
        fun MaxHeight(`$maxHeight`: Number): GUILayoutOption
        fun ExpandWidth(`$expand`: Boolean): GUILayoutOption
        fun ExpandHeight(`$expand`: Boolean): GUILayoutOption
    }
}

external open class GUILayoutOption : csharp.System.Object

external open class GUILayoutUtility : csharp.System.Object {
    companion object {
        fun GetRect(`$content`: GUIContent, `$style`: GUIStyle): Rect
        fun GetRect(`$content`: GUIContent, `$style`: GUIStyle, vararg options: GUILayoutOption): Rect
        fun GetRect(`$width`: Number, `$height`: Number): Rect
        fun GetRect(`$width`: Number, `$height`: Number, `$style`: GUIStyle): Rect
        fun GetRect(`$width`: Number, `$height`: Number, vararg options: GUILayoutOption): Rect
        fun GetRect(`$width`: Number, `$height`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): Rect
        fun GetRect(`$minWidth`: Number, `$maxWidth`: Number, `$minHeight`: Number, `$maxHeight`: Number): Rect
        fun GetRect(`$minWidth`: Number, `$maxWidth`: Number, `$minHeight`: Number, `$maxHeight`: Number, `$style`: GUIStyle): Rect
        fun GetRect(`$minWidth`: Number, `$maxWidth`: Number, `$minHeight`: Number, `$maxHeight`: Number, vararg options: GUILayoutOption): Rect
        fun GetRect(`$minWidth`: Number, `$maxWidth`: Number, `$minHeight`: Number, `$maxHeight`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): Rect
        fun GetLastRect(): Rect
        fun GetAspectRect(`$aspect`: Number): Rect
        fun GetAspectRect(`$aspect`: Number, `$style`: GUIStyle): Rect
        fun GetAspectRect(`$aspect`: Number, vararg options: GUILayoutOption): Rect
        fun GetAspectRect(`$aspect`: Number, `$style`: GUIStyle, vararg options: GUILayoutOption): Rect
    }
}

external open class GUISettings : csharp.System.Object {
    open var `var`: Any
    open var doubleClickSelectsWord: Any
    open var tripleClickSelectsLine: Any
    open var cursorColor: Any
    open var cursorFlashSpeed: Any
    open var selectionColor: Any
}

external open class Font : Object {
    constructor()
    constructor(`$name`: String)
    override var `var`: Any
    open var material: Any
    open val dynamic: dynamic
    open val ascent: Any
    open val fontSize: Any
    open val lineHeight: Any
    open fun HasCharacter(`$c`: Number): Boolean
    open fun GetCharacterInfo(`$ch`: Number, `$info`: `$Ref`<CharacterInfo>, `$size`: Number, `$style`: FontStyle): Boolean
    open fun GetCharacterInfo(`$ch`: Number, `$info`: `$Ref`<CharacterInfo>, `$size`: Number): Boolean
    open fun GetCharacterInfo(`$ch`: Number, `$info`: `$Ref`<CharacterInfo>): Boolean
    open fun RequestCharactersInTexture(`$characters`: String, `$size`: Number, `$style`: FontStyle)
    open fun RequestCharactersInTexture(`$characters`: String, `$size`: Number)
    open fun RequestCharactersInTexture(`$characters`: String)
    interface FontTextureRebuildCallback {
        @nativeInvoke
        operator fun invoke()
        var Invoke: (() -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        fun add_textureRebuilt(`$value`: `Action$1`<Font>)
        fun remove_textureRebuilt(`$value`: `Action$1`<Font>)
        fun CreateDynamicFontFromOSFont(`$fontname`: String, `$size`: Number): Font
        fun CreateDynamicFontFromOSFont(`$fontnames`: `Array$1`<String>, `$size`: Number): Font
        fun GetMaxVertsForString(`$str`: String): Number
        fun GetOSInstalledFontNames(): `Array$1`<String>
        fun GetPathsToOSFonts(): `Array$1`<String>
    }
}

external open class GUIStyleState : csharp.System.Object {
    open var `var`: Any
    open var textColor: Any
}

external enum class ImagePosition {
    ImageLeft /* = 0 */,
    ImageAbove /* = 1 */,
    ImageOnly /* = 2 */,
    TextOnly /* = 3 */
}

external enum class TextAnchor {
    UpperLeft /* = 0 */,
    UpperCenter /* = 1 */,
    UpperRight /* = 2 */,
    MiddleLeft /* = 3 */,
    MiddleCenter /* = 4 */,
    MiddleRight /* = 5 */,
    LowerLeft /* = 6 */,
    LowerCenter /* = 7 */,
    LowerRight /* = 8 */
}

external enum class TextClipping {
    Overflow /* = 0 */,
    Clip /* = 1 */
}

external enum class FontStyle {
    Normal /* = 0 */,
    Bold /* = 1 */,
    Italic /* = 2 */,
    BoldAndItalic /* = 3 */
}

external open class GUITargetAttribute : Attribute, _Attribute {
    constructor()
    constructor(`$displayIndex`: Number)
    constructor(`$displayIndex`: Number, `$displayIndex1`: Number)
    constructor(`$displayIndex`: Number, `$displayIndex1`: Number, vararg displayIndexList: Number)
}

external open class GUIUtility : csharp.System.Object {
    companion object {
        fun GetControlID(`$hint`: Number, `$focusType`: FocusType, `$rect`: Rect): Number
        fun AlignRectToDevice(`$rect`: Rect, `$widthInPixels`: `$Ref`<Number>, `$heightInPixels`: `$Ref`<Number>): Rect
        fun GetControlID(`$focus`: FocusType): Number
        fun GetControlID(`$contents`: GUIContent, `$focus`: FocusType): Number
        fun GetControlID(`$focus`: FocusType, `$position`: Rect): Number
        fun GetControlID(`$contents`: GUIContent, `$focus`: FocusType, `$position`: Rect): Number
        fun GetControlID(`$hint`: Number, `$focus`: FocusType): Number
        fun GetStateObject(`$t`: Type, `$controlID`: Number): Any
        fun QueryStateObject(`$t`: Type, `$controlID`: Number): Any
        fun ExitGUI()
        fun GUIToScreenPoint(`$guiPoint`: Vector2): Vector2
        fun GUIToScreenRect(`$guiRect`: Rect): Rect
        fun ScreenToGUIPoint(`$screenPoint`: Vector2): Vector2
        fun ScreenToGUIRect(`$screenRect`: Rect): Rect
        fun RotateAroundPivot(`$angle`: Number, `$pivotPoint`: Vector2)
        fun ScaleAroundPivot(`$scale`: Vector2, `$pivotPoint`: Vector2)
        fun AlignRectToDevice(`$rect`: Rect): Rect
    }
}

external open class ExitGUIException : Exception, ISerializable, _Exception

external open class TextEditor : csharp.System.Object {
    open var keyboardOnScreen: TouchScreenKeyboard
    open var controlID: Number
    open var style: GUIStyle
    open var multiline: Boolean
    open var hasHorizontalCursorPos: Boolean
    open var isPasswordField: Boolean
    open var scrollOffset: Vector2
    open var graphicalCursorPos: Vector2
    open var graphicalSelectCursorPos: Vector2
    open var `var`: Any
    open var text: Any
    open var position: Any
    open var cursorIndex: Any
    open var selectIndex: Any
    open var doubleClickSnapping: Any
    open var altCursorPosition: Any
    open val hasSelection: Any
    open val SelectedText: Any
    open fun OnFocus()
    open fun OnLostFocus()
    open fun HandleKeyEvent(`$e`: Event): Boolean
    open fun DeleteLineBack(): Boolean
    open fun DeleteWordBack(): Boolean
    open fun DeleteWordForward(): Boolean
    open fun Delete(): Boolean
    open fun CanPaste(): Boolean
    open fun Backspace(): Boolean
    open fun SelectAll()
    open fun SelectNone()
    open fun DeleteSelection(): Boolean
    open fun ReplaceSelection(`$replace`: String)
    open fun Insert(`$c`: Number)
    open fun MoveSelectionToAltCursor()
    open fun MoveRight()
    open fun MoveLeft()
    open fun MoveUp()
    open fun MoveDown()
    open fun MoveLineStart()
    open fun MoveLineEnd()
    open fun MoveGraphicalLineStart()
    open fun MoveGraphicalLineEnd()
    open fun MoveTextStart()
    open fun MoveTextEnd()
    open fun MoveParagraphForward()
    open fun MoveParagraphBackward()
    open fun MoveCursorToPosition(`$cursorPosition`: Vector2)
    open fun MoveAltCursorToPosition(`$cursorPosition`: Vector2)
    open fun IsOverSelection(`$cursorPosition`: Vector2): Boolean
    open fun SelectToPosition(`$cursorPosition`: Vector2)
    open fun SelectLeft()
    open fun SelectRight()
    open fun SelectUp()
    open fun SelectDown()
    open fun SelectTextEnd()
    open fun SelectTextStart()
    open fun MouseDragSelectsWholeWords(`$on`: Boolean)
    //open fun DblClickSnap(`$snapping`: DblClickSnapping)
    open fun MoveWordRight()
    open fun MoveToStartOfNextWord()
    open fun MoveToEndOfPreviousWord()
    open fun SelectToStartOfNextWord()
    open fun SelectToEndOfPreviousWord()
    open fun FindStartOfNextWord(`$p`: Number): Number
    open fun MoveWordLeft()
    open fun SelectWordRight()
    open fun SelectWordLeft()
    open fun ExpandSelectGraphicalLineStart()
    open fun ExpandSelectGraphicalLineEnd()
    open fun SelectGraphicalLineStart()
    open fun SelectGraphicalLineEnd()
    open fun SelectParagraphForward()
    open fun SelectParagraphBackward()
    open fun SelectCurrentWord()
    open fun SelectCurrentParagraph()
    open fun UpdateScrollOffsetIfNeeded(`$evt`: Event)
    open fun DrawCursor(`$newText`: String)
    open fun SaveBackup()
    open fun Undo()
    open fun Cut(): Boolean
    open fun Copy()
    open fun Paste(): Boolean
    open fun DetectFocusChange()
}

external open class ImageConversion : csharp.System.Object {
    companion object {
        fun EncodeToTGA(`$tex`: Texture2D): `Array$1`<Number>
        fun EncodeToPNG(`$tex`: Texture2D): `Array$1`<Number>
        fun EncodeToJPG(`$tex`: Texture2D, `$quality`: Number): `Array$1`<Number>
        fun EncodeToJPG(`$tex`: Texture2D): `Array$1`<Number>
        //fun EncodeToEXR(`$tex`: Texture2D, `$flags`: EXRFlags): `Array$1`<Number>
        fun EncodeToEXR(`$tex`: Texture2D): `Array$1`<Number>
        fun LoadImage(`$tex`: Texture2D, `$data`: `Array$1`<Number>, `$markNonReadable`: Boolean): Boolean
        fun LoadImage(`$tex`: Texture2D, `$data`: `Array$1`<Number>): Boolean
        fun EncodeArrayToTGA(`$array`: Array, `$format`: GraphicsFormat, `$width`: Number, `$height`: Number, `$rowBytes`: Number = definedExternally): `Array$1`<Number>
        fun EncodeArrayToPNG(`$array`: Array, `$format`: GraphicsFormat, `$width`: Number, `$height`: Number, `$rowBytes`: Number = definedExternally): `Array$1`<Number>
        fun EncodeArrayToJPG(`$array`: Array, `$format`: GraphicsFormat, `$width`: Number, `$height`: Number, `$rowBytes`: Number = definedExternally, `$quality`: Number = definedExternally): `Array$1`<Number>
        //fun EncodeArrayToEXR(`$array`: Array, `$format`: GraphicsFormat, `$width`: Number, `$height`: Number, `$rowBytes`: Number = definedExternally, `$flags`: EXRFlags = definedExternally): `Array$1`<Number>
    }
}

external enum class TouchPhase {
    Began /* = 0 */,
    Moved /* = 1 */,
    Stationary /* = 2 */,
    Ended /* = 3 */,
    Canceled /* = 4 */
}

external enum class IMECompositionMode {
    Auto /* = 0 */,
    On /* = 1 */,
    Off /* = 2 */
}

external enum class TouchType {
    Direct /* = 0 */,
    Indirect /* = 1 */,
    Stylus /* = 2 */
}

external open class Touch : ValueType {
    open var `var`: Any
    open var fingerId: Any
    open var deltaTime: Any
    open var tapCount: Any
    open var phase: Any
    open var pressure: Any
    open var maximumPossiblePressure: Any
    open var type: Any
    open var altitudeAngle: Any
    open var azimuthAngle: Any
    open var radius: Any
    open var radiusVariance: Any
}

external enum class DeviceOrientation {
    Unknown /* = 0 */,
    Portrait /* = 1 */,
    PortraitUpsideDown /* = 2 */,
    LandscapeLeft /* = 3 */,
    LandscapeRight /* = 4 */,
    FaceUp /* = 5 */,
    FaceDown /* = 6 */
}

external open class AccelerationEvent : ValueType {
    open var `var`: Any
    open val deltaTime: Any
}

external open class Gyroscope : csharp.System.Object {
    open var `var`: Any
    open val attitude: Any
    open var enabled: Any
    open var updateInterval: Any
}

external open class LocationInfo : ValueType {
    open var `var`: Any
    open val latitude: Any
    open val longitude: Any
    open val altitude: Any
    open val horizontalAccuracy: Any
    open val verticalAccuracy: Any
    open val timestamp: Any
}

external enum class LocationServiceStatus {
    Stopped /* = 0 */,
    Initializing /* = 1 */,
    Running /* = 2 */,
    Failed /* = 3 */
}

external open class LocationService : csharp.System.Object {
    open var `var`: Any
    open val isEnabledByUser: Any
    open val status: Any
    open val lastData: Any
    open fun Start(`$desiredAccuracyInMeters`: Number, `$updateDistanceInMeters`: Number)
    open fun Start(`$desiredAccuracyInMeters`: Number)
    open fun Start()
    open fun Stop()
}

external open class Compass : csharp.System.Object {
    open var `var`: Any
    open val magneticHeading: Any
    open val trueHeading: Any
    open val headingAccuracy: Any
    open val timestamp: Any
    open var enabled: Any
}

external open class Input : csharp.System.Object {
    companion object {
        fun GetAxis(`$axisName`: String): Number
        fun GetAxisRaw(`$axisName`: String): Number
        fun GetButton(`$buttonName`: String): Boolean
        fun GetButtonDown(`$buttonName`: String): Boolean
        fun GetButtonUp(`$buttonName`: String): Boolean
        fun GetMouseButton(`$button`: Number): Boolean
        fun GetMouseButtonDown(`$button`: Number): Boolean
        fun GetMouseButtonUp(`$button`: Number): Boolean
        fun ResetInputAxes()
        fun IsJoystickPreconfigured(`$joystickName`: String): Boolean
        fun GetJoystickNames(): `Array$1`<String>
        fun GetTouch(`$index`: Number): Touch
        fun GetAccelerationEvent(`$index`: Number): AccelerationEvent
        fun GetKey(`$key`: KeyCode): Boolean
        fun GetKey(`$name`: String): Boolean
        fun GetKeyUp(`$key`: KeyCode): Boolean
        fun GetKeyUp(`$name`: String): Boolean
        fun GetKeyDown(`$key`: KeyCode): Boolean
        fun GetKeyDown(`$name`: String): Boolean
    }
}

external open class JsonUtility : csharp.System.Object {
    companion object {
        fun ToJson(`$obj`: Any): String
        fun ToJson(`$obj`: Any, `$prettyPrint`: Boolean): String
        fun FromJson(`$json`: String, `$type`: Type): Any
        fun FromJsonOverwrite(`$json`: String, `$objectToOverwrite`: Any)
    }
}

external open class LocalizationAsset : Object {
    override var `var`: Any
    open var localeIsoCode: Any
    open var isEditorAsset: Any
    open fun SetLocalizedString(`$original`: String, `$localized`: String)
    open fun GetLocalizedString(`$original`: String): String
}

external enum class ParticleSystemEmissionType {
    Time /* = 0 */,
    Distance /* = 1 */
}

external enum class ParticleSystemCurveMode {
    Constant /* = 0 */,
    Curve /* = 1 */,
    TwoCurves /* = 2 */,
    TwoConstants /* = 3 */
}

external enum class ParticleSystemEmitterVelocityMode {
    Transform /* = 0 */,
    Rigidbody /* = 1 */,
    Custom /* = 2 */
}

external enum class ParticleSystemStopAction {
    None /* = 0 */,
    Disable /* = 1 */,
    Destroy /* = 2 */,
    Callback /* = 3 */
}

external enum class ParticleSystemRingBufferMode {
    Disabled /* = 0 */,
    PauseUntilReplaced /* = 1 */,
    LoopUntilReplaced /* = 2 */
}

external enum class ParticleSystemCullingMode {
    Automatic /* = 0 */,
    PauseAndCatchup /* = 1 */,
    Pause /* = 2 */,
    AlwaysSimulate /* = 3 */
}

external enum class ParticleSystemShapeType {
    Sphere /* = 0 */,
    SphereShell /* = 1 */,
    Hemisphere /* = 2 */,
    HemisphereShell /* = 3 */,
    Cone /* = 4 */,
    Box /* = 5 */,
    Mesh /* = 6 */,
    ConeShell /* = 7 */,
    ConeVolume /* = 8 */,
    ConeVolumeShell /* = 9 */,
    Circle /* = 10 */,
    CircleEdge /* = 11 */,
    SingleSidedEdge /* = 12 */,
    MeshRenderer /* = 13 */,
    SkinnedMeshRenderer /* = 14 */,
    BoxShell /* = 15 */,
    BoxEdge /* = 16 */,
    Donut /* = 17 */,
    Rectangle /* = 18 */,
    Sprite /* = 19 */,
    SpriteRenderer /* = 20 */
}

external enum class ParticleSystemShapeMultiModeValue {
    Random /* = 0 */,
    Loop /* = 1 */,
    PingPong /* = 2 */,
    BurstSpread /* = 3 */
}

external enum class ParticleSystemMeshShapeType {
    Vertex /* = 0 */,
    Edge /* = 1 */,
    Triangle /* = 2 */
}

external open class MeshRenderer : Renderer

external enum class ParticleSystemShapeTextureChannel {
    Red /* = 0 */,
    Green /* = 1 */,
    Blue /* = 2 */,
    Alpha /* = 3 */
}

external enum class ParticleSystemCollisionType {
    Planes /* = 0 */,
    World /* = 1 */
}

external enum class ParticleSystemCollisionMode {
    Collision3D /* = 0 */,
    Collision2D /* = 1 */
}

external enum class ParticleSystemCollisionQuality {
    High /* = 0 */,
    Medium /* = 1 */,
    Low /* = 2 */
}

external enum class ParticleSystemOverlapAction {
    Ignore /* = 0 */,
    Kill /* = 1 */,
    Callback /* = 2 */
}

external enum class ParticleSystemColliderQueryMode {
    Disabled /* = 0 */,
    One /* = 1 */,
    All /* = 2 */
}

external enum class ParticleSystemSubEmitterType {
    Birth /* = 0 */,
    Collision /* = 1 */,
    Death /* = 2 */,
    Trigger /* = 3 */,
    Manual /* = 4 */
}

external enum class ParticleSystemSubEmitterProperties {
    InheritNothing /* = 0 */,
    InheritEverything /* = 31 */,
    InheritColor /* = 1 */,
    InheritSize /* = 2 */,
    InheritRotation /* = 4 */,
    InheritLifetime /* = 8 */,
    InheritDuration /* = 16 */
}

external enum class ParticleSystemAnimationMode {
    Grid /* = 0 */,
    Sprites /* = 1 */
}

external enum class ParticleSystemAnimationTimeMode {
    Lifetime /* = 0 */,
    Speed /* = 1 */,
    FPS /* = 2 */
}

external enum class ParticleSystemAnimationType {
    WholeSheet /* = 0 */,
    SingleRow /* = 1 */
}

external enum class ParticleSystemAnimationRowMode {
    Custom /* = 0 */,
    Random /* = 1 */,
    MeshIndex /* = 2 */
}

external enum class ParticleSystemGradientMode {
    Color /* = 0 */,
    Gradient /* = 1 */,
    TwoColors /* = 2 */,
    TwoGradients /* = 3 */,
    RandomColor /* = 4 */
}

external enum class ParticleSystemInheritVelocityMode {
    Initial /* = 0 */,
    Current /* = 1 */
}

external enum class ParticleSystemGameObjectFilter {
    LayerMask /* = 0 */,
    List /* = 1 */,
    LayerMaskAndList /* = 2 */
}

external open class ParticleSystemForceField : Behaviour {
    override var `var`: Any
    open var shape: Any
    open var startRange: Any
    open var endRange: Any
    open var length: Any
    open var gravityFocus: Any
    open var multiplyDragByParticleSize: Any
    open var multiplyDragByParticleVelocity: Any
    open var directionX: Any
    open var directionY: Any
    open var directionZ: Any
    open var gravity: Any
    open var rotationSpeed: Any
    open var rotationAttraction: Any
    open var drag: Any
    open var vectorFieldSpeed: Any
    open var vectorFieldAttraction: Any

    companion object {
        fun FindAll(): `Array$1`<ParticleSystemForceField>
    }
}

external enum class ParticleSystemNoiseQuality {
    Low /* = 0 */,
    Medium /* = 1 */,
    High /* = 2 */
}

external enum class ParticleSystemTrailMode {
    PerParticle /* = 0 */,
    Ribbon /* = 1 */
}

external enum class ParticleSystemTrailTextureMode {
    Stretch /* = 0 */,
    Tile /* = 1 */,
    DistributePerSegment /* = 2 */,
    RepeatPerSegment /* = 3 */
}

external enum class ParticleSystemCustomDataMode {
    Disabled /* = 0 */,
    Vector /* = 1 */,
    Color /* = 2 */
}

external open class ParticlePhysicsExtensions : csharp.System.Object {
    companion object {
        fun GetSafeCollisionEventSize(`$ps`: ParticleSystem): Number
        fun GetCollisionEvents(`$ps`: ParticleSystem, `$go`: GameObject, `$collisionEvents`: `List$1`<ParticleCollisionEvent>): Number
        fun GetSafeTriggerParticlesSize(`$ps`: ParticleSystem, `$type`: ParticleSystemTriggerEventType): Number
        fun GetTriggerParticles(`$ps`: ParticleSystem, `$type`: ParticleSystemTriggerEventType, `$particles`: `List$1`<Particle>): Number
        fun GetTriggerParticles(`$ps`: ParticleSystem, `$type`: ParticleSystemTriggerEventType, `$particles`: `List$1`<Particle>, `$colliderData`: `$Ref`<ColliderData>): Number
        fun SetTriggerParticles(`$ps`: ParticleSystem, `$type`: ParticleSystemTriggerEventType, `$particles`: `List$1`<Particle>, `$offset`: Number, `$count`: Number)
        fun SetTriggerParticles(`$ps`: ParticleSystem, `$type`: ParticleSystemTriggerEventType, `$particles`: `List$1`<Particle>)
    }
}

external open class ParticleCollisionEvent : ValueType {
    open var `var`: Any
    open val colliderComponent: Any
}

external enum class ParticleSystemTriggerEventType {
    Inside /* = 0 */,
    Outside /* = 1 */,
    Enter /* = 2 */,
    Exit /* = 3 */
}

external enum class ParticleSystemRenderMode {
    Billboard /* = 0 */,
    Stretch /* = 1 */,
    HorizontalBillboard /* = 2 */,
    VerticalBillboard /* = 3 */,
    Mesh /* = 4 */,
    None /* = 5 */
}

external enum class ParticleSystemMeshDistribution {
    UniformRandom /* = 0 */,
    NonUniformRandom /* = 1 */
}

external enum class ParticleSystemSortMode {
    None /* = 0 */,
    Distance /* = 1 */,
    OldestInFront /* = 2 */,
    YoungestInFront /* = 3 */,
    Depth /* = 4 */
}

external enum class ParticleSystemRenderSpace {
    View /* = 0 */,
    World /* = 1 */,
    Local /* = 2 */,
    Facing /* = 3 */,
    Velocity /* = 4 */
}

external enum class ParticleSystemVertexStream {
    Position /* = 0 */,
    Normal /* = 1 */,
    Tangent /* = 2 */,
    Color /* = 3 */,
    UV /* = 4 */,
    UV2 /* = 5 */,
    UV3 /* = 6 */,
    UV4 /* = 7 */,
    AnimBlend /* = 8 */,
    AnimFrame /* = 9 */,
    Center /* = 10 */,
    VertexID /* = 11 */,
    SizeX /* = 12 */,
    SizeXY /* = 13 */,
    SizeXYZ /* = 14 */,
    Rotation /* = 15 */,
    Rotation3D /* = 16 */,
    RotationSpeed /* = 17 */,
    RotationSpeed3D /* = 18 */,
    Velocity /* = 19 */,
    Speed /* = 20 */,
    AgePercent /* = 21 */,
    InvStartLifetime /* = 22 */,
    StableRandomX /* = 23 */,
    StableRandomXY /* = 24 */,
    StableRandomXYZ /* = 25 */,
    StableRandomXYZW /* = 26 */,
    VaryingRandomX /* = 27 */,
    VaryingRandomXY /* = 28 */,
    VaryingRandomXYZ /* = 29 */,
    VaryingRandomXYZW /* = 30 */,
    Custom1X /* = 31 */,
    Custom1XY /* = 32 */,
    Custom1XYZ /* = 33 */,
    Custom1XYZW /* = 34 */,
    Custom2X /* = 35 */,
    Custom2XY /* = 36 */,
    Custom2XYZ /* = 37 */,
    Custom2XYZW /* = 38 */,
    NoiseSumX /* = 39 */,
    NoiseSumXY /* = 40 */,
    NoiseSumXYZ /* = 41 */,
    NoiseImpulseX /* = 42 */,
    NoiseImpulseXY /* = 43 */,
    NoiseImpulseXYZ /* = 44 */,
    MeshIndex /* = 45 */
}

external enum class ParticleSystemForceFieldShape {
    Sphere /* = 0 */,
    Hemisphere /* = 1 */,
    Cylinder /* = 2 */,
    Box /* = 3 */
}

external enum class ParticleSystemVertexStreams {
    Position /* = 1 */,
    Normal /* = 2 */,
    Tangent /* = 4 */,
    Color /* = 8 */,
    UV /* = 16 */,
    UV2BlendAndFrame /* = 32 */,
    CenterAndVertexID /* = 64 */,
    Size /* = 128 */,
    Rotation /* = 256 */,
    Velocity /* = 512 */,
    Lifetime /* = 1024 */,
    Custom1 /* = 2048 */,
    Custom2 /* = 4096 */,
    Random /* = 8192 */,
    None /* = 0 */,
    All /* = 2147483647 */
}

external enum class RigidbodyConstraints {
    None /* = 0 */,
    FreezePositionX /* = 2 */,
    FreezePositionY /* = 4 */,
    FreezePositionZ /* = 8 */,
    FreezeRotationX /* = 16 */,
    FreezeRotationY /* = 32 */,
    FreezeRotationZ /* = 64 */,
    FreezePosition /* = 14 */,
    FreezeRotation /* = 112 */,
    FreezeAll /* = 126 */
}

external enum class ForceMode {
    Force /* = 0 */,
    Acceleration /* = 5 */,
    Impulse /* = 1 */,
    VelocityChange /* = 2 */
}

external enum class JointProjectionMode {
    None /* = 0 */,
    PositionAndRotation /* = 1 */,
    PositionOnly /* = 2 */
}

external enum class MeshColliderCookingOptions {
    None /* = 0 */,
    InflateConvexMesh /* = 1 */,
    CookForFasterSimulation /* = 2 */,
    EnableMeshCleaning /* = 4 */,
    WeldColocatedVertices /* = 8 */,
    UseFastMidphase /* = 16 */
}

external open class WheelFrictionCurve : ValueType {
    open var `var`: Any
    open var extremumSlip: Any
    open var extremumValue: Any
    open var asymptoteSlip: Any
    open var asymptoteValue: Any
    open var stiffness: Any
}

external open class SoftJointLimit : ValueType {
    open var `var`: Any
    open var limit: Any
    open var bounciness: Any
    open var contactDistance: Any
}

external open class SoftJointLimitSpring : ValueType {
    open var `var`: Any
    open var spring: Any
    open var damper: Any
}

external open class JointDrive : ValueType {
    open var `var`: Any
    open var positionSpring: Any
    open var positionDamper: Any
    open var maximumForce: Any
}

external enum class JointDriveMode {
    None /* = 0 */,
    Position /* = 1 */,
    Velocity /* = 2 */,
    PositionAndVelocity /* = 3 */
}

external enum class RigidbodyInterpolation {
    None /* = 0 */,
    Interpolate /* = 1 */,
    Extrapolate /* = 2 */
}

external open class JointMotor : ValueType {
    open var `var`: Any
    open var targetVelocity: Any
    open var force: Any
    open var freeSpin: Any
}

external open class JointSpring : ValueType {
    open var spring: Number
    open var damper: Number
    open var targetPosition: Number
}

external open class JointLimits : ValueType {
    open var `var`: Any
    open var min: Any
    open var max: Any
    open var bounciness: Any
    open var bounceMinVelocity: Any
    open var contactDistance: Any
}

external open class ControllerColliderHit : csharp.System.Object {
    open var `var`: Any
    open val controller: Any
    open val collider: Any
    open val rigidbody: Any
    open val gameObject: Any
    open val transform: Any
    open val moveLength: Any
}

external open class CharacterController : Collider {
    override var `var`: Any
    open val isGrounded: Any
    open val collisionFlags: Any
    open var radius: Any
    open var height: Any
    open var slopeLimit: Any
    open var stepOffset: Any
    open var skinWidth: Any
    open var minMoveDistance: Any
    open var detectCollisions: Any
    open var enableOverlapRecovery: Any
    open fun SimpleMove(`$speed`: Vector3): Boolean
    open fun Move(`$motion`: Vector3): CollisionFlags
}

external open class Rigidbody : Component {
    override var `var`: Any
    open var drag: Any
    open var angularDrag: Any
    open var mass: Any
    open var useGravity: Any
    open var maxDepenetrationVelocity: Any
    open var isKinematic: Any
    open var freezeRotation: Any
    open var constraints: Any
    open var collisionDetectionMode: Any
    open var inertiaTensorRotation: Any
    open var detectCollisions: Any
    open var rotation: Any
    open var interpolation: Any
    open var solverIterations: Any
    open var sleepThreshold: Any
    open var maxAngularVelocity: Any
    open var solverVelocityIterations: Any
    open fun SetDensity(`$density`: Number)
    open fun MovePosition(`$position`: Vector3)
    open fun MoveRotation(`$rot`: Quaternion)
    open fun Sleep()
    open fun IsSleeping(): Boolean
    open fun WakeUp()
    open fun ResetCenterOfMass()
    open fun ResetInertiaTensor()
    open fun GetRelativePointVelocity(`$relativePoint`: Vector3): Vector3
    open fun GetPointVelocity(`$worldPoint`: Vector3): Vector3
    open fun AddForce(`$force`: Vector3, `$mode`: ForceMode)
    open fun AddForce(`$force`: Vector3)
    open fun AddForce(`$x`: Number, `$y`: Number, `$z`: Number, `$mode`: ForceMode)
    open fun AddForce(`$x`: Number, `$y`: Number, `$z`: Number)
    open fun AddRelativeForce(`$force`: Vector3, `$mode`: ForceMode)
    open fun AddRelativeForce(`$force`: Vector3)
    open fun AddRelativeForce(`$x`: Number, `$y`: Number, `$z`: Number, `$mode`: ForceMode)
    open fun AddRelativeForce(`$x`: Number, `$y`: Number, `$z`: Number)
    open fun AddTorque(`$torque`: Vector3, `$mode`: ForceMode)
    open fun AddTorque(`$torque`: Vector3)
    open fun AddTorque(`$x`: Number, `$y`: Number, `$z`: Number, `$mode`: ForceMode)
    open fun AddTorque(`$x`: Number, `$y`: Number, `$z`: Number)
    open fun AddRelativeTorque(`$torque`: Vector3, `$mode`: ForceMode)
    open fun AddRelativeTorque(`$torque`: Vector3)
    open fun AddRelativeTorque(`$x`: Number, `$y`: Number, `$z`: Number, `$mode`: ForceMode)
    open fun AddRelativeTorque(`$x`: Number, `$y`: Number, `$z`: Number)
    open fun AddForceAtPosition(`$force`: Vector3, `$position`: Vector3, `$mode`: ForceMode)
    open fun AddForceAtPosition(`$force`: Vector3, `$position`: Vector3)
    open fun AddExplosionForce(`$explosionForce`: Number, `$explosionPosition`: Vector3, `$explosionRadius`: Number, `$upwardsModifier`: Number, `$mode`: ForceMode)
    open fun AddExplosionForce(`$explosionForce`: Number, `$explosionPosition`: Vector3, `$explosionRadius`: Number, `$upwardsModifier`: Number)
    open fun AddExplosionForce(`$explosionForce`: Number, `$explosionPosition`: Vector3, `$explosionRadius`: Number)
    open fun ClosestPointOnBounds(`$position`: Vector3): Vector3
    open fun SweepTest(`$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
    open fun SweepTest(`$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number): Boolean
    open fun SweepTest(`$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
    open fun SweepTestAll(`$direction`: Vector3, `$maxDistance`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<RaycastHit>
    open fun SweepTestAll(`$direction`: Vector3, `$maxDistance`: Number): `Array$1`<RaycastHit>
    open fun SweepTestAll(`$direction`: Vector3): `Array$1`<RaycastHit>
}

external enum class PhysicMaterialCombine {
    Average /* = 0 */,
    Minimum /* = 2 */,
    Multiply /* = 1 */,
    Maximum /* = 3 */
}

external open class Collision : csharp.System.Object {
    open var `var`: Any
    open val rigidbody: Any
    open val articulationBody: Any
    open val body: Any
    open val collider: Any
    open val transform: Any
    open val gameObject: Any
    open val contactCount: Any
    open fun GetContact(`$index`: Number): ContactPoint
    open fun GetContacts(`$contacts`: `Array$1`<ContactPoint>): Number
    open fun GetContacts(`$contacts`: `List$1`<ContactPoint>): Number
}

external open class ArticulationBody : Behaviour {
    override var `var`: Any
    open var jointType: Any
    open var anchorRotation: Any
    open var parentAnchorRotation: Any
    open val isRoot: Any
    open var matchAnchors: Any
    open var linearLockX: Any
    open var linearLockY: Any
    open var linearLockZ: Any
    open var swingYLock: Any
    open var swingZLock: Any
    open var twistLock: Any
    open var xDrive: Any
    open var yDrive: Any
    open var zDrive: Any
    open var immovable: Any
    open var useGravity: Any
    open var linearDamping: Any
    open var angularDamping: Any
    open var jointFriction: Any
    open var mass: Any
    open var inertiaTensorRotation: Any
    open var sleepThreshold: Any
    open var solverIterations: Any
    open var solverVelocityIterations: Any
    open var maxAngularVelocity: Any
    open var maxLinearVelocity: Any
    open var maxJointVelocity: Any
    open var maxDepenetrationVelocity: Any
    open var jointPosition: Any
    open var jointVelocity: Any
    open var jointAcceleration: Any
    open var jointForce: Any
    open val dofCount: Any
    open val index: Any
    open var collisionDetectionMode: Any
    open fun AddForce(`$force`: Vector3, `$mode`: ForceMode)
    open fun AddForce(`$force`: Vector3)
    open fun AddRelativeForce(`$force`: Vector3, `$mode`: ForceMode)
    open fun AddRelativeForce(`$force`: Vector3)
    open fun AddTorque(`$torque`: Vector3, `$mode`: ForceMode)
    open fun AddTorque(`$torque`: Vector3)
    open fun AddRelativeTorque(`$torque`: Vector3, `$mode`: ForceMode)
    open fun AddRelativeTorque(`$torque`: Vector3)
    open fun AddForceAtPosition(`$force`: Vector3, `$position`: Vector3, `$mode`: ForceMode)
    open fun AddForceAtPosition(`$force`: Vector3, `$position`: Vector3)
    open fun ResetCenterOfMass()
    open fun ResetInertiaTensor()
    open fun Sleep()
    open fun IsSleeping(): Boolean
    open fun WakeUp()
    open fun TeleportRoot(`$position`: Vector3, `$rotation`: Quaternion)
    open fun GetClosestPoint(`$point`: Vector3): Vector3
    open fun GetRelativePointVelocity(`$relativePoint`: Vector3): Vector3
    open fun GetPointVelocity(`$worldPoint`: Vector3): Vector3
    open fun GetDenseJacobian(`$jacobian`: `$Ref`<ArticulationJacobian>): Number
    open fun GetJointPositions(`$positions`: `List$1`<Number>): Number
    open fun SetJointPositions(`$positions`: `List$1`<Number>)
    open fun GetJointVelocities(`$velocities`: `List$1`<Number>): Number
    open fun SetJointVelocities(`$velocities`: `List$1`<Number>)
    open fun GetJointAccelerations(`$accelerations`: `List$1`<Number>): Number
    open fun SetJointAccelerations(`$accelerations`: `List$1`<Number>)
    open fun GetJointForces(`$forces`: `List$1`<Number>): Number
    open fun SetJointForces(`$forces`: `List$1`<Number>)
    open fun GetDriveTargets(`$targets`: `List$1`<Number>): Number
    open fun SetDriveTargets(`$targets`: `List$1`<Number>)
    open fun GetDriveTargetVelocities(`$targetVelocities`: `List$1`<Number>): Number
    open fun SetDriveTargetVelocities(`$targetVelocities`: `List$1`<Number>)
    open fun GetDofStartIndices(`$dofStartIndices`: `List$1`<Number>): Number
    open fun SnapAnchorToClosestContact()
}

external open class ContactPoint : ValueType {
    open var `var`: Any
    open val thisCollider: Any
    open val otherCollider: Any
    open val separation: Any
}

external enum class CollisionFlags {
    None /* = 0 */,
    Sides /* = 1 */,
    Above /* = 2 */,
    Below /* = 4 */,
    CollidedSides /* = 1 */,
    CollidedAbove /* = 2 */,
    CollidedBelow /* = 4 */
}

external enum class QueryTriggerInteraction {
    UseGlobal /* = 0 */,
    Ignore /* = 1 */,
    Collide /* = 2 */
}

external enum class CollisionDetectionMode {
    Discrete /* = 0 */,
    Continuous /* = 1 */,
    ContinuousDynamic /* = 2 */,
    ContinuousSpeculative /* = 3 */
}

external enum class ConfigurableJointMotion {
    Locked /* = 0 */,
    Limited /* = 1 */,
    Free /* = 2 */
}

external enum class RotationDriveMode {
    XYAndZ /* = 0 */,
    Slerp /* = 1 */
}

external enum class ArticulationJointType {
    FixedJoint /* = 0 */,
    PrismaticJoint /* = 1 */,
    RevoluteJoint /* = 2 */,
    SphericalJoint /* = 3 */
}

external enum class ArticulationDofLock {
    LockedMotion /* = 0 */,
    LimitedMotion /* = 1 */,
    FreeMotion /* = 2 */
}

external open class ArticulationDrive : ValueType {
    open var lowerLimit: Number
    open var upperLimit: Number
    open var stiffness: Number
    open var damping: Number
    open var forceLimit: Number
    open var target: Number
    open var targetVelocity: Number
}

external open class ArticulationReducedSpace : ValueType {
    constructor(`$a`: Number)
    constructor(`$a`: Number, `$b`: Number)
    constructor(`$a`: Number, `$b`: Number, `$c`: Number)
    constructor()
    open var dofCount: Number
    open fun get_Item(`$i`: Number): Number
    open fun set_Item(`$i`: Number, `$value`: Number)
}

external open class ArticulationJacobian : ValueType {
    constructor(`$rows`: Number, `$cols`: Number)
    constructor()
    open var `var`: Any
    open var rows: Any
    open var columns: Any
}

external open class Physics : csharp.System.Object {
    companion object {
        var IgnoreRaycastLayer: Number
        var DefaultRaycastLayers: Number
        var AllLayers: Number
        fun add_ContactModifyEvent(`$value`: `Action$2`<PhysicsScene, `NativeArray$1`<ModifiableContactPair>>)
        fun remove_ContactModifyEvent(`$value`: `Action$2`<PhysicsScene, `NativeArray$1`<ModifiableContactPair>>)
        fun add_ContactModifyEventCCD(`$value`: `Action$2`<PhysicsScene, `NativeArray$1`<ModifiableContactPair>>)
        fun remove_ContactModifyEventCCD(`$value`: `Action$2`<PhysicsScene, `NativeArray$1`<ModifiableContactPair>>)
        fun IgnoreCollision(`$collider1`: Collider, `$collider2`: Collider, `$ignore`: Boolean)
        fun IgnoreCollision(`$collider1`: Collider, `$collider2`: Collider)
        fun IgnoreLayerCollision(`$layer1`: Number, `$layer2`: Number, `$ignore`: Boolean)
        fun IgnoreLayerCollision(`$layer1`: Number, `$layer2`: Number)
        fun GetIgnoreLayerCollision(`$layer1`: Number, `$layer2`: Number): Boolean
        fun GetIgnoreCollision(`$collider1`: Collider, `$collider2`: Collider): Boolean
        fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number): Boolean
        fun Raycast(`$origin`: Vector3, `$direction`: Vector3): Boolean
        fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number): Boolean
        fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
        fun Raycast(`$ray`: Ray, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun Raycast(`$ray`: Ray, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun Raycast(`$ray`: Ray, `$maxDistance`: Number): Boolean
        fun Raycast(`$ray`: Ray): Boolean
        fun Raycast(`$ray`: Ray, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun Raycast(`$ray`: Ray, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun Raycast(`$ray`: Ray, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number): Boolean
        fun Raycast(`$ray`: Ray, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
        fun Linecast(`$start`: Vector3, `$end`: Vector3, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun Linecast(`$start`: Vector3, `$end`: Vector3, `$layerMask`: Number): Boolean
        fun Linecast(`$start`: Vector3, `$end`: Vector3): Boolean
        fun Linecast(`$start`: Vector3, `$end`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun Linecast(`$start`: Vector3, `$end`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$layerMask`: Number): Boolean
        fun Linecast(`$start`: Vector3, `$end`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
        fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number): Boolean
        fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3): Boolean
        fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number): Boolean
        fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
        fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number): Boolean
        fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
        fun SphereCast(`$ray`: Ray, `$radius`: Number, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun SphereCast(`$ray`: Ray, `$radius`: Number, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun SphereCast(`$ray`: Ray, `$radius`: Number, `$maxDistance`: Number): Boolean
        fun SphereCast(`$ray`: Ray, `$radius`: Number): Boolean
        fun SphereCast(`$ray`: Ray, `$radius`: Number, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun SphereCast(`$ray`: Ray, `$radius`: Number, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun SphereCast(`$ray`: Ray, `$radius`: Number, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number): Boolean
        fun SphereCast(`$ray`: Ray, `$radius`: Number, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$orientation`: Quaternion, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$orientation`: Quaternion, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$orientation`: Quaternion, `$maxDistance`: Number): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$orientation`: Quaternion): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number, `$layerMask`: Number): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$orientation`: Quaternion): Boolean
        fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
        fun RaycastAll(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<RaycastHit>
        fun RaycastAll(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit>
        fun RaycastAll(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number): `Array$1`<RaycastHit>
        fun RaycastAll(`$origin`: Vector3, `$direction`: Vector3): `Array$1`<RaycastHit>
        fun RaycastAll(`$ray`: Ray, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<RaycastHit>
        fun RaycastAll(`$ray`: Ray, `$maxDistance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit>
        fun RaycastAll(`$ray`: Ray, `$maxDistance`: Number): `Array$1`<RaycastHit>
        fun RaycastAll(`$ray`: Ray): `Array$1`<RaycastHit>
        fun RaycastNonAlloc(`$ray`: Ray, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun RaycastNonAlloc(`$ray`: Ray, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Number
        fun RaycastNonAlloc(`$ray`: Ray, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number): Number
        fun RaycastNonAlloc(`$ray`: Ray, `$results`: `Array$1`<RaycastHit>): Number
        fun RaycastNonAlloc(`$origin`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun RaycastNonAlloc(`$origin`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Number
        fun RaycastNonAlloc(`$origin`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number): Number
        fun RaycastNonAlloc(`$origin`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>): Number
        fun CapsuleCastAll(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<RaycastHit>
        fun CapsuleCastAll(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit>
        fun CapsuleCastAll(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number): `Array$1`<RaycastHit>
        fun CapsuleCastAll(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3): `Array$1`<RaycastHit>
        fun SphereCastAll(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<RaycastHit>
        fun SphereCastAll(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit>
        fun SphereCastAll(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$maxDistance`: Number): `Array$1`<RaycastHit>
        fun SphereCastAll(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3): `Array$1`<RaycastHit>
        fun SphereCastAll(`$ray`: Ray, `$radius`: Number, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<RaycastHit>
        fun SphereCastAll(`$ray`: Ray, `$radius`: Number, `$maxDistance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit>
        fun SphereCastAll(`$ray`: Ray, `$radius`: Number, `$maxDistance`: Number): `Array$1`<RaycastHit>
        fun SphereCastAll(`$ray`: Ray, `$radius`: Number): `Array$1`<RaycastHit>
        fun OverlapCapsule(`$point0`: Vector3, `$point1`: Vector3, `$radius`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<Collider>
        fun OverlapCapsule(`$point0`: Vector3, `$point1`: Vector3, `$radius`: Number, `$layerMask`: Number): `Array$1`<Collider>
        fun OverlapCapsule(`$point0`: Vector3, `$point1`: Vector3, `$radius`: Number): `Array$1`<Collider>
        fun OverlapSphere(`$position`: Vector3, `$radius`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<Collider>
        fun OverlapSphere(`$position`: Vector3, `$radius`: Number, `$layerMask`: Number): `Array$1`<Collider>
        fun OverlapSphere(`$position`: Vector3, `$radius`: Number): `Array$1`<Collider>
        fun Simulate(`$step`: Number)
        fun SyncTransforms()
        fun ComputePenetration(`$colliderA`: Collider, `$positionA`: Vector3, `$rotationA`: Quaternion, `$colliderB`: Collider, `$positionB`: Vector3, `$rotationB`: Quaternion, `$direction`: `$Ref`<Vector3>, `$distance`: `$Ref`<Number>): Boolean
        fun ClosestPoint(`$point`: Vector3, `$collider`: Collider, `$position`: Vector3, `$rotation`: Quaternion): Vector3
        fun OverlapSphereNonAlloc(`$position`: Vector3, `$radius`: Number, `$results`: `Array$1`<Collider>, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun OverlapSphereNonAlloc(`$position`: Vector3, `$radius`: Number, `$results`: `Array$1`<Collider>, `$layerMask`: Number): Number
        fun OverlapSphereNonAlloc(`$position`: Vector3, `$radius`: Number, `$results`: `Array$1`<Collider>): Number
        fun CheckSphere(`$position`: Vector3, `$radius`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun CheckSphere(`$position`: Vector3, `$radius`: Number, `$layerMask`: Number): Boolean
        fun CheckSphere(`$position`: Vector3, `$radius`: Number): Boolean
        fun CapsuleCastNonAlloc(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun CapsuleCastNonAlloc(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Number
        fun CapsuleCastNonAlloc(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number): Number
        fun CapsuleCastNonAlloc(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>): Number
        fun SphereCastNonAlloc(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun SphereCastNonAlloc(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Number
        fun SphereCastNonAlloc(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number): Number
        fun SphereCastNonAlloc(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>): Number
        fun SphereCastNonAlloc(`$ray`: Ray, `$radius`: Number, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun SphereCastNonAlloc(`$ray`: Ray, `$radius`: Number, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number, `$layerMask`: Number): Number
        fun SphereCastNonAlloc(`$ray`: Ray, `$radius`: Number, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number): Number
        fun SphereCastNonAlloc(`$ray`: Ray, `$radius`: Number, `$results`: `Array$1`<RaycastHit>): Number
        fun CheckCapsule(`$start`: Vector3, `$end`: Vector3, `$radius`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun CheckCapsule(`$start`: Vector3, `$end`: Vector3, `$radius`: Number, `$layerMask`: Number): Boolean
        fun CheckCapsule(`$start`: Vector3, `$end`: Vector3, `$radius`: Number): Boolean
        fun CheckBox(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion, `$layermask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Boolean
        fun CheckBox(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion, `$layerMask`: Number): Boolean
        fun CheckBox(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion): Boolean
        fun CheckBox(`$center`: Vector3, `$halfExtents`: Vector3): Boolean
        fun OverlapBox(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<Collider>
        fun OverlapBox(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion, `$layerMask`: Number): `Array$1`<Collider>
        fun OverlapBox(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion): `Array$1`<Collider>
        fun OverlapBox(`$center`: Vector3, `$halfExtents`: Vector3): `Array$1`<Collider>
        fun OverlapBoxNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$results`: `Array$1`<Collider>, `$orientation`: Quaternion, `$mask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun OverlapBoxNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$results`: `Array$1`<Collider>, `$orientation`: Quaternion, `$mask`: Number): Number
        fun OverlapBoxNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$results`: `Array$1`<Collider>, `$orientation`: Quaternion): Number
        fun OverlapBoxNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$results`: `Array$1`<Collider>): Number
        fun BoxCastNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun BoxCastNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$orientation`: Quaternion): Number
        fun BoxCastNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number): Number
        fun BoxCastNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number, `$layerMask`: Number): Number
        fun BoxCastNonAlloc(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>): Number
        fun BoxCastAll(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$orientation`: Quaternion, `$maxDistance`: Number, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): `Array$1`<RaycastHit>
        fun BoxCastAll(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$orientation`: Quaternion, `$maxDistance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit>
        fun BoxCastAll(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$orientation`: Quaternion, `$maxDistance`: Number): `Array$1`<RaycastHit>
        fun BoxCastAll(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$orientation`: Quaternion): `Array$1`<RaycastHit>
        fun BoxCastAll(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3): `Array$1`<RaycastHit>
        fun OverlapCapsuleNonAlloc(`$point0`: Vector3, `$point1`: Vector3, `$radius`: Number, `$results`: `Array$1`<Collider>, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
        fun OverlapCapsuleNonAlloc(`$point0`: Vector3, `$point1`: Vector3, `$radius`: Number, `$results`: `Array$1`<Collider>, `$layerMask`: Number): Number
        fun OverlapCapsuleNonAlloc(`$point0`: Vector3, `$point1`: Vector3, `$radius`: Number, `$results`: `Array$1`<Collider>): Number
        fun RebuildBroadphaseRegions(`$worldBounds`: Bounds, `$subdivisions`: Number)
        fun BakeMesh(`$meshID`: Number, `$convex`: Boolean)
    }
}

external open class PhysicsScene : ValueType, `IEquatable$1`<PhysicsScene> {
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: PhysicsScene): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun IsValid(): Boolean
    open fun IsEmpty(): Boolean
    open fun Simulate(`$step`: Number)
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Boolean
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3): Boolean
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number = definedExternally): Boolean
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Boolean
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Boolean
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally): Boolean
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Boolean
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$raycastHits`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Number
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$raycastHits`: `Array$1`<RaycastHit>): Number
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$raycastHits`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally): Number
    open fun Raycast(`$origin`: Vector3, `$direction`: Vector3, `$raycastHits`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Number
    open fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Boolean
    open fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
    open fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally): Boolean
    open fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Boolean
    open fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Number
    open fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>): Number
    open fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally): Number
    open fun CapsuleCast(`$point1`: Vector3, `$point2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Number
    open fun OverlapCapsule(`$point0`: Vector3, `$point1`: Vector3, `$radius`: Number, `$results`: `Array$1`<Collider>, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Number
    open fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Boolean
    open fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
    open fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally): Boolean
    open fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Boolean
    open fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Number
    open fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>): Number
    open fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally): Number
    open fun SphereCast(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Number
    open fun OverlapSphere(`$position`: Vector3, `$radius`: Number, `$results`: `Array$1`<Collider>, `$layerMask`: Number, `$queryTriggerInteraction`: QueryTriggerInteraction): Number
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Boolean
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$orientation`: Quaternion): Boolean
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number = definedExternally): Boolean
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Boolean
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$hitInfo`: `$Ref`<RaycastHit>): Boolean
    open fun OverlapBox(`$center`: Vector3, `$halfExtents`: Vector3, `$results`: `Array$1`<Collider>, `$orientation`: Quaternion, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Number
    open fun OverlapBox(`$center`: Vector3, `$halfExtents`: Vector3, `$results`: `Array$1`<Collider>, `$orientation`: Quaternion): Number
    open fun OverlapBox(`$center`: Vector3, `$halfExtents`: Vector3, `$results`: `Array$1`<Collider>, `$orientation`: Quaternion, `$layerMask`: Number = definedExternally): Number
    open fun OverlapBox(`$center`: Vector3, `$halfExtents`: Vector3, `$results`: `Array$1`<Collider>): Number
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$queryTriggerInteraction`: QueryTriggerInteraction = definedExternally): Number
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$orientation`: Quaternion): Number
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number = definedExternally): Number
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>, `$orientation`: Quaternion, `$maxDistance`: Number = definedExternally, `$layerMask`: Number = definedExternally): Number
    open fun BoxCast(`$center`: Vector3, `$halfExtents`: Vector3, `$direction`: Vector3, `$results`: `Array$1`<RaycastHit>): Number

    companion object {
        fun op_Equality(`$lhs`: PhysicsScene, `$rhs`: PhysicsScene): Boolean
        fun op_Inequality(`$lhs`: PhysicsScene, `$rhs`: PhysicsScene): Boolean
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class ModifiableContactPair : ValueType {
    open var rotation: Quaternion
    open var position: Vector3
    open var otherRotation: Quaternion
    open var otherPosition: Vector3
    open var `var`: Any
    open val colliderInstanceID: Any
    open val otherColliderInstanceID: Any
    open val bodyInstanceID: Any
    open val otherBodyInstanceID: Any
    open val contactCount: Any
    open var massProperties: Any
    open fun GetPoint(`$i`: Number): Vector3
    open fun SetPoint(`$i`: Number, `$v`: Vector3)
    open fun GetNormal(`$i`: Number): Vector3
    open fun SetNormal(`$i`: Number, `$normal`: Vector3)
    open fun GetSeparation(`$i`: Number): Number
    open fun SetSeparation(`$i`: Number, `$separation`: Number)
    open fun GetTargetVelocity(`$i`: Number): Vector3
    open fun SetTargetVelocity(`$i`: Number, `$velocity`: Vector3)
    open fun GetBounciness(`$i`: Number): Number
    open fun SetBounciness(`$i`: Number, `$bounciness`: Number)
    open fun GetStaticFriction(`$i`: Number): Number
    open fun SetStaticFriction(`$i`: Number, `$staticFriction`: Number)
    open fun GetDynamicFriction(`$i`: Number): Number
    open fun SetDynamicFriction(`$i`: Number, `$dynamicFriction`: Number)
    open fun GetMaxImpulse(`$i`: Number): Number
    open fun SetMaxImpulse(`$i`: Number, `$value`: Number)
    open fun IgnoreContact(`$i`: Number)
    open fun GetFaceIndex(`$i`: Number): Number
}

external open class RaycastHit : ValueType {
    open var `var`: Any
    open val collider: Any
    open val colliderInstanceID: Any
    open var distance: Any
    open val triangleIndex: Any
    open val transform: Any
    open val rigidbody: Any
    open val articulationBody: Any
}

external open class ModifiableMassProperties : ValueType {
    open var inverseMassScale: Number
    open var inverseInertiaScale: Number
    open var otherInverseMassScale: Number
    open var otherInverseInertiaScale: Number
}

external open class PhysicMaterial : Object {
    constructor()
    constructor(`$name`: String)
    override var `var`: Any
    open var bounciness: Any
    open var dynamicFriction: Any
    open var staticFriction: Any
    open var frictionCombine: Any
    open var bounceCombine: Any
}

external open class MeshCollider : Collider {
    override var `var`: Any
    open var sharedMesh: Any
    open var convex: Any
    open var cookingOptions: Any
}

external open class BoxCollider : Collider

external open class ConstantForce : Behaviour

external open class Joint : Component {
    override var `var`: Any
    open var connectedBody: Any
    open var connectedArticulationBody: Any
    open var autoConfigureConnectedAnchor: Any
    open var breakForce: Any
    open var breakTorque: Any
    open var enableCollision: Any
    open var enablePreprocessing: Any
    open var massScale: Any
    open var connectedMassScale: Any
}

external open class HingeJoint : Joint {
    override var `var`: Any
    open var motor: Any
    open var limits: Any
    open var spring: Any
    open var useMotor: Any
    open var useLimits: Any
    open var useSpring: Any
    open val velocity: Any
    open val angle: Any
}

external open class SpringJoint : Joint {
    override var `var`: Any
    open var spring: Any
    open var damper: Any
    open var minDistance: Any
    open var maxDistance: Any
    open var tolerance: Any
}

external open class FixedJoint : Joint

external open class CharacterJoint : Joint {
    override var `var`: Any
    open var twistLimitSpring: Any
    open var swingLimitSpring: Any
    open var lowTwistLimit: Any
    open var highTwistLimit: Any
    open var enableProjection: Any
    open var projectionDistance: Any
    open var projectionAngle: Any
}

external open class ConfigurableJoint : Joint {
    override var `var`: Any
    open var xMotion: Any
    open var yMotion: Any
    open var zMotion: Any
    open var angularXMotion: Any
    open var angularYMotion: Any
    open var angularZMotion: Any
    open var linearLimitSpring: Any
    open var angularXLimitSpring: Any
    open var angularYZLimitSpring: Any
    open var linearLimit: Any
    open var lowAngularXLimit: Any
    open var highAngularXLimit: Any
    open var angularYLimit: Any
    open var angularZLimit: Any
    open var xDrive: Any
    open var yDrive: Any
    open var zDrive: Any
    open var targetRotation: Any
    open var rotationDriveMode: Any
    open var angularXDrive: Any
    open var angularYZDrive: Any
    open var slerpDrive: Any
    open var projectionMode: Any
    open var projectionDistance: Any
    open var projectionAngle: Any
    open var configuredInWorldSpace: Any
    open var swapBodies: Any
}

external open class PhysicsSceneExtensions : csharp.System.Object {
    companion object {
        fun GetPhysicsScene(`$scene`: Scene): PhysicsScene
    }
}

external open class RaycastCommand : ValueType {
    constructor(`$from`: Vector3, `$direction`: Vector3, `$distance`: Number = definedExternally, `$layerMask`: Number = definedExternally, `$maxHits`: Number = definedExternally)
    constructor(`$from`: Vector3, `$direction`: Vector3)
    constructor(`$from`: Vector3, `$direction`: Vector3, `$distance`: Number = definedExternally)
    constructor(`$from`: Vector3, `$direction`: Vector3, `$distance`: Number = definedExternally, `$layerMask`: Number = definedExternally)
    constructor()
    open var `var`: Any
    open var distance: Any
    open var layerMask: Any
    open var maxHits: Any

    companion object {
        fun ScheduleBatch(`$commands`: `NativeArray$1`<RaycastCommand>, `$results`: `NativeArray$1`<RaycastHit>, `$minCommandsPerJob`: Number, `$dependsOn`: JobHandle = definedExternally): JobHandle
    }
}

external open class SpherecastCommand : ValueType {
    constructor(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$distance`: Number = definedExternally, `$layerMask`: Number = definedExternally)
    constructor(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3)
    constructor(`$origin`: Vector3, `$radius`: Number, `$direction`: Vector3, `$distance`: Number = definedExternally)
    constructor()
    open var `var`: Any
    open var radius: Any
    open var distance: Any
    open var layerMask: Any

    companion object {
        fun ScheduleBatch(`$commands`: `NativeArray$1`<SpherecastCommand>, `$results`: `NativeArray$1`<RaycastHit>, `$minCommandsPerJob`: Number, `$dependsOn`: JobHandle = definedExternally): JobHandle
    }
}

external open class CapsulecastCommand : ValueType {
    constructor(`$p1`: Vector3, `$p2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$distance`: Number = definedExternally, `$layerMask`: Number = definedExternally)
    constructor(`$p1`: Vector3, `$p2`: Vector3, `$radius`: Number, `$direction`: Vector3)
    constructor(`$p1`: Vector3, `$p2`: Vector3, `$radius`: Number, `$direction`: Vector3, `$distance`: Number = definedExternally)
    constructor()
    open var `var`: Any
    open var radius: Any
    open var distance: Any
    open var layerMask: Any

    companion object {
        fun ScheduleBatch(`$commands`: `NativeArray$1`<CapsulecastCommand>, `$results`: `NativeArray$1`<RaycastHit>, `$minCommandsPerJob`: Number, `$dependsOn`: JobHandle = definedExternally): JobHandle
    }
}

external open class BoxcastCommand : ValueType {
    constructor(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion, `$direction`: Vector3, `$distance`: Number = definedExternally, `$layerMask`: Number = definedExternally)
    constructor(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion, `$direction`: Vector3)
    constructor(`$center`: Vector3, `$halfExtents`: Vector3, `$orientation`: Quaternion, `$direction`: Vector3, `$distance`: Number = definedExternally)
    constructor()
    open var `var`: Any
    open var orientation: Any
    open var distance: Any
    open var layerMask: Any

    companion object {
        fun ScheduleBatch(`$commands`: `NativeArray$1`<BoxcastCommand>, `$results`: `NativeArray$1`<RaycastHit>, `$minCommandsPerJob`: Number, `$dependsOn`: JobHandle = definedExternally): JobHandle
    }
}

external open class PhysicsScene2D : ValueType, `IEquatable$1`<PhysicsScene2D> {
    override fun Equals(`$other`: Any): Boolean
    open fun Equals(`$other`: PhysicsScene2D): Boolean
    override fun Equals(`$obj`: Any): Boolean
    open fun IsValid(): Boolean
    open fun IsEmpty(): Boolean
    open fun Simulate(`$step`: Number): Boolean
    open fun Linecast(`$start`: Vector2, `$end`: Vector2, `$layerMask`: Number = definedExternally): RaycastHit2D
    open fun Linecast(`$start`: Vector2, `$end`: Vector2): RaycastHit2D
    open fun Linecast(`$start`: Vector2, `$end`: Vector2, `$contactFilter`: ContactFilter2D): RaycastHit2D
    open fun Linecast(`$start`: Vector2, `$end`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number = definedExternally): Number
    open fun Linecast(`$start`: Vector2, `$end`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Linecast(`$start`: Vector2, `$end`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Linecast(`$start`: Vector2, `$end`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>): Number
    open fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number = definedExternally): RaycastHit2D
    open fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number): RaycastHit2D
    open fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D): RaycastHit2D
    open fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number = definedExternally): Number
    open fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>): Number
    open fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number = definedExternally): RaycastHit2D
    open fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number): RaycastHit2D
    open fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D): RaycastHit2D
    open fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number = definedExternally): Number
    open fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>): Number
    open fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number = definedExternally): RaycastHit2D
    open fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number): RaycastHit2D
    open fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D): RaycastHit2D
    open fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number = definedExternally): Number
    open fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>): Number
    open fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number = definedExternally): RaycastHit2D
    open fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number): RaycastHit2D
    open fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D): RaycastHit2D
    open fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number = definedExternally): Number
    open fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>): Number
    open fun GetRayIntersection(`$ray`: Ray, `$distance`: Number, `$layerMask`: Number = definedExternally): RaycastHit2D
    open fun GetRayIntersection(`$ray`: Ray, `$distance`: Number): RaycastHit2D
    open fun GetRayIntersection(`$ray`: Ray, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number = definedExternally): Number
    open fun GetRayIntersection(`$ray`: Ray, `$distance`: Number, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun OverlapPoint(`$point`: Vector2, `$layerMask`: Number = definedExternally): Collider2D
    open fun OverlapPoint(`$point`: Vector2): Collider2D
    open fun OverlapPoint(`$point`: Vector2, `$contactFilter`: ContactFilter2D): Collider2D
    open fun OverlapPoint(`$point`: Vector2, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number = definedExternally): Number
    open fun OverlapPoint(`$point`: Vector2, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapPoint(`$point`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapPoint(`$point`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
    open fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$layerMask`: Number = definedExternally): Collider2D
    open fun OverlapCircle(`$point`: Vector2, `$radius`: Number): Collider2D
    open fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$contactFilter`: ContactFilter2D): Collider2D
    open fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number = definedExternally): Number
    open fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
    open fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$layerMask`: Number = definedExternally): Collider2D
    open fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number): Collider2D
    open fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$contactFilter`: ContactFilter2D): Collider2D
    open fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number = definedExternally): Number
    open fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
    open fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$layerMask`: Number = definedExternally): Collider2D
    open fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2): Collider2D
    open fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$contactFilter`: ContactFilter2D): Collider2D
    open fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number = definedExternally): Number
    open fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
    open fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$layerMask`: Number = definedExternally): Collider2D
    open fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number): Collider2D
    open fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$contactFilter`: ContactFilter2D): Collider2D
    open fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number = definedExternally): Number
    open fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number

    companion object {
        fun op_Equality(`$lhs`: PhysicsScene2D, `$rhs`: PhysicsScene2D): Boolean
        fun op_Inequality(`$lhs`: PhysicsScene2D, `$rhs`: PhysicsScene2D): Boolean
        fun OverlapCollider(`$collider`: Collider2D, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number = definedExternally): Number
        fun OverlapCollider(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapCollider(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class RaycastHit2D : ValueType {
    open var `var`: Any
    open var distance: Any
    open var fraction: Any
    open val transform: Any
    open fun CompareTo(`$other`: RaycastHit2D): Number

    companion object {
        fun op_Implicit(`$hit`: RaycastHit2D): Boolean
    }
}

external open class ContactFilter2D : ValueType {
    open var useTriggers: Boolean
    open var useLayerMask: Boolean
    open var useDepth: Boolean
    open var useOutsideDepth: Boolean
    open var useNormalAngle: Boolean
    open var useOutsideNormalAngle: Boolean
    open var layerMask: LayerMask
    open var minDepth: Number
    open var maxDepth: Number
    open var minNormalAngle: Number
    open var maxNormalAngle: Number
    open var `var`: Any
    open val isFiltering: Any
    open fun NoFilter(): ContactFilter2D
    open fun ClearLayerMask()
    open fun SetLayerMask(`$layerMask`: LayerMask)
    open fun ClearDepth()
    open fun SetDepth(`$minDepth`: Number, `$maxDepth`: Number)
    open fun ClearNormalAngle()
    open fun SetNormalAngle(`$minNormalAngle`: Number, `$maxNormalAngle`: Number)
    open fun IsFilteringTrigger(`$collider`: Collider2D): Boolean
    open fun IsFilteringLayerMask(`$obj`: GameObject): Boolean
    open fun IsFilteringDepth(`$obj`: GameObject): Boolean
    open fun IsFilteringNormalAngle(`$normal`: Vector2): Boolean
    open fun IsFilteringNormalAngle(`$angle`: Number): Boolean

    companion object {
        var NormalAngleUpperLimit: Number
    }
}

external enum class CapsuleDirection2D {
    Vertical /* = 0 */,
    Horizontal /* = 1 */
}

external open class Collider2D : Behaviour {
    override var `var`: Any
    open var density: Any
    open var isTrigger: Any
    open var usedByEffector: Any
    open var usedByComposite: Any
    open val shapeCount: Any
    open val bounds: Any
    open val friction: Any
    open val bounciness: Any
    open fun CreateMesh(`$useBodyPosition`: Boolean, `$useBodyRotation`: Boolean): Mesh
    open fun GetShapeHash(): Number
    open fun GetShapes(`$physicsShapeGroup`: PhysicsShapeGroup2D): Number
    open fun GetShapes(`$physicsShapeGroup`: PhysicsShapeGroup2D, `$shapeIndex`: Number, `$shapeCount`: Number = definedExternally): Number
    open fun GetShapes(`$physicsShapeGroup`: PhysicsShapeGroup2D, `$shapeIndex`: Number): Number
    open fun IsTouching(`$collider`: Collider2D): Boolean
    open fun IsTouching(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D): Boolean
    open fun IsTouching(`$contactFilter`: ContactFilter2D): Boolean
    open fun IsTouchingLayers(): Boolean
    open fun IsTouchingLayers(`$layerMask`: Number): Boolean
    open fun OverlapPoint(`$point`: Vector2): Boolean
    open fun Distance(`$collider`: Collider2D): ColliderDistance2D
    open fun OverlapCollider(`$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapCollider(`$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
    open fun GetContacts(`$contacts`: `Array$1`<ContactPoint2D>): Number
    open fun GetContacts(`$contacts`: `List$1`<ContactPoint2D>): Number
    open fun GetContacts(`$contactFilter`: ContactFilter2D, `$contacts`: `Array$1`<ContactPoint2D>): Number
    open fun GetContacts(`$contactFilter`: ContactFilter2D, `$contacts`: `List$1`<ContactPoint2D>): Number
    open fun GetContacts(`$colliders`: `Array$1`<Collider2D>): Number
    open fun GetContacts(`$colliders`: `List$1`<Collider2D>): Number
    open fun GetContacts(`$contactFilter`: ContactFilter2D, `$colliders`: `Array$1`<Collider2D>): Number
    open fun GetContacts(`$contactFilter`: ContactFilter2D, `$colliders`: `List$1`<Collider2D>): Number
    open fun Cast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Cast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
    open fun Cast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$ignoreSiblingColliders`: Boolean): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$ignoreSiblingColliders`: Boolean): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number = definedExternally, `$ignoreSiblingColliders`: Boolean = definedExternally): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number = definedExternally): Number
    open fun Raycast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Raycast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
    open fun Raycast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number): Number
    open fun Raycast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): Number
    open fun Raycast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
    open fun Raycast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Raycast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
    open fun Raycast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number = definedExternally): Number
    open fun Raycast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>): Number
    open fun ClosestPoint(`$position`: Vector2): Vector2
}

external open class PhysicsSceneExtensions2D : csharp.System.Object {
    companion object {
        fun GetPhysicsScene2D(`$scene`: Scene): PhysicsScene2D
    }
}

external open class Physics2D : csharp.System.Object {
    companion object {
        var IgnoreRaycastLayer: Number
        var DefaultRaycastLayers: Number
        var AllLayers: Number
        var MaxPolygonShapeVertices: Number
        fun Simulate(`$step`: Number): Boolean
        fun SyncTransforms()
        fun IgnoreCollision(`$collider1`: Collider2D, `$collider2`: Collider2D)
        fun IgnoreCollision(`$collider1`: Collider2D, `$collider2`: Collider2D, `$ignore`: Boolean)
        fun GetIgnoreCollision(`$collider1`: Collider2D, `$collider2`: Collider2D): Boolean
        fun IgnoreLayerCollision(`$layer1`: Number, `$layer2`: Number)
        fun IgnoreLayerCollision(`$layer1`: Number, `$layer2`: Number, `$ignore`: Boolean)
        fun GetIgnoreLayerCollision(`$layer1`: Number, `$layer2`: Number): Boolean
        fun SetLayerCollisionMask(`$layer`: Number, `$layerMask`: Number)
        fun GetLayerCollisionMask(`$layer`: Number): Number
        fun IsTouching(`$collider1`: Collider2D, `$collider2`: Collider2D): Boolean
        fun IsTouching(`$collider1`: Collider2D, `$collider2`: Collider2D, `$contactFilter`: ContactFilter2D): Boolean
        fun IsTouching(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D): Boolean
        fun IsTouchingLayers(`$collider`: Collider2D): Boolean
        fun IsTouchingLayers(`$collider`: Collider2D, `$layerMask`: Number): Boolean
        fun Distance(`$colliderA`: Collider2D, `$colliderB`: Collider2D): ColliderDistance2D
        fun ClosestPoint(`$position`: Vector2, `$collider`: Collider2D): Vector2
        fun ClosestPoint(`$position`: Vector2, `$rigidbody`: Rigidbody2D): Vector2
        fun Linecast(`$start`: Vector2, `$end`: Vector2): RaycastHit2D
        fun Linecast(`$start`: Vector2, `$end`: Vector2, `$layerMask`: Number): RaycastHit2D
        fun Linecast(`$start`: Vector2, `$end`: Vector2, `$layerMask`: Number, `$minDepth`: Number): RaycastHit2D
        fun Linecast(`$start`: Vector2, `$end`: Vector2, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): RaycastHit2D
        fun Linecast(`$start`: Vector2, `$end`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
        fun Linecast(`$start`: Vector2, `$end`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>): Number
        fun LinecastAll(`$start`: Vector2, `$end`: Vector2): `Array$1`<RaycastHit2D>
        fun LinecastAll(`$start`: Vector2, `$end`: Vector2, `$layerMask`: Number): `Array$1`<RaycastHit2D>
        fun LinecastAll(`$start`: Vector2, `$end`: Vector2, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<RaycastHit2D>
        fun LinecastAll(`$start`: Vector2, `$end`: Vector2, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<RaycastHit2D>
        fun LinecastNonAlloc(`$start`: Vector2, `$end`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
        fun LinecastNonAlloc(`$start`: Vector2, `$end`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number): Number
        fun LinecastNonAlloc(`$start`: Vector2, `$end`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number, `$minDepth`: Number): Number
        fun LinecastNonAlloc(`$start`: Vector2, `$end`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun Raycast(`$origin`: Vector2, `$direction`: Vector2): RaycastHit2D
        fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number): RaycastHit2D
        fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number): RaycastHit2D
        fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): RaycastHit2D
        fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): RaycastHit2D
        fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
        fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun Raycast(`$origin`: Vector2, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number = definedExternally): Number
        fun RaycastNonAlloc(`$origin`: Vector2, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
        fun RaycastNonAlloc(`$origin`: Vector2, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun RaycastNonAlloc(`$origin`: Vector2, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number): Number
        fun RaycastNonAlloc(`$origin`: Vector2, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): Number
        fun RaycastNonAlloc(`$origin`: Vector2, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun RaycastAll(`$origin`: Vector2, `$direction`: Vector2): `Array$1`<RaycastHit2D>
        fun RaycastAll(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number): `Array$1`<RaycastHit2D>
        fun RaycastAll(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit2D>
        fun RaycastAll(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<RaycastHit2D>
        fun RaycastAll(`$origin`: Vector2, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<RaycastHit2D>
        fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2): RaycastHit2D
        fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number): RaycastHit2D
        fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number): RaycastHit2D
        fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): RaycastHit2D
        fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): RaycastHit2D
        fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
        fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun CircleCast(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number = definedExternally): Number
        fun CircleCastAll(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2): `Array$1`<RaycastHit2D>
        fun CircleCastAll(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number): `Array$1`<RaycastHit2D>
        fun CircleCastAll(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit2D>
        fun CircleCastAll(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<RaycastHit2D>
        fun CircleCastAll(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<RaycastHit2D>
        fun CircleCastNonAlloc(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
        fun CircleCastNonAlloc(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun CircleCastNonAlloc(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number): Number
        fun CircleCastNonAlloc(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): Number
        fun CircleCastNonAlloc(`$origin`: Vector2, `$radius`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2): RaycastHit2D
        fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number): RaycastHit2D
        fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number): RaycastHit2D
        fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): RaycastHit2D
        fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): RaycastHit2D
        fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
        fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun BoxCast(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number = definedExternally): Number
        fun BoxCastAll(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2): `Array$1`<RaycastHit2D>
        fun BoxCastAll(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number): `Array$1`<RaycastHit2D>
        fun BoxCastAll(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit2D>
        fun BoxCastAll(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<RaycastHit2D>
        fun BoxCastAll(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<RaycastHit2D>
        fun BoxCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
        fun BoxCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun BoxCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number): Number
        fun BoxCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): Number
        fun BoxCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2): RaycastHit2D
        fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number): RaycastHit2D
        fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number): RaycastHit2D
        fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): RaycastHit2D
        fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): RaycastHit2D
        fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
        fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun CapsuleCast(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number = definedExternally): Number
        fun CapsuleCastAll(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2): `Array$1`<RaycastHit2D>
        fun CapsuleCastAll(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number): `Array$1`<RaycastHit2D>
        fun CapsuleCastAll(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit2D>
        fun CapsuleCastAll(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<RaycastHit2D>
        fun CapsuleCastAll(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<RaycastHit2D>
        fun CapsuleCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
        fun CapsuleCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun CapsuleCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number): Number
        fun CapsuleCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number): Number
        fun CapsuleCastNonAlloc(`$origin`: Vector2, `$size`: Vector2, `$capsuleDirection`: CapsuleDirection2D, `$angle`: Number, `$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun GetRayIntersection(`$ray`: Ray): RaycastHit2D
        fun GetRayIntersection(`$ray`: Ray, `$distance`: Number): RaycastHit2D
        fun GetRayIntersection(`$ray`: Ray, `$distance`: Number, `$layerMask`: Number): RaycastHit2D
        fun GetRayIntersectionAll(`$ray`: Ray): `Array$1`<RaycastHit2D>
        fun GetRayIntersectionAll(`$ray`: Ray, `$distance`: Number): `Array$1`<RaycastHit2D>
        fun GetRayIntersectionAll(`$ray`: Ray, `$distance`: Number, `$layerMask`: Number): `Array$1`<RaycastHit2D>
        fun GetRayIntersectionNonAlloc(`$ray`: Ray, `$results`: `Array$1`<RaycastHit2D>): Number
        fun GetRayIntersectionNonAlloc(`$ray`: Ray, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
        fun GetRayIntersectionNonAlloc(`$ray`: Ray, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number, `$layerMask`: Number): Number
        fun OverlapPoint(`$point`: Vector2): Collider2D
        fun OverlapPoint(`$point`: Vector2, `$layerMask`: Number): Collider2D
        fun OverlapPoint(`$point`: Vector2, `$layerMask`: Number, `$minDepth`: Number): Collider2D
        fun OverlapPoint(`$point`: Vector2, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Collider2D
        fun OverlapPoint(`$point`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapPoint(`$point`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
        fun OverlapPointAll(`$point`: Vector2): `Array$1`<Collider2D>
        fun OverlapPointAll(`$point`: Vector2, `$layerMask`: Number): `Array$1`<Collider2D>
        fun OverlapPointAll(`$point`: Vector2, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<Collider2D>
        fun OverlapPointAll(`$point`: Vector2, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<Collider2D>
        fun OverlapPointNonAlloc(`$point`: Vector2, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapPointNonAlloc(`$point`: Vector2, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number): Number
        fun OverlapPointNonAlloc(`$point`: Vector2, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number): Number
        fun OverlapPointNonAlloc(`$point`: Vector2, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun OverlapCircle(`$point`: Vector2, `$radius`: Number): Collider2D
        fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$layerMask`: Number): Collider2D
        fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$layerMask`: Number, `$minDepth`: Number): Collider2D
        fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Collider2D
        fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapCircle(`$point`: Vector2, `$radius`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
        fun OverlapCircleAll(`$point`: Vector2, `$radius`: Number): `Array$1`<Collider2D>
        fun OverlapCircleAll(`$point`: Vector2, `$radius`: Number, `$layerMask`: Number): `Array$1`<Collider2D>
        fun OverlapCircleAll(`$point`: Vector2, `$radius`: Number, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<Collider2D>
        fun OverlapCircleAll(`$point`: Vector2, `$radius`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<Collider2D>
        fun OverlapCircleNonAlloc(`$point`: Vector2, `$radius`: Number, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapCircleNonAlloc(`$point`: Vector2, `$radius`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number): Number
        fun OverlapCircleNonAlloc(`$point`: Vector2, `$radius`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number): Number
        fun OverlapCircleNonAlloc(`$point`: Vector2, `$radius`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number): Collider2D
        fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$layerMask`: Number): Collider2D
        fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$layerMask`: Number, `$minDepth`: Number): Collider2D
        fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Collider2D
        fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapBox(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
        fun OverlapBoxAll(`$point`: Vector2, `$size`: Vector2, `$angle`: Number): `Array$1`<Collider2D>
        fun OverlapBoxAll(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$layerMask`: Number): `Array$1`<Collider2D>
        fun OverlapBoxAll(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<Collider2D>
        fun OverlapBoxAll(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<Collider2D>
        fun OverlapBoxNonAlloc(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapBoxNonAlloc(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number): Number
        fun OverlapBoxNonAlloc(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number): Number
        fun OverlapBoxNonAlloc(`$point`: Vector2, `$size`: Vector2, `$angle`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2): Collider2D
        fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$layerMask`: Number): Collider2D
        fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$layerMask`: Number, `$minDepth`: Number): Collider2D
        fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Collider2D
        fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapArea(`$pointA`: Vector2, `$pointB`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
        fun OverlapAreaAll(`$pointA`: Vector2, `$pointB`: Vector2): `Array$1`<Collider2D>
        fun OverlapAreaAll(`$pointA`: Vector2, `$pointB`: Vector2, `$layerMask`: Number): `Array$1`<Collider2D>
        fun OverlapAreaAll(`$pointA`: Vector2, `$pointB`: Vector2, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<Collider2D>
        fun OverlapAreaAll(`$pointA`: Vector2, `$pointB`: Vector2, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<Collider2D>
        fun OverlapAreaNonAlloc(`$pointA`: Vector2, `$pointB`: Vector2, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapAreaNonAlloc(`$pointA`: Vector2, `$pointB`: Vector2, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number): Number
        fun OverlapAreaNonAlloc(`$pointA`: Vector2, `$pointB`: Vector2, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number): Number
        fun OverlapAreaNonAlloc(`$pointA`: Vector2, `$pointB`: Vector2, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number): Collider2D
        fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$layerMask`: Number): Collider2D
        fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$layerMask`: Number, `$minDepth`: Number): Collider2D
        fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Collider2D
        fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapCapsule(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
        fun OverlapCapsuleAll(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number): `Array$1`<Collider2D>
        fun OverlapCapsuleAll(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$layerMask`: Number): `Array$1`<Collider2D>
        fun OverlapCapsuleAll(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$layerMask`: Number, `$minDepth`: Number): `Array$1`<Collider2D>
        fun OverlapCapsuleAll(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): `Array$1`<Collider2D>
        fun OverlapCapsuleNonAlloc(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapCapsuleNonAlloc(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number): Number
        fun OverlapCapsuleNonAlloc(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number): Number
        fun OverlapCapsuleNonAlloc(`$point`: Vector2, `$size`: Vector2, `$direction`: CapsuleDirection2D, `$angle`: Number, `$results`: `Array$1`<Collider2D>, `$layerMask`: Number, `$minDepth`: Number, `$maxDepth`: Number): Number
        fun OverlapCollider(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
        fun OverlapCollider(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
        fun GetContacts(`$collider1`: Collider2D, `$collider2`: Collider2D, `$contactFilter`: ContactFilter2D, `$contacts`: `Array$1`<ContactPoint2D>): Number
        fun GetContacts(`$collider`: Collider2D, `$contacts`: `Array$1`<ContactPoint2D>): Number
        fun GetContacts(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D, `$contacts`: `Array$1`<ContactPoint2D>): Number
        fun GetContacts(`$collider`: Collider2D, `$colliders`: `Array$1`<Collider2D>): Number
        fun GetContacts(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D, `$colliders`: `Array$1`<Collider2D>): Number
        fun GetContacts(`$rigidbody`: Rigidbody2D, `$contacts`: `Array$1`<ContactPoint2D>): Number
        fun GetContacts(`$rigidbody`: Rigidbody2D, `$contactFilter`: ContactFilter2D, `$contacts`: `Array$1`<ContactPoint2D>): Number
        fun GetContacts(`$rigidbody`: Rigidbody2D, `$colliders`: `Array$1`<Collider2D>): Number
        fun GetContacts(`$rigidbody`: Rigidbody2D, `$contactFilter`: ContactFilter2D, `$colliders`: `Array$1`<Collider2D>): Number
        fun GetContacts(`$collider1`: Collider2D, `$collider2`: Collider2D, `$contactFilter`: ContactFilter2D, `$contacts`: `List$1`<ContactPoint2D>): Number
        fun GetContacts(`$collider`: Collider2D, `$contacts`: `List$1`<ContactPoint2D>): Number
        fun GetContacts(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D, `$contacts`: `List$1`<ContactPoint2D>): Number
        fun GetContacts(`$collider`: Collider2D, `$colliders`: `List$1`<Collider2D>): Number
        fun GetContacts(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D, `$colliders`: `List$1`<Collider2D>): Number
        fun GetContacts(`$rigidbody`: Rigidbody2D, `$contacts`: `List$1`<ContactPoint2D>): Number
        fun GetContacts(`$rigidbody`: Rigidbody2D, `$contactFilter`: ContactFilter2D, `$contacts`: `List$1`<ContactPoint2D>): Number
        fun GetContacts(`$rigidbody`: Rigidbody2D, `$colliders`: `List$1`<Collider2D>): Number
        fun GetContacts(`$rigidbody`: Rigidbody2D, `$contactFilter`: ContactFilter2D, `$colliders`: `List$1`<Collider2D>): Number
    }
}

external enum class SimulationMode2D {
    FixedUpdate /* = 0 */,
    Update /* = 1 */,
    Script /* = 2 */
}

external open class PhysicsJobOptions2D : ValueType {
    open var `var`: Any
    open var useMultithreading: Any
    open var useConsistencySorting: Any
    open var interpolationPosesPerJob: Any
    open var newContactsPerJob: Any
    open var collideContactsPerJob: Any
    open var clearFlagsPerJob: Any
    open var clearBodyForcesPerJob: Any
    open var syncDiscreteFixturesPerJob: Any
    open var syncContinuousFixturesPerJob: Any
    open var findNearestContactsPerJob: Any
    open var updateTriggerContactsPerJob: Any
    open var islandSolverCostThreshold: Any
    open var islandSolverBodyCostScale: Any
    open var islandSolverContactCostScale: Any
    open var islandSolverJointCostScale: Any
    open var islandSolverBodiesPerJob: Any
    open var islandSolverContactsPerJob: Any
}

external open class ColliderDistance2D : ValueType {
    open var `var`: Any
    open var distance: Any
    open val isOverlapped: Any
    open var isValid: Any
}

external open class Rigidbody2D : Component {
    override var `var`: Any
    open var rotation: Any
    open var angularVelocity: Any
    open var useAutoMass: Any
    open var mass: Any
    open var inertia: Any
    open var drag: Any
    open var angularDrag: Any
    open var gravityScale: Any
    open var useFullKinematicContacts: Any
    open var isKinematic: Any
    open var freezeRotation: Any
    open var simulated: Any
    open val attachedColliderCount: Any
    open fun SetRotation(`$angle`: Number)
    open fun SetRotation(`$rotation`: Quaternion)
    open fun MovePosition(`$position`: Vector2)
    open fun MoveRotation(`$angle`: Number)
    open fun MoveRotation(`$rotation`: Quaternion)
    open fun IsSleeping(): Boolean
    open fun IsAwake(): Boolean
    open fun Sleep()
    open fun WakeUp()
    open fun IsTouching(`$collider`: Collider2D): Boolean
    open fun IsTouching(`$collider`: Collider2D, `$contactFilter`: ContactFilter2D): Boolean
    open fun IsTouching(`$contactFilter`: ContactFilter2D): Boolean
    open fun IsTouchingLayers(): Boolean
    open fun IsTouchingLayers(`$layerMask`: Number): Boolean
    open fun OverlapPoint(`$point`: Vector2): Boolean
    open fun Distance(`$collider`: Collider2D): ColliderDistance2D
    open fun ClosestPoint(`$position`: Vector2): Vector2
    open fun AddForce(`$force`: Vector2)
    open fun AddForce(`$force`: Vector2, `$mode`: ForceMode2D)
    open fun AddRelativeForce(`$relativeForce`: Vector2)
    open fun AddRelativeForce(`$relativeForce`: Vector2, `$mode`: ForceMode2D)
    open fun AddForceAtPosition(`$force`: Vector2, `$position`: Vector2)
    open fun AddForceAtPosition(`$force`: Vector2, `$position`: Vector2, `$mode`: ForceMode2D)
    open fun AddTorque(`$torque`: Number)
    open fun AddTorque(`$torque`: Number, `$mode`: ForceMode2D)
    open fun GetPoint(`$point`: Vector2): Vector2
    open fun GetRelativePoint(`$relativePoint`: Vector2): Vector2
    open fun GetVector(`$vector`: Vector2): Vector2
    open fun GetRelativeVector(`$relativeVector`: Vector2): Vector2
    open fun GetPointVelocity(`$point`: Vector2): Vector2
    open fun GetRelativePointVelocity(`$relativePoint`: Vector2): Vector2
    open fun OverlapCollider(`$contactFilter`: ContactFilter2D, `$results`: `Array$1`<Collider2D>): Number
    open fun OverlapCollider(`$contactFilter`: ContactFilter2D, `$results`: `List$1`<Collider2D>): Number
    open fun GetContacts(`$contacts`: `Array$1`<ContactPoint2D>): Number
    open fun GetContacts(`$contacts`: `List$1`<ContactPoint2D>): Number
    open fun GetContacts(`$contactFilter`: ContactFilter2D, `$contacts`: `Array$1`<ContactPoint2D>): Number
    open fun GetContacts(`$contactFilter`: ContactFilter2D, `$contacts`: `List$1`<ContactPoint2D>): Number
    open fun GetContacts(`$colliders`: `Array$1`<Collider2D>): Number
    open fun GetContacts(`$colliders`: `List$1`<Collider2D>): Number
    open fun GetContacts(`$contactFilter`: ContactFilter2D, `$colliders`: `Array$1`<Collider2D>): Number
    open fun GetContacts(`$contactFilter`: ContactFilter2D, `$colliders`: `List$1`<Collider2D>): Number
    open fun GetAttachedColliders(`$results`: `Array$1`<Collider2D>): Number
    open fun GetAttachedColliders(`$results`: `List$1`<Collider2D>): Number
    open fun Cast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Cast(`$direction`: Vector2, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
    open fun Cast(`$direction`: Vector2, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number = definedExternally): Number
    open fun Cast(`$direction`: Vector2, `$results`: `List$1`<RaycastHit2D>): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `Array$1`<RaycastHit2D>, `$distance`: Number): Number
    open fun Cast(`$direction`: Vector2, `$contactFilter`: ContactFilter2D, `$results`: `List$1`<RaycastHit2D>, `$distance`: Number): Number
    open fun GetShapes(`$physicsShapeGroup`: PhysicsShapeGroup2D): Number
}

external open class ContactPoint2D : ValueType {
    open var `var`: Any
    open val separation: Any
    open val normalImpulse: Any
    open val tangentImpulse: Any
    open val enabled: Any
}

external enum class RigidbodyConstraints2D {
    None /* = 0 */,
    FreezePositionX /* = 1 */,
    FreezePositionY /* = 2 */,
    FreezeRotation /* = 4 */,
    FreezePosition /* = 3 */,
    FreezeAll /* = 7 */
}

external enum class RigidbodyInterpolation2D {
    None /* = 0 */,
    Interpolate /* = 1 */,
    Extrapolate /* = 2 */
}

external enum class RigidbodySleepMode2D {
    NeverSleep /* = 0 */,
    StartAwake /* = 1 */,
    StartAsleep /* = 2 */
}

external enum class CollisionDetectionMode2D {
    None /* = 0 */,
    Discrete /* = 0 */,
    Continuous /* = 1 */
}

external enum class RigidbodyType2D {
    Dynamic /* = 0 */,
    Kinematic /* = 1 */,
    Static /* = 2 */
}

external enum class ForceMode2D {
    Force /* = 0 */,
    Impulse /* = 1 */
}

external enum class ColliderErrorState2D {
    None /* = 0 */,
    NoShapes /* = 1 */,
    RemovedShapes /* = 2 */
}

external enum class JointLimitState2D {
    Inactive /* = 0 */,
    LowerLimit /* = 1 */,
    UpperLimit /* = 2 */,
    EqualLimits /* = 3 */
}

external enum class EffectorSelection2D {
    Rigidbody /* = 0 */,
    Collider /* = 1 */
}

external enum class EffectorForceMode2D {
    Constant /* = 0 */,
    InverseLinear /* = 1 */,
    InverseSquared /* = 2 */
}

external enum class PhysicsShapeType2D {
    Circle /* = 0 */,
    Capsule /* = 1 */,
    Polygon /* = 2 */,
    Edges /* = 3 */
}

external open class PhysicsShape2D : ValueType {
    open var `var`: Any
    open var radius: Any
    open var vertexStartIndex: Any
    open var vertexCount: Any
    open var useAdjacentStart: Any
    open var useAdjacentEnd: Any
}

external open class PhysicsShapeGroup2D : csharp.System.Object {
    constructor(`$shapeCapacity`: Number = definedExternally, `$vertexCapacity`: Number = definedExternally)
    constructor()
    constructor(`$shapeCapacity`: Number = definedExternally)
    open var `var`: Any
    open val shapeCount: Any
    open val vertexCount: Any
    open fun Clear()
    open fun Add(`$physicsShapeGroup`: PhysicsShapeGroup2D)
    open fun GetShapeData(`$shapes`: `List$1`<PhysicsShape2D>, `$vertices`: `List$1`<Vector2>)
    open fun GetShapeData(`$shapes`: `NativeArray$1`<PhysicsShape2D>, `$vertices`: `NativeArray$1`<Vector2>)
    open fun GetShapeVertices(`$shapeIndex`: Number, `$vertices`: `List$1`<Vector2>)
    open fun GetShapeVertex(`$shapeIndex`: Number, `$vertexIndex`: Number): Vector2
    open fun SetShapeVertex(`$shapeIndex`: Number, `$vertexIndex`: Number, `$vertex`: Vector2)
    open fun SetShapeRadius(`$shapeIndex`: Number, `$radius`: Number)
    open fun SetShapeAdjacentVertices(`$shapeIndex`: Number, `$useAdjacentStart`: Boolean, `$useAdjacentEnd`: Boolean, `$adjacentStart`: Vector2, `$adjacentEnd`: Vector2)
    open fun DeleteShape(`$shapeIndex`: Number)
    open fun GetShape(`$shapeIndex`: Number): PhysicsShape2D
    open fun AddCircle(`$center`: Vector2, `$radius`: Number): Number
    open fun AddCapsule(`$vertex0`: Vector2, `$vertex1`: Vector2, `$radius`: Number): Number
    open fun AddBox(`$center`: Vector2, `$size`: Vector2, `$angle`: Number = definedExternally, `$edgeRadius`: Number = definedExternally): Number
    open fun AddPolygon(`$vertices`: `List$1`<Vector2>): Number
    open fun AddEdges(`$vertices`: `List$1`<Vector2>, `$edgeRadius`: Number = definedExternally): Number
    open fun AddEdges(`$vertices`: `List$1`<Vector2>): Number
    open fun AddEdges(`$vertices`: `List$1`<Vector2>, `$useAdjacentStart`: Boolean, `$useAdjacentEnd`: Boolean, `$adjacentStart`: Vector2, `$adjacentEnd`: Vector2, `$edgeRadius`: Number = definedExternally): Number
    open fun AddEdges(`$vertices`: `List$1`<Vector2>, `$useAdjacentStart`: Boolean, `$useAdjacentEnd`: Boolean, `$adjacentStart`: Vector2, `$adjacentEnd`: Vector2): Number
}

external open class Collision2D : csharp.System.Object {
    open var `var`: Any
    open val transform: Any
    open val gameObject: Any
    open val enabled: Any
    open val contactCount: Any
    open fun GetContact(`$index`: Number): ContactPoint2D
    open fun GetContacts(`$contacts`: `Array$1`<ContactPoint2D>): Number
    open fun GetContacts(`$contacts`: `List$1`<ContactPoint2D>): Number
}

external open class JointAngleLimits2D : ValueType {
    open var `var`: Any
    open var min: Any
    open var max: Any
}

external open class JointTranslationLimits2D : ValueType {
    open var `var`: Any
    open var min: Any
    open var max: Any
}

external open class JointMotor2D : ValueType {
    open var `var`: Any
    open var motorSpeed: Any
    open var maxMotorTorque: Any
}

external open class JointSuspension2D : ValueType {
    open var `var`: Any
    open var dampingRatio: Any
    open var frequency: Any
    open var angle: Any
}

external open class PhysicsMaterial2D : Object {
    constructor()
    constructor(`$name`: String)
    override var `var`: Any
    open var bounciness: Any
    open var friction: Any
}

external open class CompositeCollider2D : Collider2D {
    override var `var`: Any
    open var vertexDistance: Any
    open var edgeRadius: Any
    open var offsetDistance: Any
    open val pathCount: Any
    open val pointCount: Any
    open fun GenerateGeometry()
    open fun GetPathPointCount(`$index`: Number): Number
    open fun GetPath(`$index`: Number, `$points`: `Array$1`<Vector2>): Number
    open fun GetPath(`$index`: Number, `$points`: `List$1`<Vector2>): Number
}

external open class CustomCollider2D : Collider2D {
    override var `var`: Any
    open val customShapeCount: Any
    open val customVertexCount: Any
    open fun GetCustomShapes(`$physicsShapeGroup`: PhysicsShapeGroup2D): Number
    open fun GetCustomShapes(`$physicsShapeGroup`: PhysicsShapeGroup2D, `$shapeIndex`: Number, `$shapeCount`: Number = definedExternally): Number
    open fun GetCustomShapes(`$physicsShapeGroup`: PhysicsShapeGroup2D, `$shapeIndex`: Number): Number
    open fun GetCustomShapes(`$shapes`: `NativeArray$1`<PhysicsShape2D>, `$vertices`: `NativeArray$1`<Vector2>): Number
    open fun SetCustomShapes(`$physicsShapeGroup`: PhysicsShapeGroup2D)
    open fun SetCustomShapes(`$shapes`: `NativeArray$1`<PhysicsShape2D>, `$vertices`: `NativeArray$1`<Vector2>)
    open fun SetCustomShape(`$physicsShapeGroup`: PhysicsShapeGroup2D, `$srcShapeIndex`: Number, `$dstShapeIndex`: Number)
    open fun SetCustomShape(`$shapes`: `NativeArray$1`<PhysicsShape2D>, `$vertices`: `NativeArray$1`<Vector2>, `$srcShapeIndex`: Number, `$dstShapeIndex`: Number)
    open fun ClearCustomShapes(`$shapeIndex`: Number, `$shapeCount`: Number)
    open fun ClearCustomShapes()
}

external open class CircleCollider2D : Collider2D {
    override var `var`: Any
    open var radius: Any
}

external open class CapsuleCollider2D : Collider2D

external open class EdgeCollider2D : Collider2D {
    override var `var`: Any
    open var edgeRadius: Any
    open val edgeCount: Any
    open val pointCount: Any
    open var useAdjacentStartPoint: Any
    open var useAdjacentEndPoint: Any
    open fun Reset()
    open fun GetPoints(`$points`: `List$1`<Vector2>): Number
    open fun SetPoints(`$points`: `List$1`<Vector2>): Boolean
}

external open class BoxCollider2D : Collider2D {
    override var `var`: Any
    open var edgeRadius: Any
    open var autoTiling: Any
}

external open class PolygonCollider2D : Collider2D {
    override var `var`: Any
    open var autoTiling: Any
    open var pathCount: Any
    open fun GetTotalPointCount(): Number
    open fun GetPath(`$index`: Number): `Array$1`<Vector2>
    open fun SetPath(`$index`: Number, `$points`: `Array$1`<Vector2>)
    open fun GetPath(`$index`: Number, `$points`: `List$1`<Vector2>): Number
    open fun SetPath(`$index`: Number, `$points`: `List$1`<Vector2>)
    open fun CreatePrimitive(`$sides`: Number)
    open fun CreatePrimitive(`$sides`: Number, `$scale`: Vector2)
    open fun CreatePrimitive(`$sides`: Number, `$scale`: Vector2, `$offset`: Vector2)
}

external open class Joint2D : Behaviour {
    override var `var`: Any
    open var enableCollision: Any
    open var breakForce: Any
    open var breakTorque: Any
    open val reactionTorque: Any
    open fun GetReactionForce(`$timeStep`: Number): Vector2
    open fun GetReactionTorque(`$timeStep`: Number): Number
}

external open class AnchoredJoint2D : Joint2D {
    override var `var`: Any
    open var autoConfigureConnectedAnchor: Any
}

external open class SpringJoint2D : AnchoredJoint2D {
    override var `var`: Any
    open var autoConfigureDistance: Any
    open var distance: Any
    open var dampingRatio: Any
    open var frequency: Any
}

external open class DistanceJoint2D : AnchoredJoint2D {
    override var `var`: Any
    open var autoConfigureDistance: Any
    open var distance: Any
    open var maxDistanceOnly: Any
}

external open class FrictionJoint2D : AnchoredJoint2D {
    override var `var`: Any
    open var maxForce: Any
    open var maxTorque: Any
}

external open class HingeJoint2D : AnchoredJoint2D {
    override var `var`: Any
    open var useMotor: Any
    open var useLimits: Any
    open val referenceAngle: Any
    open val jointAngle: Any
    open val jointSpeed: Any
    open fun GetMotorTorque(`$timeStep`: Number): Number
}

external open class RelativeJoint2D : Joint2D {
    override var `var`: Any
    open var maxForce: Any
    open var maxTorque: Any
    open var correctionScale: Any
    open var autoConfigureOffset: Any
    open var angularOffset: Any
}

external open class SliderJoint2D : AnchoredJoint2D {
    override var `var`: Any
    open var autoConfigureAngle: Any
    open var angle: Any
    open var useMotor: Any
    open var useLimits: Any
    open val referenceAngle: Any
    open val jointTranslation: Any
    open val jointSpeed: Any
    open fun GetMotorForce(`$timeStep`: Number): Number
}

external open class TargetJoint2D : Joint2D {
    override var `var`: Any
    open var autoConfigureTarget: Any
    open var maxForce: Any
    open var dampingRatio: Any
    open var frequency: Any
}

external open class FixedJoint2D : AnchoredJoint2D {
    override var `var`: Any
    open var dampingRatio: Any
    open var frequency: Any
    open val referenceAngle: Any
}

external open class WheelJoint2D : AnchoredJoint2D {
    override var `var`: Any
    open var useMotor: Any
    open val jointTranslation: Any
    open val jointLinearSpeed: Any
    open val jointSpeed: Any
    open val jointAngle: Any
    open fun GetMotorTorque(`$timeStep`: Number): Number
}

external open class Effector2D : Behaviour {
    override var `var`: Any
    open var useColliderMask: Any
    open var colliderMask: Any
}

external open class AreaEffector2D : Effector2D {
    override var `var`: Any
    open var forceAngle: Any
    open var useGlobalAngle: Any
    open var forceMagnitude: Any
    open var forceVariation: Any
    open var drag: Any
    open var angularDrag: Any
}

external open class BuoyancyEffector2D : Effector2D {
    override var `var`: Any
    open var surfaceLevel: Any
    open var density: Any
    open var linearDrag: Any
    open var angularDrag: Any
    open var flowAngle: Any
    open var flowMagnitude: Any
    open var flowVariation: Any
}

external open class PointEffector2D : Effector2D {
    override var `var`: Any
    open var forceMagnitude: Any
    open var forceVariation: Any
    open var distanceScale: Any
    open var drag: Any
    open var angularDrag: Any
}

external open class PlatformEffector2D : Effector2D {
    override var `var`: Any
    open var useOneWay: Any
    open var useOneWayGrouping: Any
    open var useSideFriction: Any
    open var useSideBounce: Any
    open var surfaceArc: Any
    open var sideArc: Any
    open var rotationalOffset: Any
}

external open class SurfaceEffector2D : Effector2D {
    override var `var`: Any
    open var speed: Any
    open var speedVariation: Any
    open var forceScale: Any
    open var useContactForce: Any
    open var useFriction: Any
    open var useBounce: Any
}

external open class PhysicsUpdateBehaviour2D : Behaviour

external open class ConstantForce2D : PhysicsUpdateBehaviour2D {
    override var `var`: Any
    open var torque: Any
}

external open class ScreenCapture : csharp.System.Object {
    companion object {
        fun CaptureScreenshot(`$filename`: String)
        fun CaptureScreenshot(`$filename`: String, `$superSize`: Number)
        //fun CaptureScreenshot(`$filename`: String, `$stereoCaptureMode`: StereoScreenCaptureMode)
        fun CaptureScreenshotAsTexture(): Texture2D
        fun CaptureScreenshotAsTexture(`$superSize`: Number): Texture2D
        //fun CaptureScreenshotAsTexture(`$stereoCaptureMode`: StereoScreenCaptureMode): Texture2D
        fun CaptureScreenshotIntoRenderTexture(`$renderTexture`: RenderTexture)
    }
}

external open class SpriteMask : Renderer {
    override var `var`: Any
    open var frontSortingLayerID: Any
    open var frontSortingOrder: Any
    open var backSortingLayerID: Any
    open var backSortingOrder: Any
    open var alphaCutoff: Any
    open var sprite: Any
    open var isCustomRangeActive: Any
    open var spriteSortPoint: Any
}

external open class StreamingController : Behaviour {
    override var `var`: Any
    open var streamingMipmapBias: Any
    open fun SetPreloading(`$timeoutSeconds`: Number = definedExternally, `$activateCameraOnTimeout`: Boolean = definedExternally, `$disableCameraCuttingFrom`: Camera = definedExternally)
    open fun CancelPreloading()
    open fun IsPreloading(): Boolean
}

external enum class ProceduralProcessorUsage {
    Unsupported /* = 0 */,
    One /* = 1 */,
    Half /* = 2 */,
    All /* = 3 */
}

external enum class ProceduralCacheSize {
    Tiny /* = 0 */,
    Medium /* = 1 */,
    Heavy /* = 2 */,
    NoLimit /* = 3 */,
    None /* = 4 */
}

external enum class ProceduralLoadingBehavior {
    DoNothing /* = 0 */,
    Generate /* = 1 */,
    BakeAndKeep /* = 2 */,
    BakeAndDiscard /* = 3 */,
    Cache /* = 4 */,
    DoNothingAndCache /* = 5 */
}

external enum class ProceduralPropertyType {
    Boolean /* = 0 */,
    Float /* = 1 */,
    Vector2 /* = 2 */,
    Vector3 /* = 3 */,
    Vector4 /* = 4 */,
    Color3 /* = 5 */,
    Color4 /* = 6 */,
    Enum /* = 7 */,
    Texture /* = 8 */,
    String /* = 9 */
}

external enum class ProceduralOutputType {
    Unknown /* = 0 */,
    Diffuse /* = 1 */,
    Normal /* = 2 */,
    Height /* = 3 */,
    Emissive /* = 4 */,
    Specular /* = 5 */,
    Opacity /* = 6 */,
    Smoothness /* = 7 */,
    AmbientOcclusion /* = 8 */,
    DetailMask /* = 9 */,
    Metallic /* = 10 */,
    Roughness /* = 11 */
}

external open class IntegratedSubsystem : csharp.System.Object, ISubsystem {
    open var `var`: Any
    override var running: Boolean
    override fun Start()
    override fun Stop()
    override fun Destroy()
}

external interface ISubsystem {
    var running: Boolean
    fun Start()
    fun Stop()
    fun Destroy()
}

external open class IntegratedSubsystemDescriptor : csharp.System.Object, ISubsystemDescriptorImpl, ISubsystemDescriptor {
    open var `var`: Any
    override var id: String
    override fun Create(): ISubsystem
}

external interface ISubsystemDescriptorImpl : ISubsystemDescriptor {
    override var id: String
    override fun Create(): ISubsystem
}

external interface ISubsystemDescriptor {
    var id: String
    fun Create(): ISubsystem
}

external open class Subsystem : csharp.System.Object, ISubsystem {
    open var `var`: Any
    override var running: Boolean
    override fun Start()
    override fun Stop()
    override fun Destroy()
}

external open class SubsystemDescriptor : csharp.System.Object, ISubsystemDescriptor {
    open var `var`: Any
    override var id: String
    open var subsystemImplementationType: Any
    override fun Create(): ISubsystem
}

external open class SubsystemManager : csharp.System.Object {
    companion object {
        fun GetAllSubsystemDescriptors(`$descriptors`: `List$1`<ISubsystemDescriptor>)
        fun add_beforeReloadSubsystems(`$value`: Action)
        fun remove_beforeReloadSubsystems(`$value`: Action)
        fun add_afterReloadSubsystems(`$value`: Action)
        fun remove_afterReloadSubsystems(`$value`: Action)
        fun add_reloadSubsytemsStarted(`$value`: Action)
        fun remove_reloadSubsytemsStarted(`$value`: Action)
        fun add_reloadSubsytemsCompleted(`$value`: Action)
        fun remove_reloadSubsytemsCompleted(`$value`: Action)
    }
}

external enum class TerrainChangedFlags {
    Heightmap /* = 1 */,
    TreeInstances /* = 2 */,
    DelayedHeightmapUpdate /* = 4 */,
    FlushEverythingImmediately /* = 8 */,
    RemoveDirtyDetailsImmediately /* = 16 */,
    HeightmapResolution /* = 32 */,
    Holes /* = 64 */,
    DelayedHolesUpdate /* = 128 */,
    WillBeDestroyed /* = 256 */
}

external enum class TerrainRenderFlags {
    heightmap /* = 1 */,
    trees /* = 2 */,
    details /* = 4 */,
    all /* = 7 */,
    Heightmap /* = 1 */,
    Trees /* = 2 */,
    Details /* = 4 */,
    All /* = 7 */
}

external open class Terrain : Behaviour {
    open fun UpdateGIMaterials()
    open fun UpdateGIMaterials(`$x`: Number, `$y`: Number, `$width`: Number, `$height`: Number)
    override var `var`: Any
    open var terrainData: Any
    open var treeDistance: Any
    open var treeBillboardDistance: Any
    open var treeCrossFadeLength: Any
    open var treeMaximumFullLODCount: Any
    open var detailObjectDistance: Any
    open var detailObjectDensity: Any
    open var heightmapPixelError: Any
    open var heightmapMaximumLOD: Any
    open var basemapDistance: Any
    open var lightmapIndex: Any
    open var realtimeLightmapIndex: Any
    open var keepUnusedRenderingResources: Any
    open var shadowCastingMode: Any
    open var reflectionProbeUsage: Any
    open var materialTemplate: Any
    open var drawHeightmap: Any
    open var allowAutoConnect: Any
    open var groupingID: Any
    open var drawInstanced: Any
    open val normalmapTexture: Any
    open var drawTreesAndFoliage: Any
    open var treeLODBiasMultiplier: Any
    open var collectDetailPatches: Any
    open var editorRenderFlags: Any
    open var bakeLightProbesForTrees: Any
    open var deringLightProbesForTrees: Any
    open var preserveTreePrototypeLayers: Any
    open val leftNeighbor: Any
    open val rightNeighbor: Any
    open val topNeighbor: Any
    open val bottomNeighbor: Any
    open var renderingLayerMask: Any
    open fun GetKeepUnusedCameraRenderingResources(`$cameraInstanceID`: Number): Boolean
    open fun SetKeepUnusedCameraRenderingResources(`$cameraInstanceID`: Number, `$keepUnused`: Boolean)
    open fun GetClosestReflectionProbes(`$result`: `List$1`<ReflectionProbeBlendInfo>)
    open fun SampleHeight(`$worldPosition`: Vector3): Number
    open fun AddTreeInstance(`$instance`: TreeInstance)
    open fun SetNeighbors(`$left`: Terrain, `$top`: Terrain, `$right`: Terrain, `$bottom`: Terrain)
    open fun GetPosition(): Vector3
    open fun Flush()
    open fun SetSplatMaterialPropertyBlock(`$properties`: MaterialPropertyBlock)
    open fun GetSplatMaterialPropertyBlock(`$dest`: MaterialPropertyBlock)

    companion object {
        fun SetConnectivityDirty()
        fun GetActiveTerrains(`$terrainList`: `List$1`<Terrain>)
        fun CreateTerrainGameObject(`$assignTerrain`: TerrainData): GameObject
    }
}

external open class TerrainData : Object

external open class TreeInstance : ValueType {
    open var position: Vector3
    open var widthScale: Number
    open var heightScale: Number
    open var rotation: Number
    open var color: Color32
    open var lightmapColor: Color32
    open var prototypeIndex: Number
}

external open class TerrainExtensions : csharp.System.Object {
    companion object {
        fun UpdateGIMaterials(`$terrain`: Terrain)
        fun UpdateGIMaterials(`$terrain`: Terrain, `$x`: Number, `$y`: Number, `$width`: Number, `$height`: Number)
    }
}

external open class Tree : Component {
    override var `var`: Any
    open var data: Any
    open val hasSpeedTreeWind: Any
}

external open class TerrainCallbacks : csharp.System.Object {
    interface HeightmapChangedCallback {
        @nativeInvoke
        operator fun invoke(terrain: Terrain, heightRegion: RectInt, synched: Boolean)
        var Invoke: ((terrain: Terrain, heightRegion: RectInt, synched: Boolean) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TextureChangedCallback {
        @nativeInvoke
        operator fun invoke(terrain: Terrain, textureName: String, texelRegion: RectInt, synched: Boolean)
        var Invoke: ((terrain: Terrain, textureName: String, texelRegion: RectInt, synched: Boolean) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        fun add_heightmapChanged(`$value`: HeightmapChangedCallback)
        fun remove_heightmapChanged(`$value`: HeightmapChangedCallback)
        fun add_textureChanged(`$value`: TextureChangedCallback)
        fun remove_textureChanged(`$value`: TextureChangedCallback)
    }
}

external open class TreePrototype : csharp.System.Object {
    constructor()
    constructor(`$other`: TreePrototype)
    open var `var`: Any
    open var prefab: Any
    open var bendFactor: Any
    open var navMeshLod: Any
}

external enum class DetailRenderMode {
    GrassBillboard /* = 0 */,
    VertexLit /* = 1 */,
    Grass /* = 2 */
}

external open class DetailPrototype : csharp.System.Object {
    constructor()
    constructor(`$other`: DetailPrototype)
    open var `var`: Any
    open var prototype: Any
    open var minWidth: Any
    open var maxWidth: Any
    open var minHeight: Any
    open var maxHeight: Any
    open var noiseSeed: Any
    open var noiseSpread: Any
    open var holeEdgePadding: Any
    open var healthyColor: Any
    open var dryColor: Any
    open var renderMode: Any
    open var usePrototypeMesh: Any
    open var useInstancing: Any
    open fun Validate(): Boolean
    open fun Validate(`$errorMessage`: `$Ref`<String>): Boolean
}

external open class SplatPrototype : csharp.System.Object {
    open var `var`: Any
    open var specular: Any
    open var metallic: Any
    open var smoothness: Any
}

external open class PatchExtents : ValueType {
    open var `var`: Any
    open var min: Any
    open var max: Any
}

external enum class TerrainHeightmapSyncControl {
    None /* = 0 */,
    HeightOnly /* = 1 */,
    HeightAndLod /* = 2 */
}

external open class DetailInstanceTransform : ValueType {
    open var posX: Number
    open var posY: Number
    open var posZ: Number
    open var scaleXZ: Number
    open var scaleY: Number
    open var rotationY: Number
}

external open class TerrainLayer : Object {
    override var `var`: Any
    open var specular: Any
    open var metallic: Any
    open var smoothness: Any
    open var normalScale: Any
}

external open class TerrainCollider : Collider {
    override var `var`: Any
    open var terrainData: Any
}

external open class TextGenerationSettings : ValueType {
    open var font: Font
    open var color: Color
    open var fontSize: Number
    open var lineSpacing: Number
    open var richText: Boolean
    open var scaleFactor: Number
    open var fontStyle: FontStyle
    open var textAnchor: TextAnchor
    open var alignByGeometry: Boolean
    open var resizeTextForBestFit: Boolean
    open var resizeTextMinSize: Number
    open var resizeTextMaxSize: Number
    open var updateBounds: Boolean
    open var verticalOverflow: VerticalWrapMode
    open var horizontalOverflow: HorizontalWrapMode
    open var generationExtents: Vector2
    open var pivot: Vector2
    open var generateOutOfBounds: Boolean
    open fun Equals(`$other`: TextGenerationSettings): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external enum class VerticalWrapMode {
    Truncate /* = 0 */,
    Overflow /* = 1 */
}

external enum class HorizontalWrapMode {
    Wrap /* = 0 */,
    Overflow /* = 1 */
}

external open class TextGenerator : csharp.System.Object, IDisposable {
    constructor()
    constructor(`$initialCapacity`: Number)
    open var `var`: Any
    open val characterCountVisible: Any
    open val rectExtents: Any
    open val vertexCount: Any
    open val characterCount: Any
    open val lineCount: Any
    open val fontSizeUsedForBestFit: Any
    open fun Invalidate()
    open fun GetCharacters(`$characters`: `List$1`<UICharInfo>)
    open fun GetLines(`$lines`: `List$1`<UILineInfo>)
    open fun GetVertices(`$vertices`: `List$1`<UIVertex>)
    open fun GetPreferredWidth(`$str`: String, `$settings`: TextGenerationSettings): Number
    open fun GetPreferredHeight(`$str`: String, `$settings`: TextGenerationSettings): Number
    open fun PopulateWithErrors(`$str`: String, `$settings`: TextGenerationSettings, `$context`: GameObject): Boolean
    open fun Populate(`$str`: String, `$settings`: TextGenerationSettings): Boolean
    open fun GetVerticesArray(): `Array$1`<UIVertex>
    open fun GetCharactersArray(): `Array$1`<UICharInfo>
    open fun GetLinesArray(): `Array$1`<UILineInfo>
}

external open class UICharInfo : ValueType {
    open var cursorPos: Vector2
    open var charWidth: Number
}

external open class UILineInfo : ValueType {
    open var startCharIdx: Number
    open var height: Number
    open var topY: Number
    open var leading: Number
}

external open class UIVertex : ValueType {
    open var position: Vector3
    open var normal: Vector3
    open var tangent: Vector4
    open var color: Color32
    open var uv0: Vector4
    open var uv1: Vector4
    open var uv2: Vector4
    open var uv3: Vector4

    companion object {
        var simpleVert: UIVertex
    }
}

external enum class TextAlignment {
    Left /* = 0 */,
    Center /* = 1 */,
    Right /* = 2 */
}

external open class TextMesh : Component {
    override var `var`: Any
    open var text: Any
    open var font: Any
    open var fontSize: Any
    open var fontStyle: Any
    open var offsetZ: Any
    open var alignment: Any
    open var anchor: Any
    open var characterSize: Any
    open var lineSpacing: Any
    open var tabSize: Any
    open var richText: Any
    open var color: Any
}

external open class CharacterInfo : ValueType {
    open var index: Number
    open var size: Number
    open var style: FontStyle
    open var `var`: Any
    open var advance: Any
    open var glyphWidth: Any
    open var glyphHeight: Any
    open var bearing: Any
    open var minY: Any
    open var maxY: Any
    open var minX: Any
    open var maxX: Any
}

external open class CustomGridBrushAttribute : Attribute, _Attribute {
    constructor()
    constructor(`$hideAssetInstances`: Boolean, `$hideDefaultInstance`: Boolean, `$defaultBrush`: Boolean, `$defaultName`: String)
    open var `var`: Any
    open val hideAssetInstances: Any
    open val hideDefaultInstance: Any
    open val defaultBrush: Any
    open val defaultName: Any
}

external open class GridBrushBase : ScriptableObject {
    open fun Paint(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: Vector3Int)
    open fun Erase(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: Vector3Int)
    open fun BoxFill(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: BoundsInt)
    open fun BoxErase(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: BoundsInt)
    open fun Select(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: BoundsInt)
    open fun FloodFill(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: Vector3Int)
    //open fun Rotate(`$direction`: RotationDirection, `$layout`: CellLayout)
    //open fun Flip(`$flip`: FlipAxis, `$layout`: CellLayout)
    open fun Pick(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: BoundsInt, `$pivot`: Vector3Int)
    open fun Move(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$from`: BoundsInt, `$to`: BoundsInt)
    open fun MoveStart(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: BoundsInt)
    open fun MoveEnd(`$gridLayout`: GridLayout, `$brushTarget`: GameObject, `$position`: BoundsInt)
    open fun ChangeZPosition(`$change`: Number)
    open fun ResetZPosition()
}

external open class CanvasGroup : Behaviour, ICanvasRaycastFilter {
    override var `var`: Any
    open var alpha: Any
    open var interactable: Any
    open var blocksRaycasts: Any
    open var ignoreParentGroups: Any
    override fun IsRaycastLocationValid(`$sp`: Vector2, `$eventCamera`: Camera): Boolean
}

external open class CanvasRenderer : Component {
    override var `var`: Any
    open var hasPopInstruction: Any
    open var materialCount: Any
    open var popMaterialCount: Any
    open val absoluteDepth: Any
    open val hasMoved: Any
    open var cullTransparentMesh: Any
    open val hasRectClipping: Any
    open val relativeDepth: Any
    open var cull: Any
    open fun SetColor(`$color`: Color)
    open fun GetColor(): Color
    open fun EnableRectClipping(`$rect`: Rect)
    open fun DisableRectClipping()
    open fun SetMaterial(`$material`: Material, `$index`: Number)
    open fun GetMaterial(`$index`: Number): Material
    open fun SetPopMaterial(`$material`: Material, `$index`: Number)
    open fun GetPopMaterial(`$index`: Number): Material
    open fun SetTexture(`$texture`: Texture)
    open fun SetAlphaTexture(`$texture`: Texture)
    open fun SetMesh(`$mesh`: Mesh)
    open fun Clear()
    open fun GetAlpha(): Number
    open fun SetAlpha(`$alpha`: Number)
    open fun GetInheritedAlpha(): Number
    open fun SetMaterial(`$material`: Material, `$texture`: Texture)
    open fun GetMaterial(): Material
    interface OnRequestRebuild {
        @nativeInvoke
        operator fun invoke()
        var Invoke: (() -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        fun SplitUIVertexStreams(`$verts`: `List$1`<UIVertex>, `$positions`: `List$1`<Vector3>, `$colors`: `List$1`<Color32>, `$uv0S`: `List$1`<Vector4>, `$uv1S`: `List$1`<Vector4>, `$normals`: `List$1`<Vector3>, `$tangents`: `List$1`<Vector4>, `$indices`: `List$1`<Number>)
        fun SplitUIVertexStreams(`$verts`: `List$1`<UIVertex>, `$positions`: `List$1`<Vector3>, `$colors`: `List$1`<Color32>, `$uv0S`: `List$1`<Vector4>, `$uv1S`: `List$1`<Vector4>, `$uv2S`: `List$1`<Vector4>, `$uv3S`: `List$1`<Vector4>, `$normals`: `List$1`<Vector3>, `$tangents`: `List$1`<Vector4>, `$indices`: `List$1`<Number>)
        fun CreateUIVertexStream(`$verts`: `List$1`<UIVertex>, `$positions`: `List$1`<Vector3>, `$colors`: `List$1`<Color32>, `$uv0S`: `List$1`<Vector4>, `$uv1S`: `List$1`<Vector4>, `$normals`: `List$1`<Vector3>, `$tangents`: `List$1`<Vector4>, `$indices`: `List$1`<Number>)
        fun CreateUIVertexStream(`$verts`: `List$1`<UIVertex>, `$positions`: `List$1`<Vector3>, `$colors`: `List$1`<Color32>, `$uv0S`: `List$1`<Vector4>, `$uv1S`: `List$1`<Vector4>, `$uv2S`: `List$1`<Vector4>, `$uv3S`: `List$1`<Vector4>, `$normals`: `List$1`<Vector3>, `$tangents`: `List$1`<Vector4>, `$indices`: `List$1`<Number>)
        fun AddUIVertexStream(`$verts`: `List$1`<UIVertex>, `$positions`: `List$1`<Vector3>, `$colors`: `List$1`<Color32>, `$uv0S`: `List$1`<Vector4>, `$uv1S`: `List$1`<Vector4>, `$normals`: `List$1`<Vector3>, `$tangents`: `List$1`<Vector4>)
        fun AddUIVertexStream(`$verts`: `List$1`<UIVertex>, `$positions`: `List$1`<Vector3>, `$colors`: `List$1`<Color32>, `$uv0S`: `List$1`<Vector4>, `$uv1S`: `List$1`<Vector4>, `$uv2S`: `List$1`<Vector4>, `$uv3S`: `List$1`<Vector4>, `$normals`: `List$1`<Vector3>, `$tangents`: `List$1`<Vector4>)
        fun add_onRequestRebuild(`$value`: OnRequestRebuild)
        fun remove_onRequestRebuild(`$value`: OnRequestRebuild)
    }
}

external open class RectTransformUtility : csharp.System.Object {
    companion object {
        fun PixelAdjustPoint(`$point`: Vector2, `$elementTransform`: Transform, `$canvas`: Canvas): Vector2
        fun PixelAdjustRect(`$rectTransform`: RectTransform, `$canvas`: Canvas): Rect
        fun RectangleContainsScreenPoint(`$rect`: RectTransform, `$screenPoint`: Vector2): Boolean
        fun RectangleContainsScreenPoint(`$rect`: RectTransform, `$screenPoint`: Vector2, `$cam`: Camera): Boolean
        fun RectangleContainsScreenPoint(`$rect`: RectTransform, `$screenPoint`: Vector2, `$cam`: Camera, `$offset`: Vector4): Boolean
        fun ScreenPointToWorldPointInRectangle(`$rect`: RectTransform, `$screenPoint`: Vector2, `$cam`: Camera, `$worldPoint`: `$Ref`<Vector3>): Boolean
        fun ScreenPointToLocalPointInRectangle(`$rect`: RectTransform, `$screenPoint`: Vector2, `$cam`: Camera, `$localPoint`: `$Ref`<Vector2>): Boolean
        fun ScreenPointToRay(`$cam`: Camera, `$screenPos`: Vector2): Ray
        fun WorldToScreenPoint(`$cam`: Camera, `$worldPoint`: Vector3): Vector2
        fun CalculateRelativeRectTransformBounds(`$root`: Transform, `$child`: Transform): Bounds
        fun CalculateRelativeRectTransformBounds(`$trans`: Transform): Bounds
        fun FlipLayoutOnAxis(`$rect`: RectTransform, `$axis`: Number, `$keepPositioning`: Boolean, `$recursive`: Boolean)
        fun FlipLayoutAxes(`$rect`: RectTransform, `$keepPositioning`: Boolean, `$recursive`: Boolean)
    }
}

external open class UISystemProfilerApi : csharp.System.Object {
    companion object {
        //fun BeginSample(`$type`: SampleType)
        //fun EndSample(`$type`: SampleType)
        fun AddMarker(`$name`: String, `$obj`: Object)
    }
}

external open class RemoteSettings : csharp.System.Object {
    interface UpdatedEventHandler {
        @nativeInvoke
        operator fun invoke()
        var Invoke: (() -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        fun add_Updated(`$value`: UpdatedEventHandler)
        fun remove_Updated(`$value`: UpdatedEventHandler)
        fun add_BeforeFetchFromServer(`$value`: Action)
        fun remove_BeforeFetchFromServer(`$value`: Action)
        fun add_Completed(`$value`: `Action$3`<Boolean, Boolean, Number>)
        fun remove_Completed(`$value`: `Action$3`<Boolean, Boolean, Number>)
        fun ForceUpdate()
        fun WasLastUpdatedFromServer(): Boolean
        fun GetInt(`$key`: String): Number
        fun GetInt(`$key`: String, `$defaultValue`: Number): Number
        fun GetLong(`$key`: String): Any
        fun GetLong(`$key`: String, `$defaultValue`: Any): Any
        fun GetFloat(`$key`: String): Number
        fun GetFloat(`$key`: String, `$defaultValue`: Number): Number
        fun GetString(`$key`: String): String
        fun GetString(`$key`: String, `$defaultValue`: String): String
        fun GetBool(`$key`: String): Boolean
        fun GetBool(`$key`: String, `$defaultValue`: Boolean): Boolean
        fun HasKey(`$key`: String): Boolean
        fun GetCount(): Number
        fun GetKeys(): `Array$1`<String>
        fun GetObject(`$type`: Type, `$key`: String = definedExternally): Any
        fun GetObject(`$key`: String, `$defaultValue`: Any): Any
        fun GetDictionary(`$key`: String = definedExternally): `IDictionary$2`<String, Any>
    }
}

external open class RemoteConfigSettings : csharp.System.Object, IDisposable {
    constructor(`$configKey`: String)
    constructor()
    open fun add_Updated(`$value`: `Action$1`<Boolean>)
    open fun remove_Updated(`$value`: `Action$1`<Boolean>)
    open fun Dispose()
    open fun ForceUpdate()
    open fun WasLastUpdatedFromServer(): Boolean
    open fun GetInt(`$key`: String): Number
    open fun GetInt(`$key`: String, `$defaultValue`: Number): Number
    open fun GetLong(`$key`: String): Any
    open fun GetLong(`$key`: String, `$defaultValue`: Any): Any
    open fun GetFloat(`$key`: String): Number
    open fun GetFloat(`$key`: String, `$defaultValue`: Number): Number
    open fun GetString(`$key`: String): String
    open fun GetString(`$key`: String, `$defaultValue`: String): String
    open fun GetBool(`$key`: String): Boolean
    open fun GetBool(`$key`: String, `$defaultValue`: Boolean): Boolean
    open fun HasKey(`$key`: String): Boolean
    open fun GetCount(): Number
    open fun GetKeys(): `Array$1`<String>
    open fun GetObject(`$type`: Type, `$key`: String = definedExternally): Any
    open fun GetObject(`$type`: Type): Any
    open fun GetObject(`$key`: String, `$defaultValue`: Any): Any
    open fun GetDictionary(`$key`: String = definedExternally): `IDictionary$2`<String, Any>

    companion object {
        fun QueueConfig(`$name`: String, `$param`: Any, `$ver`: Number = definedExternally, `$prefix`: String = definedExternally): Boolean
        fun SendDeviceInfoInConfigRequest(): Boolean
        fun AddSessionTag(`$tag`: String)
    }
}

external open class WWWForm : csharp.System.Object {
    open fun AddField(`$fieldName`: String, `$value`: String)
    open fun AddField(`$fieldName`: String, `$value`: String, `$e`: Encoding)
    open fun AddField(`$fieldName`: String, `$i`: Number)
    open fun AddBinaryData(`$fieldName`: String, `$contents`: `Array$1`<Number>)
    open fun AddBinaryData(`$fieldName`: String, `$contents`: `Array$1`<Number>, `$fileName`: String)
    open fun AddBinaryData(`$fieldName`: String, `$contents`: `Array$1`<Number>, `$fileName`: String, `$mimeType`: String)
}

external open class WWWAudioExtensions : csharp.System.Object

external open class WWW : CustomYieldInstruction, IEnumerator, IDisposable {
    open fun GetAudioClip(): AudioClip
    open fun GetAudioClip(`$threeD`: Boolean): AudioClip
    open fun GetAudioClip(`$threeD`: Boolean, `$stream`: Boolean): AudioClip
    open fun GetAudioClip(`$threeD`: Boolean, `$stream`: Boolean, `$audioType`: AudioType): AudioClip
    open fun GetAudioClipCompressed(): AudioClip
    open fun GetAudioClipCompressed(`$threeD`: Boolean): AudioClip
    open fun GetAudioClipCompressed(`$threeD`: Boolean, `$audioType`: AudioType): AudioClip
    open fun GetMovieTexture(): MovieTexture
}

external open class MovieTexture : Texture

external open class WheelHit : ValueType {
    open var `var`: Any
    open var collider: Any
    open var force: Any
    open var forwardSlip: Any
    open var sidewaysSlip: Any
}

external open class WheelCollider : Collider {
    override var `var`: Any
    open var radius: Any
    open var suspensionDistance: Any
    open var suspensionSpring: Any
    open var suspensionExpansionLimited: Any
    open var forceAppPointDistance: Any
    open var mass: Any
    open var wheelDampingRate: Any
    open var forwardFriction: Any
    open var sidewaysFriction: Any
    open var motorTorque: Any
    open var brakeTorque: Any
    open var steerAngle: Any
    open val isGrounded: Any
    open val rpm: Any
    open var sprungMass: Any
    open fun ResetSprungMasses()
    open fun ConfigureVehicleSubsteps(`$speedThreshold`: Number, `$stepsBelowThreshold`: Number, `$stepsAboveThreshold`: Number)
    open fun GetWorldPose(`$pos`: `$Ref`<Vector3>, `$quat`: `$Ref`<Quaternion>)
    open fun GetGroundHit(`$hit`: `$Ref`<WheelHit>): Boolean
}

external enum class WindZoneMode {
    Directional /* = 0 */,
    Spherical /* = 1 */
}

external open class WindZone : Component {
    override var `var`: Any
    open var mode: Any
    open var radius: Any
    open var windMain: Any
    open var windTurbulence: Any
    open var windPulseMagnitude: Any
    open var windPulseFrequency: Any
}