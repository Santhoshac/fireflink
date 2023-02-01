package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_006 extends Basepage {

	// Comparing Nominee Gender
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();

		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("Shubman");
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
		addclient.getNominee_name().sendKeys("Gill");
		addclient.getNominee_sex().sendKeys("male");

		WebElement clientNomineeGender = addclient.getNominee_sex();
		String expectedNomineeGender = clientNomineeGender.getAttribute("value");
		Reporter.log(expectedNomineeGender, true);
		addclient.getNominee_birth_date().sendKeys("04-06-2008");

		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("tribute");
		addclient.getPriority().sendKeys("low");
		addclient.getNominee_phone().sendKeys("635289876543");
		addclient.getSubmit().click();

		addclient.getNomineeModule().click();
		WebElement referenceNomineeGender = driver
				.findElement(By.xpath("//td[text()='Gill']/..//td[text()='" + expectedNomineeGender + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineeGender));
		String actualNomineeGender = referenceNomineeGender.getText();
		Reporter.log("actual Nominee gender is: " + actualNomineeGender, true);

		Assert.assertEquals(expectedNomineeGender, actualNomineeGender, "Nominee Gender is not matching");
		Reporter.log("Nominee Gender is mathching", true);

	}

}