package com.example.learn_compose_20230727.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

/**
 * Created by AidenChang 2023/08/05
 */

sealed class Screen {
    object SignUpScreen : Screen()
    object TermsAndConditionsScreen : Screen()
}

object PostOfficeAppRouter {
    var currentScreen : MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)

    fun navigateTo(destination : Screen) {
        currentScreen.value = destination
    }
}