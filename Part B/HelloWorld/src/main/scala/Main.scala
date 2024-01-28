object Main {
  def general(f: Int => Int, g: (Int,Int) => Int, endVal: Int)(a : Int, b: Int) : Int = {
    if (a > b) endVal;
    else g(f(a) , general(f,g,endVal)(a+1 , b))
  }

  def main(args: Array[String]): Unit = {
//    println("Hello world!")
//    for (x <- 0 to 9 if x > 3) {
//      println(x);
//    }
//
//    println(general(x => x , (x,y) => x+y, 0)(0,10));
    val listNum : List[Int] = List(1,2,3,4,5)
    listNum.foreach(println)
  }

}