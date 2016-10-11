package tests;

import helpers.Const;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.MainPage;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by roman on 10/10/16
 */
public class BaseTest {
    private final static  String MY_URL = "http://localhost:4567/index.html";

    public WebDriver driver = initDriver();
    public MainPage mainPage = PageFactory.initElements(driver, MainPage.class);



    private WebDriver initDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void verifyFirstTarrifOption(){
        assertEquals(mainPage.getNewTarriffInfo(),"30320300");
    }
    public void verifyThatFirstProductIsPurchased(){
        assertEquals(mainPage.getCurrentBalance(), Const.ZERO);
        assertTrue(mainPage.purchaseButtonIsDisabled());
        assertEquals(mainPage.getCurrentDaysLeft(), "30");
        assertEquals(mainPage.getCurrentSpeed(), "320");
        assertEquals(mainPage.getCurrentCost(), "300");
    }

    @BeforeTest
    public void setUP(){
        driver.get(MY_URL);
    }

    @AfterTest
    public void tearDown() {
        mainPage.resetStat();
        driver.quit();
    }
}

