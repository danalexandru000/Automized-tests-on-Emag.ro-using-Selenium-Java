package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountLoginPage;

public class BuyProduct extends TestBase {

    @Test
    public void BuyTest(){
        AccountLoginPage homePage = new AccountLoginPage(driver);
        homePage.goToHomePage();
        homePage.clickOnMyAccountButton();
        homePage.typeMail();
        homePage.clickContinuaButton();
        homePage.typePassword();
        homePage.clickContinuaButton();
        homePage.clickOnMyAccountButton();
        Assert.assertEquals(homePage.getaccountName(), "Dan Alexandru");

        WebElement SearchField = driver.findElement(By.id("emg-input-autosuggest"));
        SearchField.sendKeys("Cotiera Auto Flexzon pentru Golf 4 Bora Audi A3 Octavia 1 Negru");
        SearchField.sendKeys(Keys.RETURN);
        WebElement ResultTitle = driver.findElement(By.linkText("Cotiera Auto Flexzon pentru Golf 4 Bora Audi A3 Octavia 1 Negru"));
        Assert.assertEquals(ResultTitle.getText(), "Cotiera Auto Flexzon pentru Golf 4 Bora Audi A3 Octavia 1 Negru");
        ResultTitle.click();
        WebElement AdaugaInCos = driver.findElement(By.xpath("//*[@id=\"main-container\"]/section[1]/div/div[2]/div[2]/div/div/div[2]/form/div[2]/button[1]"));
        AdaugaInCos.click();

        WebElement iframe = driver.findElement(By.id(""))
        WebElement VeziCos = driver.findElement(By.cssSelector("body > div.ph-modal.modal.fade.product-purchased-modal.in > div > div > div.modal-body.modal-content-extra-padding.pad-sep-xs.hidden-xs > div > div.table-cell.col-xs-12.col-sm-2.col-md-2.hidden-xs.hidden-sm > a"));
        driver.switchTo().frame(this.iframe);
        WebDriverWait wait = new WebDriverWait(driver, 5L);
        wait.until(ExpectedConditions.visibilityOf(VeziCos));
        VeziCos.click();
    }

}
