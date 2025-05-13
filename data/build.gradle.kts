import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties
import java.io.FileInputStream
import java.io.InputStreamReader
import java.util.Properties
plugins {
    id(libs.plugins.kotlinMultiplatformConvention.get().pluginId)
}


kotlin {
    sourceSets {
        androidMain.dependencies {

            implementation("io.ktor:ktor-client-okhttp:3.0.3")
        }
        commonMain.dependencies {
            implementation(projects.domain)
            implementation("io.ktor:ktor-client-core:3.0.3")
            implementation("io.ktor:ktor-client-content-negotiation:3.0.3")
            implementation("io.ktor:ktor-serialization-kotlinx-json:3.0.3")
            implementation("io.ktor:ktor-client-logging:3.0.3")
        }

        jvmMain.dependencies {
            implementation("io.ktor:ktor-client-okhttp:3.0.3")

        }

        iosMain.dependencies {
            implementation("io.ktor:ktor-client-darwin:3.0.3")

        }
        wasmJsMain.dependencies {
            implementation("io.ktor:ktor-client-js:3.0.3")

        }
    }
}




