plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "io.github"
version = "1.0-SNAPSHOT"

application {
    mainClass = "io.github.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}