package pages;

import Utils.DataItems;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountLoginPage {
    WebDriver driver;

    public AccountLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
}

    @FindBy (id = "my_account") private WebElement MyAccountButton;
    @FindBy (id = "email") private WebElement InputMail;
    @FindBy(xpath = "/html/body/form[1]/div[4]/div/button") private WebElement ContinuaButton;
    @FindBy (id = "password") private WebElement InputPassword;
    @FindBy (xpath = "//*[@id=\"emg-body-overlay\"]/div/div/div[1]/div/div/div[2]/p") private WebElement accountName;




    public void goToHomePage() {
        driver.get(DataItems.ENVIROMENT);
    }
    public void clickOnMyAccountButton () {MyAccountButton.click();}
    public void typeMail (){InputMail.sendKeys(DataItems.email);}
    public void clickContinuaButton () {ContinuaButton.click();}
    public void typePassword (){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(InputPassword));
        InputPassword.sendKeys(DataItems.password);}

     public String getaccountName (){return accountName.getText();}
    }






