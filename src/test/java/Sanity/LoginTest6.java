package Sanity;

import com.searchmodule.pages.SearchPage;
import com.tests.BaseTest;
import LoginPage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest6 extends BaseTest {

	@Test(groups ={"Sanity"}, description= "the script should perform a login by giving the Email, Pass, and click the login button")
    public void log__in() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.goTo();
        loginPage.clickSignInBtn();
        loginPage.setEmail("ilanmg@artlist.io");
        loginPage.setPassword("Tomido1212*");
        loginPage.clickLoginBtn();

        //Assert.assertEquals(true, siteHeader.getLicenseBtn());
       
    }
}
