package insurance;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_23 extends Basepage{
	@Test(groups = "integration")
	public void addClient() {
		login("555", "666");
	WebDriverWait explicitwait = new WebDriverWait(driver, 15);
	String expectedclientstatus = "Client Status";
	String expectedclientname = "name09";

	WebElementRepository addclient = new WebElementRepository(driver);
	addclient.getClientModule().click();
	addclient.getAddClient().click();

	Reporter.log("expectedclientstatus :"+expectedclientstatus,true);
	addclient.getClientpasswordtextefield().sendKeys("123@");
	addclient.getName().sendKeys("name09");
	WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
	imagefileuploadbutton.sendKeys("C:\\Windows\\addins\\FXSEXT.ecf");
	Reporter.log("file uploaded successfully", true);
	addclient.getGender().sendKeys("male");
	addclient.getBirthDate().sendKeys("11-3-1996");
	addclient.getMarital_Status().sendKeys("single");
	addclient.getNID().sendKeys("TC009");
	addclient.getPhone().sendKeys("8089520951");
	addclient.getAddress().sendKeys("uganda");
	addclient.getPolicy_id().sendKeys("lic123456");
	addclient.getNominee_name().sendKeys("nominee09");
	addclient.getNominee_sex().sendKeys("male");
	addclient.getNominee_birth_date().sendKeys("25-01-2023");
	addclient.getNominee_nid().sendKeys("in09");
	addclient.getNominee_relationship().sendKeys("yet to find");
	addclient.getPriority().sendKeys("50percent");
	addclient.getNominee_phone().sendKeys("9876543210");
	addclient.getSubmit().click();

	addclient.getClientModule().click();
 	WebElement referenceclientstatus = driver.findElement(By.xpath("//td[text()='name09']/..//a[text()='"+expectedclientstatus+"']"));
//	explicitwait.until(ExpectedConditions.textToBePresentInElement(referenceclientstatus, expectedclientstatus));
	referenceclientstatus.click();
	driver.findElement(By.partialLinkText("Delete Client")).click();
	try {
	driver.findElement(By.xpath("//td[text()='name09']"));
	}
	catch(NoSuchElementException e) {
		Reporter.log("expectedclient deleted successfully",true);
	}
	driver.quit();
	}

}