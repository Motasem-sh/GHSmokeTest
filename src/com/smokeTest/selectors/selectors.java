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
	 public static By continueButton=By.id("continue");
	 public static By regFname=By.id("bill_fnbox");
	 public static By regsLname=By.id("bill_lnbox");
	 public static By comp = By.id("bill_cnbox");
	 public static By street = By.id("bill_sa1box");
	 public static By city = By.id ("bill_citybox");
	 public static By state= By.id ("bill_region");
	 public static By zipCode= By.id ("bill_zipbox");
	 public static By phone = By.id("bill_phone1box");
	 public static By saveButton = By.cssSelector("#gwt_billshipaddr_btn > button");
	 public static By logonButton = By.id("logonButton");
	 public static By incorrectmessage =By.id("gwt-error-placement-div");
	 public static By errorZipCode = By.id("error-div-bill_country-name-bill_region-bill_zipbox");
	 
	 
	 //////////////////////////////////////////////////////////////////////////////////
	 
	 
	 public static By logo = By.cssSelector("#logoline > div.logos");
	 public static By closeModal = By.id("Close3-Item112");
	 public static By search = By.id("headerBox");
	 public static By searchButton = By.id("searchButton");
	 public static By colorOption = By.className("gwt-image-picker-option");
	 public static By sizeOption =  By.className("gwt-selection-chip-picker-option");
	 public static By  addtoCartButton = By.cssSelector("div.gwt-product-detail-buttons-container > button.button.primary");
	// public static By closeAdToCartModal = By.className("gwt-Button ok-cancel-close-btn");
	 public static By goToCart = By.cssSelector(" #cbiBody > div.gwt-DialogBox.ok-cancel-dlog.gwt_addtocart_div > div > table > tbody > tr.dialogMiddle > td.dialogMiddleCenter > div > table > tbody > tr:nth-child(3) > td > div > button.button.primary");
	 public static By startCheckout = By.cssSelector("div.bottom-checkout-buttons > div > button"); 


}
