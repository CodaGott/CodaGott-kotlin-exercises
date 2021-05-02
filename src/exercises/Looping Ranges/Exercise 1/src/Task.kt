// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var total: Long = 1
  for (num in 1..n){
  total *= num
  }
  return total
}

fun main() {
  println(factorial(10))  // 3628800
}