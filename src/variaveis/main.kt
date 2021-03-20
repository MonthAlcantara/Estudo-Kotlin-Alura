package variaveis

fun main() {
    // Sempre preciso deefinir se o valor da variável será mudado ou não val == Constante no Java
    val kotlin = "Byte Bank"

    /* Não preciso tipar a variável pois o Kotlin infere porém uma vez inferido o tipo, o mesmo não pode ser alterado
       O valor sim mas o tipo não ( No caso do Var)
    */
    var conta = 1000 // Int
    var saldo: Double = 200.0

    // Consigo concatenar variáveis e String usando o template $nomeDaVariavel
    println("bem vindo ao $kotlin")
    println("saldo $saldo")
    println("conta: $conta")
}