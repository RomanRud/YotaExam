package pages;

import helpers.Constans;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by roman on 10/10/16
 */
public class MainPage extends BasePage {
    private WebElement amount;

    @FindBy(xpath = ".//*[@data-bind='click: doPayment']")
    private WebElement addFundsButton;

    @FindBy(xpath = ".//*[@data-bind ='click: doReset']")
    private WebElement resetStatButton;

    @FindBy(xpath = ".//*[@id='balance-holder']")
    private WebElement balanceHolder;

    @FindBy(xpath = ".//*[@data-bind='text: previousSpeed']")
    private WebElement currentSpeed;

    @FindBy(xpath = ".//*[@data-bind='click: moveRight']")
    private WebElement plus;

    @FindBy(xpath = ".//*[@data-bind='click: moveLeft']")
    private WebElement minus;

    @FindBy(xpath = ".//*[@data-bind=' css: addOferButtonClasses, click: doPurchase']")
    private WebElement connectButton;

    @FindBy(xpath = ".//*[@id='sliders']/div[2]/div[3]/div[2]/div/div")
    private WebElement newTarrifInfo;

    @FindBy(xpath = ".//*[@id='sliders']/div[2]/div[1]/div/div[2]/div")
    private WebDriver currentTarrifInfo;

    public MainPage(WebDriver driver){
        super(driver);
    }

    public String getCurrentBalance(){
        String balance = balanceHolder.getText();
        return balance.replaceAll("\\W", "");
    }
    public String getCurrentSpeed(){
        String speed = currentSpeed.getText();
        return speed.replaceAll("\\W", "");
    }
    public void resetStat(){
        resetStatButton.click();
    }

    public void clickPlus(){
        clickByJS(plus);

    }
    public void clickMinus(){
        clickByJS(minus);
    }
    public void doPurchase(){
        if(purchaseButtonIsActive()) connectButton.click();
    }

    public Boolean purchaseButtonIsActive(){
        Boolean condition = connectButton.isEnabled();
        return condition;
    }

    public void addFundsForFirstProduct() {
        amount.sendKeys(Constans.THREE_HUNDRET);
        addFundsButton.click();
    }

    public String getNewTarriffInfo(){
        String tarrifInfo = newTarrifInfo.getText();
        return tarrifInfo;
    }
}
