package com.eldhopj.kotlin_extensions.utils.formatter

import java.util.Date
import org.jetbrains.annotations.NotNull

internal interface Formatter {

    /**
     * Formats the given date object to the specified pattern
     *
     * @param date {@link Date} object
     * @param pattern Pattern to format(e.g, yyyy-MM-dd)
     */
    fun format(@NotNull date: Date?, @NotNull pattern: String): String

    /**
     * Formats the given date object to the specified pattern
     *
     * @param date string date value
     * @param pattern Pattern to which the date follows(e.g, yyyy-MM-dd)
     */
    fun format(@NotNull date: String, @NotNull pattern: String): Date?

    /**
     * Formats the given date object to the specified pattern
     *
     * @param date string date value
     * @param fromPattern Pattern to which the date follows(e.g, yyyy-MM-dd)
     * @param toPattern Pattern to format(e.g, yyyy-MM-dd)
     */
    fun format(
        @NotNull date: String,
        @NotNull fromPattern: String,
        @NotNull toPattern: String
    ): String

}
