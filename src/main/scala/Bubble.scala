import scala.util.control.Breaks._

/** Bubble sort.
  *
  * @param array array to be sorted
  * @return sorted array in ascending order
  */
class Bubble {
  def bubble(array: Array[Int]): Array[Int] = {

    var tempArray = new Array[Int](array.length)
    array.copyToArray(tempArray)

    breakable {
      for (i <- 0 until tempArray.length - 1) {
        var isChange = false
        for (j <- 0 until tempArray.length - 1 - i) {
          if (tempArray(j) > tempArray(j + 1)) {
            val temp = tempArray(j)
            tempArray(j) = tempArray(j + 1)
            tempArray(j + 1) = temp
            isChange = true
          }
        }
        if (!isChange) {
          break
        }
      }
    }
    tempArray
  }
}
