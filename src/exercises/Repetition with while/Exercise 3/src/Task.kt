// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var total = 0
  var count = 0

  while (count <= n){
    if (count % 2 == 0){
      total+=count
    }
    count++
  }

  return total
}

fun main() {
  println(sumOfEven(10))  // 30
}