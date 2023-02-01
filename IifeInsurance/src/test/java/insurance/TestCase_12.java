package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_12 extends Basepage {
	// Comparing nomiee ID in Add Nominee module
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		AddNomineeRepository nomineRepo = new AddNomineeRepository(driver);
		nomineRepo.getNomineeModule().click();
		nomineRepo.getAddNominee().click();

		WebElement clientNomineePhoneNumber = nomineRepo.getNominee_idInAddNomiee();
		String expectedNomineeID = clientNomineePhoneNumber.getAttribute("value");
		Reporter.log(expectedNomineeID, true);
		nomineRepo.getClientIdInAddNominee().sendKeys("84644346");
		nomineRepo.getNomineeName().sendKeys("sanju");
		nomineRepo.getNomineeGenderInAddNominee().sendKeys("Male");
		nomineRepo.getNomineeBirthDateInAddNominee().sendKeys("03-05-1999");
		nomineRepo.getNomineeNIDInAddNominee().sendKeys("486543647");
		nomineRepo.getNomineeRelationshipInAddNominee().sendKeys("Married");
		nomineRepo.getNomineePriorityInAddNominee().sendKeys("high");
		nomineRepo.getNomineePhoneInAddNominee().sendKeys("8476149236");

		nomineRepo.getSubmitButtonInAddNominee().click();

		nomineRepo.getNomineeModule().click();

		WebElement referenceNomineeID = driver
				.findElement(By.xpath("//td[text()='sanju']/..//td[text()='" + expectedNomineeID + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineeID));
		String actualNomineeID = referenceNomineeID.getText();
		Reporter.log("actual Nominee IDis: " + actualNomineeID, true);

		Assert.assertEquals(expectedNomineeID, actualNomineeID, "Nominee ID is not matching");
		Reporter.log("Nominee ID is mathching", true);

	}

}