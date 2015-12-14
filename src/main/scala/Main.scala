import org.openqa.selenium.htmlunit.HtmlUnitDriver

object Main extends App{

  val driver = new HtmlUnitDriver
  driver.get("https://google.com/search?q=hoge")
  println(s"title: ${driver.getTitle()}")

}
