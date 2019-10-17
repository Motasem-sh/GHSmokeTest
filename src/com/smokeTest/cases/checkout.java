package com.smokeTest.cases;

import com.smokeTest.actionElement.genaretors;
import com.smokeTest.selectors.selectors;

public class checkout {

	////////////////////////// Search on PDP

	public static void searchPDP(String PDPNummber) {
		genaretors.clickButtonIfExsists(selectors.closeModal);
		genaretors.sendData(selectors.search, PDPNummber);
		genaretors.pressButton(selectors.searchButton);
	}

	///////////////////////////// Select swatches and add PDP to cart

	public static void addSinglePDPToCart() throws InterruptedException {
		genaretors.clickButtonIfExsists(selectors.closeModal);
		genaretors.clickOnRandomItem(selectors.colorOption);
		genaretors.clickButtonIfExsists(selectors.closeModal);
		Thread.sleep(2000);
		genaretors.clickOnRandomItem(selectors.sizeOption);
		Thread.sleep(2000);
		genaretors.clickButtonIfExsists(selectors.closeModal);
		genaretors.pressButton(selectors.addtoCartButton);
		genaretors.clickButtonIfExsists(selectors.closeModal);
		Thread.sleep(2000);
		genaretors.pressButton(selectors.continueShoppingButton);

	}
	
	public static void addBundlePDPToCart() throws InterruptedException {
		Thread.sleep(2000);
		genaretors.pressButton(selectors.colorBundleOption);
		genaretors.pressButton(selectors.sizeOption);
		Thread.sleep(2000);
		genaretors.pressButton(selectors.addBundleButton);

	}

	//////////////////////// cart and checkout steps
	
	public static void proceedCheckout() throws InterruptedException {
		Thread.sleep(2000);
		genaretors.pressButton(selectors.continueShoppingButton);
		genaretors.pressButton(selectors.miniCartLink);
		genaretors.pressButton(selectors.startCheckout);

	}

}
