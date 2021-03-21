package variaveis

fun main() {

    //Tipos de variáveis em Kotlin - Em Kotlin tudo é Objeto
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647 // Kotlin permite usar _ para separar casas decimais (Java também)
    val num4: Long = 9_223_372_036_854_775_807 // Long.MAX_VALUE

    // Tipos Numéricos com ponto flutuante
    val num5: Float = 3.15F
    val num6: Double = 3.15

    //Tipo Caracter
    val char: Char = 'a' // char em Java é uma palavra reservada, em Kotlin n

    //Tipo Booleano
    val boolean: Boolean = true // boolean em Java é uma palavra reservada, em Kotlin n

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    // 2 é um Int, como o instanceOf do Java
    println( 2 is Int)

}