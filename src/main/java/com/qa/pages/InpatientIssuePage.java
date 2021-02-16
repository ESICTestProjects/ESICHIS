package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.util;

public class InpatientIssuePage extends BasePage{
	util utilobj = new util();
public InpatientIssuePage(WebDriver driver) {
	
		super(driver);
		// TODO Auto-generated constructor stub
	}

   private By  AdmissionSerch = By.id("ctl00_cphpage_imgBtnAdmissionNo");
   private By  SerchText = By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_dlData_ctl00_txtCriteria");
   private By  SearchBtn =By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchCriteria_btnSearch");
  
   private By  RadioBtn =By.id("ctl00_cphpage_HISDataSearchCtrl_hisSearchResultGrid_gdvList_ctl02_rdbTemp");
   private By  btnSelect =By.id("ctl00_cphpage_HISDataSearchCtrl_btnSelect");
   //private By  btnOK =By.name("ctl00$cphpage$btnOK");
   
   private By  btnOK =By.id("ctl00_cphpage_btnOK");
   private By  txtIssueQty =By.id("ctl00_cphpage_Grid_ctl02_txtIssueQty");
   private By  btnSave =By.id("ctl00_cphpage_btnSave");
   private By  ButtonOK =By.id("ctl00_cphpage_MyMessageBoxInfo_ButtonOK");
   
   
  
 

public WebElement getAdmissionSerch() {
	return getElement(AdmissionSerch);
	
	
	
}
public WebElement getButtonOK() {
	return getElement(ButtonOK);
	
	
	
}



public WebElement getSerchText() {
	return getElement(SerchText);
	

	
}


public WebElement getSearchBtn() {
	return getElement(SearchBtn);
	

	
}

public WebElement getRadioBtn() {
	return getElement(RadioBtn);
	

	
}

public WebElement getbtnSelect() {
	return getElement(btnSelect);
	

	
}
public WebElement getbtnOK() {
	return getElement(btnOK);
	

	
}
public WebElement getbtnSave() {
	return getElement(btnSave);
	

	
}
public WebElement gettxtIssueQty() {
	return getElement(txtIssueQty);
	

	
}



public void dopatientIssue(String IPNumber) {
	
	try {

	getAdmissionSerch().click();
	getSerchText().sendKeys("IP022100009");
	getSearchBtn().click();
	getRadioBtn().click();
	getbtnSelect().click();
	Thread.sleep(2000);
	getbtnOK().click();
	gettxtIssueQty().clear();
	gettxtIssueQty().sendKeys("1");
	getbtnSave().click();
	Thread.sleep(2000);
	getButtonOK().click();
	
	}
	
	
	catch (Exception ex) {
		System.err.println(ex);
	}
}}



