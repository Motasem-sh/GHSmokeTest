package com.smokeTest.actionElement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.smokeTest.run.templats;
import com.smokeTest.selectors.selectors;

public class genaretors extends templats {
	public static void runDriver() {

		{
			System.setProperty("webdriver.chrome.driver", "src\\com\\smokeTest\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		}
	}

	
	public static void waitForWelcomeModal(){
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectors.welcomeModal));
		element.click();
		
	}
//////////////////////////press on buttons

	public static void pressButton(By by) {
		WebElement el = null;
		try {
			el = driver.findElement(by);

		} catch (Exception e) {
			System.out.println("ELEMENT NOT FOUND EXCEPTION" + e.getMessage());
		}

		try {
			el.click();

		} catch (Exception e) {
			System.out.println("CAN NOT CLICK EXCEPTION" + e.getMessage());

		}
	}

//////////////////////////// send elements
	public static void sendData(By by, String data) {
		WebElement el = null;
		try {
			el = driver.findElement(by);

		} catch (Exception e) {
			System.out.println("ELEMENT NOT FOUND EXCEPTION" + e.getMessage());
		}

		try {
			el.sendKeys(data);

		} catch (Exception e) {
			System.out.println("CAN NOT SEND EXCEPTION" + e.getMessage());

		}
	}

////////////////////////////////////////////////// get Data 
	public static String getData(By by) {
		WebElement el = null;
		try {
			el = driver.findElement(by);

		} catch (Exception e) {
			System.out.println("ELEMENT NOT FOUND EXCEPTION" + e.getMessage());
		}

		try {
			return el.getText();
		} catch (Exception e) {
			System.out.println("CAN NOT RETURN TEXT EXCEPTION" + e.getMessage());

		}
		return null;

	}

/////////////////////////////////////////////////////////// find element if exist 
	public static void clickButtonIfExsists(By by) {
		if (driver.findElements(by).size() != 0)
			genaretors.pressButton(by);
	}

/////////////////////////////////////////////////////////// get element count

	public static int getElementsCount(By by) {
		List<WebElement> el = null;
		try {
			el = driver.findElements(by);

		} catch (Exception e) {
			System.out.println("ELEMENT NOT FOUND EXCEPTION" + e.getMessage());
		}

		try {
			return el.size();
		} catch (Exception e) {
			System.out.println("CAN NOT RETURN SIZE EXCEPTION" + e.getMessage());

		}
		return 0;
	}

/////////////////////////////////////////////////////////////select random option 

	public static WebElement getRandomElement(By by) {
		Random rand = new Random();
		int size = genaretors.getElementsCount(by);
		List<WebElement> el = null;
		try {
			el = driver.findElements(by);
			return el.get(rand.nextInt(size));

		} catch (Exception e) {
			System.out.println("ELEMENT NOT FOUND EXCEPTION" + e.getMessage());
		}

		return null;

	}

///////////////////////////////////////////////////////////// click on Random item 
	
	public static void clickOnRandomItem(By by) {
		WebElement el = null;
		try {
			el = genaretors.getRandomElement(by);
			el.click();
		} catch (Exception e) {
			System.out.println("ELEMENT NOT CLICKED" + e.getMessage());
		}

	}
/////////////////////////////////////////////////////////// select from drop down menu 

	public static void selectFromDropDown(By by, String value) {
		Select dropdown = null;
		try {
			dropdown = new Select(driver.findElement(by));

		} catch (Exception e) {
			System.out.println("ELEMENT NOT FOUND EXCEPTION" + e.getMessage());
		}

		try {
			dropdown.selectByVisibleText(value);
		} catch (Exception e) {
			System.out.println("CAN NOT SELECT EXCEPTION" + e.getMessage());

		}
	}

////////////////////////////////////////////////////////// generate random email	

	public static String genareaterandomEmail() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		return ("username" + randomInt + "@gmail.com");
	}

//////////////////////////////////////////////////////// genareate randome password 	
	public static String genareaterandomPassword() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000000);
		return ("a" + randomInt);
	}

/////////////////////////////////////////////////////// store data to file 

	public static void storeData(String key, String value) {
		Properties prop = new Properties();
		OutputStream output = null;
		try {
			output = new FileOutputStream("src\\com\\smokeTest\\propreties\\data.properties");
			prop.setProperty(key, value);
			prop.store(output, null);
			System.out.println("Data saved ..");
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

//////////////////////////////////////////////////////////// Read Data from file 

	public static String readData(String Key) {
		Properties prop = new Properties();
		InputStream input = null;
		String value = "";
		try {
			input = new FileInputStream("src\\com\\smokeTest\\propreties\\data.properties");
			prop.load(input);
			value = prop.getProperty(Key);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return value;

	}
}
