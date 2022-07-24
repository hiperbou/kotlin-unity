@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("UnityKotlin")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp

import csharp.UnityEngine.MonoBehaviour
import kotlin.js.*

external class HelloKotlin:MonoBehaviour {

    fun CSharpCall(name:String):String

    companion object
    {
        fun CallStaticFunction(o:dynamic)
        fun Sum(a:Double, b:Double):Double
    }
}