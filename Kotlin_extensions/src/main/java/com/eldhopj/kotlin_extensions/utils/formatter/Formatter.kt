package com.eldhopj.kotlin_extensions.utils.formatter

import java.util.Date

internal interface Formatter {

    /**
     * Formats the given date object to the specified pattern
     *
     * @param date {@link Date} object
     * @param pattern Pattern to format(e.g, yyyy-MM-dd)
     */
    fun format(date: Date, pattern: String): String

    /**
     * Formats the given date object to the specified pattern
     *
     * @param date string date value
     * @param pattern Pattern to which the date follows(e.g, yyyy-MM-dd)
     */
    fun format(date: String, pattern: String): Date?

    /**
     * Formats the given date object to the specified pattern
     *
     * @param date string date value
     * @param fromPattern Pattern to which the date follows(e.g, yyyy-MM-dd)
     * @param toPattern Pattern to format(e.g, yyyy-MM-dd)
     */
    fun format(date: String, fromPattern: String, toPattern: String): String

}
