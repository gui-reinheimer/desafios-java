public class Desenvolvedor extends Funcionario {
    private int projetosEntregue;


    @Override
    public double calcularSalarioTotal() {
        return this.salarioBase + (1000 * this.projetosEntregue);
    }


    public int getProjetosEntregue() {
        return projetosEntregue;
    }

    public void setProjetosEntregue(int projetosEntregue) {
        this.projetosEntregue = projetosEntregue;
    }
}
