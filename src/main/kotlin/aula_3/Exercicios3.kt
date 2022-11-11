package aula_3

fun main() {
//    conversorDeIdade()
//    calculoDeIdade()
//    categoriaNadador()
//    valorDeZeroADez()
//    nomeSenhaDiferente()
}

// Ex.1
fun conversorDeIdade() {

    println("Digite sua idade")
    val idade = readln().toInt()

    val meses = idade.times(12)
    val dias = idade.times(365)
    val horas = idade.times(8760)
    val minutos = idade.times(525600)

    println("Sua idade equivale a:")
    println("$meses  meses\n$dias dias\n$horas horas\n$minutos minutos")

}

// Ex.2
fun calculoDeIdade() {

    println("Qual seu ano de nascimento?")
    val anoNascimento = readln().toInt()
    println("Qual o ano atual?")
    val anoAtual = readln().toInt()

    val idade = anoAtual.minus(anoNascimento)
    val semanas = idade.times(52)

    println("Você tem $idade anos, você já viveu aproximadamente $semanas semanas.")

}

// Ex.3
fun categoriaNadador() {

    println("Digite sua idade")
    val idade = readln().toInt()

    when (idade) {
        in 5..7 -> println("Categoria => Infantil A")
        in 8..10 -> println("Categoria => Infantil B")
        in 11..13 -> println("Categoria => Juvenil A")
        in 14..17 -> println("Categoria => Juvenil B")
        in 18..Int.MAX_VALUE -> println("Categoria => Sênior")
        else -> println("Não há categoria disponível nessa idade")
    }
}

// Ex.4
fun valorDeZeroADez() {
    do {
        println("Digite um valor entre 0 e 10:")
        val valor = readln().toIntOrNull()
    } while ((0..10).contains(valor).not())
}

// Ex.5
fun nomeSenhaDiferente() {

    do {
        println("Digite seu nome de usuario:")
        val usuario = readln()
        println("Digite sua senha:")
        val senha = readln()

        val entradasInvalidas = usuario.isEmpty() || senha.isEmpty()
        val entradasIguais = usuario == senha

        if (entradasInvalidas) println("Os campos não podem ser vazios")
        if (entradasIguais) println("O usuario não pode ser igual a senha")
    } while (entradasIguais || entradasInvalidas)

}