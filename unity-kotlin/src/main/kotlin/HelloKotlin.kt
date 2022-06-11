@file:OptIn(ExperimentalJsExport::class)

import com.hiperbou.unity.coroutines.launch
import csharp.HelloKotlin
import csharp.HelloKotlin.Companion.CallStaticFunction
import csharp.HelloKotlin.Companion.Sum
import csharp.UnityEngine.GameObject
import csharp.UnityEngine.Vector3
import kotlinx.coroutines.delay
import kotlinx.coroutines.coroutineScope

suspend fun main() = coroutineScope {
    val gameObject = GameObject("Hello Kotlin 0.1")
    println(gameObject.name)
    CallStaticFunction(gameObject)
    println(Sum(1.0,1.0))
    println(Sum(2.0,2.0))
    println(Sum(4.0,100.0))

    (0..10).forEach {
        println("kotlinx-coroutines iteration $it!")
        delay(1000)
    }
    println("kotlinx-coroutines exiting main!")
}

@JsExport
fun greet() = "Kotlin"
@JsExport
fun greetByName(name:String) = "Hello $name!"
@JsExport
fun useInstance(instance: HelloKotlin) {
    println("useInstance")
    println(instance)
    val result = instance.CSharpCall("Kotlin")
    println(result)
    launch {
        moveCamera(instance)
    }
}

suspend fun moveCamera(instance:HelloKotlin) {
    println("moveCamera")
    (0..120).forEach {
        instance.gameObject.transform.SetPosition(Vector3(it/10.0, 0, 0))
        delay(16)
    }
}
