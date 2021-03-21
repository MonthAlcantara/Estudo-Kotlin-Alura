package boaspraticas

fun testaComportamentosConta() {
    val contaMaria = Conta("Maria", 1000)
    contaMaria.depositar(1000.0) // como o set do saque é private, eu não consigo usá-lo fora da classe

    val contaJoao = Conta("Joao", 1001)
    contaJoao.depositar(1000.0)

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()

    contaJoao.sacar(1050.0)

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()

    contaJoao.transferir(contaDestino = contaMaria, valor = 1050.0)

    contaMaria.mostraSaldo()
    contaJoao.mostraSaldo()
}