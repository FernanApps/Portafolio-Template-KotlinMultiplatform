import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension

/*
val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

val Project.androidLibs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("androidLibs")
*/

val Project.libs: VersionCatalog
    get() = (extensions.getByType(VersionCatalogsExtension::class.java).named("libs")) as VersionCatalog

val Project.androidLibs: VersionCatalog
    get() = (extensions.getByType(VersionCatalogsExtension::class.java).named("libs")) as VersionCatalog
