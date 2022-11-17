package aula_4

fun main() {

//    val nomes: List<String> = listOf("Ana", "Beatriz", "Renato", "João")

//    nomes[0] = "Fernanda"

//    val nomesMutaveis: MutableList<String> = mutableListOf("Ana", "Beatriz", "Renato", "João")
//    var exemplo: MutableList<String> = nomesMutaveis
//
//    nomesMutaveis[0] = "Fernanda"

//    val nomes: List<Int> = intArrayOf()

//    val nomesM = nomesMutaveis.map { nome ->
//        nome.uppercase()
//    }
//
//    println(nomesM)


//    val numeros: Array<Int> = arrayOf(1, 2, 3)
//
//    println(numeros.toList())

//    val numerosDuplicados = mutableListOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10)
//    numerosDuplicados.add(element = 50, index = 0)
//    numerosDuplicados.removeAt(3)
//    numerosDuplicados.removeAll(listOf(1, 2, 3))
//    println("Lista => $numerosDuplicados")

//    val set: Set<Int> = numerosDuplicados.toSet()

//    println("Set => $set")

//    for (i in 0..10) {
//        println("Laço: $i")
//    }

//    println("Estrutura de repetição For /Para")
    var listaCompras = listOf(
        "Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos", "Frango"
    )
    // For = Do tal ao Tal no caso do 0 ao 8 usando os .. para selecionar//
    // in igual Intervalo //
//    for (produto in listaCompras) {
//        println(produto)
//    }

//    for(letra in 'a'..'z'){
//        print("$letra ")
//    }

    for(i in 100 downTo 0 step 5) {
        println(i)
    }
}
