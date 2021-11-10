package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement login;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement numberofrooms;
	@FindBy(id = "datepick_in")
	private WebElement checkIndate;
	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;
	@FindBy(id = "adult_room")
	private WebElement adultsperroom;
	@FindBy(id = "child_room")
	private WebElement childernperroom;
	@FindBy(id = "Submit")
	private WebElement searchhotel;
	@FindBy(id = "radiobutton_0")
	private WebElement selecthotel;
	@FindBy(id = "continue")
	private WebElement usrcontinue;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getCheckIndate() {
		return checkIndate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public void setAdultsperroom(WebElement adultsperroom) {
		this.adultsperroom = adultsperroom;
	}

	public WebElement getChildernperroom() {
		return childernperroom;
	}

	public WebElement getSearchhotel() {
		return searchhotel;
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getUsrcontinue() {
		return usrcontinue;
	}

}
