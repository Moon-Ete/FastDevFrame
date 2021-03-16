package com.moonete.fastdevframe.core.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

/**
 * @Author: Moon-Ete
 * @CreateDate: 2021/3/14 17:51
 */
class BaseViewModel : ViewModel() {

    fun launchOnUI(block: suspend CoroutineScope.() -> Unit) {
        viewModelScope.launch { block() }
    }

    fun launchOnIO(block: suspend CoroutineScope.() -> Unit) {
        viewModelScope.launch(viewModelScope.coroutineContext + Dispatchers.IO) { block() }
    }

    suspend fun <T> requestApi(block: suspend CoroutineScope.() -> T) =
        withContext(viewModelScope.coroutineContext + Dispatchers.IO ) {
            block()
        }
}