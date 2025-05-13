package pe.fernan.apps.template.presentation.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.stringResource


interface HomeNavigator {
    fun toWordSearch()
}

@Composable
fun HomeScreen(navigator: HomeNavigator) {

    Text("This a HomeScreen")

}


