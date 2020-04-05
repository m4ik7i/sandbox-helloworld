import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.71"
    application
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "showcase"
version = "0.1.0"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "1.8"
  }
}

application {
    mainClassName = "showcase.hello_world.MainKt"
}
