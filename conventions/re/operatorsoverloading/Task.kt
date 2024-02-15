package conventions.re.operatorsoverloading

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun TimeInterval.times(amount: Int) = TimeUnit(this, amount)
data class TimeUnit(val timeInterval: TimeInterval, val amount: Int);

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(timeUnit: TimeUnit): MyDate = addTimeIntervals(timeUnit.timeInterval, timeUnit.amount)


fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

fun task2(today: MyDate): MyDate {
    return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
}