package core;

import org.openqa.selenium.WebDriver;

public class SignUpChrome {
	
	public static void validate(WebDriver driver, String url) {
		
		CommonChrome.open(url);
		
		CommonChrome.pageValidation("01. Element [Quotes (dynamic)]: ",		CommonChrome.el_01);
		CommonChrome.pageValidation("02. Element [Current Location]: ",		CommonChrome.el_02);
		CommonChrome.pageValidation("03. Element [Weather Icon]: ",			CommonChrome.el_03);
		CommonChrome.pageValidation("04. Element [Quotes (dynamic)]: ",		CommonChrome.el_04);
		CommonChrome.pageValidation("05. Element [Title]: ", 				CommonChrome.el_05);
			
		CommonChrome.pageValidation("06. Element [First Name (label)]: ", 	CommonChrome.el_06);
		CommonChrome.pageValidation("07. Element [First Name (field)]: ", 	CommonChrome.el_07);
		CommonChrome.pageValidation("08. Element [Last Name (label)]: ", 	CommonChrome.el_08);
		CommonChrome.pageValidation("09. Element [Last Name (field)]: ", 	CommonChrome.el_09);
		CommonChrome.pageValidation("10. Element [Email (label)]: ", 		CommonChrome.el_10);
			
		CommonChrome.pageValidation("11. Element [Email (filed)]: ", 		CommonChrome.el_11);
		CommonChrome.pageValidation("12. Element [Phone (label)]: ", 		CommonChrome.el_12);
		CommonChrome.pageValidation("13. Element [Phone (field)]: ", 		CommonChrome.el_13);
		CommonChrome.pageValidation("14. Element [Genre (label)]: ", 		CommonChrome.el_14);
		CommonChrome.pageValidation("15. Element [Male (label)]: ", 		CommonChrome.el_15);
		
		CommonChrome.pageValidation("16. Element [Male (radio button)]: ", 	CommonChrome.el_16);
		CommonChrome.pageValidation("17. Element [Female (label)]: ", 		CommonChrome.el_17);
		CommonChrome.pageValidation("18. Element [Female (radio button)]: ", CommonChrome.el_18);
		CommonChrome.pageValidation("19. Element [State (label)]: ", 		CommonChrome.el_19);
		CommonChrome.pageValidation("20. Element [State (drop-down)]: ", 	CommonChrome.el_20);
		
		CommonChrome.pageValidation("21. Element [State California (item)]: ", CommonChrome.el_21);
		CommonChrome.pageValidation("22. Element [Terms (label)]: ", 		CommonChrome.el_22);
		CommonChrome.pageValidation("23. Element [Terms (checkbox)]: ", 	CommonChrome.el_23);
		CommonChrome.pageValidation("24. Element [Image (facebook)]: ", 	CommonChrome.el_24);
		CommonChrome.pageValidation("25. Element [Image (twitter)]: ", 		CommonChrome.el_25);
				
		CommonChrome.pageValidation("26. Element [Image (flickr)]: ", 		CommonChrome.el_26);
		CommonChrome.pageValidation("27. Element [Image (youtube)]: ", 		CommonChrome.el_27);
		CommonChrome.pageValidation("28. Element [Reset (button)]:  ", 		CommonChrome.el_28);
		CommonChrome.pageValidation("29. Element [Submit (button)]: ", 		CommonChrome.el_29);
		CommonChrome.pageValidation("30. Element [Timestamp (dynamic)]: ", CommonChrome.el_30);
		
		CommonChrome.pageValidation("31. Element [Copyright (dynamic)]: ", 	CommonChrome.el_31);
		CommonChrome.pageValidation("32. Element [OS & Browser (dynamic)]: ", CommonChrome.el_32);
		CommonChrome.pageValidation("33. Element [Error Line]: ", 			CommonChrome.el_33);
		CommonChrome.pageValidation("34. Element [First Name Error]: ", 	CommonChrome.el_34);
		CommonChrome.pageValidation("35. Element [Last Name Error]: ", 		CommonChrome.el_35);
		
		CommonChrome.pageValidation("36. Element [Email Error]: ", 			CommonChrome.el_36);
		CommonChrome.pageValidation("37. Element [Phone Error]: ", 			CommonChrome.el_37);
		CommonChrome.pageValidation("38. Element [First Name Error (img)]: ", CommonChrome.el_38);
		CommonChrome.pageValidation("39. Element [Last Name Error (img)]: ", CommonChrome.el_39);
		CommonChrome.pageValidation("40. Element [Email Error (img)]: ", 	CommonChrome.el_40);
		CommonChrome.pageValidation("41. Element [Phone Error (img)]: ", 	CommonChrome.el_41);
	}

}
