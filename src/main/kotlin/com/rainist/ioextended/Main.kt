package com.rainist.ioextended


fun solve(combinedList: List<Long>): List<Long> {
    val a = combinedList
    return if (a.isEmpty()) a else a.take(1) + solve(a - a[0] - a[0] * 4 / 3)
}