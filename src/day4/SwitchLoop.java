package day4;

import org.openqa.selenium.By;

public class SwitchLoop {
	public By getLocator(String locatorType, String locatorValue) {
		By result = null;
		switch (locatorType) {
		case "id": {
			result = By.id(locatorValue);
			break;
		}
		case "name": {
			result = By.id(locatorValue);
			break;
		}
		/*
		 * id name linkText cssSelector partialLinkText tagName xpath
		 */

		case "linkText": {
			result = By.id(locatorValue);

		}
		case "cssSelector": {
			result = By.id(locatorValue);
		}
		}
		return result;

	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void printArray (int[] a) {
		if (a.length>0)
			//print là không xuống dòng
			//println là xuống dòng
		{
			System.out.print("{");
			for (int i=0;i<a.length;i++) {
				System.out.print(a[i] );
				if (i <a.length-1) {
					System.out.print(",");
				}
			}
			
			System.out.print("}");
			
			
		}
		else			
			System.out.println("Không có phần tử của mảng");
		
		
	}

}
