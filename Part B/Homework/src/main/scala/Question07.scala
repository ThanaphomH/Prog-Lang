object Question07 {
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if (list.isEmpty) Nil
    else f(list.head) :: myMap(f)(list.tail)
  }
}
