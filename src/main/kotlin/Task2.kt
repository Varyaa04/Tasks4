fun hasPerfectSquare(m: Int, n: Int): Boolean {
    for (i in m..n) {
        val sqrt = Math.sqrt(i.toDouble())

        if (sqrt % 1 == 0.0) {
            return true
        }
    }

    return false
}

fun main() {
    println("Введите два числа:")
    val m = readLine()?.toIntOrNull()
    val n = readLine()?.toIntOrNull()

    if (m == null || n == null) {
        println("Некорректный ввод")
        return
    }

    val hasSquare = hasPerfectSquare(m, n)

    if (hasSquare) {
        println("Между числами $m и $n существует точный квадрат")
    } else {
        println("Между числами $m и $n нет точных квадратов")
    }
}
