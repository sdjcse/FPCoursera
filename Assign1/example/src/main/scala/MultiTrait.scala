/**
  * Created by sdj on 5/29/17.
  */

trait First{
  var x : Int // Abstract Variable
  var y : Int = 123  // Concrete Variable

  def fun()
}

trait Second{
  def show()
}

trait Third{
  def conceal()
}

class MultiTrait extends First with Second with Third{
  override var x: Int = 10

  override def fun(): Unit = {
    println("I'm having fun")
  }

  override def show(): Unit = {
    println("I'm showing")
  }

  override def conceal(): Unit = {
    println("I'm hiding")
  }
}

object MainClassObject{
  def main(args: Array[String]): Unit = {
    var testVar : MultiTrait = new MultiTrait
    testVar.fun()
    testVar.show()
    testVar.conceal()
  }
}
