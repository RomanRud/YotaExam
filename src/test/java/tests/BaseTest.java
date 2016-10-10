package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MainPage;
import java.util.concurrent.TimeUnit;

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

    @BeforeClass
    public void setUP(){
        driver.get(MY_URL);
    }

    @AfterClass
    public void tearDown() {
        mainPage.resetStat();
        driver.quit();
    }
}

