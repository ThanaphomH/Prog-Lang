object Question06 {
  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    if (list.isEmpty) Nil
    else if (f(list.head)) list.head :: myFilter(f)(list.tail);
    else myFilter(f)(list.tail)
  }
}
