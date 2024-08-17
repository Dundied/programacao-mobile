import kotlin.math.pow

fun main() {
    print("Digite seu peso: ")
    val peso = readln().toDouble()

    print("Digite sua altura: ")
    val altura = readln().toDouble()

    val base = (peso / altura.pow(2))

    val classificacao = if (base < 18.5) {
        "Magreza"
    } else if (base >= 18.5 && base <= 24.9){
        "Normal"
    } else if (base >= 25.0 && base <= 29.9){
        "Sobrepeso"
    } else if (base >= 30.0 && base <= 39.9){
        "Obesidade"
    } else{
        "Obesidade Grave"
    }
    println()

        println("IMC\t\tClassificação\t\tObesidade (grau)")
    println("-------------------------------------------------------------")
    println("Menor que 18,5  \tMagreza\t\t\t0")
    println("Entre 18,5 e 24,9\tNormal\t\t\t0")
    println("Entre 25,0 e 29,9\tSobrepeso\t\tI")
    println("Entre 30,0 e 39,9\tObesidade\t\tII")
    println("Maior que 40,0\t\tObesidade Grave\tIII")

    println()
    println()
    println("Sua classificação IMC é: $classificacao ")

}