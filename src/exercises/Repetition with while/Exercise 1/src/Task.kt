// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(character: String) {
    var num = 0
    while (num != character.length){
        println(character[num])
        num++
    }
}

fun main() {
  displayContent("abc")
}
/* Expected output:
a
b
c
*/