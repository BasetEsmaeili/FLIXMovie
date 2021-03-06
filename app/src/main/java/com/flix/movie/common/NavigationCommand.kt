package com.flix.movie.common

import androidx.navigation.NavDirections
sealed class NavigationCommand {
    object Nothing : NavigationCommand()
    data class To(val direction: NavDirections) : NavigationCommand()
    object Back : NavigationCommand()
    data class BackTo(val destinationId: Int) : NavigationCommand()
}
