package com.flix.movie.data.usecase

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.compose
import kotlinx.coroutines.flow.flowOn

abstract class BaseUseCase<T>(private val dispatcher: CoroutineDispatcher = Dispatchers.IO) {
    abstract fun createFlow(date: Map<String, Any>? = null): Flow<T>

    fun execute(withData: Map<String, Any>? = null): Flow<T> {
        return createFlow(withData).flowOn(dispatcher)
    }
}