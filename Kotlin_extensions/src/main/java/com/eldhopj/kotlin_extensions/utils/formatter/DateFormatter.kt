package com.eldhopj.kotlin_extensions.utils.formatter

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

internal class DateFormatter(timeZoneId: String? = null) : Formatter {

    private var sdf: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)

    init {
        if (timeZoneId != null) sdf.timeZone = TimeZone.getTimeZone(timeZoneId)
    }

    override fun format(date: String, pattern: String): Date? {
        sdf.applyPattern(pattern)
        return try {
            return sdf.parse(date)
        } catch (ignored: ParseException) {
            null
        } catch (ignored: NullPointerException) {
            null
        }
    }

    override fun format(date: String, fromPattern: String, toPattern: String): String {
        return format(format(date, fromPattern), toPattern)
    }

    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    override fun format(date: Date?, pattern: String): String {
        sdf.applyPattern(pattern)
        return try {
            sdf.format(date)
        } catch (ignore: NullPointerException) {
            ""
        }
    }

    companion object {
        const val TAG = "DateFormatter"
    }

}
