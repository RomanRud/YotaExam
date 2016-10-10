package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by roman on 10/10/16.
 */
public class VerifyThatBaseProductIsActivatedOnAppStart extends BaseTest {
    @Test
    public void verifyThatBaseProductIsActiveOnAppStart() {
        assertEquals(mainPage.getCurrentSpeed(), "64");
        assertEquals(mainPage.getCurrentCost(), 0);
    }
}
