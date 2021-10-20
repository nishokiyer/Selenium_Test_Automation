package Webdriver;

import java.util.List;                                                   

import org.openqa.selenium.By;                                                                                                         
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> Options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));                                                                                                                                                                                                                                                                                                                                                                                              
		for(WebElement Option :Options)
		{
			if(Option.getText().equalsIgnoreCase("India"))
			
			{
				System.out.println(Option.getText());
				Option.click();
				break;
			}
			
			
		}
	}

}
