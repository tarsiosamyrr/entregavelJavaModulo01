public class Main {

    public static void main(String[] args) {

        System.out.println("SISTEMA DE PAGAMENTOS");

        Pix pix = new Pix(150.00);

        pix.pagar();
        pix.exibirDetalhes();

        Debito debito = new Debito(200.00, 500.00);

        debito.pagar();
        debito.exibirDetalhes();

        Credito credito = new Credito(300.00, 1000.00);

        credito.pagar();
        credito.exibirDetalhes();

        Pix pixInvalido = new Pix(0);

        pixInvalido.pagar();
        pixInvalido.exibirDetalhes();


        System.out.println();
        System.out.println("FIM DO PROGRAMA");
    }
}