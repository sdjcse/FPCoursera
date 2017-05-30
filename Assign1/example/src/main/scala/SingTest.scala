/**
  * Created by sdj on 5/29/17.
  */
object SingTest {
  private var  m : Int = 576
  def main(args:Array[String]): Unit ={
    var singObj : SingTest = new SingTest
    singObj.show()
  }
}

class SingTest{
  import SingTest._
  def show(): Unit ={
    println("Value = " + m)
  }
}
