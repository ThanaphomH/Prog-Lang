object Question04 {

  private def check(x: Any, l:List[Any]) : Boolean = {
    if (l.length == 1) l.head == x;
    else check(x , l.tail);
  }

  private def sliceMostLeft(l : List[Any]) : List[Any] = {
    if (l.isEmpty) Nil
    else if (l.length == 1) Nil
    else l.head :: sliceMostLeft(l.tail)
  }

  private def palin(l: List[Any] , cnt: Int): Boolean = {
    if (cnt == 0) true;
    else check(l.head, l.tail) && palin(sliceMostLeft(l.tail), cnt-1);
  }

  def palindrome(l :List[Any]): Boolean = {
    palin(l , l.length / 2);
  }


}
