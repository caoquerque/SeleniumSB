package steps;

import cucumber.api.java.pt.E;
import pages.UserLoginPage;

public class LoginSteps {

    UserLoginPage userLoginPage;

    public LoginSteps() {
        userLoginPage = new UserLoginPage();
    }

    @E("efetuar login")
    public void efetuarLogin() {
        userLoginPage.Login();
    }
}
