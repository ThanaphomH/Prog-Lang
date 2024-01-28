object Question01 {
  def insertAtPosition(x: Any, pos: Int, l:List[Any]): List[Any] ={
    if (pos == 0) x :: l;
    else l.head :: insertAtPosition(x , pos-1 , l.tail);
  }
}
