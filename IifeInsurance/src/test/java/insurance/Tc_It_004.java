package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Tc_It_004 extends Basepage {
	public void change_dob() {
String expecteddob = "11-04-1999";
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);

		WebElementRepository addclient = new WebElementRepository(driver);
		addclient.getClientModule().click();
		addclient.getAddClient().click();

		WebElement clientidgenerated = addclient.getClientidtextfield();
		String expectedclientid = clientidgenerated.getAttribute("value");
		Reporter.log(expectedclientid, true);
		addclient.getClientpasswordtextefield().sendKeys("123@");
		addclient.getName().sendKeys("leopard");
		WebElement imagefileuploadbutton = addclient.getFileuploadbutton();
		imagefileuploadbutton.sendKeys("C:\\Users\\Lenovo\\Desktop\\sac\\Screenshot (83).png");
		Reporter.log("file uploaded successfully", true);
		addclient.getGender().sendKeys("male");
	     addclient.getBirthDate().sendKeys("11-04-1999");
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
		
		WebElement referencedob = driver
				.findElement(By.xpath("//td[text()='leopard']/..//td[text()='" + expecteddob + "']"));
		explicitwait.until(ExpectedConditions.textToBePresentInElement(referencedob, expecteddob));
		String actualdob = referencedob.getText();
		Reporter.log("actual dob is: " + actualdob, true);

		Assert.assertEquals(expecteddob, actualdob, "date of birth is not matching");
		Reporter.log("date of birth is mathching", true);
		
//		 String actualdob = addclient.getBirthDate().getAttribute("value");

	}

}
