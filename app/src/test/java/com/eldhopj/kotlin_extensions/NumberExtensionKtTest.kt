package com.eldhopj.kotlin_extensions

import com.eldhopj.kotlin_extensions.utils.Utils
import com.google.common.truth.Truth.assertThat
import java.text.DecimalFormat

import org.junit.Test

class NumberExtensionKtTest {

    @Test
    fun `if string shorten return true`() {
        var value = 1000
        val arr = arrayOf("", "K", "M", "B", "T", "P", "E")
        var index = 0
        while (value / Utils.THOUSAND >= 1) {
            value /= Utils.THOUSAND
            index++
        }
        val decimalFormat = DecimalFormat("#.##")
        val result = "${decimalFormat.format(value)}${arr[index]}"
        assertThat(result).isEqualTo("1K")
    }
}
