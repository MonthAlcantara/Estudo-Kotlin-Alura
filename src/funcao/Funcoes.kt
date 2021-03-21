package funcao

/*Para esse método existem duas formas para chamá-lo
  passando a e b ou somente a visto que b ja tem um valor default
*/
fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main() {
    //Usando Label e informando apenas a
    println(soma(a = 1))
    println(soma(b = 2, a = 3))
}