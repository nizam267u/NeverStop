package never.us.elementpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import never.us.base.BasePage;
import never.us.generic.Utility;
import never.us.generic.Waits;


public class ElementPageFactory extends BasePage {

	public ElementPageFactory() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement ClickSignInBtN;

	public WebElement getClickSignInBtN() {
		return ClickSignInBtN;
	}

	@FindBy(id = "email")
	@CacheLookup
	private WebElement EnterUserName;

	public WebElement getEnterUserName() {
		return EnterUserName;
	}

	@FindBy(id = "pass")
	@CacheLookup
	private WebElement EnterPWD;

	public WebElement getEnterPWD() {
		return EnterPWD;
	}

	@FindBy(xpath = "//*[@class='action login primary']/span")
	@CacheLookup
	private WebElement ClickLogIn;

	public WebElement getClickLogIn() {
		return ClickLogIn;
	}

	@FindBy(xpath = "(//*[contains(text(),'Welcome, Smart Tech!')])[1]")
	@CacheLookup
	private WebElement VerifyText;

	public WebElement getVerifyText() {
		return VerifyText;
	}

	@FindBy(xpath = "(//*[contains(text(),'Men')])[2]")
	@CacheLookup
	private WebElement ClickOnMen;

	public WebElement getClickOnMen() {
		return ClickOnMen;
	}

	@FindBy(xpath = "(//*[contains(text(),'Tops')])[2]")
	@CacheLookup
	private WebElement ClickOnTops;

	public WebElement getClickOnTops() {
		return ClickOnTops;
	}

	@FindBy(xpath = "(//*[contains(text(),'Jackets')])[2]")
	@CacheLookup
	private WebElement ClickOnJacket;

	public WebElement getClickOnJacket() {
		return ClickOnJacket;
	}

	@FindBy(xpath = "(//*[@class='product-item-link'])[3]")
	@CacheLookup
	private WebElement VerifyMenJacketSection;

	public WebElement getVerifyMenJacketSection() {
		return VerifyMenJacketSection;
	}

	@FindBy(xpath = "//*[@aria-label='M']")
	@CacheLookup
	private WebElement SelectedSize;

	public WebElement getSelectedSize() {
		return SelectedSize;
	}

	@FindBy(xpath = "//*[@id='option-label-color-93-item-50']")
	@CacheLookup
	private WebElement ClickOnColor;

	public WebElement getClickOnColor() {
		return ClickOnColor;
	}

	@FindBy(xpath = "//*[@id='qty']")
	@CacheLookup
	private WebElement SelectedQty;

	public WebElement getSelectedQty() {
		return SelectedQty;
	}

	@FindBy(xpath = "//*[@title='Add to Cart']/span")
	@CacheLookup
	private WebElement ClickAddToCart;

	public WebElement getClickAddToCart() {
		return ClickAddToCart;
	}

	@FindBy(xpath = "//*[text()='shopping cart']")
	@CacheLookup
	private WebElement ClickOnCart;

	public WebElement getClickOnCart() {
		return ClickOnCart;
	}

	@FindBy(xpath = "(//*[text()='Proceed to Checkout'] )[2]")
	@CacheLookup
	private WebElement ClickOnProceedToCheckout;

	public WebElement getClickOnProceedToCheckout() {
		return ClickOnProceedToCheckout;
	}

	@FindBy(xpath = "//*[@class='action action-show-popup']/span")
	@CacheLookup
	private WebElement ClickOnNewAddress;

	public WebElement getClickOnNewAddress() {
		return ClickOnNewAddress;
	}

