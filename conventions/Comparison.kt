package conventions

import java.time.LocalDate
import java.time.LocalDateTime

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
//        if (year > other.year) return 1 else if (year < other.year) return -1
//        if (month > other.month) return 1 else if (month < other.month) return -1
//        if (dayOfMonth > other.dayOfMonth) return 1 else if (dayOfMonth < other.dayOfMonth) return -1
//        return 0
        when{
            year != other.year -> return year - other.year
            month != other.month -> return month - other.month
            else -> return dayOfMonth
        }
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}