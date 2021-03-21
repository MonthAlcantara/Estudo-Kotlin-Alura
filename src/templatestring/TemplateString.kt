package templatestring

fun main() {

    var bomHumor: Boolean = true
    //Template String permite também que seja usado uma expressão
    println("Hoje eu estou ${if (bomHumor) "feliz" else "chateado"}")

    /*Se o acesso for a uma variável como o bomHumor eu poderia fazer apenas $bomHumor
      como se trata de acessar um objeto para imprimir o valor, deve-se usar as {}
      dessa forma eu digo onde começa e onde termina a expressão, que no caso é tudo o que está
      dentro das chaves
    */
    val aprovados = listOf("João", "Maria", "Pedro")
    println("O primeiro colocado foi ${aprovados[1]}")
}