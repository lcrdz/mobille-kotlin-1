package aula_2

fun main() {
//    calculaAreaQuadrado()
//    calculaAreaTriangulo()
//    geradorDeNick()
}

fun calculaAreaQuadrado() {
    println("Digite do lado do quadrado")
    val tamanho: Int = readln().toInt()

    val area = tamanho.times(tamanho)

    val perimetro = tamanho * 4

    println("A area do quadrado é de $area e seu perimetro é de $perimetro ")
}

fun calculaAreaTriangulo() {
    println("Digite a base do triangulo: ")
    val base = readln().toIntOrNull() ?: 0
    println("Digite a altura: ")
    val alt = readln().toIntOrNull() ?: 0
    val area = base.times(alt).div(2)
    println("Área do triangulo: $area")

//    println("Digite a base: ")
//    val base: Int = readln().toInt()
//
//    println("Digite a altura: ")
//    val altura: Int = readln().toInt()
//
//    val area =  base * altura /2
//    println("A area do triangulo é de: $area")
}

fun geradorDeNick() {
    println("Digite o nome: ")
    val nome = readln()
    println("Digite o sobrenome: ")
    val sobrenome = readln()
    println("Digite o ano de nascimento: ")
    val anoNasc = readln()
    val nick = "${nome.substring(0, 2)}${sobrenome.reversed()}${anoNasc.takeLast(2)}"

    println("\nnick gerado: ${nick.lowercase()}")
}