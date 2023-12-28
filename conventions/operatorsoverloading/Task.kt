package conventions.operatorsoverloading

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun TimeInterval.times(times: Int) = RepeatedTimeInterval(this, times)

operator fun MyDate.plus(timeInterval: TimeInterval) = this.addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

class RepeatedTimeInterval(val timeInterval: TimeInterval, val times: Int)

operator fun MyDate.plus(repeatedTimeInterval: RepeatedTimeInterval) =
    this.addTimeIntervals(repeatedTimeInterval.timeInterval, repeatedTimeInterval.times)

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
}
