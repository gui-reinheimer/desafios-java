public abstract class Cliente {
    protected String nome;
    protected String email;
    protected double pontosFidelidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPontosFidelidade() {
        return pontosFidelidade;
    }

    public final void fazerCompras(double valor) {
        pontosFidelidade += valor * 0.1;
    }
}
