package com.eldhopj.kotlin_extensions

import com.eldhopj.kotlin_extensions.utils.Utils.EMAIL_ADDRESS
import com.eldhopj.kotlin_extensions.utils.Utils.NAME_PATTERN_REGEX
import com.eldhopj.kotlin_extensions.utils.Utils.PHONE_REGEX
import com.eldhopj.kotlin_extensions.utils.Utils.convertToHourMinute
import com.eldhopj.kotlin_extensions.utils.Utils.convertToHourMinuteSeconds
import java.util.Locale
import java.util.regex.Pattern

/**
 * Checks whether the email is valid or not
 *
 * @return true-> if valid, else false
 */
fun String.isValidEmail(): Boolean = this.checkRegex(EMAIL_ADDRESS)

/**
 * Checks whether the user name is valid name or not.
 *
 * @return true-> if valid, else false
 */
fun String.isValidName(): Boolean = this.checkRegex(NAME_PATTERN_REGEX)

/**
 * Extension method to check if String is Phone Number.
 */
fun String.isValidPhoneNumber(): Boolean = this.checkRegex(PHONE_REGEX)

/**
 * Capitalize each word
 *
 * eg: hello world -> Hello World
 *
 */
fun String?.getCapitalizeEachWord() =
    this?.lowercase(Locale.getDefault())?.split(" ")?.joinToString(" ") { word ->
        if (word.length <= 1) word // if the word is a single character then no need to capitalize.
        else
            word.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(Locale.getDefault())
                else it.toString()
            }
    }?.trim()

/**
 * Converts the seconds to Hours, Minutes & Seconds pattern.
 *
 * E.g., 1h 2m 30s
 *
 * @param pattern in which pattern we have to convert. Default Pattern is %dh %dm %ds.
 *
 * @return String in Hours, Minutes & Seconds pattern
 */
fun String?.toHourMinuteSeconds(pattern: String = "%dh %dm %ds"): String =
    if (this == null) "" else convertToHourMinuteSeconds(this, pattern)

/**
 * Converts the seconds to Hours, Minutes pattern.
 *
 * E.g., 1h 2m.
 *
 * @param pattern in which pattern we have to convert. Default Pattern is %dhr %dmin.
 * @return String in Hours, Minutes pattern
 */
fun String?.toHourMinute(pattern: String = "%dh %dm"): String =
    if (this == null) "" else convertToHourMinute(this, pattern)

/**
 * Check regex
 *
 * @param pattern Regex pattern
 * @return @return true-> if valid, else false
 */
fun String.checkRegex(pattern: Pattern): Boolean {
    val regex = pattern.toRegex()
    return this.isNotBlank() && this.matches(regex)
}
