object Question10 {

  private def apply(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int], res: Boolean, cur : Int) : Int = {
    if (list.isEmpty) cur
    else {
      if (res) apply(f1,f2,list.tail,false,f1(cur , list.head))
      else apply(f1,f2,list.tail,true,f2(cur , list.head))
    }
  }

  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int ={
    if (list.isEmpty) 0
    else if (list.length == 1) list.head
    else apply(f1,f2,list.tail,true,list.head)
  }

}
