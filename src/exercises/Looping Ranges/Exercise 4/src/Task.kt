// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun printHalfPyramid(n: Int) {
  for (row in 1..n){
    for (col in 1..row){
      print("# ")
    }
    println()
  }
}

fun main() {
  printHalfPyramid(4)
}
/* Output:
#
##
###
####
*/