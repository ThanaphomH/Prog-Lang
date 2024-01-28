object Q1 {
    def listcheck(l : List[Int] , f : Int => Boolean , checkVal : Boolean) : List[Int] = {
        if (l.isEmpty) Nil
        else if (f(l.head) == checkVal) l.head :: listcheck(l.tail , f , checkVal);
        else listcheck(l.tail,f,checkVal);
    }

    def partition(l : List[Int] , f : Int => Boolean) : List[List[Int]] = {
        List(listcheck(l , f , true) , listcheck(l , f , false));
    }

    def compliment(f:Int => Int):Int => Int = {
        f(_) * -1
    }

    def f1(x:Int):Boolean = {
        x%2 == 1
    }
    def f2(x:Int):Boolean = {
        x*x > 10
    }
    def f3(x:Int):Int ={
        x -1000
    }

    def main(args: Array[String]): Unit = {
        val l1 = List(1,2,3,4,5)
        println(partition(l1,f1)) // List(List(1, 3, 5), List(2, 4))
        println(partition(l1,f2)) // List(List(4, 5), List(1, 2, 3))
        println(partition(l1,(x => x==0))) // List(List(), List(1, 2, 3, 4, 5))
        println(partition(l1,(x => x<6))) // List(List(1, 2, 3, 4, 5), List())

        println("-------------------")

        println(compliment((x => x*x))(-5)) // -25
        println(compliment((x => x*x))(3)) // -9
        println(compliment((x => -1*x*x))(3)) // 9
        val c = compliment(f3)
        println(c(3)) // 997
        println(c(3000)) // -2000
    }
}
