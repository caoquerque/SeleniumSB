package steps;

import cucumber.api.java.pt.E;
import pages.ExtractPage;

public class ExtractSteps {

    ExtractPage extractPage;

    public ExtractSteps() {
        extractPage = new ExtractPage();
    }

    @E("exibir resumo mensal")
    public void exibirResumoMensal() {
        extractPage.Summarizing();
    }

    @E("filtrar pelo mes {string} do ano {string}")
    public void filtrarPeloMesDoAno(String mes, String ano) {
        extractPage.filterMonthAndYear(mes, ano);
    }


    @E("excluir lancamento com descricao {string} e data de pagamento {string} e valor {string} e situacao {string}")
    public void excluirLancamentoComDescricaoEDataDePagamentoEValorESituacao(
            String descricao, String dataPagamento, String valor, String situacao) {
        extractPage.deleteItems(descricao, dataPagamento, valor, situacao);
    }
}
