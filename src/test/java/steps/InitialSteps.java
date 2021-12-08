package steps;

import cucumber.api.java.pt.Dado;
import pages.InitialPage;

public class InitialSteps {

    InitialPage initialPage;

    public InitialSteps() {
        initialPage = new InitialPage();
    }

    @Dado("acessar aplicacao")
    public void acessarAplicacao() {
        initialPage.acessarAplicacao();
    }
}
