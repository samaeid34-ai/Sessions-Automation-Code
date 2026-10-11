package Keys;
import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testKeys(){
        var keyPressesPage =homePage.clickKeyPresses();
        keyPressesPage.setText("a"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResultMessage(), "You entered: BACK_SPACE",
                "Message is incorrect");
    }
}

