package com.smokeTest.cases;

import com.smokeTest.actionElement.genaretors;
import com.smokeTest.dataInputs.inputs;
import com.smokeTest.run.templats;
import com.smokeTest.selectors.selectors;

public class login extends templats {

	/////////////////////////////////// negative login

	public static void negativeSigninCase() throws InterruptedException {
		genaretors.pressButton(selectors.loginLink);
		genaretors.sendData(selectors.username, "mm@mm.nn");
		genaretors.sendData(selectors.userPasswor, "1234567a");
		genaretors.pressButton(selectors.logonButton);
		Thread.sleep(2000);
		inputs.errorState = genaretors.getData(selectors.incorrectmessage);
		if (inputs.inCorrectEmail.equals(inputs.errorState)) {
			driver.findElement(selectors.username).clear();
			System.out.println("Can't logon successfully");
		}

	}

	////////////////////////////////// positive login

	public static void positiveSigninCase() {
		genaretors.sendData(selectors.username,inputs.emailReg);
		genaretors.sendData(selectors.userPasswor,inputs.passwordReg);
		genaretors.pressButton(selectors.logonButton);
	}

}
