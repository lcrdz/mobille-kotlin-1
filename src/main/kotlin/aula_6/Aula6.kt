package aula_6

fun main() {

    val nomeEIdade: Pair<String, Int> = Pair("João", 26)
    val nomeEIdadeESaldo: Triple<String, Int, Double> = Triple("João", 26, 1000.0)

    val map: Map<String, String> = mapOf("chave-1" to "valor-1", "chave-2" to "valor-2")
    println(map)

    println(nomeEIdade)
    println(nomeEIdade.first)
    println(nomeEIdade.second)
    println(nomeEIdadeESaldo.third)
}