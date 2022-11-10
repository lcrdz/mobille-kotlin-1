package aula_3

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    println("Digite o numero minimo")
    val min = readln().toInt()

    println("Digite o numero maximo")
    val max = readln().toInt()

    val random = Random.nextInt(min..max)

    do {
        println("Tente adivinhar o número gerado")
        val number = readln().toInt()

        when {
            number > random -> println("O número secreto é menor do que o escolhido")
            number < random -> println("O número secreto é maior do que o escolhido")
            else -> println("Você acertou!!")
        }

    } while (number != random)

}

