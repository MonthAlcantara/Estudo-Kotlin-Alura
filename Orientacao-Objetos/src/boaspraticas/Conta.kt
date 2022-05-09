package boaspraticas

class Conta(val titular: String, val numero: Int) {
    var saldo: Double = 0.0
        private set

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
        if (this.sacar(valor)) contaDestino.depositar(valor)
        else println("Operação nao autorizada")
    }

    fun mostraSaldo() {
        println("Saldo conta cliente ${this.titular}:  ${this.saldo}")
    }
}