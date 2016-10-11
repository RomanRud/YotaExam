package tests;

import helpers.Const;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Created by roman on 10/10/16
 */

public class VerifyThatUserIsAbleToAddFunds extends BaseTest {

    @DataProvider(name = "Options")
    public Object[][] getDataFromDataprovider(){

        return new Object[][] {

                {"1"},
                {"0"},
                {"9999"},
                {"9999999999999999999999"},
                {"-1"},
        };
    }

    @Test(dataProvider = "Options")
    public void addFunds(String value){
        mainPage.addFunds(value);

        if(value.equals(Const.UNACCEPTABLE_SUM)){
            assertEquals(mainPage.getCurrentBalance(), Const.ZERO);
            mainPage.resetStat();
        }
        if(value.equals(Const.MINUS_ONE)){
            assertNotEquals(mainPage.getCurrentBalance(), Const.MINUS_ONE);
            mainPage.resetStat();
        }

        else {
        assertEquals(mainPage.getCurrentBalance(), value);
        mainPage.resetStat();
        }
    }

}
