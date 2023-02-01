package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_004 extends Basepage {

	// Comparing Nominee Name
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
		// WebElement clientidBirthDAte = addclient.getBirthDate();
		// String expectedclientBirthDate = clientidBirthDAte.getAttribute("value");
		// Reporter.log(expectedclientBirthDate,true);
		addclient.getMarital_Status().sendKeys("single");
		addclient.getNID().sendKeys("UG91");
		addclient.getPhone().sendKeys("1234567890");
		addclient.getAddress().sendKeys("Mumbai");
		addclient.getPolicy_id().sendKeys("lic123456");
		addclient.getNominee_name().sendKeys("Villian");
		addclient.getNominee_sex().sendKeys("male");
		addclient.getNominee_birth_date().sendKeys("04-06-2008");

		WebElement clientNomineeName = addclient.getNominee_name();

		String expectedNomineeName = clientNomineeName.getAttribute("value");
		Reporter.log(expectedNomineeName, true);
		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("tribute");
		addclient.getPriority().sendKeys("low");
		addclient.getNominee_phone().sendKeys("635289876543");
		addclient.getSubmit().click();

		addclient.getNomineeModule().click();
		WebElement referenceNomineeName = driver
				.findElement(By.xpath("//td[text()='Villian']/..//td[text()='" + expectedNomineeName + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineeName));
		// explicitwait.until(ExpectedConditions.textToBePresentInElement(referenceid,
		// expectedclientid));
		// (ExpectedConditions.textToBePresentInElement(referenceid, expectedclientid));
		String actualNomineeName = referenceNomineeName.getText();
		Reporter.log("actual Nominee Name is: " + actualNomineeName, true);

		Assert.assertEquals(expectedNomineeName, actualNomineeName, "Nominee Name is not matching");
		Reporter.log("Nominee Name is mathching", true);

	}

}