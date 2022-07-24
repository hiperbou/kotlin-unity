package com.hiperbou.unity.coroutines

import kotlin.coroutines.*

fun launch(block: suspend () -> Unit) = launch(block, EmptyCoroutineContext)
fun launch(block: suspend () -> Unit, context: CoroutineContext) =
    block.startCoroutine(StandaloneCoroutine(context))

private class StandaloneCoroutine(override val context: CoroutineContext): Continuation<Unit> {
    override fun resumeWith(result: Result<Unit>) =
        try { result.getOrThrow() } catch (e:Throwable){ e.printStackTrace() }
}
