@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("System")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.System

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
import csharp.System.Collections.Generic.`IEnumerable$1`
import csharp.System.Collections.IEnumerable
import csharp.System.Runtime.Serialization.ISerializable
import csharp.System.Runtime.InteropServices._Exception
import csharp.System.Runtime.Serialization.SerializationInfo
import csharp.System.Runtime.Serialization.StreamingContext
import csharp.System.Reflection.MethodInfo
import csharp.System.Reflection.TypeFilter
import csharp.System.Reflection.MemberTypes
import csharp.System.Reflection.BindingFlags
import csharp.System.Reflection.MemberFilter
import csharp.System.Reflection.MemberInfo
import csharp.System.Reflection.ConstructorInfo
import csharp.System.Reflection.Binder
import csharp.System.Reflection.ParameterModifier
import csharp.System.Reflection.CallingConventions
import csharp.System.Reflection.EventInfo
import csharp.System.Reflection.FieldInfo
import csharp.System.Reflection.PropertyInfo
import csharp.System.Globalization.CultureInfo
import csharp.System.Reflection.InterfaceMapping
import csharp.System.Runtime.InteropServices._MemberInfo
import csharp.System.Runtime.InteropServices._Type
import csharp.System.Reflection.ICustomAttributeProvider
import csharp.System.Reflection.IReflect
import csharp.System.Reflection.AssemblyName
import csharp.System.Reflection.Assembly
import csharp.System.Collections.IEnumerator
import csharp.System.Collections.IStructuralComparable
import csharp.System.Collections.IStructuralEquatable
import csharp.System.Collections.ICollection
import csharp.System.Collections.IList
import csharp.System.Collections.IComparer
import csharp.System.Runtime.InteropServices._Attribute

