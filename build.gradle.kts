plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.7.10"
    id("io.kotest.multiplatform") version "5.4.2"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64()
    macosX64()
    macosArm64()
    mingwX64()

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation("io.kotest:kotest-assertions-core:5.4.2")
                implementation("io.kotest:kotest-framework-api:5.4.2")
                implementation("io.kotest:kotest-framework-engine:5.4.2")
            }
        }
    }
}

extensions.findByName("buildScan")?.withGroovyBuilder {
    setProperty("termsOfServiceUrl", "https://gradle.com/terms-of-service")
    setProperty("termsOfServiceAgree", "yes")
}
