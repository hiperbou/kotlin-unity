@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("System.Collections.Generic")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.System.Collections.Generic

import csharp.System.Runtime.Serialization.SerializationInfo
import csharp.System.Runtime.Serialization.StreamingContext
import csharp.`$Ref`
import csharp.System.*
import csharp.System.Collections.*
import csharp.System.Collections.ObjectModel.`ReadOnlyCollection$1`
import csharp.System.Runtime.Serialization.IDeserializationCallback
import csharp.System.Runtime.Serialization.ISerializable
import csharp.System.Object

external interface `IEnumerable$1`<T> : IEnumerable

external open class `List$1`<T> : Object, `IReadOnlyList$1`<T>, ICollection, `IEnumerable$1`<T>, IEnumerable, `IList$1`<T>, `IReadOnlyCollection$1`<T>,
    IList, `ICollection$1`<T> {
    constructor()
    constructor(`$capacity`: Number)
    constructor(`$collection`: `IEnumerable$1`<T>)
    open var `var`: Any
    open var Capacity: Any
    open val Count: Any
    open fun get_Item(`$index`: Number): T
    open fun set_Item(`$index`: Number, `$value`: T)
    open fun Add(`$item`: T)
    open fun AddRange(`$collection`: `IEnumerable$1`<T>)
    open fun AsReadOnly(): `ReadOnlyCollection$1`<T>
    open fun BinarySearch(`$index`: Number, `$count`: Number, `$item`: T, `$comparer`: `IComparer$1`<T>): Number
    open fun BinarySearch(`$item`: T): Number
    open fun BinarySearch(`$item`: T, `$comparer`: `IComparer$1`<T>): Number
    open fun Clear()
    open fun Contains(`$item`: T): Boolean
    open fun CopyTo(`$array`: `Array$1`<T>)
    open fun CopyTo(`$index`: Number, `$array`: `Array$1`<T>, `$arrayIndex`: Number, `$count`: Number)
    open fun CopyTo(`$array`: `Array$1`<T>, `$arrayIndex`: Number)
    open fun Exists(`$match`: `Predicate$1`<T>): Boolean
    open fun Find(`$match`: `Predicate$1`<T>): T
    open fun FindAll(`$match`: `Predicate$1`<T>): `List$1`<T>
    open fun FindIndex(`$match`: `Predicate$1`<T>): Number
    open fun FindIndex(`$startIndex`: Number, `$match`: `Predicate$1`<T>): Number
    open fun FindIndex(`$startIndex`: Number, `$count`: Number, `$match`: `Predicate$1`<T>): Number
    open fun FindLast(`$match`: `Predicate$1`<T>): T
    open fun FindLastIndex(`$match`: `Predicate$1`<T>): Number
    open fun FindLastIndex(`$startIndex`: Number, `$match`: `Predicate$1`<T>): Number
    open fun FindLastIndex(`$startIndex`: Number, `$count`: Number, `$match`: `Predicate$1`<T>): Number
    open fun ForEach(`$action`: `Action$1`<T>)
    open fun GetEnumerator(): Enumerator<T>
    open fun GetRange(`$index`: Number, `$count`: Number): `List$1`<T>
    open fun IndexOf(`$item`: T): Number
    open fun IndexOf(`$item`: T, `$index`: Number): Number
    open fun IndexOf(`$item`: T, `$index`: Number, `$count`: Number): Number
    open fun Insert(`$index`: Number, `$item`: T)
    open fun InsertRange(`$index`: Number, `$collection`: `IEnumerable$1`<T>)
    open fun LastIndexOf(`$item`: T): Number
    open fun LastIndexOf(`$item`: T, `$index`: Number): Number
    open fun LastIndexOf(`$item`: T, `$index`: Number, `$count`: Number): Number
    open fun Remove(`$item`: T): Boolean
    open fun RemoveAll(`$match`: `Predicate$1`<T>): Number
    open fun RemoveAt(`$index`: Number)
    open fun RemoveRange(`$index`: Number, `$count`: Number)
    open fun Reverse()
    open fun Reverse(`$index`: Number, `$count`: Number)
    open fun Sort()
    open fun Sort(`$comparer`: `IComparer$1`<T>)
    open fun Sort(`$index`: Number, `$count`: Number, `$comparer`: `IComparer$1`<T>)
    open fun Sort(`$comparison`: `Comparison$1`<T>)
    open fun ToArray(): `Array$1`<T>
    open fun TrimExcess()
    open fun TrueForAll(`$match`: `Predicate$1`<T>): Boolean
    open class Enumerator<T> : ValueType, `IEnumerator$1`<T>, IEnumerator, IDisposable
}