	@FindBy(xpath = "//*[@name='firstname']")
	@CacheLookup
	private WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}

	@FindBy(xpath = "//*[@name='lastname']")
	@CacheLookup
	private WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}

	@FindBy(xpath = "(//input[@class='input-text'])[9]")
	@CacheLookup
	private WebElement StreetAddress;

	public WebElement getStreetAddress() {
		return StreetAddress;
	}

	@FindBy(xpath = "(//input[@class='input-text'])[12]")
	@CacheLookup
	private WebElement CityName;

	public WebElement getCityName() {
		return CityName;
	}

	@FindBy(xpath = "(//*[@class='select'])[1]")
	@CacheLookup
	private WebElement StateName;

	public WebElement getStateName() {
		return StateName;
	}

	/*
	 * @FindBy(xpath = "(//*[@class='select'])[1]")
	 * 
	 * @CacheLookup private List<WebElement> StatesNameList;
	 * 
	 * public List<WebElement> getStatesNameList() { return StatesNameList; }
	 */

	@FindBy(xpath = "(//input[@class='input-text'])[14]")
	@CacheLookup
	private WebElement ZipCode;

	public WebElement getZipCode() {
		return ZipCode;
	}

	@FindBy(xpath = "(//*[@class='select'])[2]")
	@CacheLookup
	private WebElement CountryName;

	public WebElement getCountryName() {
		return CountryName;
	}

	@FindBy(xpath = "(//input[@class='input-text'])[15]")
	@CacheLookup
	private WebElement PhoneNumber;

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	@FindBy(xpath = "//*[@class='action primary action-save-address']/span")
	@CacheLookup
	private WebElement ShipHere;

	public WebElement getShipHere() {
		return ShipHere;
	}

	@FindBy(xpath = "//*[@name='ko_unique_3']")
	@CacheLookup
	private WebElement SelectRadioBTN;

	public WebElement getSelectRadioBTN() {
		return SelectRadioBTN;
	}

	@FindBy(xpath = "//button[@class='button action continue primary']")
	@CacheLookup
	private WebElement ClickOnNext;

	public WebElement getClickOnNext() {
		return ClickOnNext;
	}

	@FindBy(xpath = "//*[text()='Payment Method']")
	@CacheLookup
	private WebElement VerifyShippingAddress;

	public WebElement getVerifyShippingAddress() {
		return VerifyShippingAddress;
	}

	@FindBy(xpath = "//*[text()='Place Order']")
	@CacheLookup
	private WebElement ClickOnPlaceOrder;

	public WebElement getClickOnPlaceOrder() {
		return ClickOnPlaceOrder;
	}

	@FindBy(xpath = "//*[text()='Thank you for your purchase!']")
	@CacheLookup
	private WebElement VerifyOrderNumber;

	public WebElement getVerifyOrderNumber() {
		return VerifyOrderNumber;
	}

	public void signIn() {

		log.info("User able to click on SignIn Button.............");
		Utility.Highlighter(getClickSignInBtN());
		Waits.explicitWaits(getClickSignInBtN(), 30);
		Utility.getActionClick(getClickSignInBtN());

		log.info("User able to enter the email address............");
		Utility.Highlighter(getEnterUserName());
		Waits.explicitWaits(getEnterUserName(), 30);
		getEnterUserName().sendKeys(prop.getProperty("Email"));

		log.info("User able to enter the PWD.....................");
		Utility.Highlighter(getEnterPWD());
		Waits.explicitWaits(getEnterPWD(), 30);
		getEnterPWD().sendKeys(prop.getProperty("Password"));

		log.info("User able to click on SignIn button............");
		Utility.Highlighter(getClickLogIn());
		Waits.explicitWaits(getClickLogIn(), 30);
		Utility.getActionClick(getClickLogIn());
	}

	public void menModule() {
		log.info("User able to click on Men Module............");
		Utility.Highlighter(getClickOnMen());
		Waits.explicitWaits(getClickOnMen(), 30);
		Utility.getActionMoveToElement(getClickOnMen());

		log.info("User able to MouseHover on Tops..........");
		Utility.Highlighter(getClickOnTops());
		Waits.explicitWaits(getClickOnTops(), 30);
		Utility.getActionMoveToElement(getClickOnTops());

		log.info("User able to MouseHover and click on Jacket..........");
		Utility.Highlighter(getClickOnJacket());
		Waits.explicitWaits(getClickOnJacket(), 30);
		Utility.getActionClick(getClickOnJacket());

	}

	public void addShippingDetails() {
		log.info("User able to enter New Address......................");
		Utility.Highlighter(getClickOnNewAddress());
		Waits.explicitWaits(getClickOnNewAddress(), 30);
		Utility.getJSEClick(getClickOnNewAddress());

		log.info("User able to enter first name......................");
		Utility.Highlighter(getFirstName());
		getFirstName().clear();
		Waits.explicitWaits(getFirstName(), 30);
		getFirstName().sendKeys("Smart");

		log.info("User able to enter Last name......................");
		Utility.Highlighter(getLastName());
		getLastName().clear();
		Waits.explicitWaits(getLastName(), 30);
		getLastName().sendKeys("Tech");

		log.info("User able to enter Street address.................");
		Utility.Highlighter(getStreetAddress());
		getStreetAddress().clear();
		Waits.explicitWaits(getStreetAddress(), 30);
		Utility.getActionClick(getStreetAddress());
		getStreetAddress().sendKeys("123 Smartteck Square");

		log.info("User able to enter City Name .....................");
		Utility.Highlighter(getCityName());
		getCityName().clear();
		Waits.explicitWaits(getCityName(), 30);
		Utility.getActionClick(getCityName());
		getCityName().sendKeys("Queens");

		log.info("User able to enter State Name ....................");
		Utility.Highlighter(getStreetAddress());
		// CommonUtility.getActionMoveToElement(getStateName());
		Waits.explicitWaits(getStateName(), 30);
		// CommonUtility.getSelectValue(getStateName(), "New York");
		Utility.getSelectValue(getStateName(), "New York");

		log.info("User able to enter Zipcode .......................");
		Utility.Highlighter(getStreetAddress());
		getZipCode().clear();
		Waits.explicitWaits(getZipCode(), 30);
		getZipCode().sendKeys("11423");

		log.info("User able to enter Country Name ..................");
		Utility.Highlighter(getCountryName());
		Waits.explicitWaits(getCountryName(), 30);
		Utility.getSelectValue(getCountryName(), "United States");

		log.info("User able to enter Phone Number ..................");
		Utility.Highlighter(getPhoneNumber());
		getPhoneNumber().clear();
		Waits.explicitWaits(getPhoneNumber(), 30);
		getPhoneNumber().sendKeys("347-969-2511");

		log.info("User able to click on Ship Here ..................");
		Utility.Highlighter(getShipHere());
		Waits.explicitWaits(getShipHere(), 30);
		Utility.getActionClick(getShipHere()); 

		log.info("User able to select the radio button...............");
		Utility.Highlighter(getSelectRadioBTN());
		Waits.explicitWaits(getSelectRadioBTN(), 30);
		//Utility.getScrollDownWithActionClass();
		Utility.selectRadioButton(getSelectRadioBTN());

		log.info("User able to click on Next button ..................");
		Utility.Highlighter(getClickOnNext());
		Waits.explicitWaits(getClickOnNext(), 30);
		Utility.getJSEClick(getClickOnNext());
	}

	public void verifyAddress() {

		/*
		 * String expected = prop.getProperty("VerifyAddress"); String actual =
		 * getVerifyShippingAddress().getText();
		 *  
		 * log.info("User can verify/validate the Men's Jacket information..........");
		 * Waits.explicitWaits(getVerifyShippingAddress(), 30); 
		 * CommonUtility.getAssert(actual, expected); Assert.assertEquals(actual,
		 * expected);
		 */

		log.info("User able to click on Proceed to Checkout..................");
		Utility.Highlighter(getClickOnPlaceOrder());
		Waits.explicitWaits(getClickOnPlaceOrder(), 30);
		Utility.getJSEClick(getClickOnPlaceOrder());
	}

}
