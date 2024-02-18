package com.example.passwordmanager

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.chaquo.python.Python
import com.example.passwordmanager.NavigationBar.MainScreen
import com.example.passwordmanager.View.HomeScreen.HomeScreen.HomeScreen
import com.example.passwordmanager.View.NewPassword.NewPasswordScreen.NewPasswordScreen
import com.example.passwordmanager.View.PassWordGenerator.PassWordGeneratorScreen.PasswordGeneratorScreen
import com.example.passwordmanager.View.PasswordHealth.PasswordHealthScreen.PasswordHealthScreen
import com.example.passwordmanager.ViewModel.PasswordGenerator.PasswordGeneratorViewModel
import com.example.passwordmanager.ui.theme.PasswordManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                Color.TRANSPARENT, Color.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.light(
                Color.BLACK, Color.BLACK
            )
        )
        super.onCreate(savedInstanceState)
        setContent {
            PasswordManagerTheme {
                MainScreen()

            }
        }
    }
}


