package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selection_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	for(int i = 1; i<4; i++)
	{
	driver.findElement(By.id("hrefIncAdt")).click();
	}
	driver.findElement(By.id("btnclosepaxoption")).click(); 
	}

}
