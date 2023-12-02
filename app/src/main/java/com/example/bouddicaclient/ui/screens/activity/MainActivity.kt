package com.example.bouddicaclient.ui.screens.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.bouddicaclient.ui.screens.mainscreen.MainScreen
import com.example.bouddicaclient.ui.theme.HiltMVVMComposeMovieTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      HiltMVVMComposeMovieTheme {
        MainScreen()
      }
    }
  }
}