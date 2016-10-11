package tests;

import helpers.Const;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by roman on 10/10/16.
 */
public class VerifyThatBaseProductIsActiveOnAppStart extends BaseTest {
    @Test
    public void verifyThatBaseProductIsActive() {
        assertEquals(mainPage.getCurrentSpeed(), Const.DEFAULT_SPEED);
        assertEquals(mainPage.getCurrentCost(), Const.ZERO);
        assertTrue(mainPage.purchaseButtonIsDisabled());
    }
}
