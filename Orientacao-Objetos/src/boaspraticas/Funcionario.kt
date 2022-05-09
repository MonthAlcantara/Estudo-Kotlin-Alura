package boaspraticas
/*
* Por padrao as classes criadas em Kotlin são final, sendo assim elas não podem ser herdadas
* se queremos que um classe possa ser herdada, precisamos adicionar a palavra open na declaração da classe
* */
open class Funcionario(val nome: String, val cpf: String, val salario: Double) {

    /*
    * Uma particularidade do Kotlin pe que podemos alterar o comportamento
    * de um método de uma classe  mão, na classe fila. Para isso precisamos
    * marcar esse método como open
    * */
   open fun adicionaBonificacao(): Double{
        return this.salario * 0.1
    }
}