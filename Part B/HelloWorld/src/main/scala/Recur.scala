object Recur {
  def member(x: Any, l : List[Any]) : Boolean = {
    if (l.isEmpty) false;
    else if (l.head == x) true;
    else member(x,l.tail);
  }

  def sorted(l : List[Int]) : Boolean = {
    if (l.length <= 1) true;
    else (l.head <= l.tail.head) && sorted(l.tail);
  }

  def delete(x : Any , l: List[Any]) : List[Any] = {
    if (l.isEmpty) Nil
    else if (l.head != x) {
      l.head :: delete(x,l.tail);
    } else {
      delete(x,l.tail);
    }
  }

  def length(l : List[Any]) : Int = {
    if (l.isEmpty) 0;
    else 1 + length(l.tail);
  }

  def myReverse(l : List[Any]) : List[Any] = {
    if (l.isEmpty) Nil
    else myReverse(l.tail) ++ List(l.head);
  }


}
