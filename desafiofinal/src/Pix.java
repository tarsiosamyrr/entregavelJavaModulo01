public class Pix extends FormaPagamento {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {

        if (!valorValido()) {
            status = "Recusado";
            return;
        }

        status = "Aprovado";

        System.out.println("Pagamento via PIX realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("PAGAMENTO PIX");
        System.out.println("Tipo: PIX");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
    }
}