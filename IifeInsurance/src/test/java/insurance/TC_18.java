package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_18 extends Basepage{
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		String expectedDOB = "11-3-1996";

	WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();

		//WebElement clientidgenerated = addclient.getClientidtextfield();
		//String expectedclientid = clientidgenerated.getAttribute("value");
		Reporter.log(expectedDOB,true);
		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("henge neevu");
		WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
		imagefileuploadbutton.sendKeys("C:\\Windows\\addins\\FXSEXT.ecf");
		Reporter.log("file uploaded successfully", true);
		addclient.getGender().sendKeys("male");
		addclient.getBirthDate().sendKeys("11-3-1996");
		addclient.getMarital_Status().sendKeys("single");
		addclient.getNID().sendKeys("UG91");
		addclient.getPhone().sendKeys("1234567890");
		addclient.getAddress().sendKeys("africa");
		addclient.getPolicy_id().sendKeys("lic123456");
		addclient.getNominee_name().sendKeys("bhadra");
		addclient.getNominee_sex().sendKeys("male");
		addclient.getNominee_birth_date().sendKeys("25-01-2023");
		addclient.getNominee_nid().sendKeys("in09");
		addclient.getNominee_relationship().sendKeys("yet to find");
		addclient.getPriority().sendKeys("50percent");
		addclient.getNominee_phone().sendKeys("9876543210");
		addclient.getSubmit().click();

		addclient.getClientModule().click();
		WebElement referenceDOB = driver.findElement(By.xpath("//td[text()='henge neevu']/..//td[text()='"+expectedDOB+"']"));
		explicitwait.until(ExpectedConditions.textToBePresentInElement(referenceDOB, expectedDOB));
		String actualDOB = referenceDOB.getText();
		Reporter.log("actual id is: " + actualDOB,true);
        SoftAssert sassert=new SoftAssert();
		sassert.assertEquals(expectedDOB, actualDOB, "client DOB is not matching");
		Reporter.log("client id is mathching",true);

}

}


