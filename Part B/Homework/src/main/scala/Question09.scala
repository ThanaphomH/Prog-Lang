object Question09 {

  //val tape = List('C','H','A','R')

  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] ={
    if (tape.isEmpty) Nil
    else if (n == 0) tape
    else f(tape.head) :: turingStep(f,tape.tail,n-1)
  }


}
