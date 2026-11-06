public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        Pix pix = new Pix();

        cartaoCredito.processarPagamento(100);
        pix.processarPagamento(100);
    }
}
