package boaspraticas
/*
* O ":" funciona como o extends no java
* Quando a classe que estou estendendo possui um construtor com parametros, tenho de estendela tbm
* Quando eu instanciar o Programador, os valores serão usados para instanciar um Funcionario de forma igual
* O filho pode ter outras properties e comportamentos que o pai não tem ( Nesse exemplo o atributo senha)
* */
class Diretor(nome: String, cpf: String, salario: Double, val senha: String, val plr: Double) : Funcionario(nome, cpf, salario) {

    /*
    * Usando a palavra reservada override é possível modificar o comportamento
    * de um método da classe mãe. Esse método na classe mãe deve ser anotado como
    * open e na filha anotado como override
    * */
    override fun adicionaBonificacao(): Double{
// Super para chamar o método adicionaBonificacao() da classe mãe e não o da classe
        return super.adicionaBonificacao() + salario + plr
    }

    fun autentica(senha: String): Boolean{
        return this.senha == senha
    }
}