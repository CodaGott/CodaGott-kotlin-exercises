// LoopingAndRanges/Task2.kt
package loopingAndRangesExercise2

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun sumOfFactorials(n: Int): Long {
  var total: Long = 1

  for(num in 1..n){
    total+= factorial(num)
  }

  return total
}

fun main() {
  println(sumOfFactorials(10))  // 4037913
}