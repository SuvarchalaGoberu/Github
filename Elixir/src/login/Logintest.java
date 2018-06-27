package login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterClass;

public class Logintest {
	WebDriver driver;	
  @Test
  public void L() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	
	  
  }
  @BeforeClass
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(" http://demo.elixiraid.com/index.php");
	  driver.manage().window().maximize();
	  System.out.println("Chrome browser is being launched");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Your login was successful.");
	  
  }

}
