package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("democsr");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement((By.linkText("CRM/SFA"))).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		 driver.findElement(By.name("emailAddress")).sendKeys("A@gmail.com");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(2000);
		 WebElement Name=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		 String CapturedName=Name.getText();
		 Name.click();
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 String Title=driver.getTitle();
		 System.out.println("Title of the Page Is:" + Title);
		 	 
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 
		 WebElement LeadName=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		 String DupName=LeadName.getText();
		 if(DupName.equals(CapturedName))
		 {
			 System.out.println("Name Matched");
		 }
		 else
		 {
			 System.out.println("Name is not Matching");
		 }
		 driver.close();

	}

}
