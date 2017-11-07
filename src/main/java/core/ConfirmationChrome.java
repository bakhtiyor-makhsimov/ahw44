package core;

import org.openqa.selenium.WebDriver;

public class ConfirmationChrome {
	
	public static void validate(WebDriver driver, String url) {
		
		CommonChrome.open(url);
		
		CommonChrome.pageValidation("01. Element [Title]: ", 				CommonChrome.el_05);
		CommonChrome.pageValidation("02. Element [First Name (label)]: ",	CommonChrome.el_06);
		CommonChrome.pageValidation("03. Element [First Name (field)]: ", 	CommonChrome.el_07);
		CommonChrome.pageValidation("04. Element [Last Name (label)]: ",	CommonChrome.el_08);
		CommonChrome.pageValidation("05. Element [Last Name (field)]: ",	CommonChrome.el_09);
			
		CommonChrome.pageValidation("06. Element [Email (label)]: ", 		CommonChrome.el_10);
		CommonChrome.pageValidation("07. Element [Email (filed)]: ", 		CommonChrome.el_11);
		CommonChrome.pageValidation("08. Element [Phone (label)]: ", 		CommonChrome.el_12);
		CommonChrome.pageValidation("09. Element [Phone (field)]: ", 		CommonChrome.el_13);
		CommonChrome.pageValidation("10. Element [Genre (label)]: ", 		CommonChrome.el_14);
			
		CommonChrome.pageValidation("11. Element [Genre (field)): ", 		CommonChrome.el_42);
		CommonChrome.pageValidation("12. Element [Back (button)]: ", 		CommonChrome.el_43);
	}
}
