package settings;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Hospital_Regtest {
	WebDriver driver;
  @Test
  public void hsptl() {
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("1411");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).sendKeys("Malik Hospital");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).sendKeys("Haryana");
	  new Select(driver.findElement(By.xpath("//select[@id='Hospitalregistration_yearofestablishment']"))).selectByIndex(2018);
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']")).sendKeys("India");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']")).sendKeys("HR");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']")).sendKeys("9813217444");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_email']")).sendKeys("Vikasmalik8881@gmail.com");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_fax']")).sendKeys("123456789");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_noofbuildings']")).sendKeys("10");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_contactperson']")).sendKeys("Vikas");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_promotedby']")).sendKeys("Vikas");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_logo']")).click();
	  driver.findElement(By.xpath("//button[@class='btn bg-teal']")).click();
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(" http://demo.elixiraid.com/index.php");
	  driver.manage().window().maximize();
	  System.out.println("Chrome browser is being launched");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Your Hospital details were registered successsfully");  
  }

}
