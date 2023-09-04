import java.util.ArrayList;
import java.util.Random;

public class ListaDeTijolos {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        ArrayList<Tijolo> listaDeTijolos = new ArrayList<>();
        int contadorDeTijolosPretosepar = 0;
        int contadorDeTijolosPretosImpar = 0;
        int contadorDeTijolosBrancospar =0;
        int contadorDeTijolosBrancosImpar =0;
        int numeroAleatorioDeCorTijolos;
        int numeroDeFuros;
        String corDeTijolos;


        for (int i = 0; i < 100 ; i++) {
            numeroDeFuros = random.nextInt(9);
            numeroAleatorioDeCorTijolos = random.nextInt(2);

            if(numeroAleatorioDeCorTijolos == 1){
                corDeTijolos = "Branco";
            }else {
                corDeTijolos = "Preto";
            }

            Tijolo tijolo  = new Tijolo(i + 1,corDeTijolos,numeroDeFuros);
            listaDeTijolos.add(tijolo);
        }

       for(Tijolo Tijolo : listaDeTijolos) {
           if (Tijolo.getCor().equals("Preto") && Tijolo.getFuros() % 2 == 0) {
               contadorDeTijolosPretosepar++;
           } else if (Tijolo.getCor().equals("Preto") && Tijolo.getFuros() % 2 != 0) {
               contadorDeTijolosPretosImpar++;
           } else if (Tijolo.getCor().equals("Branco") && Tijolo.getFuros() % 2 == 0) {
               contadorDeTijolosBrancospar++;
           } else if (Tijolo.getCor().equals("Branco") && Tijolo.getFuros() % 2 != 0) {
               contadorDeTijolosBrancosImpar++;
           }
           if (Tijolo.getId() == 76) {
               ImpressoraDeTijolos.ImprimirTijolo(Tijolo);
           }
       }

       System.out.println("Quantidade de tijolos Pretos com furos Pares é : " + contadorDeTijolosPretosepar);
        System.out.println("Quantidade de tijolos Pretos com furos Impares é :" + contadorDeTijolosPretosImpar);
        System.out.println("Quantidade de tijolos Brancos com furos Pares é :" + contadorDeTijolosBrancospar);
        System.out.println("Quantidade de tijolos Brancos com furos Impares é : " + contadorDeTijolosBrancosImpar);
        System.out.println("Quantidade de tijolos Pretos é :" + (contadorDeTijolosBrancospar + contadorDeTijolosBrancosImpar)+
                "\nQuantidade de tijolos brancos é : " + (contadorDeTijolosPretosepar + contadorDeTijolosPretosImpar));
        System.out.println("Tamanho da lista de tijolos: " + listaDeTijolos.size());
    }
}


