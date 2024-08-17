fun main(){

    print("Digite um numero inteiro: ")
    val numberOne = readln().toInt()

    print("Digite outro numero inteiro: ")
    val numberTwo = readln().toInt()

    if(numberOne > numberTwo){
        print(numberOne)
    }else{
        print(numberTwo)
    }
}