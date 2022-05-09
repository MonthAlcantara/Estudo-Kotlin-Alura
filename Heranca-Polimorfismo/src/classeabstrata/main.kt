package classeabstrata

fun main() {
    var monti = Diretor(nome = "Monti", cpf = "00000000000", salario = 1000.00, senha = "1234")
    println("O nome do funcionário é ${monti.nome}")
    println("A bonificação do funcionário é ${monti.bonificacao()}")
    println(monti.autentica("123"))
}









