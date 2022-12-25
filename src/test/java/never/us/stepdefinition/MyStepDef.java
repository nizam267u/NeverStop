package never.us.stepdefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.cucumber.java.en.*;
import never.us.base.BasePage;
import never.us.elementpage.ElementPageFactory;
import never.us.generic.Utility;
import never.us.generic.Waits;



public class MyStepDef extends BasePage {

	ElementPageFactory pf;

	@Given("Users already in the landing page and verify the user information on the landing page")
	public void users_already_in_the_landing_page_and_verify_the_user_information_on_the_landing_page() {

		pf = PageFactory.initElements(driver, ElementPageFactory.class);

		pf.signIn();

		log.info("User can verify the user information/Landing page..........");
		Utility.Highlighter(pf.getVerifyText());
		String actual = pf.getVerifyText().getText();
		String expected = prop.getProperty("Text");

		Waits.explicitWaits(pf.getVerifyText(), 30);
		// CommonUtility.getAssert(actual, expected);
		Assert.assertEquals(actual, expected);
	}

	@When("Users should be able to select Jupiter All-Weather Trainer jacket from men module")
	public void users_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {

		pf.menModule();

	}

	@When("Verify the jacket name Jupiter All-Weather Trainer on the list")
	public void verify_the_jacket_name_jupiter_all_weather_trainer_on_the_list() {

		log.info("User can verify/validate the Men's Jacket information..........");
		Utility.Highlighter(pf.getVerifyMenJacketSection());
		String expected = prop.getProperty("MenJacket");
		String actual = pf.getVerifyMenJacketSection().getText();

		Waits.explicitWaits(pf.getVerifyMenJacketSection(), 30);
		// CommonUtility.getAssert(actual, expected);
		Assert.assertEquals(actual, expected);

		log.info("User able to click on Jupiter all weather Jacket ..........");
		Utility.Highlighter(pf.getVerifyMenJacketSection());
		Waits.explicitWaits(pf.getVerifyMenJacketSection(), 30);
		Utility.getActionClick(pf.getVerifyMenJacketSection());

	}

	@When("User should be able to select the M and Blue and {int} then click on the add to cart")
	public void user_should_be_able_to_select_the_m_and_blue_and_then_click_on_the_add_to_cart(Integer int1) {

		log.info("User able to click on Jacket Size..........");
		Utility.Highlighter(pf.getSelectedSize());
		Waits.explicitWaits(pf.getSelectedSize(), 30);
		// CommonUtility.getActionMoveToElement(pf.getSelectedSize());
		Utility.getActionClick(pf.getSelectedSize());

		log.info("User able to select Blue color............");
		Utility.Highlighter(pf.getClickOnColor());
		Waits.explicitWaits(pf.getClickOnColor(), 30);
		Utility.getJSEClick(pf.getClickOnColor());

		log.info("User able to select jacket quantity..........");
		Utility.Highlighter(pf.getSelectedQty());
		Waits.explicitWaits(pf.getSelectedQty(), 30);
		// CommonUtility.getActionClick(pf.getSelectedQty());
		pf.getSelectedQty().clear();
		pf.getSelectedQty().sendKeys("1");

		log.info("User able to click on Add to Cart..........");
		Utility.Highlighter(pf.getClickAddToCart());
		Waits.explicitWaits(pf.getClickAddToCart(), 50);
		Utility.getActionMoveToElement(pf.getClickAddToCart());
		Utility.getJSEClick(pf.getClickAddToCart());

	}

	@When("User should be able to Click on the cart")
	public void user_should_be_able_to_click_on_the_cart() {
		log.info("User able to click on Cart..................");
		Utility.Highlighter(pf.getClickOnCart());
		Waits.explicitWaits(pf.getClickOnCart(), 30);
		Utility.getJSEClick(pf.getClickOnCart());

	}

	@When("User should be able to click on the checkout")
	public void user_should_be_able_to_click_on_the_checkout() {

		log.info("User able to click on Proceed to Checkout..................");
		Utility.Highlighter(pf.getClickOnProceedToCheckout());
		Waits.explicitWaits(pf.getClickOnProceedToCheckout(), 30);
		Utility.getJSEClick(pf.getClickOnProceedToCheckout());

	}

	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
		pf.addShippingDetails();

	}

	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
		pf.verifyAddress();

	}

	@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {
		
		 String expected = prop.getProperty("VerifyOrderNumber");
		  String actual =  pf.getVerifyOrderNumber().getText();
		  
		  log.info("User can verify/validate the order's information..........");
		  Utility.Highlighter(pf.getVerifyOrderNumber());
		  Waits.explicitWaits(pf.getVerifyOrderNumber(), 30); // Utility.getAssert(actual,
		  Assert.assertEquals(actual, expected); 

	}
}
