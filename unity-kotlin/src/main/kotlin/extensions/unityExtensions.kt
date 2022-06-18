import csharp.UnityEngine.Component
import csharp.UnityEngine.GameObject
import csharp.UnityEngine.Transform
import csharp.UnityEngine.Vector3

inline fun Transform.SetPosition(position: Vector3) {
    SetPositionAndRotation(position, rotation)
}

inline fun <T>GameObject.GetComponent(`$type`: String): T {
    return GetComponent(`$type`).asDynamic()
}