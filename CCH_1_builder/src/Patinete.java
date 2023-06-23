public class Patinete {
    private String cor;
    private String marca;
    private int rodas;

    public Patinete() {
        this.cor = "";
        this.marca = "";
        this.rodas = 0;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public void usarPatinete() {
        System.out.println("Usando o patinete " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Quantidade de rodas: " + this.rodas);
    }
}