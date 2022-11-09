package aula_2

fun main() {

    // Operadores aritimeticos

    // Soma
    1 + 1
    1.plus(1)

    // Subtração
    5 - 4
    5.minus(4)

    // Divisão
    4 / 2
    4.div(2)

    // Multiplicação
    8 * 8
    8.times(8)


    // Converter String para Int

    println("Digite sua idade:")

    val idade: Int = readln().toInt() // toInt() irá converter a String em Int


    val pi = 3.14159265359

    println(String.format("%.2f", pi)) // Será exibido apenas 2 casas decimais 3,14

}