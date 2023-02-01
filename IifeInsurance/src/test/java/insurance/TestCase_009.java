package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_009 extends Basepage {

	// Comparing Nominee Priority
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();

		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("Gautam");
		WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
		imagefileuploadbutton.sendKeys("C:\\Users\\HP\\Downloads\\ty logo.png");
		Reporter.log("file uploaded successfully", true);
		addclient.getGender().sendKeys("male");
		addclient.getBirthDate().sendKeys("03-03-2003");
		addclient.getMarital_Status().sendKeys("single");
		addclient.getNID().sendKeys("UG91");
		addclient.getPhone().sendKeys("1234567890");
		addclient.getAddress().sendKeys("Mumbai");
		addclient.getPolicy_id().sendKeys("lic123456");
		addclient.getNominee_name().sendKeys("Gambhir");
		addclient.getNominee_sex().sendKeys("male");
		addclient.getNominee_birth_date().sendKeys("04-04-2004");
		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("Married");
		addclient.getPriority().sendKeys("Very very High");
		WebElement clientNomineePriority = addclient.getPriority();
		String expectedNomineePriority = clientNomineePriority.getAttribute("value");
		Reporter.log(expectedNomineePriority, true);
		addclient.getNominee_phone().sendKeys("635289876543");
		addclient.getSubmit().click();

		addclient.getNomineeModule().click();
		WebElement referenceNomineePriority = driver
				.findElement(By.xpath("//td[text()='Gambhir']/..//td[text()='" + expectedNomineePriority + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineePriority));
		String actualNomineePriority = referenceNomineePriority.getText();
		Reporter.log("actual Nominee Priority is: " + actualNomineePriority, true);

		Assert.assertEquals(expectedNomineePriority, actualNomineePriority, "Nominee Priority is not matching");
		Reporter.log("Nominee Priority is mathching", true);

	}

}