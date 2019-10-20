package com.smokeTest.cases;

import com.smokeTest.actionElement.genaretors;
import com.smokeTest.dataInputs.inputs;
import com.smokeTest.run.templats;
import com.smokeTest.selectors.selectors;

public class registration extends templats {

	///////////////////////////////// Registration negative case in step1

	public static void negativeRegistrationCaseStep1() throws InterruptedException {
		genaretors.pressButton(selectors.loginLink);
		Thread.sleep(3000);
		//genaretors.waitForWelcomeModal();
		genaretors.clickButtonIfExsists(selectors.closeModal);
		genaretors.pressButton(selectors.createAccountButton);
		Thread.sleep(3000);
		//genaretors.waitForWelcomeModal();
		genaretors.clickButtonIfExsists(selectors.closeModal);
		genaretors.sendData(selectors.username, inputs.email);
		genaretors.sendData(selectors.reEmail, inputs.email);
		genaretors.sendData(selectors.userPasswor, inputs.passwordtest);
		genaretors.sendData(selectors.rePassword, inputs.passwordtest);
		genaretors.pressButton(selectors.continueButton);
		Thread.sleep(2000);
		inputs.errorState = genaretors.getData(selectors.incorrectmessage);
		if (inputs.emailExist.equals(inputs.errorState)) {
			driver.findElement(selectors.username).clear();
			driver.findElement(selectors.reEmail).clear();
			driver.findElement(selectors.userPasswor).clear();
			driver.findElement(selectors.rePassword).clear();
			System.out.println("Can't signup successfully");
		}

	}
	///////////////////////////////// Registration negative case in step2

	public static void negativeRegistrationCaseStep2() throws InterruptedException {
		genaretors.sendData(selectors.username, inputs.emailReg);
		genaretors.sendData(selectors.reEmail, inputs.emailReg);
		genaretors.sendData(selectors.userPasswor, inputs.passwordReg);
		genaretors.sendData(selectors.rePassword, inputs.passwordReg);
		genaretors.pressButton(selectors.continueButton);
		genaretors.sendData(selectors.regFname, inputs.fName);
		genaretors.sendData(selectors.regsLname, inputs.lName);
		genaretors.sendData(selectors.comp, inputs.company);
		genaretors.sendData(selectors.street, inputs.streetAddress);
		genaretors.sendData(selectors.city, inputs.city);
		genaretors.selectFromDropDown(selectors.state, inputs.wrongState);
		genaretors.sendData(selectors.zipCode, inputs.zipCode);
		genaretors.sendData(selectors.phone, inputs.phone);
		genaretors.pressButton(selectors.saveButton);
		Thread.sleep(2000);
		inputs.errorState = genaretors.getData(selectors.errorZipCode);
		if (inputs.errorZipCodeState.equals(inputs.errorState)) {
			System.out.println("Can't signup successfully");
			driver.navigate().refresh();
		}
	}
///////////////////////////////// Registration positive case

	public static void positiveRegistrationCase() throws InterruptedException {
		genaretors.sendData(selectors.username, inputs.emailReg);
		genaretors.sendData(selectors.reEmail, inputs.emailReg);
		genaretors.sendData(selectors.userPasswor, inputs.passwordReg);
		genaretors.sendData(selectors.rePassword, inputs.passwordReg);
		genaretors.pressButton(selectors.continueButton);
		genaretors.sendData(selectors.regFname, inputs.fName);
		genaretors.sendData(selectors.regsLname, inputs.lName);
		genaretors.sendData(selectors.comp, inputs.company);
		genaretors.sendData(selectors.street, inputs.streetAddress);
		genaretors.sendData(selectors.city, inputs.city);
		genaretors.selectFromDropDown(selectors.state, inputs.state);
		genaretors.sendData(selectors.zipCode, inputs.zipCode);
		genaretors.sendData(selectors.phone, inputs.phone);
		genaretors.pressButton(selectors.saveButton);
		Thread.sleep(3000);
		genaretors.pressButton(selectors.loginLink);
	}

}
