import java.net.URI

plugins {
    `kotlin-dsl`
}
private val libs get() = libsBuildLogic
group = libs.versions.data.application.id.get() //your module name

dependencies {
    compileOnly(libs.android.gradlePlugin) //if targetting Android
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin) //if you are using Compose Multiplatform
    implementation(libs.kotlin.serialization.gradlePlugin)
}

/**
libs.versions.toml
android-gradlePlugin = { module = "com.android.tools.build:gradle", version.ref = "agp" }
kotlin-gradlePlugin = { module = "org.jetbrains.kotlin:kotlin-gradle-plugin", version.ref = "kotlin" }
compose-gradlePlugin = { module = "org.jetbrains.compose:org.jetbrains.compose.gradle.plugin", version.ref = "compose" }
 **/

gradlePlugin {
    plugins {
        register(libs.plugins.kotlinMultiplatformConvention.get().pluginId){
            id = libs.plugins.kotlinMultiplatformConvention.get().pluginId
            //id = "dev.icerock.mobile.multiplatform-network-generator"
            implementationClass = "KotlinMultiplatformPlugin"
        }

        register(libs.plugins.composeMultiplatformConvention.get().pluginId){
            id = libs.plugins.composeMultiplatformConvention.get().pluginId
            implementationClass = "ComposeMultiplatformPlugin"
        }
    }
}

