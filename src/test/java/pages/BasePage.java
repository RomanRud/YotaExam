package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by roman on 10/10/16
 */
public class BasePage {
    public WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickByJS(WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

}
