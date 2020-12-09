Circular Animated Image
=======

A circular loaders to be used for splashscreen

[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-18%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=18)

Usage
--------

### Download Library
---------

To make a circular animated image add CircularAnimatedImg in your layout XML and add CircularAnimatedImage library in your project, download the latest AAR from [JitPack][1] or you can also grab it via Gradle:

[![](https://jitpack.io/v/valix93/circularanimatedimage.svg)](https://jitpack.io/#valix93/circularanimatedimage)


#### Gradle

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
  repositories {
    maven { 
      url 'https://jitpack.io' 
    }
  }
}
```

Add the dependency

```groovy
dependencies {
  implementation 'com.github.valix93:circularanimatedimage:1.1.1'
}
  ```

#### Maven

Add the JitPack repository to your build file

```xml
<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>
```
Add the dependency

```xml
<dependency>
    <groupId>com.github.valix93</groupId>
    <artifactId>circularanimatedimage</artifactId>
    <version>1.1.1</version>
</dependency>
```

### XML
------
```xml
<it.valix93.circularanimatedimg.CircularAnimatedImg
    android:id="@+id/circularImgSplash"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_centerHorizontal="true"
    android:layout_centerVertical="true"
    android:layout_marginTop="-50dp"
    android:layout_marginLeft="50dp"
    android:layout_marginRight="50dp"
    android:src="@drawable/logo"
    app:cai_border="true"
    app:cai_border_width="12dp"
    app:cai_progress="0"
    app:cai_wave_color="@color/blue"
    app:cai_wave_amplitude="0.10"
    />
```
You must use the following properties in your XML to change your CircularAnimatedImg.

##### Properties:

* `app:cai_progress`        (integer)   -> default 0
* `app:cai_border`          (boolean)   -> default true
* `app:cai_border_width`    (dimension) -> default 4dp
* `app:cai_wave_amplitude`  (float)     -> default 0.05f (between 0.00f and 0.10f)

### Java
-------

```java
//circularImgSplash is your CircularAnimatedImg
CircularAnimatedImg circularImgSplash = findViewById(R.id.circularImgSplash); 
// Set Progress
circularImgSplash.setProgress(100, progressMills, new Animator.AnimatorListener() { ... } )
// Set Border Width
circularImgSplash.setBorderWidth(10 * getResources().getDisplayMetrics().density);
// Set Wave Amplitude (between 0.00f and 0.10f)
circularFillableLoaders.setAmplitudeRatio(0.08);
```


License [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
--------

CircularAnimatedImg by V. Lipari is licensed under a Apache License 2.0.

 [1]: https://jitpack.io/#valix93/circularanimatedimage
 
 
 

