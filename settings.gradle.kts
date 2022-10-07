pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "CalorieTracker"
include(":app",
        ":core",
        ":onboarding",
        ":onboarding:onboarding_presentation",
        ":onboarding:onboarding_domain",
        ":tracker",
        ":tracker:tracker_data",
        ":tracker:tracker_domain",
        ":tracker:tracker_presentation",
)
