package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by roman on 10/10/16
 */
public class VerifyThatUserIsAbleToConnectFirstPaidProduct extends BaseTest {
    @Test
    public void purchaseNewProduct() throws InterruptedException {
        mainPage.addFundsForFirstProduct();
        mainPage.clickPlus();

        assertEquals(mainPage.getNewTarriffInfo(),"30320300");
        assertTrue(mainPage.purchaseButtonIsActive());

        mainPage.doPurchase();
        assertEquals(mainPage.getCurrentBalance(),"0");
        assertFalse(mainPage.purchaseButtonIsActive());



    }

}
