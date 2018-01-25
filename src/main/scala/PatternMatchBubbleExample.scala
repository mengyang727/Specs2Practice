class PatternMatchBubbleExample {
  def imperativeBubbleSort[T <% Ordered[T]](source: Array[T]): Array[T] = {
    for (i <- 0 until source.length - 1; j <- 0 until source.length - 1 - i) {
      if (source(j) > source(j + 1)) {
        val temp = source(j)
        source(j) = source(j + 1)
        source(j + 1) = temp
      }
    }
    source
  }

  def bubbleSort[T <% Ordered[T]](inputList: List[T]): List[T] = {
    def sort(source: List[T], result: List[T]) = {
      if (source.isEmpty) result
      else bubble(source, Nil, result)
    }


    def bubble(source: List[T], tempList: List[T], result: List[T]): List[T] = source match {
      case h1 :: h2 :: t =>
        if (h1 > h2) bubble(h1 :: t, h2 :: tempList, result)
        else bubble(h2 :: t, h1 :: tempList, result)
      case h1 :: t => sort(tempList, h1 :: result)
    }

    sort(inputList, Nil)
  }
}

object Demo {
  def main(args: Array[String]): Unit = {
    println(new PatternMatchBubbleExample().bubbleSort(List(6, 5, 8, 7)))
    println(new PatternMatchBubbleExample().imperativeBubbleSort(Array(5, 6, 8, 7)).toBuffer)
  }
}
