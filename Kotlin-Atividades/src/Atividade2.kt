
fun main () {
    print("Digite a largura do retângulo: ")
    val largura = readln().toDouble()

    print("Digite a altura do retângulo: ")
    val altura = readln().toDouble()


    val area = largura * altura

    val perimetro = 2 * (largura + altura)

    println("A área do retângulo é: $area")
    println("O perímetro do retângulo é: $perimetro")
}