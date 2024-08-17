fun main(){
    fun readInt(prompt: String): Int {
        print(prompt)
        return readLine()?.toIntOrNull() ?: 0
    }


    val numero = readInt("Digite um número: ")


    val ehMultiploDe3 = numero % 3 == 0
    val ehMultiploDe4 = numero % 4 == 0

    if (ehMultiploDe3 && ehMultiploDe4) {
        println("O número $numero é múltiplo de 3 e 4.")
    } else {
        println("O número $numero NÃO é múltiplo de 3 e 4.")
    }
}