package sample_Test_NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	WebDriver driver ;
  @Test(priority=1)
  public void f() {
	  WebElement name = driver.findElement(By.xpath("(//a[@href=\"https://www.salemholycross.com/links\"])[1]"));
	  System.out.println(name.getText());
  }
  @Test(priority=2)
  public void ff()
  {
	  WebElement name = driver.findElement(By.xpath("(//*[@class=\"StylableButton2545352419__container\"])[2]"));
	  System.out.println(name.getText());
	  
  }
		  @Test(priority=0)
		  public void fff()
		  {
			  WebElement name = driver.findElement(By.xpath("(//span[@class=\"itemDepth02233374943__label wixui-horizontal-menu__item-label\"])[2]"));
			  System.out.println(name.getText());
			  
		  }
		  
		  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.salemholycross.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
