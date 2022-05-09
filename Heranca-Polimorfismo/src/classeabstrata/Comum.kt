package classeabstrata

class Comum(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun bonificacao(): Double {
        return this.salario * 0.1
    }

}