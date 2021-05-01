package kotlin_exercises

class Person (val firstName: String = "Peter", val lastName: String = "John"){


    init {
        println("init 1")
    }
    constructor(): this("Don", "Dozie"){
        println("Secondary constructor")
    }

    init {
        println("init 2")
    }

    var nickname: String? = null
        set(value) {
            field = value
            println("the set name is $value")
        }

    get() {
        println("this is the name you get $field")
        return field
    }

    fun printInfo(){
        val nickNameToPrint =  nickname ?: "no nickname"
        println("$firstName, $nickNameToPrint, $lastName")
    }

}