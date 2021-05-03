package kotlin_exercises

import java.time.LocalDate
import java.time.temporal.TemporalAmount
import java.util.*

class Account(var firstName: String, var lastName: String, var age: Int) {
    var accountNumber: Int = 0
    var balance: Int = 0

//        set(value) {
//        field = value
//            println("value by setter is $value")
//    }


    @JvmName("setBalance1")
    fun setBalance(depositAmount:Int){
        balance += depositAmount
    }

    @JvmName("getBalance1")
    fun getBalance(): Int{
        return balance
    }

    fun withdraw(amount: Int): Int{
        if (amount < balance){
            balance -= amount
        }else{
            println("Insufficient fund")
        }
        return balance
    }
}
