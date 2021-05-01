package kotlin_exercises

import java.util.Scanner

fun main(){
   val scanner = Scanner(System.`in`)
    println("Calculate the amount to be paid this week")

    println("Enter weekly pay")
    val weeklyPay = scanner.nextInt()

    println("Enter weekly grossSale")
    val grossSale = scanner.nextInt()

    println("Enter weekly percentage")
    val percentage = scanner.nextDouble()


    val weeklyIncome = weeklyPay + grossSale * percentage
    println(weeklyIncome)

    println("Enter operator sign below")
    val number = readLine()
    val num = 2
    val num1 = 3
      val result = when(number){
       "+" -> num + num1
       "-" -> num1 - num
       "/" -> num1 / num
       "*" -> num1 * num

       else -> "invalid entry"
      }
 println(result)

}