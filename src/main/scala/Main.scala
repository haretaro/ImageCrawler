import org.openqa.selenium.htmlunit.HtmlUnitDriver
import collection.JavaConversions._
import scala.io.Source
import java.net.URL
import java.io.File
import sys.process._

object Main extends App{

  val driver = new HtmlUnitDriver
  driver.get("https://google.com/search?q=hoge&tbm=isch")
  val imgs = driver.findElementsByTagName("img")
    .map(img => img.getAttribute("src"))
    .zipWithIndex
    .foreach{case (url,index) => new URL(url) #> new File(index+".jpg")!!}

}