external open class Object {
    open fun Equals(`$obj`: Any): Boolean
    open fun GetHashCode(): Number
    open fun GetType(): Type
    open fun ToString(): String

    companion object {
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
        fun ReferenceEquals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class Void : ValueType

external open class ValueType : Object

external interface IFormattable

external interface `IEquatable$1`<T>

external open class Single : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external interface ISpanFormattable

external interface IComparable

external interface `IComparable$1`<T>

external interface IConvertible

external open class Boolean : ValueType, IComparable, `IComparable$1`<Boolean>, IConvertible, `IEquatable$1`<Boolean>

external open class Int32 : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external open class String : Object, ICloneable, IComparable, `IComparable$1`<String>, IConvertible, `IEnumerable$1`<Number>, IEnumerable, `IEquatable$1`<String>

external interface ICloneable

external open class Char : ValueType, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external open class Enum : ValueType, IFormattable, IComparable, IConvertible

external open class Exception : Object, ISerializable, _Exception

external interface IFormatProvider

external interface `Converter$2`<TInput, TOutput> {
    @nativeInvoke
    operator fun invoke(input: TInput): TOutput
    var Invoke: ((input: TInput) -> TOutput)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MulticastDelegate {
    @nativeInvoke
    operator fun invoke(vararg args: Any): Any
    var Invoke: ((args: Any) -> Any)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external open class Delegate : Object, ISerializable, ICloneable {
    open var `var`: Any
    open val Method: Any
    open val Target: Any
    open fun DynamicInvoke(vararg args: Any): Any
    open fun Clone(): Any
    open fun GetObjectData(`$info`: SerializationInfo, `$context`: StreamingContext)
    open fun GetInvocationList(): `Array$1`<Function<*>>

    companion object {
        fun CreateDelegate(`$type`: Type, `$firstArgument`: Any, `$method`: MethodInfo, `$throwOnBindFailure`: Boolean): Function<*>
        fun CreateDelegate(`$type`: Type, `$firstArgument`: Any, `$method`: MethodInfo): Function<*>
        fun CreateDelegate(`$type`: Type, `$method`: MethodInfo, `$throwOnBindFailure`: Boolean): Function<*>
        fun CreateDelegate(`$type`: Type, `$method`: MethodInfo): Function<*>
        fun CreateDelegate(`$type`: Type, `$target`: Any, `$method`: String): Function<*>
        fun CreateDelegate(`$type`: Type, `$target`: Type, `$method`: String, `$ignoreCase`: Boolean, `$throwOnBindFailure`: Boolean): Function<*>
        fun CreateDelegate(`$type`: Type, `$target`: Type, `$method`: String): Function<*>
        fun CreateDelegate(`$type`: Type, `$target`: Type, `$method`: String, `$ignoreCase`: Boolean): Function<*>
        fun CreateDelegate(`$type`: Type, `$target`: Any, `$method`: String, `$ignoreCase`: Boolean, `$throwOnBindFailure`: Boolean): Function<*>
        fun CreateDelegate(`$type`: Type, `$target`: Any, `$method`: String, `$ignoreCase`: Boolean): Function<*>
        fun Combine(`$a`: Function<*>, `$b`: Function<*>): Function<*>
        fun Combine(vararg delegates: Function<*>): Function<*>
        fun Remove(`$source`: Function<*>, `$value`: Function<*>): Function<*>
        fun RemoveAll(`$source`: Function<*>, `$value`: Function<*>): Function<*>
        fun op_Equality(`$d1`: Function<*>, `$d2`: Function<*>): Boolean
        fun op_Inequality(`$d1`: Function<*>, `$d2`: Function<*>): Boolean
    }
}

external interface `Predicate$1`<T> {
    @nativeInvoke
    operator fun invoke(obj: T): Boolean
    var Invoke: ((obj: T) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Action$1`<T> {
    @nativeInvoke
    operator fun invoke(obj: T)
    var Invoke: ((obj: T) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IDisposable

external interface `Comparison$1`<T> {
    @nativeInvoke
    operator fun invoke(x: T, y: T): Number
    var Invoke: ((x: T, y: T) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Double : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external open class Type : MemberInfo, _MemberInfo, _Type, ICustomAttributeProvider, IReflect {
    open var `var`: Any
    open val IsSerializable: Any
    open val ContainsGenericParameters: Any
    open val IsVisible: Any
    open val MemberType: Any
    open val Namespace: Any
    open val AssemblyQualifiedName: Any
    open val FullName: Any
    open val Assembly: Any
    open val Module: Any
    open val IsNested: Any
    open val DeclaringType: Any
    open val DeclaringMethod: Any
    open val ReflectedType: Any
    open val UnderlyingSystemType: Any
    open val IsTypeDefinition: Any
    open val IsArray: Any
    open val IsByRef: Any
    open val IsPointer: Any
    open val IsConstructedGenericType: Any
    open val IsGenericParameter: Any
    open val IsGenericTypeParameter: Any
    open val IsGenericMethodParameter: Any
    open val IsGenericType: Any
    open val IsGenericTypeDefinition: Any
    open val IsVariableBoundArray: Any
    open val IsByRefLike: Any
    open val HasElementType: Any
    open val GenericParameterPosition: Any
    open val GenericParameterAttributes: Any
    open val Attributes: Any
    open val IsAbstract: Any
    open val IsImport: Any
    open val IsSealed: Any
    open val IsSpecialName: Any
    open val IsClass: Any
    open val IsNestedAssembly: Any
    open val IsNestedFamANDAssem: Any
    open val IsNestedFamily: Any
    open val IsNestedFamORAssem: Any
    open val IsNestedPrivate: Any
    open val IsNestedPublic: Any
    open val IsNotPublic: Any
    open val IsPublic: Any
    open val IsAutoLayout: Any
    open val IsExplicitLayout: Any
    open val IsLayoutSequential: Any
    open val IsAnsiClass: Any
    open val IsAutoClass: Any
    open val IsUnicodeClass: Any
    open val IsCOMObject: Any
    open val IsContextful: Any
    open val IsCollectible: Any
    open val IsEnum: Any
    open val IsMarshalByRef: Any
    open val IsPrimitive: Any
    open val IsValueType: Any
    open val IsSignatureType: Any
    open val IsSecurityCritical: Any
    open val IsSecuritySafeCritical: Any
    open val IsSecurityTransparent: Any
    open val StructLayoutAttribute: Any
    open val TypeInitializer: Any
    open val TypeHandle: Any
    open val GUID: Any
    open val BaseType: Any
    open val IsInterface: Any
    open fun IsEnumDefined(`$value`: Any): Boolean
    open fun GetEnumName(`$value`: Any): String
    open fun GetEnumNames(): `Array$1`<String>
    open fun FindInterfaces(`$filter`: TypeFilter, `$filterCriteria`: Any): `Array$1`<Type>
    open fun FindMembers(`$memberType`: MemberTypes, `$bindingAttr`: BindingFlags, `$filter`: MemberFilter, `$filterCriteria`: Any): `Array$1`<MemberInfo>
    open fun IsSubclassOf(`$c`: Type): Boolean
    open fun IsAssignableFrom(`$c`: Type): Boolean
    override fun GetType(): Type
    open fun GetElementType(): Type
    open fun GetArrayRank(): Number
    open fun GetGenericTypeDefinition(): Type
    open fun GetGenericArguments(): `Array$1`<Type>
    open fun GetGenericParameterConstraints(): `Array$1`<Type>
    open fun GetConstructor(`$types`: `Array$1`<Type>): ConstructorInfo
    open fun GetConstructor(`$bindingAttr`: BindingFlags, `$binder`: Binder, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): ConstructorInfo
    open fun GetConstructor(`$bindingAttr`: BindingFlags, `$binder`: Binder, `$callConvention`: CallingConventions, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): ConstructorInfo
    open fun GetConstructors(): `Array$1`<ConstructorInfo>
    open fun GetConstructors(`$bindingAttr`: BindingFlags): `Array$1`<ConstructorInfo>
    open fun GetEvent(`$name`: String): EventInfo
    open fun GetEvent(`$name`: String, `$bindingAttr`: BindingFlags): EventInfo
    open fun GetEvents(): `Array$1`<EventInfo>
    open fun GetEvents(`$bindingAttr`: BindingFlags): `Array$1`<EventInfo>
    open fun GetField(`$name`: String): FieldInfo
    open fun GetField(`$name`: String, `$bindingAttr`: BindingFlags): FieldInfo
    open fun GetFields(): `Array$1`<FieldInfo>
    open fun GetFields(`$bindingAttr`: BindingFlags): `Array$1`<FieldInfo>
    open fun GetMember(`$name`: String): `Array$1`<MemberInfo>
    open fun GetMember(`$name`: String, `$bindingAttr`: BindingFlags): `Array$1`<MemberInfo>
    open fun GetMember(`$name`: String, `$type`: MemberTypes, `$bindingAttr`: BindingFlags): `Array$1`<MemberInfo>
    open fun GetMembers(): `Array$1`<MemberInfo>
    open fun GetMembers(`$bindingAttr`: BindingFlags): `Array$1`<MemberInfo>
    open fun GetMethod(`$name`: String): MethodInfo
    open fun GetMethod(`$name`: String, `$bindingAttr`: BindingFlags): MethodInfo
    open fun GetMethod(`$name`: String, `$types`: `Array$1`<Type>): MethodInfo
    open fun GetMethod(`$name`: String, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): MethodInfo
    open fun GetMethod(`$name`: String, `$bindingAttr`: BindingFlags, `$binder`: Binder, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): MethodInfo
    open fun GetMethod(`$name`: String, `$bindingAttr`: BindingFlags, `$binder`: Binder, `$callConvention`: CallingConventions, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): MethodInfo
    open fun GetMethod(`$name`: String, `$genericParameterCount`: Number, `$types`: `Array$1`<Type>): MethodInfo
    open fun GetMethod(`$name`: String, `$genericParameterCount`: Number, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): MethodInfo
    open fun GetMethod(`$name`: String, `$genericParameterCount`: Number, `$bindingAttr`: BindingFlags, `$binder`: Binder, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): MethodInfo
    open fun GetMethod(`$name`: String, `$genericParameterCount`: Number, `$bindingAttr`: BindingFlags, `$binder`: Binder, `$callConvention`: CallingConventions, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): MethodInfo
    open fun GetMethods(): `Array$1`<MethodInfo>
    open fun GetMethods(`$bindingAttr`: BindingFlags): `Array$1`<MethodInfo>
    open fun GetNestedType(`$name`: String): Type
    open fun GetNestedType(`$name`: String, `$bindingAttr`: BindingFlags): Type
    open fun GetNestedTypes(): `Array$1`<Type>
    open fun GetNestedTypes(`$bindingAttr`: BindingFlags): `Array$1`<Type>
    open fun GetProperty(`$name`: String): PropertyInfo
    open fun GetProperty(`$name`: String, `$bindingAttr`: BindingFlags): PropertyInfo
    open fun GetProperty(`$name`: String, `$returnType`: Type): PropertyInfo
    open fun GetProperty(`$name`: String, `$types`: `Array$1`<Type>): PropertyInfo
    open fun GetProperty(`$name`: String, `$returnType`: Type, `$types`: `Array$1`<Type>): PropertyInfo
    open fun GetProperty(`$name`: String, `$returnType`: Type, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): PropertyInfo
    open fun GetProperty(`$name`: String, `$bindingAttr`: BindingFlags, `$binder`: Binder, `$returnType`: Type, `$types`: `Array$1`<Type>, `$modifiers`: `Array$1`<ParameterModifier>): PropertyInfo
    open fun GetProperties(): `Array$1`<PropertyInfo>
    open fun GetProperties(`$bindingAttr`: BindingFlags): `Array$1`<PropertyInfo>
    open fun GetDefaultMembers(): `Array$1`<MemberInfo>
    open fun InvokeMember(`$name`: String, `$invokeAttr`: BindingFlags, `$binder`: Binder, `$target`: Any, `$args`: `Array$1`<Any>): Any
    open fun InvokeMember(`$name`: String, `$invokeAttr`: BindingFlags, `$binder`: Binder, `$target`: Any, `$args`: `Array$1`<Any>, `$culture`: CultureInfo): Any
    open fun InvokeMember(`$name`: String, `$invokeAttr`: BindingFlags, `$binder`: Binder, `$target`: Any, `$args`: `Array$1`<Any>, `$modifiers`: `Array$1`<ParameterModifier>, `$culture`: CultureInfo, `$namedParameters`: `Array$1`<String>): Any
    open fun GetInterface(`$name`: String): Type
    open fun GetInterface(`$name`: String, `$ignoreCase`: Boolean): Type
    open fun GetInterfaces(): `Array$1`<Type>
    open fun GetInterfaceMap(`$interfaceType`: Type): InterfaceMapping
    open fun IsInstanceOfType(`$o`: Any): Boolean
    open fun IsEquivalentTo(`$other`: Type): Boolean
    open fun GetEnumUnderlyingType(): Type
    open fun GetEnumValues(): Array
    open fun MakeArrayType(): Type
    open fun MakeArrayType(`$rank`: Number): Type
    open fun MakeByRefType(): Type
    open fun MakeGenericType(vararg typeArguments: Type): Type
    open fun MakePointerType(): Type
    override fun Equals(`$o`: Any): Boolean
    open fun Equals(`$o`: Type): Boolean
    override fun Equals(`$obj`: Any): Boolean

    companion object {
        var Delimiter: Number
        var EmptyTypes: `Array$1`<Type>
        var Missing: Any
        var FilterAttribute: MemberFilter
        var FilterName: MemberFilter
        var FilterNameIgnoreCase: MemberFilter
        fun GetTypeHandle(`$o`: Any): RuntimeTypeHandle
        fun GetTypeArray(`$args`: `Array$1`<Any>): `Array$1`<Type>
        fun GetTypeCode(`$type`: Type): TypeCode
        fun GetTypeFromCLSID(`$clsid`: Guid): Type
        fun GetTypeFromCLSID(`$clsid`: Guid, `$throwOnError`: Boolean): Type
        fun GetTypeFromCLSID(`$clsid`: Guid, `$server`: String): Type
        fun GetTypeFromProgID(`$progID`: String): Type
        fun GetTypeFromProgID(`$progID`: String, `$throwOnError`: Boolean): Type
        fun GetTypeFromProgID(`$progID`: String, `$server`: String): Type
        fun MakeGenericSignatureType(`$genericTypeDefinition`: Type, vararg typeArguments: Type): Type
        fun MakeGenericMethodParameter(`$position`: Number): Type
        fun GetTypeFromHandle(`$handle`: RuntimeTypeHandle): Type
        fun GetType(`$typeName`: String, `$throwOnError`: Boolean, `$ignoreCase`: Boolean): Type
        fun GetType(`$typeName`: String, `$throwOnError`: Boolean): Type
        fun GetType(`$typeName`: String): Type
        fun GetType(`$typeName`: String, `$assemblyResolver`: `Func$2`<AssemblyName, Assembly>, `$typeResolver`: `Func$4`<Assembly, String, Boolean, Type>): Type
        fun GetType(`$typeName`: String, `$assemblyResolver`: `Func$2`<AssemblyName, Assembly>, `$typeResolver`: `Func$4`<Assembly, String, Boolean, Type>, `$throwOnError`: Boolean): Type
        fun GetType(`$typeName`: String, `$assemblyResolver`: `Func$2`<AssemblyName, Assembly>, `$typeResolver`: `Func$4`<Assembly, String, Boolean, Type>, `$throwOnError`: Boolean, `$ignoreCase`: Boolean): Type
        fun op_Equality(`$left`: Type, `$right`: Type): Boolean
        fun op_Inequality(`$left`: Type, `$right`: Type): Boolean
        fun ReflectionOnlyGetType(`$typeName`: String, `$throwIfNotFound`: Boolean, `$ignoreCase`: Boolean): Type
        fun GetTypeFromCLSID(`$clsid`: Guid, `$server`: String, `$throwOnError`: Boolean): Type
        fun GetTypeFromProgID(`$progID`: String, `$server`: String, `$throwOnError`: Boolean): Type
        fun Equals(`$objA`: Any, `$objB`: Any): Boolean
    }
}

external open class Array : Object, IStructuralComparable, IStructuralEquatable, ICloneable, ICollection, IEnumerable, IList {
    open var `var`: Any
    open val LongLength: Any
    open val IsFixedSize: Any
    open val IsReadOnly: Any
    open val IsSynchronized: Any
    open val SyncRoot: Any
    open val Length: Any
    open val Rank: Any
    open fun CopyTo(`$array`: Array, `$index`: Number)
    open fun Clone(): Any
    open fun CopyTo(`$array`: Array, `$index`: Any)
    open fun GetLongLength(`$dimension`: Number): Any
    open fun GetValue(`$index`: Any): Any
    open fun GetValue(`$index1`: Any, `$index2`: Any): Any
    open fun GetValue(`$index1`: Any, `$index2`: Any, `$index3`: Any): Any
    open fun SetValue(`$value`: Any, `$index`: Any)
    open fun SetValue(`$value`: Any, `$index1`: Any, `$index2`: Any)
    open fun SetValue(`$value`: Any, `$index1`: Any, `$index2`: Any, `$index3`: Any)
    open fun GetEnumerator(): IEnumerator
    open fun GetLength(`$dimension`: Number): Number
    open fun GetLowerBound(`$dimension`: Number): Number
    open fun GetValue(vararg indices: Number): Any
    open fun SetValue(`$value`: Any, vararg indices: Number)
    open fun GetUpperBound(`$dimension`: Number): Number
    open fun GetValue(`$index1`: Number, `$index2`: Number): Any
    open fun GetValue(`$index1`: Number, `$index2`: Number, `$index3`: Number): Any
    open fun SetValue(`$value`: Any, `$index1`: Number, `$index2`: Number)
    open fun SetValue(`$value`: Any, `$index1`: Number, `$index2`: Number, `$index3`: Number)
    open fun Initialize()

    companion object {
        fun CreateInstance(`$elementType`: Type, vararg lengths: Any): Array
        fun BinarySearch(`$array`: Array, `$value`: Any): Number
        fun Copy(`$sourceArray`: Array, `$destinationArray`: Array, `$length`: Any)
        fun Copy(`$sourceArray`: Array, `$sourceIndex`: Any, `$destinationArray`: Array, `$destinationIndex`: Any, `$length`: Any)
        fun BinarySearch(`$array`: Array, `$index`: Number, `$length`: Number, `$value`: Any): Number
        fun BinarySearch(`$array`: Array, `$value`: Any, `$comparer`: IComparer): Number
        fun BinarySearch(`$array`: Array, `$index`: Number, `$length`: Number, `$value`: Any, `$comparer`: IComparer): Number
        fun IndexOf(`$array`: Array, `$value`: Any): Number
        fun IndexOf(`$array`: Array, `$value`: Any, `$startIndex`: Number): Number
        fun IndexOf(`$array`: Array, `$value`: Any, `$startIndex`: Number, `$count`: Number): Number
        fun LastIndexOf(`$array`: Array, `$value`: Any): Number
        fun LastIndexOf(`$array`: Array, `$value`: Any, `$startIndex`: Number): Number
        fun LastIndexOf(`$array`: Array, `$value`: Any, `$startIndex`: Number, `$count`: Number): Number
        fun Reverse(`$array`: Array)
        fun Reverse(`$array`: Array, `$index`: Number, `$length`: Number)
        fun Sort(`$array`: Array)
        fun Sort(`$array`: Array, `$index`: Number, `$length`: Number)
        fun Sort(`$array`: Array, `$comparer`: IComparer)
        fun Sort(`$array`: Array, `$index`: Number, `$length`: Number, `$comparer`: IComparer)
        fun Sort(`$keys`: Array, `$items`: Array)
        fun Sort(`$keys`: Array, `$items`: Array, `$comparer`: IComparer)
        fun Sort(`$keys`: Array, `$items`: Array, `$index`: Number, `$length`: Number)
        fun Sort(`$keys`: Array, `$items`: Array, `$index`: Number, `$length`: Number, `$comparer`: IComparer)
        fun CreateInstance(`$elementType`: Type, `$length`: Number): Array
        fun CreateInstance(`$elementType`: Type, `$length1`: Number, `$length2`: Number): Array
        fun CreateInstance(`$elementType`: Type, `$length1`: Number, `$length2`: Number, `$length3`: Number): Array
        fun CreateInstance(`$elementType`: Type, vararg lengths: Number): Array
        fun CreateInstance(`$elementType`: Type, `$lengths`: `Array$1`<Number>, `$lowerBounds`: `Array$1`<Number>): Array
        fun Clear(`$array`: Array, `$index`: Number, `$length`: Number)
        fun Copy(`$sourceArray`: Array, `$destinationArray`: Array, `$length`: Number)
        fun Copy(`$sourceArray`: Array, `$sourceIndex`: Number, `$destinationArray`: Array, `$destinationIndex`: Number, `$length`: Number)
        fun ConstrainedCopy(`$sourceArray`: Array, `$sourceIndex`: Number, `$destinationArray`: Array, `$destinationIndex`: Number, `$length`: Number)
    }
}

external open class UInt64 : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Any>, IConvertible, `IEquatable$1`<Any>

external open class Int64 : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Any>, IConvertible, `IEquatable$1`<Any>

external open class Attribute : Object, _Attribute

external open class RuntimeTypeHandle : ValueType, ISerializable

external enum class TypeCode {
    Empty /* = 0 */,
    Object /* = 1 */,
    DBNull /* = 2 */,
    Boolean /* = 3 */,
    Char /* = 4 */,
    SByte /* = 5 */,
    Byte /* = 6 */,
    Int16 /* = 7 */,
    UInt16 /* = 8 */,
    Int32 /* = 9 */,
    UInt32 /* = 10 */,
    Int64 /* = 11 */,
    UInt64 /* = 12 */,
    Single /* = 13 */,
    Double /* = 14 */,
    Decimal /* = 15 */,
    DateTime /* = 16 */,
    String /* = 18 */
}

external open class Guid : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Guid>, `IEquatable$1`<Guid>

external interface `Func$2`<T, TResult> {
    @nativeInvoke
    operator fun invoke(arg: T): TResult
    var Invoke: ((arg: T) -> TResult)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Func$4`<T1, T2, T3, TResult> {
    @nativeInvoke
    operator fun invoke(arg1: T1, arg2: T2, arg3: T3): TResult
    var Invoke: ((arg1: T1, arg2: T2, arg3: T3) -> TResult)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class UInt32 : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external interface Action {
    @nativeInvoke
    operator fun invoke()
    var Invoke: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external interface IAsyncResult

external interface AsyncCallback {
    @nativeInvoke
    operator fun invoke(ar: IAsyncResult)
    var Invoke: ((ar: IAsyncResult) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally

    //companion object
}

external open class IntPtr : ValueType, ISerializable, `IEquatable$1`<IntPtr>

external open class SByte : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external open class Int16 : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external open class Byte : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external open class MarshalByRefObject : Object

external interface IAsyncDisposable

external open class `Nullable$1`<T> : ValueType

external interface `Func$1`<TResult> {
    @nativeInvoke
    operator fun invoke(): TResult
    var Invoke: (() -> TResult)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Action$2`<T1, T2> {
    @nativeInvoke
    operator fun invoke(arg1: T1, arg2: T2)
    var Invoke: ((arg1: T1, arg2: T2) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class DateTime : ValueType, IFormattable, ISerializable, ISpanFormattable, IComparable, `IComparable$1`<Date>, IConvertible, `IEquatable$1`<Date>

external open class UInt16 : ValueType, IFormattable, ISpanFormattable, IComparable, `IComparable$1`<Number>, IConvertible, `IEquatable$1`<Number>

external open class SystemException : Exception, ISerializable, _Exception

external interface `Action$3`<T1, T2, T3> {
    @nativeInvoke
    operator fun invoke(arg1: T1, arg2: T2, arg3: T3)
    var Invoke: ((arg1: T1, arg2: T2, arg3: T3) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}