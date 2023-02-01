package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_13 extends Basepage {
	// Comparing Client ID in Add Nominee module
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		AddNomineeRepository nomineRepo = new AddNomineeRepository(driver);
		nomineRepo.getNomineeModule().click();
		nomineRepo.getAddNominee().click();
		nomineRepo.getClientIdInAddNominee().sendKeys("84644346");

		WebElement ClientIdInAddNominee = nomineRepo.getClientIdInAddNominee();
		String expectedClientID = ClientIdInAddNominee.getAttribute("value");
		Reporter.log(expectedClientID, true);
		nomineRepo.getNomineeName().sendKeys("Sanjay");
		nomineRepo.getNomineeGenderInAddNominee().sendKeys("Male");
		nomineRepo.getNomineeBirthDateInAddNominee().sendKeys("03-05-1999");
		nomineRepo.getNomineeNIDInAddNominee().sendKeys("486543647");
		nomineRepo.getNomineeRelationshipInAddNominee().sendKeys("Married");
		nomineRepo.getNomineePriorityInAddNominee().sendKeys("high");
		nomineRepo.getNomineePhoneInAddNominee().sendKeys("8476149236");

		nomineRepo.getSubmitButtonInAddNominee().click();

		nomineRepo.getNomineeModule().click();

		WebElement referenceClientID = driver
				.findElement(By.xpath("//td[text()='sanju']/..//td[text()='" + expectedClientID + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceClientID));
		String actualClientID = referenceClientID.getText();
		Reporter.log("actual Nominee IDis: " + actualClientID, true);

		Assert.assertEquals(expectedClientID, actualClientID, "Client ID is not matching");
		Reporter.log("Client ID is mathching", true);

	}

}


