public abstract class FormaPagamento {

    protected double valor;
    protected String status;

    public FormaPagamento(double valor) {
        this.valor = valor;
        this.status = "Pendente";
    }

    public abstract void pagar();

    public abstract void exibirDetalhes();

    protected boolean valorValido() {
        if (valor <= 0) {
            System.out.println("Pagamento recusado!");
            System.out.println("O valor deve ser maior que zero.");
            return false;
        }

        return true;
    }
}