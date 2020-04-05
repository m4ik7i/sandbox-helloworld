plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.70"
    application
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

application {
    mainClassName = "showcase.hello_world.MainKt"
}
