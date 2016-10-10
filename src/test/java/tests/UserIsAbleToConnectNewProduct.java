package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by roman on 10/10/16
 */
public class UserIsAbleToConnectNewProduct extends BaseTest {
    @Test
    public void addNewProduct(){
        mainPage.addFundsForFirstProduct();
        mainPage.clickPlus();
        System.out.print(mainPage.getNewTarriffInfo());
        assertTrue(mainPage.purchaseButtonIsActive());
        mainPage.doPurchase();
        assertFalse(mainPage.purchaseButtonIsActive());

        //assertCurrentTarrifInfo();
        //asserCurrentBalance()

        //assertEquals(mainPage.getCurrentBalance(),"0");


    }

}
