package Webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//static drop down
		System.out.println("Start of execution");
		//WebElement curdd1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select cur_dd = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		cur_dd.selectByIndex(3);
		System.out.println(cur_dd.getFirstSelectedOption().getText());		
		cur_dd.selectByValue("AED");
		System.out.println(cur_dd.getFirstSelectedOption().getText());
		cur_dd.selectByVisibleText("INR");
		System.out.println(cur_dd.getFirstSelectedOption().getText());
		System.out.println("Execution Completed");
	}

}
