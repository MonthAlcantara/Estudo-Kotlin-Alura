package estruturas

    fun main() {

        val kotlin = "Byte Bank"
        var conta = 1000 // Int
        var saldo: Double = 200.0
        saldo -= 200.1


        println("bem vindo ao $kotlin")
        println("saldo $saldo")
        println("conta: $conta")

        // Kotlin sugere usar o When expression ao invés do If
        when {
            saldo > 0.0 -> println("saldo positivo")
            saldo < 0.0 -> println("saldo negativo")
            else -> println("saldo zerado")
        }
    }
