package kotlin_exercises

fun displayContent( greet: String){
    val name: String = "Dozie $greet"
}

fun main(){
    val number: Int = 39

    if (number > 0){
        println("Positive")
    }else if (number < 0){
        println("Negative")
    }else{
        println("zero")
    }

    val num = -9
    val num2 = -20

    val result = if (num > num2) "num is greater" else "num2 is greater"
    println(result)

    val weeklyPay = 200
    val grossSale: Int = 5000
    val percentage: Double = 0.09

    val weeklyIncome = weeklyPay + grossSale * percentage

    println(weeklyIncome)

}