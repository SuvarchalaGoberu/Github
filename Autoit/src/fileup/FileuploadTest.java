package fileup;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileuploadTest {
	WebDriver driver;
  @Test
  public void upload() throws Exception {
	  WebElement focus=driver.findElement(By.xpath("//span[@class='ui-button-text'][contains(text(),'Upload Files')]"));
	  focus.click();
	  Runtime.getRuntime().exec("C:\\Users\\edu 15\\Documents\\Sc.exe");
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("D:\\selenium softwares\\Seleium Prj\\Autoit\\Screenshots\\Fileupload.png"));
			  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium softwares\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(" https://pdf2doc.com/");
	  driver.manage().window().maximize();
	  System.out.println("Chrome browser is being launched");
	  
  }

}
