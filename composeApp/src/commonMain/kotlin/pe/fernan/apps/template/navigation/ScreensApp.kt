package pe.fernan.apps.template.navigation

import kotlinx.serialization.Serializable



@Serializable
internal sealed class Screens{

    @Serializable
    object Splash

    @Serializable
    object Home

    @Serializable
    data class Details(val arg: String)

}

//@Serializable
//data class Details(val arg: String)