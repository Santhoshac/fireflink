package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_21 extends Basepage {
	@Test(groups = "integration")
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		String expectedaddress = "uganda";

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();

		Reporter.log("expectedaddress :" + expectedaddress, true);
		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("name07");
		WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
		imagefileuploadbutton.sendKeys("C:\\Windows\\addins\\FXSEXT.ecf");
		Reporter.log("file uploaded successfully", true);
		addclient.getGender().sendKeys("male");
		addclient.getBirthDate().sendKeys("11-3-1996");
		addclient.getMarital_Status().sendKeys("single");
		addclient.getNID().sendKeys("UG91");
		addclient.getPhone().sendKeys("8089520951");
		addclient.getAddress().sendKeys("uganda");
		addclient.getPolicy_id().sendKeys("lic123456");
		addclient.getNominee_name().sendKeys("nominee07");
		addclient.getNominee_sex().sendKeys("male");
		addclient.getNominee_birth_date().sendKeys("25-01-2023");
		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("yet to find");
		addclient.getPriority().sendKeys("50percent");
		addclient.getNominee_phone().sendKeys("9876543210");
		addclient.getSubmit().click();

		addclient.getClientModule().click();
		WebElement referenceaddress = driver
				.findElement(By.xpath("//td[text()='name07']/..//td[text()='" + expectedaddress + "']"));
		explicitwait.until(ExpectedConditions.textToBePresentInElement(referenceaddress, expectedaddress));
		String actualaddress = referenceaddress.getText();
		Reporter.log("actual addresss : " + actualaddress, true);
		SoftAssert sassert = new SoftAssert();
		sassert.assertEquals(expectedaddress, actualaddress, "client address is not matching");
		Reporter.log("client address is mathching", true);
		driver.quit();
	}
}