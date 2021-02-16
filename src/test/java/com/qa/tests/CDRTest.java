package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.CDRPage;
import com.qa.pages.HISHomePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SelectHospitalLocationPage;

public class CDRTest extends BaseTest { 

	public CDRTest() {
		// TODO Auto-generated constructor stub
	}
	LoginPage loginpage;
	HomePage homepage;
	SelectHospitalLocationPage selecthospitallocationpage;
	HISHomePage hishomepage;
	CDRPage cdrpage;

@Test(priority =0)
public void doLoginTest() {

	loginpage = new LoginPage(driver);

	homepage = loginpage.doLogin(prop.getProperty("uidd"), prop.getProperty("pwdd"));

}

@Test(priority =1)
public void doNavigateToSelectHospitalLocationTest() {

	selecthospitallocationpage = homepage.doNavigateToSelectHospitalLocation();
}

@Test(priority =2)
public void doNavigateToHISHomeTest() {

	hishomepage = selecthospitallocationpage.doNavigateToHISHome(prop.getProperty("locationName"), prop.getProperty("facilityName"));
}

@Test(priority =3)
public void doNavigateToCDRTest() {

	cdrpage = hishomepage.doNavigateToCDRLink();
	
	
	
}

@Test(priority =3)
public void doSearchCDRTest() {

	cdrpage.doSearchCDR((prop.getProperty("IPNumber")));
	
	
}
}




