package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Date_Picker_Current_date {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	//		if(driver.findElement(By.cssSelector("div#ui-datepicker-div td.ui-datepicker-days-cell-over.ui-datepicker-today a")).isEnabled()) {
//			
//		driver.findElement(By.cssSelector("div#ui-datepicker-div td.ui-datepicker-days-cell-over.ui-datepicker-today a")).click();
		System.out.println("Elements loaded");
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		//radio button to click round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
			System.out.println("2nd Date picker is enabled");
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		}
		
	}
	

	





































































































