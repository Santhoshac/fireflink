package insurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WebElementRepository {
	public WebElementRepository(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "CLIENTS")
	private WebElement ClientModule;

	@FindBy(partialLinkText = "Add Client")
	private WebElement AddClient;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement Name;

	@FindBy(xpath = "//input[@name='sex']")
	private WebElement Gender;

	@FindBy(xpath = "//input[@name='birth_date']")
	private WebElement BirthDate;

	

	@FindBy(xpath = "//input[@name='nid']")
	private WebElement NID;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='policy_id']")
	private WebElement policy_id;

	@FindBy(xpath = "//input[@name='nominee_name']")
	private WebElement nominee_name;

	@FindBy(xpath = "//input[@name='nominee_sex']")
	private WebElement nominee_sex;

	@FindBy(xpath = "//input[@name='nominee_birth_date']")
	private WebElement nominee_birth_date;

	@FindBy(xpath = "//input[@name='nominee_nid']")
	private WebElement nominee_nid;

	@FindBy(xpath = "//input[@name='nominee_relationship']")
	private WebElement nominee_relationship;

	@FindBy(xpath = "//input[@name='priority']")
	private WebElement priority;

	@FindBy(xpath = "//input[@name='nominee_phone']")
	private WebElement nominee_phone;

	@FindBy(xpath = "//input[@type ='submit']")
	private WebElement submit;

	@FindBy(xpath = "(//td[text() ='1674620131'])/.././/a[text()='Edit']")
	private WebElement ParticularClientEditOption;

	@FindBy(name = "client_password")
	private WebElement clientpasswordtextefield;

	@FindBy(name = "fileToUpload")
	private WebElement fileuploadbutton;
	@FindBy(name = "client_id")
	private WebElement clientidtextfield;
	
	@FindBy(xpath = "//input[@name='maritial_status']")
	private WebElement Marital_Status;
	
	public WebElement getNomineeModule() {
		return NomineeModule;
	}

	@FindBy(name = "agent_id")
	private WebElement agentid;
	
	@FindBy(xpath = "//a[text()='NOMINEE']")
	private WebElement NomineeModule;
	
	@FindBy(name = "nominee_id")
	private WebElement nominee_id;


	public WebElement getNominee_id() {
		return nominee_id;
	}

	public WebElement getAgentid() {
		return agentid;
	}

	public WebElement getMarital_Status() {
		return Marital_Status;
	}

	public WebElement getClientidtextfield() {
		return clientidtextfield;
	}

	public WebElement getFileuploadbutton() {
		return fileuploadbutton;
	}

	public WebElement getClientpasswordtextefield() {
		return clientpasswordtextefield;
	}

	public WebElement getClientModule() {
		return ClientModule;
	}

	public WebElement getAddClient() {
		return AddClient;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getBirthDate() {
		return BirthDate;
	}

	public WebElement getNID() {
		return NID;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPolicy_id() {
		return policy_id;
	}

	public WebElement getNominee_name() {
		return nominee_name;
	}

	public WebElement getNominee_sex() {
		return nominee_sex;
	}

	public WebElement getNominee_birth_date() {
		return nominee_birth_date;
	}

	public WebElement getNominee_nid() {
		return nominee_nid;
	}

	public WebElement getNominee_relationship() {
		return nominee_relationship;
	}

	public WebElement getPriority() {
		return priority;
	}

	public WebElement getNominee_phone() {
		return nominee_phone;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getParticularClientEditOption() {
		return ParticularClientEditOption;

	}
	
	
	
	
			
}