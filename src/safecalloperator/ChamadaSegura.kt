package safecalloperator

fun main() {
    /*Adicionando o '?' (safe operator), eu estou dizendo que esta variável pode
    ter um valor nulo (não ter valor)
    */
    var a: Int? = null

    /*Tentar acessar um comportamento a partir de uma variavel com null safe operator
    me devolve um null. No Java eu receberia um null pointer excpeption
    */
    println(a?.dec())
    /*
    * Na verdade essa funcionalidade seria equivalente ao Optional do java
    * */

//    Elvis Operator
    val optional: String? = null
    /*
    * Para garantir que não será passado um valor null para uma ariavel que não possui
    * o safe operator, eu consigo passar o elvis operator e logo depois um valor com
    * é feioto no optional do java com isPresent() e .orElse()
    * */
    val obrigatorio: String = optional ?: "valor padrão"

    println(obrigatorio)

    var x: Int? = null
    println(a?.inc())

    println("Correndo risco com o '!!' e forçando o erro de KotlinNUllPointer")
    println(a!!.inc()) // Ao adicionar o '!!' eu digo que aceito correr o risco de o a ser null, by-passando a proteção do safe operator
}