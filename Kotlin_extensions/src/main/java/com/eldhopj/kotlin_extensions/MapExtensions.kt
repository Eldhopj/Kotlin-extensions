package com.eldhopj.kotlin_extensions

/**
 * Merges two maps
 *
 * @param another
 * @return
 */
fun Map<String, String>.mergeWith(another: Map<String, String>): Map<String, String> {
    val unionList = toMutableMap()
    for ((key, value) in another) {
        unionList[key] = listOfNotNull(unionList[key], value).toSet().joinToString(", ")
    }
    return unionList
}
