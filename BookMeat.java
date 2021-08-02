import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMeat {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vidya\\Documents\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String mainurl="https://www.licious.in/";
		driver.get(mainurl);
		
		driver.findElement(By.className("login-text")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("user-id")).sendKeys("9620446490");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/div[2]/div[5]/p/button[1]")).click();
		Thread.sleep(15000);
		
		driver.get("https://www.licious.in/red-meat/mutton-soup-bones-pr_58d3ae77dcce0");
		Thread.sleep(4000);
		
		
		try {
			driver.findElement(By.xpath("/html/body/div[8]/div[5]/div[1]/div[4]/div[4]/div[3]/div/button")).click();
			System.out.println("Mutton Bones Added To Cart");
		}catch (Exception e) {
			System.out.println("Mutton Bones Not in Stock");
		}
		
		driver.quit();
	}

}
