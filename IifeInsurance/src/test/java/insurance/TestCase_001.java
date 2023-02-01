package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_001 extends Basepage {
	// Comparing Cleint Id
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();

		WebElement clientidgenerated = addclient.getClientidtextfield();
		String expectedclientid = clientidgenerated.getAttribute("value");
		Reporter.log(expectedclientid, true);
		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("tiger");
		WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
		imagefileuploadbutton.sendKeys("C:\\Users\\HP\\Downloads\\ty logo.png");
		Reporter.log("file uploaded successfully", true);
		addclient.getGender().sendKeys("male");
		addclient.getBirthDate().sendKeys("11-3-1995");
		addclient.getMarital_Status().sendKeys("single");
		addclient.getNID().sendKeys("UG91");
		addclient.getPhone().sendKeys("1234567890");
		addclient.getAddress().sendKeys("uganda");
		addclient.getPolicy_id().sendKeys("lic123456");
		addclient.getNominee_name().sendKeys("rudra");
		addclient.getNominee_sex().sendKeys("male");
		addclient.getNominee_birth_date().sendKeys("25-01-2023");
		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("yet to find");
		addclient.getPriority().sendKeys("50percent");
		addclient.getNominee_phone().sendKeys("9876543210");
		addclient.getSubmit().click();

		addclient.getClientModule().click();
		WebElement referenceid = driver
				.findElement(By.xpath("//td[text()='tiger']/..//td[text()='" + expectedclientid + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceid));
	
		String actualID = referenceid.getText();
		Reporter.log("actual id is: " + actualID, true);

		Assert.assertEquals(expectedclientid, actualID, "client id is not matching");
		Reporter.log("client id is mathching", true);

	}

}