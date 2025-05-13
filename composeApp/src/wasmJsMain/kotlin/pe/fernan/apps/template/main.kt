package pe.fernan.apps.template

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    document.title = BuildKonfig.appName
    ComposeViewport(document.body!!) {
        App()
    }
}