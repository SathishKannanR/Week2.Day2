package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kannan");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 String Title=driver.getTitle();
		 System.out.println("Page Title is:" +Title);
		 driver.findElement((By.linkText("Edit"))).click();
		 
		 WebElement Cmpname=driver.findElement(By.id("updateLeadForm_companyName"));
		 String OriginalCmpName=Cmpname.getText();
		 Cmpname.clear();
		 Cmpname.sendKeys("Wipro");
		 driver.findElement(By.xpath("(//input[@name=\"submitButton\"])[1]")).click();
		 
		 WebElement UpdatedCmpname=driver.findElement(By.id("viewLead_companyName_sp"));
		 String Newname=UpdatedCmpname.getText();
		 
		 if(OriginalCmpName.equals(Newname))
		 {
			 System.out.println("Matched");
		 }
		 else
		 {
			 System.out.println("Mismatched Name");
	      }
		 
		 driver.close();
	}

}
