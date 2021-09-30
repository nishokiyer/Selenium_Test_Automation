import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coding_Challenge_1 {
	
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		
			String n1 = "";
			
			Thread.sleep(1000);
	boolean n11 = driver.findElement(By.cssSelector("span.rts-counter")).isDisplayed();
			if(n11 == true){
				n1 = driver.findElement(By.cssSelector("div.maincounter-number span")).getText();
				
				System.out.println("Current World Population" + n1);
				System.out.println("______________");
				int i = 0;
				while(i < 20)
				{
		
					String nn = driver.findElement(By.xpath("//div[@ class ='maincounter-number']")).getText();
					System.out.println("Current World population " + nn);
				i = i++;
				}
			}
			
			
			
		}
			
			
			
		
		
	}


