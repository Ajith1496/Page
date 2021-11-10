package org.base;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainClass extends BaseClass {
	@Test
	public void launch() {
	loadUrl("https://adactinhotelapp.com/");
	LoginPojo l= new LoginPojo();
	WebElement txtuserName=l.getUsername();
    txtuserName.sendKeys("JohnJames");
    WebElement txtuserPassword=l.getPassword();
    txtuserPassword.sendKeys("Ajith@123");
    WebElement usrLogin=l.getLogin();
    usrLogin.click();
    WebElement usrLocation=l.getLocation();
    selectVisible(usrLocation,"New York");
    WebElement hotels = l.getHotels();
    selectVisible(hotels,"Hotel Sunshine");
    WebElement roomtype = l.getRoomtype();
    selectVisible(roomtype,"Standard");
    WebElement numberofrooms = l.getNumberofrooms();
    selectVisible(numberofrooms,"1 - One");
    WebElement checkIndate = l.getCheckIndate();
    checkIndate.sendKeys("09/11/2021");
    WebElement checkoutdate = l.getCheckoutdate();
    checkoutdate.sendKeys("12/11/2021");
    WebElement adultsperroom = l.getAdultsperroom();
    selectVisible(adultsperroom,"2 - Two");
    WebElement searchhotel = l.getSearchhotel();
    searchhotel.click();
    WebElement selecthotel = l.getSelecthotel();
    selecthotel.click();
    WebElement usrcontinue = l.getUsrcontinue();
    usrcontinue.click();
    
    
    
    }

}
