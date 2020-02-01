package Tests;

import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountLoginPage;

public class AccountLogin extends TestBase {

@Test
        public void LoginTest (){


    AccountLoginPage homePage = new AccountLoginPage(driver);
    homePage.goToHomePage();
    homePage.clickOnMyAccountButton();
    homePage.typeMail();
    homePage.clickContinuaButton();
    homePage.typePassword();
    homePage.clickContinuaButton();
    homePage.clickOnMyAccountButton();

    Assert.assertEquals(homePage.getaccountName(), "Dan Alexandru");
}



}
