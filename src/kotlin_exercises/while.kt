package kotlin_exercises

fun main(args: Array<String>){
    var principalInvestment = 1000
    var percentage = 0.03
    var years = 1


    while (years <= 10){
        var roi = (principalInvestment + percentage) * years
        println("Year $years return = $roi")
        ++years
    }

    for (i in 5 downTo 1 step 2) println(i)

    var sum = readLine()!!.toInt()
}