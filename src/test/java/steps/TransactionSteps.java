package steps;

import cucumber.api.java.pt.E;
import pages.CreateTransactionPage;

public class TransactionSteps {

    CreateTransactionPage createTransactionPage;

    public TransactionSteps() {
        createTransactionPage = new CreateTransactionPage();
    }

    @E("criar transacao")
    public void criarTransacao() {
        createTransactionPage.clickOnTransaction();
        createTransactionPage.createTransaction();
    }
}
