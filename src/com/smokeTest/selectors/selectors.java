package com.smokeTest.selectors;

import org.openqa.selenium.By;

public class selectors {
	/////////////////////////////////////////// Sign in, SignUp selectors

	public static By loginLink = By.id("login");
	public static By createAccountButton = By.cssSelector("#userLogonRegistration > div.registration > div > button");
	public static By username = By.id("logonId");
	public static By reEmail = By.id("verifyLogonId");
	public static By userPasswor = By.id("logonPassword");
	public static By rePassword = By.id("logonPasswordVerify");
	public static By continueButton = By.id("continue");
	public static By regFname = By.id("bill_fnbox");
	public static By regsLname = By.id("bill_lnbox");
	public static By comp = By.id("bill_cnbox");
	public static By street = By.id("bill_sa1box");
	public static By city = By.id("bill_citybox");
	public static By state = By.id("bill_region");
	public static By zipCode = By.id("bill_zipbox");
	public static By phone = By.id("bill_phone1box");
	public static By saveButton = By.cssSelector("#gwt_billshipaddr_btn > button");
	public static By logonButton = By.id("logonButton");
	public static By incorrectmessage = By.id("gwt-error-placement-div");
	public static By errorZipCode = By.id("error-div-bill_country-name-bill_region-bill_zipbox");

	////////////////////////////////////////////////////////////////////////////////// PDP

	public static By logo = By.cssSelector("#logoline > div.logos");
	public static By welcomeModal = By.cssSelector("#fcopt_form_35642");
	public static By closeModal = By.cssSelector("#Close4-Item111 > button");
	public static By search = By.id("headerBox");
	public static By searchButton = By.id("searchButton");
	public static By selectItem = By.cssSelector("div.bundle-select-items-btn-container > div > button");
	public static By colorOption = By.className("gwt-image-picker-option");
	public static By sizeOption = By.className("gwt-selection-chip-picker-option");
	public static By addtoCartButton = By.cssSelector("div.gwt-product-detail-buttons-container > button.button.primary");
	public static By colorBundleOption = By.cssSelector("#gwt-option-panel > div.gwt-price-grouped-option-picker.clearfix > div.enabled.gwt-product-option-panel-swatchbox > div.gwt-product-option-panel-widget-panel > div > div > div:nth-child(1) > img");
	public static By addBundleButton = By.id("gwt-add-to-cart-btn");
	public static By continueShoppingButton = By.cssSelector("td > div > button.button.secondary");
	public static By personlizedLink = By.cssSelector("div.gwt-HTML.hyper-label.gwt-personalize-link-style");
	public static By pesonlizedFirst = By.id("First (or only) Word|11-option");
	public static By pesonlizedSecond = By.id("Second Word (or leave blank)|21-option");
	public static By savePersonlized = By.cssSelector("div.gwt-submit-cancel-dialog-button-panel > button.button.primary");
	public static By addPersonlizedButton = By.cssSelector("div.gwt-product-detail-buttons-panel > div:nth-child(1) > button");
	public static By miniCartLink = By.id("gwt_minicart_div");
	
	///////////////// Checkout
	
	public static By startCheckout = By.cssSelector("#shopping-cart-v2-root > div > div.main-panel > div.right-main-panel > div.order-summary > div.checkout-buttons-container > div.secure-checkout-button-holder > button");
	public static By multipleAddress = By.cssSelector("table > tbody > tr > td:nth-child(3) > div > div");
	public static By addNewAddress = By.cssSelector("#multiAddressContainer > div:nth-child(2) > div.order-item-address-panel-v2 > div.address-buttons-panel > button");
	public static By newFName = By.id("176416055_fnbox");
	public static By newLName = By.id("176416055_lnbox");
	public static By newStreet= By.id("176416055_sa1box");
	public static By newZipCode = By.id("176416055_zipbox");
	public static By newCity = By.id("176416055_citybox");
	public static By newState= By.id("176416055_region");
	public static By newPhone = By.id("176416055_phone1box");
	public static By saveNewAddress = By.cssSelector(" td > div > button.button.primary");
	public static By toSecondStep = By.cssSelector("div.next-botton-panel > button");
	public static By toThirdStep = By.cssSelector("div.gwt-accordion-tab-content.tabopen > div > div > div > div > div.next-botton-panel > button");
	public static By toForthStep = By.cssSelector("div.gwt-accordion.checkout-steps.tabopen > div:nth-child(3) > div.gwt-accordion-tab-content.tabopen > div > div > div > div.next-botton-panel > button");
	public static By card = By.id("accountcc");
	public static By exMonth = By.id("exp-month");
	public static By exYear = By.id("exp-year");
	public static By CVV = By.id("security-id");
	public static By placeOrder = By.cssSelector("div.place-order-panel > button");
}
