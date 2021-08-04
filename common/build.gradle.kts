import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform") version "1.5.21"
    id("org.jetbrains.compose") version "1.0.0-alpha2"
}

group = "me.ploou"
version = "1.0"

repositories {
    google()
    jcenter()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}

kotlin {
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    js("browser", IR) {
        binaries.library()
        browser()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                implementation(compose.web.widgets)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val desktopMain by getting {
            dependencies {
                api(compose.desktop.common)
            }
        }
        val desktopTest by getting
        val browserMain by getting {
            dependencies {
                api(compose.web.core)
                api(compose.web.widgets)
            }
        }
        val browserTest by getting
    }
}
