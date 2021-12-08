package steps;

import cucumber.api.java.pt.E;
import pages.BillPage;

public class AddBillSteps {

    BillPage billPage;

    public AddBillSteps() {
        billPage = new BillPage();
    }

    @E("clicar em adicionar")
    public void clicarEmAdicionar() {
        billPage.clickOnAddBill();
    }

    @E("adicionar nova conta")
    public void adicionarNovaConta() {
        billPage.createBill();
    }
}
