package Login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {
@Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        var secureAreaPage = loginPage.clickLoginButton();
        String message = secureAreaPage.getMessage();
    }
}
