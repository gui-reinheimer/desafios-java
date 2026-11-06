public class Main {
    public static void main(String[] args) {
        ClienteVip c1 = new ClienteVip();

        c1.setNome("Fulano");
        c1.setEmail("Fulano@email.com");

        c1.ganharBonus();
        c1.fazerCompras(100);
        System.out.println(c1.toString());
    }
}
