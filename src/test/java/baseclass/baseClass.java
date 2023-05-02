package baseclass;

//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class baseClass {
  @BeforeClass
  public void openBrowser() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.co.in/");
  }

}
