public class Pix extends FormaPagamento{
    @Override
    public void processarPagamento(double valor) {
        double valorDesconto = valor - (valor * 0.1);
        System.out.println("Pagamento de R$" + valorDesconto + " Processado via PIX com sucesso");
    }
}
