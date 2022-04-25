package com.eldhopj.kotlin_extensions

import com.eldhopj.kotlin_extensions.utils.Utils.THOUSAND
import java.math.RoundingMode
import java.text.DecimalFormat

/**
 * Returns the string representation of the value using [DecimalFormat]
 *
 * @param pattern pattern conversion pattern for [DecimalFormat]
 * @param roundingMode Specifies the rounding behavior for operations whose results cannot be
 * represented exactly.
 * @return Formatted string representation.
 */
fun Double?.format(
    pattern: String = "0.##",
    roundingMode: RoundingMode = RoundingMode.HALF_EVEN
): String {
    if (this == null) return "0"
    return DecimalFormat(pattern).apply {
        this.roundingMode = roundingMode
    }
        .format(this)
}

/**
 * Returns the string representation of the value using [DecimalFormat]
 *
 * @param pattern pattern conversion pattern for [DecimalFormat]
 * @param roundingMode Specifies the rounding behavior for operations whose results cannot be
 * represented exactly.
 * @return Formatted string representation.
 */
fun Float?.format(
    pattern: String = "0.##",
    roundingMode: RoundingMode = RoundingMode.HALF_EVEN
): String {
    if (this == null) return "0"
    return DecimalFormat(pattern).apply {
        this.roundingMode = roundingMode
    }
        .format(this)
}

/**
 * Format number into Short values
 *
 * eg: 1000 -> 1k
 *      1000000 -> 1M
 *
 * @return
 */
val Long.shortenString: String
    get() {
        var value = this
        val arr = arrayOf("", "K", "M", "B", "T", "P", "E")
        var index = 0
        while (value / THOUSAND >= 1) {
            value /= THOUSAND
            index++
        }
        val decimalFormat = DecimalFormat("#.##")
        return String.format("%s %s", decimalFormat.format(value), arr[index])
    }

/**
 * Format number into Short values
 *
 * eg: 1000 -> 1k
 *      1000000 -> 1M
 *
 * @return
 */
val Int.shortenString: String
    get() {
        var value = this
        val arr = arrayOf("", "K", "M", "B", "T", "P", "E")
        var index = 0
        while (value / THOUSAND >= 1) {
            value /= THOUSAND
            index++
        }
        val decimalFormat = DecimalFormat("#.##")
        return String.format("%s %s", decimalFormat.format(value), arr[index])
    }
