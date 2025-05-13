package pe.fernan.apps.template

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import pe.fernan.apps.template.BuildKonfig

fun main() = application {
    val state: WindowState = rememberWindowState(
        placement = WindowPlacement.Maximized
    )
    Window(
        onCloseRequest = ::exitApplication,
        state = state,
        title = BuildKonfig.appName,
    ) {
        App()
    }
}



