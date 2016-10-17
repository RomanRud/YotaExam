package tests;

import helpers.Const;
import org.testng.annotations.Test;

/**
 * Created by roman on 10/10/16
 */
public class VerifyThatUserIsAbleToConnectFirstPaidProduct extends BaseTest {
    @Test
    public void purchaseNewProduct()  {
        mainPage.addFunds(Const.THREE_HUNDRED);
        mainPage.clickPlus();
        verifyFirstTarrifOption();
        mainPage.doPurchase();
        verifyThatFirstProductIsPurchased();
    }

}
