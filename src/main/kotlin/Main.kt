//ЗАДАНИЕ 1
fun areCoprime(m: Int, n: Int): Boolean {
    var a = m
    var b = n

    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    return a == 1
}

fun main() {
    println("Введите два числа:")
    val m = readLine()?.toIntOrNull()
    val n = readLine()?.toIntOrNull()

    if (m == null || n == null) {
        println("Некорректный ввод")
        return
    }

    val coprime = areCoprime(m, n)

    if (coprime) {
        println("Числа $m и $n являются взаимно простыми")
    } else {
        println("Числа $m и $n не являются взаимно простыми")
    }
}
