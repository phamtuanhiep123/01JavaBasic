package day7;

import org.openqa.selenium.WebDriver;

public class Page {
 public WebDriver driver;
 public TestBase testBase = new TestBase();

 public Page(WebDriver dr) {
	this.driver = dr;
}
 
}
