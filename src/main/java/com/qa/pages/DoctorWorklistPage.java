package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class DoctorWorklistPage extends BasePage {
	util utilobj = new util();

	String checkinNumber = null;
	String lblchkin1 = "//span[text()='";
	String lblchkin2 = "']";
//private By lblBillNo1 = By.linkText(checkinNumber);
	// private By lblBillNo1 = By.xpath(lblchkin1+ checkinNumber +lblchkin2);

	private By popok = By.id("popup_ok");

	private By lableprecripstionlink = By.id("ctl00_cphpage_trvSectionst11");

	private By txtOrdPackSearch = By.id("txtOrdPackSearch");
	private By orderpack = By.id("97701");

	private By clickorderpackbutton = By.id("btnOrdpack");

	public WebElement getpopok() {
		return getElement(popok);

	}

	public WebElement getlableprecripstionlink() {
		return getElement(lableprecripstionlink);

	}

	public WebElement gettxtOrdPackSearch() {
		return getElement(txtOrdPackSearch);

	}

	public WebElement getorderpack() {
		return getElement(orderpack);

	}

	public WebElement getclickorderpackbutton() {
		return getElement(clickorderpackbutton);

	}

	public WebElement getlblBillNo1(String checkinNumber) {
		return getElement(By.xpath(lblchkin1 + checkinNumber + lblchkin2));
		//// span[text()='OPGENE012100026']
	}

	/*
	 * public WebElement getlblBillNo1(String checkinNumber) { return getElement(
	 * By.linkText(checkinNumber)); //// span[text()='OPGENE012100026'] }
	 */

	public DoctorWorklistPage(WebDriver driver) {
		super(driver);
	}

	public String verifyDoctorWorklistPageTitle() {

		return driver.getTitle();

	}

	public void doOpenCaseSheet(String checkinNumber) {

		try

		{

			getlblBillNo1(checkinNumber).click();

		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}
	
	public void doCasesheetprecripstion(String orderpackname) {

		try

		{
			getpopok().click();
			getlableprecripstionlink().click();
			utilobj.ChildWindow(driver);
			
		System.out.println(driver.getTitle());	
			
//			driver.switchTo().window("ClientSide_Prescriptions");
			gettxtOrdPackSearch().sendKeys(orderpackname);
			getclickorderpackbutton().click();
		}

		catch (Exception ex) {
			System.err.println(ex);
		}

	}
}
