package com.smokeTest.cases;

import com.smokeTest.actionElement.genaretors;
import com.smokeTest.dataInputs.inputs;
import com.smokeTest.selectors.selectors;

public class checkout {
	
	public static void searchPDP() {
		genaretors.clickButtonIfExsists(selectors.closeModal);
		genaretors.sendData(selectors.search, inputs.PDPN);
		
		
		genaretors.pressButton(selectors.searchButton);
	}
	
	public static void addProductToCart() throws InterruptedException {
		genaretors.clickButtonIfExsists(selectors.closeModal);
		genaretors.clickOnRandomItem(selectors.colorOption);
		genaretors.clickButtonIfExsists(selectors.closeModal);
		Thread.sleep(2000);
		genaretors.clickOnRandomItem(selectors.sizeOption);
		Thread.sleep(2000);
		genaretors.clickButtonIfExsists(selectors.closeModal);
		genaretors.pressButton(selectors.addtoCartButton);
		genaretors.clickButtonIfExsists(selectors.closeModal);

	}
	public static void proceedCheckout() throws InterruptedException {
		Thread.sleep(2000);
		// genaretors.pressButton(selectors.closeAdToCartModal);
		genaretors.pressButton(selectors.goToCart);
		genaretors.pressButton(selectors.startCheckout);

	}


}
