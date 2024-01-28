object Question02 {
  def insertInOrder(x: Int, l:List[Int]): List[Int] ={
    if (l.isEmpty) List(x)
    else if (x < l.head) x :: l
    else l.head :: insertInOrder(x,l.tail)
  }
}
