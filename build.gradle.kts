buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.bundles.plugins)
    }
}

subprojects {
    afterEvaluate {
        project.apply("${rootDir}/gradle/common.gradle")
    }
}