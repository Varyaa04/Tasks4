fun findNthDigit(n: Int): Int? {
    var number = 1
    var count = 0

    while (count < n) {
        val squared = number * number
        val digitCount = squared.toString().length

        if (count + digitCount >= n) {
            val remainingDigits = n - count
            val digits = squared.toString().toCharArray()
            return digits[remainingDigits - 1].toString().toInt()
        }

        count += digitCount
        number++
    }

    return null
}

fun main() {
    println("Введите номер цифры:")
    val n = readLine()?.toIntOrNull()

    if (n == null) {
        println("Некорректный ввод")
        return
    }

    val digit = findNthDigit(n)

    if (digit != null) {
        println("N-я цифра последовательности: $digit")
    } else {
        println("Цифра с номером $n не найдена")
    }
}