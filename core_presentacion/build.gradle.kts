plugins {
    id(libs.plugins.kotlinMultiplatformConvention.get().pluginId)
    id(libs.plugins.composeMultiplatformConvention.get().pluginId)

}


kotlin {
    sourceSets {
        androidMain.dependencies {


        }
        commonMain.dependencies {
            implementation(projects.common)
            implementation(projects.data)
            implementation(projects.domain)

        }

        jvmMain.dependencies {


        }
    }
}
dependencies {
    debugImplementation(compose.uiTooling)
    //debugImplementation(libs.androidx.ui.tooling)
}

compose.resources {
    publicResClass = true
    packageOfResClass = myLibs.versions.data.application.id.get() + "." + project.name.replace("_",".") + ".resources"
    generateResClass = always
}

