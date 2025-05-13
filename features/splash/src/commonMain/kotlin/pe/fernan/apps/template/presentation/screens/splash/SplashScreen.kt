package pe.fernan.apps.template.presentation.screens.splash

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(onNavigate: () -> Unit) {

    LaunchedEffect(true){
        delay(3500)
        onNavigate()
    }

    Text("This a SplashScreen")
}