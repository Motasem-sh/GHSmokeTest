package com.smokeTest.run;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.smokeTest.cases.addPDPToCart;
import com.smokeTest.cases.addPDPToGRWL;
import com.smokeTest.cases.checkout;
import com.smokeTest.cases.login;
import com.smokeTest.cases.registration;
import com.smokeTest.actionElement.genaretors;
import com.smokeTest.dataInputs.inputs;

public class runSmokeTest extends templats {
	@BeforeTest
	public void doBeforeTest() {
		genaretors.runDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		inputs.emailReg = genaretors.genareaterandomEmail();
		inputs.passwordReg = genaretors.genareaterandomPassword();
	}

	@Test(priority = 1)
	public void openURL() {
		driver.get(inputs.siteURL);

	}
///////////////////////////////////// Registration 
@Test(priority = 2)
	public void registration() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		registration.negativeRegistrationCaseStep1();
		registration.negativeRegistrationCaseStep2();
		registration.positiveRegistrationCase();
	}

	//////////////////////////////////// SignIn
	@Test(priority = 3)

	public void signIn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		login.negativeSigninCase();
		login.positiveSigninCase();
	}

///////////////////////////////////// 
	@Test(priority = 4)
	public void addToWLGR() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		genaretors.searchPDP(inputs.singlePDP);
		addPDPToGRWL.addToWL();
		addPDPToGRWL.addToGR();
	}

	@Test(priority = 5)
	public void addPDPToCart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		addPDPToCart.addSinglePDPToCart();
		genaretors.searchPDP(inputs.bundlePDP);
		addPDPToCart.addBundlePDPToCart();
		//genaretors.searchPDP(inputs.personlizedPDP);
	//	addPDPToCart.addPersonlizedToCart();
	}

	@Test(priority = 6)
	public void startCheckout() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		checkout.proceedCheckout();
	}
	
	@AfterTest
	public void exitDriver() {
		driver.close();
	}

}
