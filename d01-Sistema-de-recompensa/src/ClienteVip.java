public class ClienteVip extends Cliente{
    public void ganharBonus() {
        this.pontosFidelidade += 50;
    }



    @Override
    public String toString() {
        return "ClienteVip{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", pontosFidelidade=" + pontosFidelidade +
                '}';
    }
}
