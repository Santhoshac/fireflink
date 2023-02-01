package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_003 extends Basepage {

	// Comparing Nominee ID
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();
		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("Arya");
		WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
		imagefileuploadbutton.sendKeys("C:\\Users\\HP\\Downloads\\ty logo.png");
		Reporter.log("file uploaded successfully", true);
		addclient.getGender().sendKeys("male");
		addclient.getBirthDate().sendKeys("01-01-2001");

		addclient.getMarital_Status().sendKeys("single");
		addclient.getNID().sendKeys("UG91");
		addclient.getPhone().sendKeys("1234567890");
		addclient.getAddress().sendKeys("Mumbai");
		addclient.getPolicy_id().sendKeys("lic123456");
		addclient.getNominee_name().sendKeys("virat");
		addclient.getNominee_sex().sendKeys("male");
		addclient.getNominee_birth_date().sendKeys("04-06-2008");

		WebElement clientNomineeId = addclient.getNominee_id();

		String expectedNomineeID = clientNomineeId.getAttribute("value");
		Reporter.log(expectedNomineeID, true);
		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("Marr");
		addclient.getPriority().sendKeys("low");
		addclient.getNominee_phone().sendKeys("9876543210");
		addclient.getSubmit().click();

		addclient.getNomineeModule().click();
		WebElement referenceNomineeId = driver
				.findElement(By.xpath("//td[text()='virat']/..//td[text()='" + expectedNomineeID + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineeId));
		// explicitwait.until(ExpectedConditions.textToBePresentInElement(referenceid,
		// expectedclientid));
		// (ExpectedConditions.textToBePresentInElement(referenceid, expectedclientid));
		String actualNomineeId = referenceNomineeId.getText();
		Reporter.log("actual Nominee Name is: " + actualNomineeId, true);

		Assert.assertEquals(expectedNomineeID, actualNomineeId, "Nominee id is not matching");
		Reporter.log("Nominee id is mathching", true);

	}

}