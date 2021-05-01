// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var total = 0
  var count = 0

  while (count <= number){
    total += count
    count++
  }
  return total
}

fun main() {
  println(sum(10))  // 55
}