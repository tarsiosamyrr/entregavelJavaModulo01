public class Elevador {

    private int andarAtual;
    private double pesoMaximo;
    private double pesoAtual;

    public Elevador(int andarAtual, double pesoMaximo) {
        this.andarAtual = andarAtual;
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
    }

    public void setPesoAtual(double pesoAtual) {
        if (pesoAtual >= 0) {
            this.pesoAtual = pesoAtual;
        } else {
            System.out.println("O peso não pode ser negativo.");
        }
    }

    public void subir() {

        if (pesoAtual > pesoMaximo) {
            System.out.println("Não é possível subir!");
            System.out.println("Excesso de peso. O elevador permanece no andar "
                    + andarAtual + ".");
        } else {
            andarAtual++;

            System.out.println("Subida realizada com sucesso!");
            System.out.println("O elevador está agora no andar "
                    + andarAtual + ".");
        }
    }


    public int getAndarAtual() {
        return andarAtual;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }
}