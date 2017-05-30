/**
  * Created by sdj on 5/29/17.
  */
trait first{
  def show()
}
abstract class TraitTest extends first{

}

object mainClass{
  def main(args: Array[String]): Unit = {
    var testObj : TraitTest = new TraitTest {
      override def show(): Unit = {
        println("Test Abstract Extend")
      }
    }
    testObj.show()
  }
}
