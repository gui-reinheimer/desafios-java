public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public abstract double calcularSalarioTotal();

    public final void exibirHolerite() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Total: " + calcularSalarioTotal());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
