package insurance;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basepage {
	WebDriver driver;

	public void login(String username, String password) {
		String Expectedusername = "welcome, 555";
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://elftestingserver/domain/");

		driver.findElement(By.xpath("//span[text()='Life Insurance Management System']")).click();
		Set<String> allwindowid = driver.getWindowHandles();
		for (String windowid : allwindowid) {
			driver.switchTo().window(windowid);
		}
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='login']")).click();

		String actualusername = driver.findElement(By.xpath("//div[contains(text(),'welcome, 555 ')]")).getText();
		Assert.assertEquals(actualusername, Expectedusername, "valid username is not displayed in the homepage");
		Reporter.log("valid username is displayed", true);
//		LifeInsuranceHomePage lifeinsurance = new LifeInsuranceHomePage(driver);
//		lifeinsurance.getPaymentslink().click();
//		lifeinsurance.getClientsbutton().click();
//		lifeinsurance.getClientseditlink().click();
//WebElement fileuploadbutton = lifeinsurance.getFileuploadbutton();
//		fileuploadbutton.sendKeys("C:\\Users\\Lenovo\\Desktop\\sac\\Screenshot (83).png");
//		Reporter.log("file uploaded successfully", true);

	}

}
