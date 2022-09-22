package app.sololabs.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.sololabs.Greeting
import app.sololabs.ui.theme.SoloTheme


@Composable
fun SoloApp(
    windowSizeClass: WindowSizeClass, appState: SoloAppState = rememberSoloAppState(windowSizeClass)
) {
    SoloTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Greeting("Android")
        }
    }
}