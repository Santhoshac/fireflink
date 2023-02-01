package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_007 extends Basepage {

	// Comparing Nominee Birth Date
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();

		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("Rishab");
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
		addclient.getNominee_name().sendKeys("Pant");
		addclient.getNominee_sex().sendKeys("male");

		addclient.getNominee_birth_date().sendKeys("04-04-2004");
		WebElement clientNomineeBirthDate = addclient.getNominee_birth_date();
		String expectedNomineeBirthDate = clientNomineeBirthDate.getAttribute("value");
		Reporter.log(expectedNomineeBirthDate, true);

		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("tribute");
		addclient.getPriority().sendKeys("low");
		addclient.getNominee_phone().sendKeys("635289876543");
		addclient.getSubmit().click();

		addclient.getNomineeModule().click();
		WebElement referenceNomineeBirthDate = driver
				.findElement(By.xpath("//td[text()='Pant']/..//td[text()='" + expectedNomineeBirthDate + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineeBirthDate));
		String actualNomineeBirthDate = referenceNomineeBirthDate.getText();
		Reporter.log("actual Nominee Birth Date is: " + actualNomineeBirthDate, true);

		Assert.assertEquals(expectedNomineeBirthDate, actualNomineeBirthDate, "Nominee Birt Date is not matching");
		Reporter.log("Nominee Birth Date is mathching", true);

	}

}