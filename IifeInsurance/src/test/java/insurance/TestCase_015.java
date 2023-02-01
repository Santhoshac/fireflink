package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_015 extends Basepage {
	// Comparing NOminee Relationship in Add Nominee
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		AddNomineeRepository nomineRepo = new AddNomineeRepository(driver);
		nomineRepo.getNomineeModule().click();
		nomineRepo.getAddNominee().click();
		nomineRepo.getClientIdInAddNominee().sendKeys("84644346");
		nomineRepo.getNomineeName().sendKeys("Vijay");
		nomineRepo.getNomineeGenderInAddNominee().sendKeys("Male");
		nomineRepo.getNomineeBirthDateInAddNominee().sendKeys("03-05-1999");
		nomineRepo.getNomineeNIDInAddNominee().sendKeys("486543647");
		nomineRepo.getNomineeRelationshipInAddNominee().sendKeys("Married");

		WebElement NomineeRelationship = nomineRepo.getNomineeRelationshipInAddNominee();
		String expectedNomineeRelationship = NomineeRelationship.getAttribute("value");
		Reporter.log(expectedNomineeRelationship, true);
		nomineRepo.getNomineePriorityInAddNominee().sendKeys("low");
		nomineRepo.getNomineePhoneInAddNominee().sendKeys("8476149236");

		nomineRepo.getSubmitButtonInAddNominee().click();

		nomineRepo.getNomineeModule().click();

		WebElement referenceNomineeRelationship = driver
				.findElement(By.xpath("//td[text()='Vijay']/..//td[text()='" + expectedNomineeRelationship + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineeRelationship));
		String actualNomineeRelationship = referenceNomineeRelationship.getText();
		Reporter.log("actual Nomine Relationship is: " + actualNomineeRelationship, true);

		Assert.assertEquals(expectedNomineeRelationship, actualNomineeRelationship,
				"Nomine Relationship is not matching");
		Reporter.log("Nominee Relationship is mathching", true);

	}

}