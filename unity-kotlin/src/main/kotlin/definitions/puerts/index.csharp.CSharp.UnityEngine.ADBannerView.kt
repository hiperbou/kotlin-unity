@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEngine.ADBannerView")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEngine.ADBannerView

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

external enum class Layout {
    Top /* = 0 */,
    Bottom /* = 1 */,
    TopLeft /* = 0 */,
    TopRight /* = 4 */,
    TopCenter /* = 8 */,
    BottomLeft /* = 1 */,
    BottomRight /* = 5 */,
    BottomCenter /* = 9 */,
    CenterLeft /* = 2 */,
    CenterRight /* = 6 */,
    Center /* = 10 */,
    Manual /* = -1 */
}

external enum class Type {
    Banner /* = 0 */,
    MediumRect /* = 1 */
}

external interface BannerWasClickedDelegate {
    @nativeInvoke
    operator fun invoke()
    var Invoke: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external interface BannerWasLoadedDelegate {
    @nativeInvoke
    operator fun invoke()
    var Invoke: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}