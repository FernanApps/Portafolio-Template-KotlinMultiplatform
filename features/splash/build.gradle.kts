plugins {
    id(libs.plugins.kotlinMultiplatformConvention.get().pluginId)
    id(libs.plugins.composeMultiplatformConvention.get().pluginId)
}


kotlin {
    sourceSets {
        androidMain.dependencies {


        }
        commonMain.dependencies {

        }

        jvmMain.dependencies {


        }
    }
}


