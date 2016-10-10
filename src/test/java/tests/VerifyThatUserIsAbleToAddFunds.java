package tests;

import org.testng.annotations.Test;

import static helpers.Constans.THREE_HUNDRET;
import static org.testng.Assert.assertEquals;

/**
 * Created by roman on 10/10/16
 */
public class VerifyThatUserIsAbleToAddFunds extends BaseTest {
    @Test
    public void userIsAbleToAddFunds(){
        mainPage.addFundsForFirstProduct();
        assertEquals(mainPage.getCurrentBalance(), THREE_HUNDRET);
    }

}
