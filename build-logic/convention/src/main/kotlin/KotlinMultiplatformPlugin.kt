import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class KotlinMultiplatformPlugin: Plugin<Project> {

    override fun apply(target: Project):Unit = with(target){
        with(pluginManager){
            apply(libs.findPlugin("kotlinMultiplatform").get().get().pluginId)
            //apply(libs.findPlugin("kotlinCocoapods").get().get().pluginId)
            apply(libs.findPlugin("androidLibrary").get().get().pluginId)
            apply(libs.findPlugin("kotlinSerialization").get().get().pluginId)
            //target.plugins.apply("org.jetbrains.kotlin.plugin.serialization")

        }

        extensions.configure<KotlinMultiplatformExtension>(KotlinMultiplatformExtension::class.java,::configureKotlinMultiplatform)
        extensions.configure<LibraryExtension>(LibraryExtension::class.java, ::configureKotlinAndroid)
    }
}