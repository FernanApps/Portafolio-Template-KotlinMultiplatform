import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.compose.ComposeExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

// https://medium.com/@sarguru1981/dependency-management-using-kotlin-dsl-28d06d678dfc
class ComposeMultiplatformPlugin : Plugin<Project> {

    //alias(libs.plugins.kotlinMultiplatform)
    //alias(libs.plugins.androidLibrary)
    //alias(libs.plugins.composeMultiplatform)
    //alias(libs.plugins.composeCompiler)

    override fun apply(target: Project) = with(target) {
        with(pluginManager){
            apply(libs.findPlugin("composeMultiplatform").get().get().pluginId)
            apply(libs.findPlugin("composeCompiler").get().get().pluginId)

        }

        val composeDeps = extensions.getByType<ComposeExtension>(ComposeExtension::class.java).dependencies

        dependencies {
            debugImplementation(composeDeps.uiTooling)
        }
        extensions.configure<KotlinMultiplatformExtension>(KotlinMultiplatformExtension::class.java) {

            sourceSets.apply {
                androidMain.dependencies {
                    implementation(composeDeps.preview)
                    implementation(libs.findLibrary("androidx.activity.compose").get())
                    //implementation(libs.findLibrary("koin.android").get() )

                    implementation(libs.findLibrary("androidx.activity.compose").get())
                    implementation(libs.findLibrary("androidx.lifecycle.viewmodel").get())
                    implementation(libs.findLibrary("androidx.lifecycle.runtime.compose").get())
                }
                commonMain {
                    dependencies {
                        implementation(composeDeps.runtime)
                        implementation(composeDeps.foundation)
                        implementation(composeDeps.material3)
                        implementation(composeDeps.materialIconsExtended)
                        implementation(composeDeps.material)
                        implementation(composeDeps.ui)
                        implementation(composeDeps.components.resources)
                        implementation(composeDeps.components.uiToolingPreview)
                    }
                }
                jvmMain.dependencies {
                    implementation(composeDeps.desktop.currentOs)
                }

            }
        }

    }
}

/**
libs.versions.toml
composeMultiplatform = { id = "org.jetbrains.compose", version.ref = "compose" }
 **/