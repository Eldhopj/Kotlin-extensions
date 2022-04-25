package com.eldhopj.kotlin_extensions.utils

import java.math.BigDecimal
import java.util.Locale
import java.util.regex.Pattern

/**
 * Support Util class
 *
 * @constructor Create empty Utils
 */
object Utils {
    /**
     * Name Pattern Regex
     */
    internal const val NAME_PATTERN_REGEX = "^[\\p{L} .'-]+$"

    /**
     * Thousand
     */
    internal const val THOUSAND = 1000

    /**
     * Seconds In Hour
     */
    private const val SECONDS_IN_HOUR = 3600

    /**
     * Minutes In Hour
     */
    private const val MINUTES_IN_HOUR = 60

    /**
     * Email Address
     */
    internal val EMAIL_ADDRESS = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )

    /**
     * Converts duration in seconds to hours, minutes & seconds.
     *
     * @param duration Duration in seconds
     * @param pattern Pattern eg: %dh %dm.
     * @return Seconds in hours, minutes & seconds pattern.
     * @throws NumberFormatException
     */
    @Throws(NumberFormatException::class)
    internal fun convertToHourMinuteSeconds(duration: String, pattern: String): String {
        val bigDecimal = BigDecimal(duration)
        val longVal = bigDecimal.toLong()
        val hours = longVal.toInt() / SECONDS_IN_HOUR
        var remainder = longVal.toInt() - hours * SECONDS_IN_HOUR
        val minutes = remainder / MINUTES_IN_HOUR
        remainder -= minutes * MINUTES_IN_HOUR
        val secs = remainder
        return String.format(Locale.ENGLISH, pattern, hours, minutes, secs)
    }

    /**
     * Converts duration in seconds to hours, minutes.
     *
     * @param duration Duration in seconds
     * @param pattern Pattern eg: %dh %dm
     * @return Seconds in hours, minutes pattern.
     */
    @Throws(NumberFormatException::class)
    internal fun convertToHourMinute(duration: String, pattern: String): String {
        val bigDecimal = BigDecimal(duration)
        val longVal = bigDecimal.toLong()
        val hours = longVal.toInt() / SECONDS_IN_HOUR
        val remainder = longVal.toInt() - hours * SECONDS_IN_HOUR
        val minutes = remainder / MINUTES_IN_HOUR
        return String.format(Locale.ENGLISH, pattern, hours, minutes)
    }
}
