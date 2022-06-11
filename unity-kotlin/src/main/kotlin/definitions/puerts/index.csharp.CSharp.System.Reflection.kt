@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("System.Reflection")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.System.Reflection

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
import csharp.System.Object
import csharp.System.Runtime.InteropServices._MemberInfo
import csharp.System.Runtime.InteropServices._MethodBase
import csharp.System.Runtime.InteropServices._MethodInfo
import csharp.System.Type
import csharp.System.Runtime.Serialization.ISerializable
import csharp.System.Security.IEvidenceFactory
import csharp.System.Runtime.InteropServices._Assembly
import csharp.System.Runtime.InteropServices._Module
import csharp.System.Runtime.InteropServices._ConstructorInfo
import csharp.System.ValueType
import csharp.System.Runtime.InteropServices._EventInfo
import csharp.System.Runtime.InteropServices._FieldInfo
import csharp.System.Runtime.InteropServices._PropertyInfo
import csharp.System.Runtime.InteropServices._AssemblyName
import csharp.System.Runtime.Serialization.IDeserializationCallback
import csharp.System.ICloneable

external open class MemberInfo : Object, _MemberInfo, ICustomAttributeProvider

external interface ICustomAttributeProvider

external interface IReflect

external open class MethodInfo : MethodBase, _MemberInfo, _MethodBase, _MethodInfo, ICustomAttributeProvider

external open class MethodBase : MemberInfo, _MemberInfo, _MethodBase, ICustomAttributeProvider

external interface MemberFilter {
    @nativeInvoke
    operator fun invoke(m: MemberInfo, filterCriteria: Any): Boolean
    var Invoke: ((m: MemberInfo, filterCriteria: Any) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external interface TypeFilter {
    @nativeInvoke
    operator fun invoke(m: Type, filterCriteria: Any): Boolean
    var Invoke: ((m: Type, filterCriteria: Any) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external enum class MemberTypes {
    Constructor /* = 1 */,
    Event /* = 2 */,
    Field /* = 4 */,
    Method /* = 8 */,
    Property /* = 16 */,
    TypeInfo /* = 32 */,
    Custom /* = 64 */,
    NestedType /* = 128 */,
    All /* = 191 */
}

external enum class BindingFlags {
    Default /* = 0 */,
    IgnoreCase /* = 1 */,
    DeclaredOnly /* = 2 */,
    Instance /* = 4 */,
    Static /* = 8 */,
    Public /* = 16 */,
    NonPublic /* = 32 */,
    FlattenHierarchy /* = 64 */,
    InvokeMethod /* = 256 */,
    CreateInstance /* = 512 */,
    GetField /* = 1024 */,
    SetField /* = 2048 */,
    GetProperty /* = 4096 */,
    SetProperty /* = 8192 */,
    PutDispProperty /* = 16384 */,
    PutRefDispProperty /* = 32768 */,
    ExactBinding /* = 65536 */,
    SuppressChangeType /* = 131072 */,
    OptionalParamBinding /* = 262144 */,
    IgnoreReturn /* = 16777216 */,
    DoNotWrapExceptions /* = 33554432 */
}

external open class Assembly : Object, ISerializable, ICustomAttributeProvider, IEvidenceFactory, _Assembly

external open class Module : Object, ISerializable, _Module, ICustomAttributeProvider

external enum class GenericParameterAttributes {
    None /* = 0 */,
    VarianceMask /* = 3 */,
    Covariant /* = 1 */,
    Contravariant /* = 2 */,
    SpecialConstraintMask /* = 28 */,
    ReferenceTypeConstraint /* = 4 */,
    NotNullableValueTypeConstraint /* = 8 */,
    DefaultConstructorConstraint /* = 16 */
}

external enum class TypeAttributes {
    VisibilityMask /* = 7 */,
    NotPublic /* = 0 */,
    Public /* = 1 */,
    NestedPublic /* = 2 */,
    NestedPrivate /* = 3 */,
    NestedFamily /* = 4 */,
    NestedAssembly /* = 5 */,
    NestedFamANDAssem /* = 6 */,
    NestedFamORAssem /* = 7 */,
    LayoutMask /* = 24 */,
    AutoLayout /* = 0 */,
    SequentialLayout /* = 8 */,
    ExplicitLayout /* = 16 */,
    ClassSemanticsMask /* = 32 */,
    Class /* = 0 */,
    Interface /* = 32 */,
    Abstract /* = 128 */,
    Sealed /* = 256 */,
    SpecialName /* = 1024 */,
    Import /* = 4096 */,
    Serializable /* = 8192 */,
    WindowsRuntime /* = 16384 */,
    StringFormatMask /* = 196608 */,
    AnsiClass /* = 0 */,
    UnicodeClass /* = 65536 */,
    AutoClass /* = 131072 */,
    CustomFormatClass /* = 196608 */,
    CustomFormatMask /* = 12582912 */,
    BeforeFieldInit /* = 1048576 */,
    RTSpecialName /* = 2048 */,
    HasSecurity /* = 262144 */,
    ReservedMask /* = 264192 */
}

external open class ConstructorInfo : MethodBase, _MemberInfo, _MethodBase, _ConstructorInfo, ICustomAttributeProvider

external open class Binder : Object

external open class ParameterModifier : ValueType

external enum class CallingConventions {
    Standard /* = 1 */,
    VarArgs /* = 2 */,
    Any /* = 3 */,
    HasThis /* = 32 */,
    ExplicitThis /* = 64 */
}

external open class EventInfo : MemberInfo, _MemberInfo, _EventInfo, ICustomAttributeProvider

external open class FieldInfo : MemberInfo, _MemberInfo, ICustomAttributeProvider, _FieldInfo

external open class PropertyInfo : MemberInfo, _PropertyInfo, _MemberInfo, ICustomAttributeProvider

external open class InterfaceMapping : ValueType

external open class AssemblyName : Object, _AssemblyName, IDeserializationCallback, ISerializable, ICloneable