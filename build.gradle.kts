plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    id("com.vanniktech.maven.publish") version "0.28.0"

}


subprojects {
    val project = this
    project.afterEvaluate {
        // Fix Apply composeCompiler
        val isComposeMultiplatform = project.plugins.findPlugin(libs.plugins.composeMultiplatform.get().pluginId) != null
        val composeCompilerPluginId = libs.plugins.composeCompiler.get().pluginId

        if (isComposeMultiplatform) {
            if (project.plugins.findPlugin(composeCompilerPluginId) == null) {
                project.pluginManager.apply(composeCompilerPluginId)
            }
        }
    }

}

