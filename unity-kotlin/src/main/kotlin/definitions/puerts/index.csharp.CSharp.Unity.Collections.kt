@file:JsModule("csharp")
@file:JsNonModule
@file:JsQualifier("Unity.Collections")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package csharp.Unity.Collections

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
import csharp.System.ValueType
import csharp.System.Collections.Generic.`IEnumerable$1`
import csharp.System.Collections.IEnumerable
import csharp.System.IDisposable
import csharp.System.`IEquatable$1`

external open class `NativeArray$1`<T> : ValueType, `IEnumerable$1`<T>, IEnumerable, IDisposable, `IEquatable$1`<`NativeArray$1`<T>>

external open class `NativeSlice$1`<T> : ValueType, `IEnumerable$1`<T>, IEnumerable, `IEquatable$1`<`NativeSlice$1`<T>>