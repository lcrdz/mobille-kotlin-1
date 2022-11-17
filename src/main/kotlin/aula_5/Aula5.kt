package aula_5

fun main() {
//    val frutas = listOf("Maçã", "Pera", "Uva")
//    println(frutas.filterNot { it == "Uva" })

    var numeros = listOf(10, 1156, 78, 52, 24, 199, 2, 69, 45)

    println(numeros.find { it == 3 })

}

fun funcaoSemRetorno(): Unit {
    print("Minha primeira função no kotlin!")
}

fun mostraSaldo(
    nome: String, dia: Boolean = true, saldo: Double
): String {
    val diaOuNoite = if (dia) "Bom dia," else "Boa noite,"
    return "$diaOuNoite $nome\n seu saldo é de R$$saldo"
}

fun teste(numero: Int, acao: (Int, String) -> Unit) {
    acao(numero, "João")
}

