package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chekbox_selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Check box selected or not
		System.out.println(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		//Senior citizen check box selected
		driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).click();
		//Check box selected or not
		System.out.println(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		//Count of all check boxes
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
	}

}
