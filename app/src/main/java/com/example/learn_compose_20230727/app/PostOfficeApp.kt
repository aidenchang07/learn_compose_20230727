package com.example.learn_compose_20230727.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.learn_compose_20230727.navigation.PostOfficeAppRouter
import com.example.learn_compose_20230727.navigation.Screen
import com.example.learn_compose_20230727.screens.SignUpScreen
import com.example.learn_compose_20230727.screens.TermsAndConditionsScreen

/**
 * Created by AidenChang 2023/07/27
 */

@Composable
fun PostOfficeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
            }
        }
    }
}