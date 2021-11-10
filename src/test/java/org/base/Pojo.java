package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	
	public Pojo(){
		PageFactory.initElements(driver,this);
		
	}
	
	private WebElement username;
	private WebElement password;
	private WebElement location;

	

}
