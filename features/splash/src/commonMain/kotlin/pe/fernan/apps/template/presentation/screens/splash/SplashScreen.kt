package pe.fernan.apps.template.presentation.screens.splash

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(onNavigate: () -> Unit) {

    LaunchedEffect(true){
        delay(3500)
        //onNavigate()
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("This is a SplashScreen")

       /* Image(
            imageVector = MyIconPack.Logofx,
            contentDescription = ""
        )*/
        return@Column
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.LightGray)
        ) {
            val path = PathParser().parsePathString("M10 80 C 40 10, 65 10, 95 80 S 150 150, 180 80").toPath()

            drawPath(
                path = path,
                color = Color.Red,
                style = Stroke(width = 4f)
            )
        }
    }
}