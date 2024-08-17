fun main(){

    print("Digite um numero inteiro: ")
    val numberOne = readln().toInt()

    print("Digite outro numero inteiro: ")
    val numberTwo = readln().toInt()

    print("Digite outro numero inteiro: ")
    val numberThree = readln().toInt()

    val maxNumber = maxOf(numberOne, numberTwo, numberThree)
    println("O numero maior dentre os numeros que digitou: $maxNumber")
}