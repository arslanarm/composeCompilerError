import org.jetbrains.compose.compose

plugins {
    kotlin("js") version "1.5.21"
    id("org.jetbrains.compose") version "1.0.0-alpha2"
}

group = "me.ploou"
version = "1.0"

repositories {
    mavenCentral()
    google()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}

dependencies {
    implementation(project(":common"))
    implementation(compose.web.core)
    implementation(compose.web.widgets)
}

kotlin {
    js(IR) {
        binaries.executable()
        browser()
    }
}
