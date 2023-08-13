package com.example.learn_compose_20230727.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learn_compose_20230727.R
import com.example.learn_compose_20230727.components.ButtonComponent
import com.example.learn_compose_20230727.components.ClickableLoginTextComponent
import com.example.learn_compose_20230727.components.DividerTextComponent
import com.example.learn_compose_20230727.components.HeadingTextComponent
import com.example.learn_compose_20230727.components.MyTextFieldComponent
import com.example.learn_compose_20230727.components.NormalTextComponent
import com.example.learn_compose_20230727.components.PasswordMyTextFieldComponent
import com.example.learn_compose_20230727.components.UnderLineTextComponent
import com.example.learn_compose_20230727.navigation.PostOfficeAppRouter
import com.example.learn_compose_20230727.navigation.Screen
import com.example.learn_compose_20230727.navigation.SystemBackButtonHandler

/**
 * Created by AidenChang 2023/08/13
 */

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.message)
            )
            PasswordMyTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_lock)
            )
            Spacer(modifier = Modifier.height(20.dp))
            UnderLineTextComponent(stringResource(id = R.string.forgot_password))
            Spacer(modifier = Modifier.height(20.dp))
            ButtonComponent(value = stringResource(id = R.string.login))
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()
            ClickableLoginTextComponent(
                tryingToLogin = false,
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
                }
            )
        }
    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}