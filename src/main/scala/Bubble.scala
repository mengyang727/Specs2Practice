import scala.util.control.Breaks._

/**
  * bubble sort
  */
class Bubble {
  /**
    * bubble sort
    * @param array
    * @return increament sorted array
    */
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

  /**
    * bubble sort by recursion
    * @param array
    * @return increament sorted array
    */
  def bubbleRecursion(array: Array[Int]): Array[Int] = {
    var newArray = new Array[Int](array.length)
    array.copyToArray(newArray)
    compareInLineRecursion(newArray, newArray.length - 1)
    newArray
  }

  def compareInLineRecursion(array: Array[Int], endIndex: Int): Unit = {
    if(endIndex > 0) {
      var isChange = compareBubblesRecursion(array, 0, endIndex, false)
      if(isChange) {
        compareInLineRecursion(array, endIndex - 1)
      }
    }
  }

  /**
    * compare two close bubbles
    * @param array
    * @param startIndex
    * @param endIndex index of the biggest bubble
    * @param isChange
    * @return true: bubbles have been exchanged; false: no exchange;
    */
  def compareBubblesRecursion(array: Array[Int], startIndex: Int, endIndex: Int, isChange: Boolean): Boolean = {
    if(startIndex < endIndex) {
      var hasChange = false
      var temp = 0
      if(array(startIndex) > array(startIndex + 1)) {
        temp = array(startIndex)
        array(startIndex) = array(startIndex + 1)
        array(startIndex + 1) = temp
        hasChange = true
      }
      compareBubblesRecursion(array, startIndex + 1, endIndex, hasChange || isChange)
    } else {
      isChange
    }
  }

  /**
    * bubble sort by pattern match
    * @param list
    * @param result
    * @return increament sorted array
    */
  def bubblePatternMatch(list: List[Int], result: List[Int]): List[Int] = {
    if (list.isEmpty) result
    else compareBubblesPatternMatch(list, Nil, result)
  }

  /**
    *
    * @param list
    * @param smallBubbleList
    * @param result the biggest bubbles list
    * @return
    */
  def compareBubblesPatternMatch(list: List[Int], smallBubbleList: List[Int], result: List[Int]): List[Int] = list match {
    case h1 :: h2 :: t =>
      if(h1 > h2) compareBubblesPatternMatch(h1 :: t, h2 :: smallBubbleList, result)
      else compareBubblesPatternMatch(h2 :: t, h1 :: smallBubbleList, result)
    case h1 :: t =>
      bubblePatternMatch(smallBubbleList, h1 :: result)
  }
}
