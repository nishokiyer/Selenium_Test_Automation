package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_Current_date {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(5000);
//		if(driver.findElement(By.cssSelector("div#ui-datepicker-div td.ui-datepicker-days-cell-over.ui-datepicker-today a")).isEnabled()) {
//			
//		driver.findElement(By.cssSelector("div#ui-datepicker-div td.ui-datepicker-days-cell-over.ui-datepicker-today a")).click();
		System.out.println("Elements loaded");
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.close();
		driver.quit();
		
		}
		
	}
	

	





































































































