package com.smokeTest.cases;

import com.smokeTest.actionElement.genaretors;
import com.smokeTest.dataInputs.inputs;
import com.smokeTest.selectors.selectors;

public class checkout {

	//////////////////////// cart and checkout steps
	
	public static void proceedCheckout() throws InterruptedException{
		Thread.sleep(2000);
		genaretors.pressButton(selectors.continueShoppingButton);
		genaretors.pressButton(selectors.miniCartLink);
		genaretors.pressButton(selectors.startCheckout);
		Thread.sleep(2000);
		genaretors.pressButton(selectors.multipleAddress);
		Thread.sleep(2000);
		genaretors.pressButton(selectors.addNewAddress);
		genaretors.sendData(selectors.newFName, "Motasem");
		genaretors.sendData(selectors.newLName, "Shtayeh");
		genaretors.sendData(selectors.newStreet, "Broadway");
		genaretors.sendData(selectors.newCity, "New York");
		genaretors.selectFromDropDown(selectors.newState,"NY - New York");
		genaretors.sendData(selectors.newPhone, "8956784578");
		genaretors.pressButton(selectors.saveNewAddress);
		Thread.sleep(2000);

		genaretors.pressButton(selectors.toSecondStep);
		Thread.sleep(2000);

		genaretors.pressButton(selectors.toThirdStep);
		Thread.sleep(2000);

		genaretors.pressButton(selectors.toForthStep);
		Thread.sleep(3000);
		genaretors.sendData(selectors.card, inputs.card);
		genaretors.selectFromDropDown(selectors.exMonth, "4");
		genaretors.selectFromDropDown(selectors.exYear, "2022");
		genaretors.sendData(selectors.CVV, "111");
		genaretors.pressButton(selectors.placeOrder);

	}

}
