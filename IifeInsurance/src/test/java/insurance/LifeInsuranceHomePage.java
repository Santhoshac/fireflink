package insurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeInsuranceHomePage {
	public LifeInsuranceHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPaymentslink() {
		return paymentslink;
	}

	public WebElement getAddpaymentsbutton() {
		return addpaymentsbutton;
	}

	public WebElement getAbceditlink() {
		return abceditlink;
	}

	public WebElement getPaymentinforecieptnotextfield() {
		return paymentinforecieptnotextfield;
	}

	public WebElement getPaymentsclientidtextfield() {
		return paymentsclientidtextfield;
	}

	public WebElement getMonthtextfield() {
		return monthtextfield;
	}

	public WebElement getAmounttextfield() {
		return amounttextfield;
	}

	public WebElement getDuetextfield() {
		return duetextfield;
	}

	public WebElement getFinetextfield() {
		return finetextfield;
	}

	public WebElement getAgentidtextfiel() {
		return agentidtextfiel;
	}

	public WebElement getUpdatebutton() {
		return updatebutton;
	}

	public WebElement getDeletelinktextfield() {
		return deletelinktextfield;
	}

	public WebElement getAddpaymentrecieptnumbertextfield() {
		return addpaymentrecieptnumbertextfield;
	}

	public WebElement getAddpaymentclientidtextfield() {
		return addpaymentclientidtextfield;
	}

	public WebElement getAddpaymentmonttextfield() {
		return addpaymentmonttextfield;
	}

	public WebElement getAddpaymentamounttextfield() {
		return addpaymentamounttextfield;
	}

	public WebElement getAddpaymentduetextfield() {
		return addpaymentduetextfield;
	}

	public WebElement getAddpaymentsdinetextfield() {
		return addpaymentsdinetextfield;
	}

	public WebElement getAddpaymentsagentidtextfield() {
		return addpaymentsagentidtextfield;
	}

	public WebElement getAddpaymentssubmitbutton() {
		return addpaymentssubmitbutton;
	}

	public WebElement getClientsbutton() {
		return clientsbutton;
	}

	public WebElement getClientseditlink() {
		return clientseditlink;
	}
	

	@FindBy(xpath = "//a[text()='PAYMENTS']")
	private WebElement paymentslink;
	@FindBy(linkText = "Add Payment")
	private WebElement addpaymentsbutton;
	@FindBy(xpath = "//td[text()='123123123']/..//a[text()='Edit']")
	private WebElement abceditlink;
	@FindBy(name = "recipt_no")
	private WebElement paymentinforecieptnotextfield;
	@FindBy(name = "client_id")
	private WebElement paymentsclientidtextfield;
	@FindBy(name = "month")
	private WebElement monthtextfield;
	@FindBy(name = "amount")
	private WebElement amounttextfield;
	@FindBy(name = "due")
	private WebElement duetextfield;
	@FindBy(name = "fine")
	private WebElement finetextfield;
	@FindBy(name = "agent_id")
	private WebElement agentidtextfiel;
	@FindBy(xpath = "//input[@value='UPDATE']")
	private WebElement updatebutton;
	@FindBy(linkText = "Delete Payment")
	private WebElement deletelinktextfield;
	@FindBy(name = "recipt_no")
	private WebElement addpaymentrecieptnumbertextfield;
	@FindBy(name = "client_id")
	private WebElement addpaymentclientidtextfield;
	@FindBy(name = "month")
	private WebElement addpaymentmonttextfield;
	@FindBy(name = "amount")
	private WebElement addpaymentamounttextfield;
	@FindBy(name = "due")
	private WebElement addpaymentduetextfield;
	@FindBy(name = "fine")
	private WebElement addpaymentsdinetextfield;
	@FindBy(name = "agent_id")
	private WebElement addpaymentsagentidtextfield;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement addpaymentssubmitbutton;
	@FindBy(xpath = "//a[text()='CLIENTS']")
	private WebElement clientsbutton;
	@FindBy(xpath = "//td[text()='123123123']/..//a[text()='Edit']")
	private WebElement clientseditlink;

	
}
