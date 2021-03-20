package properties

/*
    Nesse caso eu estou declarando a variável e ao mesmo tempo colocando ela no construtor
    ou seja ao instanciar o objeto eu tbm eirei criar  um variavel chamada titular e outra chamada conta
    que receberá os valores informados. Dessas forma meu construtor primário será este ao invés do comum constructor()
    Poderia ter um valor default no construtor onde dessa forma eu não precisaria informalo ao instanciar a classe ex.:
    Conta(val titular: String, val numero: Int, var teste: Int = 0)
 */
class Conta(val titular: String, val numero: Int) {
    var saldo: Double = 0.0
        /*
             Toda variável é uma propertie, sendo assim ela tem nela um set e um get publico ja implementado
             para mudar esse comportamento eu preciso definir a visibiliadade desses métodos logo abaixo da variável
         */
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

fun main() {
    val contaMaria = Conta("Maria", 1000)
    contaMaria.depositar(1000.0) // como o set do saque é private, eu não consigo usá-lo fora da classe

    val contaJoao = Conta("Joao", 1001)
    contaJoao.depositar(1000.0)

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()

    contaJoao.sacar(1050.0)

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()

    /*
    * Label = Dessa forma não sou obrigado a seguir a ordem que foi definida no método ou construtor
    * preciso apenas passar a qual properties aquele valor se refere. Preciso fazer isso para todas
    * as properties da declaração
    * Declarado transferir(valor: Double, contaDestino: Conta)
    * */
    contaJoao.transferir(contaDestino = contaMaria, valor = 1050.0)

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()

}


