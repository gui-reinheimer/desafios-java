public class Main {
    public static void main(String[] args) {
        Funcionario[]  funcionarios = new Funcionario[2];

        Desenvolvedor dev = new Desenvolvedor();
        dev.setNome("Guilherme");
        dev.setSalarioBase(5000);
        dev.setProjetosEntregue(2);
        funcionarios[0] = dev;

        Gerente ger = new Gerente();
        ger.setNome("Gerente");
        ger.setSalarioBase(10000);
        funcionarios[1] = ger;

        for(Funcionario f : funcionarios){
            f.exibirHolerite();
            System.out.println("-----------------------------------");
        }
    }
}
