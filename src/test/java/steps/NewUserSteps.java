package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import pages.NewUserPage;

public class NewUserSteps {

    NewUserPage newUserPage;

    public NewUserSteps() {
        newUserPage = new NewUserPage();
    }

    @Quando("clicar em novo usuario")
    public void clicarEmNovoUsuario() {
        newUserPage.acessarPaginaNovoUsuario();
    }

    @E("cadastrar novo usuario")
    public void cadastrarNovoUsuario() {
        newUserPage.cadastrarUsuario();
    }
}
