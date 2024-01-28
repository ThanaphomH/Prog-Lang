object Question08 {
  private def findMax(l1: List[Int] , l2: List[Int]): List[Int] = {
    if (l1.isEmpty) l2
    else if (l2.isEmpty) l1
    else (if (l1.head > l2.head) l1.head else l2.head) :: findMax(l1.tail,l2.tail)
  }

  def maxAll(lists:List[List[Int]]) :List[Int] = {
    if (lists.isEmpty) Nil
    else if (lists.head.isEmpty) maxAll(lists.tail)
    else findMax(lists.head , maxAll(lists.tail))
  }

}
