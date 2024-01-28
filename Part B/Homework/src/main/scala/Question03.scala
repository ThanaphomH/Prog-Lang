object Question03 {
  private def find(x: Any , l:List[Any]) : Boolean = {
    if (l.isEmpty) false;
    else if (l.head == x) true;
    else find(x,l.tail);
  }

  def subList(l1: List[Any], l2:List[Any]): Boolean ={
    if (l1.isEmpty) true
    else find(l1.head , l2) && subList(l1.tail, l2)
  }


}
