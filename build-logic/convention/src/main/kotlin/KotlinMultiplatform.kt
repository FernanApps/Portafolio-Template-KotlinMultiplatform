import org.gradle.api.Project
import org.gradle.kotlin.dsl.getting
import org.gradle.kotlin.dsl.provideDelegate
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

internal fun Project.configureKotlinMultiplatform(
    extension: KotlinMultiplatformExtension
) = extension.apply {
    jvmToolchain(17)

    // targets
    androidTarget()
    iosArm64()
    iosX64()
    iosSimulatorArm64()

    jvm()

    //@OptIn(ExperimentalWasmDsl::class)
    //wasmJs()
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = project.name /*"ComposeApp"*/
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                outputFileName =  project.name + ".js"/*"composeApp.js"*/
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
        }
        binaries.executable()
    }
    applyDefaultHierarchyTemplate()

    //common dependencies
    sourceSets.apply {

        commonMain {
            dependencies {
                /*
                implementation(libs.findLibrary("koin.core").get())
                implementation(libs.findLibrary("coroutines.core").get())
                implementation(libs.findLibrary("kotlinx-dateTime").get())
                implementation(libs.findLibrary("napier").get())
                implementation(libs.findLibrary("kotlinx-serialization").get())

                 */
                implementation(libs.findLibrary("kotlinx-serialization-json").get())

            }
        }

        androidMain {
            dependencies {


            }
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }
        jvmMain.dependencies {
            //implementation(compose.desktop.currentOs)
            implementation(libs.findLibrary("kotlinx.coroutines.swing").get())

        }
    }

    //applying the Cocoapods Configuration we made
    //(this as ExtensionAware).extensions.configure<CocoapodsExtension>(::configureKotlinCocoapods)
    //(this as ExtensionAware).extensions.configure(CocoapodsExtension::class.java, ::configureKotlinCocoapods)

}