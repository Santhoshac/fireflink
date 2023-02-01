package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_014 extends Basepage {
	// Comparing NOminee Gender in Add Nominee
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		AddNomineeRepository nomineRepo = new AddNomineeRepository(driver);
		nomineRepo.getNomineeModule().click();
		nomineRepo.getAddNominee().click();
		nomineRepo.getClientIdInAddNominee().sendKeys("84644346");
		nomineRepo.getNomineeName().sendKeys("Sanjit");
		nomineRepo.getNomineeGenderInAddNominee().sendKeys("Male");
		WebElement NomineeGender = nomineRepo.getNomineeGenderInAddNominee();
		String expectedNomineeGender = NomineeGender.getAttribute("value");
		Reporter.log(expectedNomineeGender, true);
		nomineRepo.getNomineeBirthDateInAddNominee().sendKeys("03-05-1999");
		nomineRepo.getNomineeNIDInAddNominee().sendKeys("486543647");
		nomineRepo.getNomineeRelationshipInAddNominee().sendKeys("Married");
		nomineRepo.getNomineePriorityInAddNominee().sendKeys("low");
		nomineRepo.getNomineePhoneInAddNominee().sendKeys("8476149236");

		nomineRepo.getSubmitButtonInAddNominee().click();

		nomineRepo.getNomineeModule().click();

		WebElement referenceNomineeGender = driver
				.findElement(By.xpath("//td[text()='Sanjit']/..//td[text()='" + expectedNomineeGender + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineeGender));
		String actualNomineeGender = referenceNomineeGender.getText();
		Reporter.log("actual Nomine eName is: " + actualNomineeGender, true);

		Assert.assertEquals(expectedNomineeGender, actualNomineeGender, "Nomine Gender is not matching");
		Reporter.log("Nominee Gender is mathching", true);

	}

}