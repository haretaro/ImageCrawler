import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.remote.DesiredCapabilities
import collection.JavaConversions._
import scala.io.Source
import java.net.URL
import java.io.File
import sys.process._

object Main extends App{


  val driver = new HtmlUnitDriver(DesiredCapabilities.firefox)
  driver.get("https://google.com/search?q=cardcaptor&tbm=isch")
  driver.findElementsByTagName("img")
    .foreach(i => i.getText)
    //.map(img => img.getAttribute("src"))
    //.zipWithIndex
    //.foreach{case (url,index) => new URL(url) #> new File(index+".jpg")!!}
  println(driver.getPageSource())

}
