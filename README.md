# android-manufacturer

[![Build Status](https://cloud.drone.io/api/badges/v7lin/android-manufacturer/status.svg)](https://cloud.drone.io/v7lin/android-manufacturer)
[![GitHub tag](https://img.shields.io/github/tag/v7lin/android-manufacturer.svg)](https://github.com/v7lin/android-manufacturer/releases)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)

### snapshot

````
ext {
    latestVersion = '0.0.1-SNAPSHOT'
}

allprojects {
    repositories {
        ...
        maven {
            url 'https://oss.jfrog.org/artifactory/oss-snapshot-local'
        }
        ...
    }
}
````

### release

````
ext {
    latestVersion = '0.0.1'
}

allprojects {
    repositories {
        ...
        jcenter()
        ...
    }
}
````

### usage

android
````
...
dependencies {
    ...
    implementation "io.github.v7lin:manufacturer-android:${latestVersion}"
    ...
}
...
````
