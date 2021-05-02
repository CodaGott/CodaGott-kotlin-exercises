// LoopingAndRanges/Task3.kt
package loopingAndRangesExercise3

fun sumOfEven(n: Int): Int {
  var total : Int = 0
  for (i in 0..n step 2){
    total += i
  }
  return total
}

fun main() {
  println(sumOfEven(10))  // 30
}