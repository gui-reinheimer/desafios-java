public class Gerente extends Funcionario {

    @Override
    public double calcularSalarioTotal() {
        return this.salarioBase * 1.30;
    }
}
