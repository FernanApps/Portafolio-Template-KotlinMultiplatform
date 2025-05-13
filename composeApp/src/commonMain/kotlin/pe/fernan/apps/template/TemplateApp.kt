package pe.fernan.apps.template

import androidx.annotation.MainThread
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import pe.fernan.apps.template.core.presentation.navigation.GoBackAction
import pe.fernan.apps.template.navigation.Screens
import pe.fernan.apps.template.navigation.Screens.Details
import pe.fernan.apps.template.presentation.screens.home.HomeNavigator
import pe.fernan.apps.template.presentation.screens.home.HomeScreen
import pe.fernan.apps.template.presentation.screens.splash.SplashScreen


@Composable
fun TemplateApp() {
    val navController: NavHostController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    //val currentScreen = Screens(
    //    backStackEntry?.destination?.route ?: ScreensApp.Home.name
    //)



    Scaffold(
        topBar = {
            /*
            CupcakeAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )

             */
        }
    ) { innerPadding ->


        val goBackAction = GoBackAction { navController.navigateUp() }

        val homeNavigator = object : HomeNavigator {
            override fun toWordSearch() {
                navController.navigate(Screens.Details("arg"))
            }
        }


        NavHost(
            navController = navController,
            startDestination = Screens.Splash,
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.75f))
                //.verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ) {
            composable<Screens.Splash> {
                SplashScreen(onNavigate = {
                    navController.navigateAndClear(Screens.Home)
                })
            }
            composable<Screens.Home> {
                HomeScreen(
                    navigator = homeNavigator
                )
            }

            composable<Screens.Details> { backStackEntry ->
                val arg = backStackEntry.toRoute<Details>()
                Text("arg $arg")
            }


        }

    }
}

@MainThread
private fun <T : Any> NavController.navigateAndClear(
    route: T,
    builder: NavOptionsBuilder.() -> Unit = {
        popUpTo(0) { inclusive = true }
    }
) {
    this.navigate(route, builder)
}
