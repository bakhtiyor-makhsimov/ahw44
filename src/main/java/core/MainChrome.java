package core;

import org.openqa.selenium.WebDriver;

public class MainChrome {
	
	static long start;
	static long finish;
	static WebDriver driver; 

	public static void main(String[] args) {
		System.out.println("Browser: Chrome");
		start = System.currentTimeMillis();
		SignUpChrome.validate(driver, "http://alex.academy/exe/signup/v1/index.php");
		CommonChrome.quite();
		ConfirmationChrome.validate(driver, "http://alex.academy/exe/signup/v1/confirmation.php");
		CommonChrome.quite();
		finish = System.currentTimeMillis();
		System.out.println("Response time: " + (finish - start) + " ms");
		CommonChrome.quite();
	}
}
