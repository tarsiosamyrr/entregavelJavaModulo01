public class Debito extends FormaPagamento {

    private double saldo;

    public Debito(double valor, double saldo) {
        super(valor);
        this.saldo = saldo;
    }

    @Override
    public void pagar() {

        if (!valorValido()) {
            status = "Recusado";
            return;
        }

        if (valor > saldo) {
            status = "Recusado";

            System.out.println("Pagamento via débito recusado!");
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldo -= valor;
        status = "Aprovado";

        System.out.println("Pagamento via débito realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("PAGAMENTO DÉBITO");
        System.out.println("Tipo: Débito");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("Saldo restante: R$ " + saldo);
    }
}