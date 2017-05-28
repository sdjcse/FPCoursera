/**
  * Created by sdj on 5/12/17.
  */
object ExampleApp {
    private var _instance : ExampleApp = null
    def instance() = {
        if (_instance == null)
            _instance = new ExampleApp(0)
        _instance
    }
    def main(args: Array[String]): Unit = {
        ExampleApp.instance.doSomething()
        ExampleApp.instance.doSomething()
    }
}

class ExampleApp private(var state:Int){
    def doSomething() = {
        state += 1
        println("I did something here: " + this.state +" times")
    }
}