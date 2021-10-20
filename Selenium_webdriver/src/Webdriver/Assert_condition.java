package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert_condition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Assertion method available in TestNG jar
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i = 1; i<4; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		
		//Check box returns false
		//AssertFalse
		Assert.assertFalse(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Senior citizen check box selected
		driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).click();
		//Check box returns true
		//AssertTrue
		Assert.assertTrue(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
	
		
		System.out.println("Execution completed");
	
		
	}

}
