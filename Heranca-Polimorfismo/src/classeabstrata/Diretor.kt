package classeabstrata

class Diretor(
    nome: String,
    cpf: String,
    salario: Double, // Daqui pra cima eu recebo variáveis que serão repassadas ao contrutor da classe mãe
    val senha: String // Como a classe mãe n tem esse campo, aqui eu declaro ele (Campo só dessa classe
) : Funcionario(nome,cpf,salario){

    override fun bonificacao(): Double {
        return this.salario * 0.3
    }
    fun autentica(senha: String): Boolean{
        if(senha.equals(this.senha)){
            println("${this.nome} autenticou com Sucesso")
            return true
        }
        return false
    }

}