package aula_5

private const val PAES = 1
private const val SALGADOS = 2
private const val DOCES = 3
private const val FINALIZAR = 0

private const val LINHA = ".........."

val valorPaoFrances = 0.60
val valorPaoDeLeite = 0.40
val valorPaoDeMilho = 0.50

val produtoPaoFrances = "Pão Francês"
val produtoPaoDeLeite = "Pão de Leite"
val produtoPaoDeMilho = "Pão de Milho"

val paes: List<Pair<String, Double>> = listOf(
    Pair(produtoPaoFrances, valorPaoFrances), // index 0
    Pair(produtoPaoDeLeite, valorPaoDeLeite), // index 1
    Pair(produtoPaoDeMilho, valorPaoDeMilho), // index 2
)

val categorias = """
    Digite a opção desejada no Menu:
    1..................Pães
    2..............Salgados
    3.................Doces
    0......Finalizar compra
""".trimIndent()

val menuPaes = """
        1 - $produtoPaoFrances...........R$ $valorPaoFrances
        2 - $produtoPaoDeLeite..........R$ $valorPaoDeLeite
        3 - $produtoPaoDeMilho..........R$ $valorPaoDeMilho
        0 - Voltar
    """.trimIndent()


val menuSalgados = """
        1 - Coxinha...........R$ 5,00
        2 - Esfiha..........R$ 6,00
        3 - Pão de Queijo..........R$ 3,00
        0 - Voltar
    """.trimIndent()

val menuDoces = """
        1 - Carolina...........R$ 1,50
        2 - Pudim..........R$ 4,00
        3 - Brigadeiro..........R$ 2,00
        0 - Voltar
    """.trimIndent()

val itensComanda: MutableList<String> = mutableListOf<String>()
var total: Double = 0.0

fun main() {
    ePadoca()
}

fun ePadoca() {
    println("Bem Vindo à padaria E-Padoca!")
    do {
        println(categorias)

        val categoria = readln().toInt()
//        var cancelarCompra = "N"

        when (categoria) {
            PAES -> selecionaProduto(menuSelecionado = menuPaes, produtos = paes)
            SALGADOS -> println(menuSalgados)
            DOCES -> println(menuDoces)
            else -> Unit
        }

//        if (itensComanda.isEmpty()) {
//            println("Deseja mesmo cancelar compra? (S/N)") // funcao
//            cancelarCompra = readln().uppercase()
//        } else {
//            itensComanda.forEach { item -> // funcao
//                println(item)
//            }
//            println("Valor total R$$total")
//        }

    } while (categoria != FINALIZAR)
}

fun selecionaProduto(
    menuSelecionado: String, produtos: List<Pair<String, Double>>
) {
    do {
        println(menuSelecionado)
        val produtoSelecionado = readln().toInt() // valor atual -> 1 (corresponde ao pao frances)

        for ((i, produto) in produtos.withIndex()) {
            if (i.inc() == produtoSelecionado) {
                selecionaQuantidadeDoProduto(produto)
                break
            }
        }


    } while (produtoSelecionado != 0)
}

fun selecionaQuantidadeDoProduto(produto: Pair<String, Double>) {
    println("Digite a quantidade:")
    val quantidade = readln().toInt()
    val totalItem = quantidade * produto.second
    val item =
        itemComanda(produto = produto.first, quantidade = quantidade, valorUnitario = produto.second, total = totalItem)
    itensComanda.add(item)
    total += totalItem
}

fun itemComanda(
    produto: String,
    quantidade: Int,
    valorUnitario: Double,
    total: Double,
): String = "${itensComanda.size.inc()}$LINHA$produto$LINHA$quantidade$LINHA$valorUnitario${LINHA}R$$total"
