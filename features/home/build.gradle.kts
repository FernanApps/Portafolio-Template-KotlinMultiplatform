plugins {
    id(libs.plugins.kotlinMultiplatformConvention.get().pluginId)
    id(libs.plugins.composeMultiplatformConvention.get().pluginId)
}


kotlin {
    sourceSets {
        androidMain.dependencies {


        }
        commonMain.dependencies {

            implementation(projects.corePresentacion)
            implementation(projects.domain)
            implementation(projects.data)
            implementation(projects.common)

            // Enables FileKit without Compose dependencies
            implementation(myLibs.filekit.compose)
            // Coil3
            implementation(myLibs.coil.compose)
        }

        jvmMain.dependencies {


        }
    }
}


