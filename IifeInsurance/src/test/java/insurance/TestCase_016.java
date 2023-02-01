package insurance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_016 extends Basepage {
	// Comparing NOminee Priority in Add Nominee
	@Test
	public void addClient() {
		login("555", "666");
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		AddNomineeRepository nomineRepo = new AddNomineeRepository(driver);
		nomineRepo.getNomineeModule().click();
		nomineRepo.getAddNominee().click();
		nomineRepo.getClientIdInAddNominee().sendKeys("84644346");
		nomineRepo.getNomineeName().sendKeys("Hardik");
		nomineRepo.getNomineeGenderInAddNominee().sendKeys("Male");
		nomineRepo.getNomineeBirthDateInAddNominee().sendKeys("03-05-1999");
		nomineRepo.getNomineeNIDInAddNominee().sendKeys("486543647");
		nomineRepo.getNomineeRelationshipInAddNominee().sendKeys("Married");
		nomineRepo.getNomineePriorityInAddNominee().sendKeys("low");

		WebElement NomineePriority = nomineRepo.getNomineePriorityInAddNominee();
		String expectedNomineePriority = NomineePriority.getAttribute("value");
		Reporter.log(expectedNomineePriority, true);
		nomineRepo.getNomineePhoneInAddNominee().sendKeys("8476149236");

		nomineRepo.getSubmitButtonInAddNominee().click();

		nomineRepo.getNomineeModule().click();

		WebElement referenceNomineePriority = driver
				.findElement(By.xpath("//td[text()='Hardik']/..//td[text()='" + expectedNomineePriority + "']"));
		explicitwait.until(ExpectedConditions.visibilityOf(referenceNomineePriority));
		String actualNomineePriority = referenceNomineePriority.getText();
		Reporter.log("actual Nomine Relationship is: " + actualNomineePriority, true);

		Assert.assertEquals(expectedNomineePriority, actualNomineePriority, "Nomine Priority is not matching");
		Reporter.log("Nominee Priority is mathching", true);

	}

}