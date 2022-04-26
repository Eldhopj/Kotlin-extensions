package com.eldhopj.kotlin_extensions

import java.io.File

private const val KILO_BYTE_SIZE = 1024F

/**
 * Returns the file size in MB.
 *
 * @return
 */
fun File?.getSizeInMB(): Float =
    if (this == null) 0.00f else "%.2f".format(File(this.absolutePath).length() / (KILO_BYTE_SIZE * KILO_BYTE_SIZE))
        .toFloat()

