package com.eldhopj.kotlin_extensions

import com.eldhopj.kotlin_extensions.utils.Utils.EMAIL_ADDRESS
import com.eldhopj.kotlin_extensions.utils.Utils.NAME_PATTERN_REGEX
import com.eldhopj.kotlin_extensions.utils.Utils.convertToHourMinute
import com.eldhopj.kotlin_extensions.utils.Utils.convertToHourMinuteSeconds
import java.util.Locale

/**
 * Checks whether the email is valid or not
 * @param regEx Regular expression value to match the text for the email format.
 */
fun String?.isValidEmail(regEx: Regex = EMAIL_ADDRESS.toRegex()): Boolean =
    this != null && this.matches(regEx)

/**
 * Checks whether the user name is valid name or not.
 *
 * @return true-> if valid, else false
 */
fun String?.isValidName(pattern: Regex = Regex(NAME_PATTERN_REGEX)): Boolean {
    return this != null &&
            this.trim().isNotEmpty() &&
            matches(pattern)
}

/**
 * Capitalize each word
 *
 * eg: hello world -> Hello World
 *
 */
val String?.capitalizeEachWord
    get() = this?.lowercase(Locale.getDefault())?.split(" ")?.joinToString(" ") { word ->
        if (word.length <= 1) word // if the word is a single character then no need to capitalize.
        else
            word.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(Locale.getDefault())
                else it.toString()
            }
    }?.trimEnd()?.trim()

/**
 * Converts the seconds to Hours, Minutes & Seconds pattern.
 *
 * E.g., 1hr 2min 30s
 *
 * @param pattern Default Pattern is %dh %dm %ds.
 *
 * @return String in Hours, Minutes & Seconds pattern
 */
fun String?.toHourMinuteSeconds(pattern: String = "%dh %dm %ds"): String {
    if (this == null) return ""
    return convertToHourMinuteSeconds(this, pattern)
}

/**
 * Converts the seconds to Hours, Minutes pattern.
 *
 * E.g., 1hr 2min.
 *
 * @param pattern Default Pattern is %dhr %dmin.
 * @return String in Hours, Minutes pattern
 */
fun String?.toHourMinute(pattern: String = "%dhr %dmin"): String {
    if (this == null) return ""
    return convertToHourMinute(this, pattern)
}