external interface `IReadOnlyList$1`<T> : `IEnumerable$1`<T>, IEnumerable, `IReadOnlyCollection$1`<T>

external interface `IReadOnlyCollection$1`<T> : `IEnumerable$1`<T>, IEnumerable

external interface `IList$1`<T> : `IEnumerable$1`<T>, IEnumerable, `ICollection$1`<T>

external interface `ICollection$1`<T> : `IEnumerable$1`<T>, IEnumerable

external interface `IComparer$1`<T>

external interface `IEnumerator$1`<T> : IEnumerator, IDisposable

external open class `Dictionary$2`<TKey, TValue> : Object, IDeserializationCallback, `IReadOnlyDictionary$2`<TKey, TValue>, `IDictionary$2`<TKey, TValue>, ISerializable, ICollection, IDictionary, `IEnumerable$1`<`KeyValuePair$2`<TKey, TValue>>, IEnumerable, `IReadOnlyCollection$1`<`KeyValuePair$2`<TKey, TValue>>, `ICollection$1`<`KeyValuePair$2`<TKey, TValue>> {
    constructor()
    constructor(`$capacity`: Number)
    constructor(`$comparer`: `IEqualityComparer$1`<TKey>)
    constructor(`$capacity`: Number, `$comparer`: `IEqualityComparer$1`<TKey>)
    constructor(`$dictionary`: `IDictionary$2`<TKey, TValue>)
    constructor(`$dictionary`: `IDictionary$2`<TKey, TValue>, `$comparer`: `IEqualityComparer$1`<TKey>)
    constructor(`$collection`: `IEnumerable$1`<`KeyValuePair$2`<TKey, TValue>>)
    constructor(`$collection`: `IEnumerable$1`<`KeyValuePair$2`<TKey, TValue>>, `$comparer`: `IEqualityComparer$1`<TKey>)
    open var `var`: Any
    open val Count: Any
    open fun get_Item(`$key`: TKey): TValue
    open fun set_Item(`$key`: TKey, `$value`: TValue)
    open fun Add(`$key`: TKey, `$value`: TValue)
    open fun Clear()
    open fun ContainsKey(`$key`: TKey): Boolean
    open fun ContainsValue(`$value`: TValue): Boolean
    //open fun GetEnumerator(): _csharp_CSharp_System_Collections_Generic_Dictionary$2_Enumerator<TKey, TValue>
    open fun GetObjectData(`$info`: SerializationInfo, `$context`: StreamingContext)
    open fun OnDeserialization(`$sender`: Any)
    open fun Remove(`$key`: TKey): Boolean
    open fun TryGetValue(`$key`: TKey, `$value`: `$Ref`<TValue>): Boolean
    open fun EnsureCapacity(`$capacity`: Number): Number
    open fun TrimExcess()
    open fun TrimExcess(`$capacity`: Number)
    open class KeyCollection<TKey, TValue> : Object, ICollection, `IEnumerable$1`<TKey>, IEnumerable, `IReadOnlyCollection$1`<TKey>, `ICollection$1`<TKey>
    open class ValueCollection<TKey, TValue> : Object, ICollection, `IEnumerable$1`<TValue>, IEnumerable, `IReadOnlyCollection$1`<TValue>, `ICollection$1`<TValue>
    open class Enumerator<TKey, TValue> : ValueType, IDictionaryEnumerator, `IEnumerator$1`<`KeyValuePair$2`<TKey, TValue>>, IEnumerator, IDisposable
}

external interface `IReadOnlyDictionary$2`<TKey, TValue> : `IEnumerable$1`<`KeyValuePair$2`<TKey, TValue>>, IEnumerable, `IReadOnlyCollection$1`<`KeyValuePair$2`<TKey, TValue>>

external open class `KeyValuePair$2`<TKey, TValue> : ValueType

external interface `IDictionary$2`<TKey, TValue> : `IEnumerable$1`<`KeyValuePair$2`<TKey, TValue>>, IEnumerable, `ICollection$1`<`KeyValuePair$2`<TKey, TValue>>

external interface `IEqualityComparer$1`<T>