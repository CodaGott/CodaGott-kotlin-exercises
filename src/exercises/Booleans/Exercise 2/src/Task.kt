// Booleans/Task2.kt
package booleansExercise2

import com.sun.org.apache.xpath.internal.operations.Bool

fun showAnd(first: Boolean, second: Boolean) {
  println("$first && $second == ${first && second}")
//  val result: Boolean = true
//  if (first && second == result){
//    println("$first && $second == true")
//  }else{
//    println("$first && $second == false")
//  }
}

fun showOr(first: Boolean, second: Boolean) {
  println("$first || $second == ${first || second}")
//  val result: Boolean = true
//  if (first || second == result){
//    println("$first || $second == true")
//  }else if (first || second != result){
//    println("$first || $second == false")
//  }
}

fun showTruthTable() {
  showAnd(true, true)
  showAnd(true, false)
  showAnd(false, true)
  showAnd(false, false)

  showOr(true, true)
  showOr(true, false)
  showOr(false, true)
  showOr(false, false)
}

fun main() {
  showTruthTable()
}