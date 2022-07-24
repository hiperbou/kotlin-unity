@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityEngine.SceneManagement")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.UnityEngine.SceneManagement

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
import csharp.UnityEngine.PhysicsScene
import csharp.UnityEngine.PhysicsScene2D
import csharp.System.ValueType

external open class Scene : ValueType {
    open fun GetPhysicsScene(): PhysicsScene
    open fun GetPhysicsScene2D(): PhysicsScene2D
}