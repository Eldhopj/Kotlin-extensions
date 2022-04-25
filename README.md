Kotlin-Extenstions
=====

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/29fc318009654c17a6cfafcc1ff37b04)](https://www.codacy.com/gh/Eldhopj/kotlin-extensions/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Eldhopj/kotlin-extensions&amp;utm_campaign=Badge_Grade)
[![](https://jitpack.io/v/Eldhopj/kotlin-extensions.svg)](https://jitpack.io/#Eldhopj/kotlin-extensions)

This library contains essential Kotlin language extenstions which we use in daily projects

How To
--------
 Gradle:

Add it in your `root build.gradle` at the end of repositories:
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
dependency to your module `build.gradle` file
```gradle
dependencies { 
	implementation 'com.github.Eldhopj:kotlin-extensions:1.0'
}
```

For info on using in the maven and others, see the [jitpack][1] docs page.

Usage
-------------------

## **String Extenstions**

- .**isValidEmail** -> Checks whether the email is valid, returns true if valid else false
- .**isValidName** -> Checks whether the name is valid, returns true if valid else false
- .**capitalizeEachWord** -> Capitalize each word
 * eg: hello world -> Hello World
-  .**toHourMinuteSeconds** ->  * Converts the seconds to Hours, Minutes & Seconds as per your pattern.
		Default pattern is %dh %dm %ds.
 * eg: 1h 2m 30s
-  .**toHourMinuteSeconds** ->  * Converts the seconds to Minutes & Seconds as per your pattern.
		Default pattern is %dm %ds.
 * eg: 1hr 2m

## **Number Extenstions**

- .**shortenString** ->   Format number into short values.
 * eg: 1000 -> 1k
 * 1000000 -> 1M
- .**format** ->  Returns the string representation of the decimal values
	 	Pattern : defaut its 0.##, u can pass any desired pattern
		 RoundingMode: default its RoundingMode.HALF_EVEN
 * eg: 10.02542 -> 10.03
 
 
 ## **Date Extenstions**
 
Please go thorugh the [Date Extension][2] code documentation


[1]: https://jitpack.io/#Eldhopj/kotlin-extensions/Tag
[2]: https://github.com/Eldhopj/kotlin-extensions/blob/master/Kotlin_extensions/src/main/java/com/eldhopj/kotlin_extensions/DateExtension.kt "Date Extension"
