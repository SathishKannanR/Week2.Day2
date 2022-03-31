package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Create New Account")).click();
		 
		 //driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		 
          //driver.findElement(By.name("firstname")).sendKeys("Sathish");
          driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sathish");
          
          driver.findElement(By.name("lastname")).sendKeys("Kannan");          
          //driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kannan");
          
          driver.findElement(By.id("password_step_input")).sendKeys("SatKan123");
          
          WebElement we=driver.findElement(By.xpath("//select[@id='day']"));
          Select se=new Select(we);
          se.selectByVisibleText("11");
          
          WebElement we1=driver.findElement(By.xpath("//select[@id='month']"));
          Select se1=new Select(we1);
          se1.selectByVisibleText("Sep");
          
          WebElement we2=driver.findElement(By.xpath("//select[@id='year']"));
          Select se2=new Select(we2);
          se2.selectByValue("1993");
          
          driver.findElement(By.xpath("//label[contains(text(),'Fema')]")).click();
                    
		 
	}

}
