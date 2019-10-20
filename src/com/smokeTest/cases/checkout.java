package com.smokeTest.cases;

import com.smokeTest.actionElement.genaretors;
import com.smokeTest.selectors.selectors;

public class checkout {

	////////////////////////// Search on PDP

	public static void searchPDP(String PDPNummber) {
		genaretors.sendData(selectors.search, PDPNummber);
		genaretors.pressButton(selectors.searchButton);
	}




	//////////////////////// cart and checkout steps
	
	public static void proceedCheckout() throws InterruptedException {
		Thread.sleep(2000);
		genaretors.pressButton(selectors.continueShoppingButton);
		genaretors.pressButton(selectors.miniCartLink);
		genaretors.pressButton(selectors.startCheckout);

	}

}
