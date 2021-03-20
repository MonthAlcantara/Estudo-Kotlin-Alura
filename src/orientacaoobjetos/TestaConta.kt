package orientacaoobjetos

class Conta {
    var titular: String = ""
    var conta: Int = 0
    var saldo: Double = 0.0

    fun sacar(valor: Double): Boolean {
        println("Solicitação de saque no valor de $valor na conta do ${this.titular}")
        when {
            this.saldo >= valor -> this.saldo -= valor
            this.saldo == 0.0 -> println("Essa conta não possui saldo")
            else -> println("Impossíval sacar, saldo inferior ao valor solicitado: ${this.saldo}")
        }
        return this.saldo >= valor
    }

    fun depositar(valor: Double) {
        if (valor > 0.0) this.saldo += valor
        else println("Impossíval depositar valor negativo")

    }

    fun transferir(valor: Double, contaDestino: Conta) {
        println("Solicitação de transferencia no valor de $valor na conta do ${this.titular}")
        if(this.sacar(valor)) contaDestino.depositar(valor)
        else println("Operação nao autorizada")
    }

    fun mostraSaldo() {
        println("Saldo conta cliente ${this.titular}:  ${this.saldo}")
    }
}

fun main() {
    val contaMaria = Conta()
    contaMaria.conta = 1000
    contaMaria.saldo = 1000.0
    contaMaria.titular = "Maria"

    val contaJoao = Conta()
    contaJoao.conta = 1000
    contaJoao.saldo = 1000.0
    contaJoao.titular = "Joao"

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()

    contaJoao.sacar(1050.0)

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()

    contaJoao.transferir(1050.0, contaMaria)

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()

}


