# android-manufacturer

[![Build Status](https://cloud.drone.io/api/badges/v7lin/android-manufacturer/status.svg)](https://cloud.drone.io/v7lin/android-manufacturer)
[ ![Download](https://api.bintray.com/packages/v7lin/maven/manufacturer-android/images/download.svg) ](https://bintray.com/v7lin/maven/manufacturer-android/_latestVersion)

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
