package day7;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {
//		TestBase testBase = new TestBase();
//
//		submitSuccesfully();
//		validateEmail();
//       checkBoxVerify();		
       multiCheckBoxVerify ();
	}
// TCs 1
	public static void submitSuccesfully() {
		String userName = "HieppHAM";
		String userEmail = "phamtuanhiep123@gmail.com";
		String currentAddress = "1234";
		String permanentAddress = "1234";

		TestBase testBase = new TestBase();
		testBase.openWebBrower();

		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickonElements();
		TextBoxPage textBoxPage = elementsPage.clickonTextBox();
		textBoxPage.inputData(userName, userEmail, currentAddress, permanentAddress);
		textBoxPage.clickSubmits();
		textBoxPage.verifyData(textBoxPage.lbNameElement, userName);
		textBoxPage.verifyData(textBoxPage.lbEmailElement, userEmail);
		textBoxPage.verifyData(textBoxPage.lbCurrentAddressElement, currentAddress );
		textBoxPage.verifyData(textBoxPage.lbPermanentAddressElement, permanentAddress );
	}
	//TCs 2
	public static void validateEmail () {
		String userName = "HieppHAM";
		String userEmail = "phamtuanhiep123gmail.com";
		String currentAddress = "1234";
		String permanentAddress = "1234";

		TestBase testBase = new TestBase();
		testBase.openWebBrower();

		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickonElements();
		TextBoxPage textBoxPage = elementsPage.clickonTextBox();
		textBoxPage.inputData(userName, userEmail, currentAddress, permanentAddress);
		textBoxPage.clickSubmits();
		
	}
	//TCs 3
	public static void checkBoxVerify () {

		TestBase testBase = new TestBase();
		testBase.openWebBrower();
		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickonElements();
		CheckBoxPage checkBoxPage = elementsPage.clickonCheckBox();
		boolean verify1 = checkBoxPage.verifyCheckbox();
		boolean clickCheckBox = checkBoxPage.clickCheckbox();

	}
	//TCs 4
	public static void multiCheckBoxVerify () {

		TestBase testBase = new TestBase();
		testBase.openWebBrower();
		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickonElements();
		CheckBoxPage checkBoxPage = elementsPage.clickonCheckBox();
		boolean clickCheckBox = checkBoxPage.clickCheckbox();
	}
}
