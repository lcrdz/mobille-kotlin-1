package aula_3

fun main() {

    println("-----Cadastro de usuario----")
    println("*min 6 caracteres")
    println("*max 10 caracteres")

    println("Digite o usuario")
    val usuario = readln()

    when {
        usuario.length in 6..10 -> println("Usuario cadastrado com sucesso!")
        usuario.length > 10 -> println("Usuario nao pode ter mais de 10 caracteres.")
        else -> println("Usuario não cadastrado :/")
    }

//    when(usuario.length) {
//        in 6..10 -> println("Usuario cadastrado com sucesso!")
//        in 0..5 -> println("Usuario nao pode ter mais de 10 caracteres.")
//        else ->  println("Usuario não cadastrado :/")
//    }

//    if (usuario.length in 6..10) {
//        println("Usuario cadastrado com sucesso!")
//    } else if (usuario.length > 10) {
//        println("Usuario nao pode ter mais de 10 caracteres.")
//    } else {
//        println("Usuario não cadastrado :/")
//    }

}