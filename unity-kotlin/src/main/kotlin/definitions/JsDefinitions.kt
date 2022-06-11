import csharp.UnityEngine.Debug

external fun setTimeout(block:()->Unit, timeoutMs:Int):Int
external fun setInterval(block:()->Unit, intervalMs:Int):Int
external fun clearInterval(id:Int)

fun println(message: Any?) = Debug.Log(message ?: "null")
