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
    implementation 'com.github.Eldhopj:kotlin-extensions:1.2'
}
```

For info on using in the maven and others, see the [jitpack][1] docs page.

Usage
-------------------

## **String Extensions**

- .**isValidEmail** -> Checks whether the email is valid, returns true if valid else false
- .**isValidName** -> Checks whether the name is valid, returns true if valid else false
- .**isValidPhoneNumber** -> Checks whether the phone number is valid, returns true if valid else false
- .**capitalizeEachWord** -> Capitalize each word
 	* eg: hello world -> Hello World

- .**checkRegex** ->  Checks the regex pattern is valid, returns true if valid else false

		Parameters
		1.pattern -> regex pattern.
- .**toHourMinuteSeconds** ->  Converts the seconds to Hours, Minutes & Seconds as per your pattern.

		Parameters
		1.pattern -> in which pattern we have to convert. Default Pattern is %dh %dm %ds.
 	* eg: 1h 2m 30s
- .**toHourMinute** ->  Converts the seconds to Minutes & Seconds as per your pattern.

		Parameters
		1.pattern -> in which pattern we have to convert. Default Pattern is %dm %ds.
 	* eg: 1hr 2m

Please go thorough the [String Extensions][3] code documentation for more information

## **Number Extensions**

- .**shortenString** ->   Format number into short values.
	* eg: 1000 -> 1k
	*     1000000 -> 1M
- .**format** ->  Returns the string representation of the decimal values

  	Parameters
  	1.pattern -> in which pattern we have to convert. Default Pattern is 0.##.
  	2.roundingMode -> set the rounding behavour, default behavour is RoundingMode.HALF_EVEN
	* eg: 10.02542 -> 10.03
- .**isNullOrZero** -> Returns true if this number is null or zero (0)

Please go thorough the [Number Extensions][4] code documentation for more information

## **Date Extensions**

Please go thorough the [Date Extension][2] code documentation

## **Map Extensions**

- .**mergeWith** -> Merges two maps

Please go thorough the [Map Extension][5] code documentation


[1]: https://jitpack.io/#Eldhopj/kotlin-extensions/Tag

[2]: https://github.com/Eldhopj/kotlin-extensions/blob/master/Kotlin_extensions/src/main/java/com/eldhopj/kotlin_extensions/DateExtension.kt "Date Extension"

[3]: https://github.com/Eldhopj/kotlin-extensions/blob/master/Kotlin_extensions/src/main/java/com/eldhopj/kotlin_extensions/StringExtensions.kt "String Extenstions"

[4]: https://github.com/Eldhopj/kotlin-extensions/blob/master/Kotlin_extensions/src/main/java/com/eldhopj/kotlin_extensions/NumberExtension.kt "Number Extenstions"

[5]: https://github.com/Eldhopj/kotlin-extensions/blob/master/Kotlin_extensions/src/main/java/com/eldhopj/kotlin_extensions/MapExtensions.kt "Number Extenstions"
