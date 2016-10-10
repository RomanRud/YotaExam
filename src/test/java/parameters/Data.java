package parameters;

import org.testng.annotations.DataProvider;
import tests.BaseTest;


/**
 * Created by roman on 10/10/16
 */
public class Data extends BaseTest {
    @DataProvider(name = "fundingAmountOptions")

    public Object[][] getDataFromDataprovider(){

        return new Object[][] {

                { "1"},

                { "9999"},

                { "99999999999999999999999"},
                { "0"},
                { "-1"},
                {"@#&abcd"}

        };

    }
}

