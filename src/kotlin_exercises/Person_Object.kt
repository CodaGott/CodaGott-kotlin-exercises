package kotlin_exercises

val person = Person()
val account = Account("Dozie", "Money", 5)
fun main() {
//    person.printInfo()
    account.accountNumber = 10778
//    account.dateOpened
    println(account.getBalance())
    account.setBalance(500)
    account.withdraw(700)
    println(account.getBalance())

}