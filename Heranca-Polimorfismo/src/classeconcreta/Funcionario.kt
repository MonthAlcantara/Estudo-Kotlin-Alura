package classeconcreta

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
//    Eu posso fazer a declaração da minha função dessa forma onde eu tenho um método
//    concreto que por ter a palavra reservada "open" permite que seja sobreescrita
//    por uma classe filha.
//    open fun bonificacao(): Double{
//        return this.salario * 0.1
//    }
//    Como ela só possui uma linha eu ainda poderia simplicifar a escrita dela
//    open fun bonificacao() =  this.salario * 0.1

    //    Posso também usar ela como property pois ela tem o mesmo comportamento de um
//    get do property. Isso implica em mudanças nos filhos dessa classe
    open val bonificacao: Double
        get() {
            return this.salario * 0.1
        }

//    Inclusive posso colocar em uma só linha aqui tbm
//    open val bonificacao: Double get()= this.salario * 0.1
}
