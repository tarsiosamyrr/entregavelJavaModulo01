public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de controle de elevador");

        Elevador elevador = new Elevador(0, 500);

        System.out.println("CENÁRIO 1: SUBIDA BEM-SUCEDIDA");


        elevador.setPesoAtual(300);

        System.out.println("Peso atual: " + elevador.getPesoAtual() + " kg");
        System.out.println("Peso máximo: " + elevador.getPesoMaximo() + " kg");
        System.out.println("Andar atual: " + elevador.getAndarAtual());

        elevador.subir();


        System.out.println("CENÁRIO 2: EXCESSO DE PESO");

        elevador.setPesoAtual(600);

        System.out.println("Peso atual: " + elevador.getPesoAtual() + " kg");
        System.out.println("Peso máximo: " + elevador.getPesoMaximo() + " kg");
        System.out.println("Andar atual: " + elevador.getAndarAtual());

        elevador.subir();


        System.out.println("Fim do programa");
    }
}