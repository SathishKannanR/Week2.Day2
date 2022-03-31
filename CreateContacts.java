package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContacts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("democsr");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement((By.linkText("CRM/SFA"))).click();
		 driver.findElement((By.linkText("Contacts"))).click();
		 driver.findElement((By.linkText("Create Contact"))).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Sathish");
		 driver.findElement(By.id("lastNameField")).sendKeys("Kannan");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sathish");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kannan");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Sw Testing");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sathishkannan@gmail.com");
		 WebElement We= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select se=new Select(We);
		 se.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Create Contact Module");
		 driver.findElement(By.xpath("//input[@name='submitButton'][@value='Update']")).click();
		 String Title=driver.getTitle();
		 System.out.println(Title); 
		 
		 
	}

}
