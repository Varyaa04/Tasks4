fun reverseDigits(n: Int): Int {
    var number = n
    var reversed = 0

    while (number != 0) {
        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }

    return reversed
}

fun main() {
    println("Введите число:")
    val n = readLine()?.toIntOrNull()

    if (n == null) {
        println("Некорректный ввод")
        return
    }

    val reversed = reverseDigits(n)
    println("Число $n с обратным порядком цифр: $reversed")
}