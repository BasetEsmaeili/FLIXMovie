
package com.flix.movie.view.base

import androidx.lifecycle.ViewModel
import com.flix.movie.common.NavigationCommand
import com.flix.movie.common.SingleEvent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@ExperimentalCoroutinesApi
open class BaseViewModel : ViewModel() {
    private val navigatorLiveData: MutableStateFlow<SingleEvent<NavigationCommand>> =
        MutableStateFlow(SingleEvent(NavigationCommand.Nothing))

    fun getNavigatorLiveData(): StateFlow<SingleEvent<NavigationCommand>> = navigatorLiveData

    fun setNavigatorCommand(command: NavigationCommand) {
        navigatorLiveData.value = SingleEvent(command)
    }
}
