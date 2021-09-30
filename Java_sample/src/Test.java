import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//ChromeDriver.getInstance().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		/*driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("Keepsolid download");
		driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys(Keys.ENTER);
		String ss = driver.getTitle();
		System.out.println(ss);*/
		//driver.findElement(By.xpath("//div[1]/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text() ='Log out']")).click();
		driver.close();
	}	

}
