package modals;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalsTests extends BaseTests {
    @Test
    public void testModals(){
        var entryAdPage=homePage.clickEntryAd();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entryAdPage.closeModal();
        entryAdPage.clickRestartLink();
        assertEquals(entryAdPage.getEntryAdText(), "Entry Ad",
                "The Header is not correct");
    }
}


