public class Credito extends FormaPagamento {

    private double limite;

    public Credito(double valor, double limite) {
        super(valor);
        this.limite = limite;
    }

    @Override
    public void pagar() {

        if (!valorValido()) {
            status = "Recusado";
            return;
        }

        if (valor > limite) {
            status = "Recusado";

            System.out.println("Pagamento via crédito recusado!");
            System.out.println("Limite insuficiente.");
            return;
        }

        limite -= valor;
        status = "Aprovado";

        System.out.println("Pagamento via crédito realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("PAGAMENTO CRÉDITO");
        System.out.println("Tipo: Crédito");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("Limite restante: R$ " + limite);
    }
}