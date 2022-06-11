import csharp.UnityEngine.Transform
import csharp.UnityEngine.Vector3

inline fun Transform.SetPosition(position: Vector3) {
    SetPositionAndRotation(position, rotation)
}