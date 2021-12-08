package steps;

import cucumber.api.java.pt.Entao;
import pages.UserLogoutPage;

public class LogoutSteps {

    UserLogoutPage userLogoutPage;

    public LogoutSteps() {
        userLogoutPage = new UserLogoutPage();
    }

    @Entao("efetuar logout")
    public void efetuarLogout() {
        userLogoutPage.logout();
    }
}
