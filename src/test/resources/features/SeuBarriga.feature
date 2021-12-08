# language: pt
# charset: UTF-8

Funcionalidade: Compra
  Eu como cliente gostaria de comprar um produto para ter mais acessorios

  @dev
  Cenario: Comprar um produto
    Dado acessar aplicacao
#    Quando clicar em novo usuario
#    E cadastrar novo usuario
    E efetuar login
#    E clicar em adicionar
#    E adicionar nova conta
#    E criar transacao
    E exibir resumo mensal
    E filtrar pelo mes "12" do ano "2021"
#    E excluir lancamento com descricao "PS5" e data de pagamento "04/12/2021" e valor "5000.00" e situacao "Pago"
    Entao efetuar logout

