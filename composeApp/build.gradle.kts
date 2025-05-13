import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig
import java.io.FileInputStream
import java.io.InputStreamReader
import java.util.Properties


plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinSerialization)
    //alias(libs.plugins.buildConfig)
    alias(libs.plugins.buildKonfig)

}

kotlin {
    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = project.name /*"ComposeApp"*/
            isStatic = true
        }
    }
    
    jvm()


    // Guide dev server custom
    // https://kotlinlang.org/docs/js-project-setup.html#webpack-configuration-file

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
    
    sourceSets {

        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)
        }
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)

            implementation(libs.navigation.compose)
            //implementation("org.jetbrains.compose.material3:material3-window-size-class:1.7.3")
            implementation(projects.windowsizeclass)

            implementation(projects.corePresentacion)
            implementation(projects.features.splash)

            implementation(projects.common)
            implementation(projects.data)
            implementation(projects.domain)

            implementation(projects.features.splash)
            implementation(projects.features.home)

            implementation(libs.kotlinx.serialization.json)

        }
        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutines.swing)
        }

        all {
            languageSettings.optIn("androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi")
        }
    }
}


android {
    namespace = libs.versions.data.application.id.get()
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        applicationId = libs.versions.data.application.id.get()
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = libs.versions.data.application.version.code.get().toInt()
        versionName = libs.versions.data.application.version.name.get()

        addConstantResource("app_name", libs.versions.data.application.name.get())

    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

fun addConstantApp(constName: String, constValue: String) {
    android.defaultConfig {
        buildConfigField("String", constName, "\"$constValue\"")
    }
}

fun addConstantManifest(constName: String, constValue: String) {
    android.defaultConfig {
        manifestPlaceholders += mapOf(constName to constValue)
    }
}

fun addConstantResource(constName: String, constValue: String) {
    android.defaultConfig {
        resValue("string", constName, constValue)
    }
}

fun addConstant(constName: String, constValue: String) {
    addConstantManifest(constName, constValue)
    addConstantApp(constName, constValue)
}

dependencies {
    debugImplementation(compose.uiTooling)
}

compose.desktop {
    application {
        mainClass = libs.versions.data.application.id.get() + ".MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = libs.versions.data.application.id.get()
            packageVersion = libs.versions.data.application.version.name.get()/*"1.0.0"*/

            linux {
                modules("jdk.security.auth")
            }
        }
    }
}


buildkonfig {

    /// Types
    val STRING = com.codingfeline.buildkonfig.compiler.FieldSpec.Type.STRING

    packageName = myLibs.versions.data.application.id.get()

    defaultConfigs {
        buildConfigField(STRING, "appName", libs.versions.data.application.name.get())
    }
}

/*
buildConfig {
    buildConfig<String>("package", libs.versions.data.application.id.get())
    buildConfig<String>("appName", libs.versions.data.application.name.get())
    buildConfig<String>("versionName", libs.versions.data.application.version.name.get())
    buildConfig<Int>("versionCode", libs.versions.data.application.version.code.get().toInt())



    // BuildConfig configuration here.
    // https://github.com/gmazzo/gradle-buildconfig-plugin#usage-in-kts
}



private inline fun <reified T> com.github.gmazzo.gradle.plugins.BuildConfigExtension.buildConfig(
    key: String,
    value: T
): NamedDomainObjectProvider<com.github.gmazzo.gradle.plugins.BuildConfigField> {
    println("buildConfig [ value = $value ] [ class = ${T::class.java} ]")
    val (clazzType, finalValue) = when (T::class.java) {
        //String::class.java -> "String" to ""
        //Boolean::class.java -> "kotlin.Boolean" to "$value"
        Integer::class.java -> "kotlin.Int" to "$value"
        else -> "String" to "\"${value}\""
    }
    return buildConfigField(clazzType, key, finalValue)
}
*/

compose.resources {
    packageOfResClass = libs.versions.data.application.id.get()
}



