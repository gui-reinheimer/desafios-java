public class CartaoCredito extends FormaPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " Processado no credito. valor total com taxa de R$"
                + (valor + (valor * 0.05)));
    }
}
