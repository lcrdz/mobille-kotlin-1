package aula_7

fun main() {

//    val lista: MutableList<Int?> = mutableListOf() // [1, 14, null, 0, 15]
//
//    val listaQuePodeSerNula: List<Int>? = null // null
//
//    repeat(3) {
//        println("Digite o ${it.inc()} número:")
//        val entrada = readln().toIntOrNull()
//        lista.add(entrada)
//    }
//
//    lista.forEach { numero ->
//        numero?.let {
//            println(it)
//        }
//    }


//    val inteiro: Int = readln().toInt()
//    println(inteiro)

    println("Digite sua idade")
    val idade: Int? = readln().toIntOrNull()

    try {
        when (idade) {
            in 0..17 -> throw MenorDeIdadeException()
            in 18..Int.MAX_VALUE -> println("Acesso permitido")
            null -> throw NullPointerException()
        }
    } catch (e: MenorDeIdadeException){
        println("Proibido para menores de 18 anos")
    } catch (e: NullPointerException){
        println("Digite uma idade valida")
    } catch (e: Exception){
        println("Erro genérico")
    }


}

class MenorDeIdadeException : Exception() {
    override fun getLocalizedMessage(): String {
        return "Erro: acesso permitido apenas para maiores de 18 anos"
    }
}