dynamicIosConfig {
    bundleId = libs.versions.data.application.id.get()
    appName = libs.versions.data.application.name.get()
    configFilePath = "../iosApp/Configuration/Config.xcconfig"
}

dynamicStringsConfig {
    stringsFilePath = "./src/commonMain/composeResources/values/strings.xml"
    config("app_name", libs.versions.data.application.name.get())
}

tasks.named("preBuild") {
    dependsOn("updateStringsXml", "updateXcconfig")
}


// TODO EXTENSIONS FOR PROJECT

open class DynamicIosConfigExtension {
    var bundleId: String = ""
    var appName: String = ""
    var configFilePath: String = ""
}

fun Project.dynamicIosConfig(configure: DynamicIosConfigExtension.() -> Unit) {
    val extension = extensions.create("dynamicIosConfig", DynamicIosConfigExtension::class.java)
    extension.configure()

    tasks.register("updateXcconfig") {
        group = "configuration"
        description = "Updates Config.xcconfig with dynamic BUNDLE_ID and APP_NAME."

        doLast {
            val configFile = file(extension.configFilePath)
            if (configFile.exists()) {
                println("🔵 Updating Config.xcconfig...")

                val updatedLines = configFile.readLines().map { line ->
                    when {
                        line.startsWith("BUNDLE_ID=") -> "BUNDLE_ID=${extension.bundleId}"
                        line.startsWith("APP_NAME=") -> "APP_NAME=${extension.appName}"
                        else -> line
                    }
                }

                configFile.writeText(updatedLines.joinToString("\n"))
                println("✅ Config.xcconfig updated successfully.")
            } else {
                throw GradleException("⚠️ Config.xcconfig not found at ${configFile.absolutePath}")

            }
        }
    }
}


//val apiKey: String = getLocalProperty("API_KEY").toString()
fun Project.getLocalProperty(key: String, file: String = "local.properties"): Any {
    val properties = Properties()
    val localProperties = File(rootDir.path, file)
    if (localProperties.isFile) {
        InputStreamReader(FileInputStream(localProperties), Charsets.UTF_8).use { reader ->
            properties.load(reader)
        }
    } else error("File from not found")


    return properties.getProperty(key, "")
}

open class DynamicStringsConfigExtension {
    lateinit var stringsFilePath: String

    val configs = mutableMapOf<String, String>()

    fun config(key: String, value: String) {
        configs[key] = value
    }
}

fun Project.dynamicStringsConfig(configure: DynamicStringsConfigExtension.() -> Unit) {
    val extension = extensions.create("dynamicStringsConfig", DynamicStringsConfigExtension::class.java)
    extension.configure()

    tasks.register("updateStringsXml") {
        group = "configuration"
        description = "Updates or adds values in strings.xml dynamically."

        doLast {
            val stringsFile = file(extension.stringsFilePath)
            if (!stringsFile.exists()) {
                throw GradleException("⚠️ strings.xml not found at ${stringsFile.absolutePath}")
            }

            println("🔵 Updating strings.xml...")

            val configs = extension.configs

            val lines = stringsFile.readLines().toMutableList()
            val updatedLines = mutableListOf<String>()
            val existingKeys = mutableSetOf<String>()

            for (line in lines) {
                val match = Regex("""<string name="([^"]+)">.*</string>""").find(line)
                if (match != null) {
                    val key = match.groupValues[1]
                    existingKeys.add(key)
                    if (configs.containsKey(key)) {
                        updatedLines.add("""    <string name="$key">${configs[key]}</string>""")
                        println("✅ Updated key: $key")
                    } else {
                        updatedLines.add(line)
                    }
                } else {
                    updatedLines.add(line)
                }
            }

            for ((key, value) in configs) {
                if (!existingKeys.contains(key)) {
                    updatedLines.add("""    <string name="$key">$value</string>""")
                    println("➕ Added new key: $key")
                }
            }

            stringsFile.writeText(updatedLines.joinToString("\n"))
            println("✅ strings.xml updated successfully.")
        }
    }
}

