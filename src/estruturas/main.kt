package estruturas

fun main() {

    /*
    * for (i in 1..5) {loop com o i começando em 1 até 5 }
    * for (i in 5 down to 1){loop com o i começando em 5 até 1 }
    * for (i in 1..100 step 2 ) {loop com o i começando em 1 até 100 pulando de 2 em 2}
    * para interromper um fluxo em algum momento posso usar um if com um break dentro para interrompenter ou um continue para pular aquele laço
    * */
    for (i in 1..5) {
        println(i)
        val kotlin = "Byte Bank"
        var conta = i + 1000
        var saldo: Double = 200.0
        var titular = "Fulano $i"


        println("bem vindo ao $kotlin")


        println("titular: $titular")
        println("conta: $conta")
        println("saldo $saldo")

    }
//        testaCondicoesUsandoWhen(saldo)
//        testaCondicoesUsandoIf(saldo)

}

fun testaCondicoesUsandoWhen(saldo: Double) {
    // Kotlin sugere usar o When expression ao invés do If
    when {
        saldo > 0.0 -> println("saldo positivo")
        saldo < 0.0 -> println("saldo negativo")
        else -> println("saldo zerado")
    }
}

fun testaCondicoesUsandoIf(saldo: Double) {
    if (saldo > 0.0) println("saldo positivo")
    else if (saldo < 0.0) println("saldo negativo")
    else println("saldo zerado")
}