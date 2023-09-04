public class ImpressoraDeTijolos {

    public static void ImprimirTijolo(Tijolo tijolo) throws InterruptedException {
        System.out.println("Tijolo de numero : " + tijolo.getId());
        System.out.println("Cor : " + tijolo.getCor());
        System.out.println("Furos : " + tijolo.getFuros());
        System.out.println("------------------------------------------");
        Thread.sleep(50);
    }
}
