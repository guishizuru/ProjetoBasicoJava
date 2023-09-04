public class Tijolo {
    private int id;
    private String cor;
    private int furos;

    public Tijolo(){

    }
    public Tijolo(int id, String  cor, int furos){
        this.id = id;
        this.cor = cor;
        this.furos = furos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setFuros(int furos) {
        this.furos = furos;
    }

    public int getFuros() {
        return furos;
    }

}
