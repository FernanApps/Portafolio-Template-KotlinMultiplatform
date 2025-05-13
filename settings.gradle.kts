rootProject.name = "FernanApps-Template-KotlinMultiplatform"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }

    versionCatalogs {
        create("myLibs") {
            from(files("gradle/libs.versions.toml"))
        }
    }

}


include(":composeApp")
include(":common")
include(":core_presentacion")

include(":features:splash")
include(":features:home")
include(":features:word_search")

include(":domain")
include(":data")


// WindowSizeClass
//include(":windowsizeclass:lib")
include(":windowsizeclass")
project(":windowsizeclass").projectDir = file("windowsizeclass/lib")
