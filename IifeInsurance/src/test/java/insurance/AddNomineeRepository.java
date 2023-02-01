package insurance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddNomineeRepository{
	public AddNomineeRepository(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//
	@FindBy(linkText = "NOMINEE")
	private WebElement NomineeModule;
	
	public WebElement getNomineeModule() {
		return NomineeModule;
	}
	@FindBy(linkText = "Add Nominee")
	private WebElement AddNominee;
	
	public WebElement getAddNominee() {
		return AddNominee;
	}
	@FindBy(xpath =  "//input[@name='name']")
	private WebElement NomineeName;
	
	@FindBy(xpath =  "//input[@name='client_id']")
	private WebElement ClientIdInAddNominee;
	
	@FindBy(name = "name")
	private WebElement NomineeNameInAddNominee;
	
	@FindBy(name = "sex")
	private WebElement NomineeGenderInAddNominee;
	
	@FindBy(name = "birth_date")
	private WebElement NomineeBirthDateInAddNominee;
	
	@FindBy(name = "nid")
	private WebElement NomineeNIDInAddNominee;
	
	
	@FindBy(name = "relationship")
	private WebElement NomineeRelationshipInAddNominee;
	
	
	@FindBy(name = "priority")
	private WebElement NomineePriorityInAddNominee;
	
	@FindBy(name = "phone")
	private WebElement NomineePhoneInAddNominee;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement SubmitButtonInAddNominee;
	
	//nominee_id
	@FindBy(name = "nominee_id")
	private WebElement nominee_idInAddNomiee;

	public WebElement getNominee_idInAddNomiee() {
		return nominee_idInAddNomiee;
	}

	public WebElement getNomineeName() {
		return NomineeName;
	}

	public WebElement getClientIdInAddNominee() {
		return ClientIdInAddNominee;
	}

	public WebElement getNomineeNameInAddNominee() {
		return NomineeNameInAddNominee;
	}

	public WebElement getNomineeGenderInAddNominee() {
		return NomineeGenderInAddNominee;
	}

	public WebElement getNomineeBirthDateInAddNominee() {
		return NomineeBirthDateInAddNominee;
	}

	public WebElement getNomineeNIDInAddNominee() {
		return NomineeNIDInAddNominee;
	}

	public WebElement getNomineeRelationshipInAddNominee() {
		return NomineeRelationshipInAddNominee;
	}

	public WebElement getNomineePriorityInAddNominee() {
		return NomineePriorityInAddNominee;
	}

	public WebElement getNomineePhoneInAddNominee() {
		return NomineePhoneInAddNominee;
	}

	public WebElement getSubmitButtonInAddNominee() {
		return SubmitButtonInAddNominee;
	}
	
	
	//
}