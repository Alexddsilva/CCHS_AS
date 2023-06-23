public class PatineteBuilder {
    private Patinete patinete;

    public PatineteBuilder() {
        this.patinete = new Patinete();
    }

    public PatineteBuilder setCor(String cor) {
        this.patinete.setCor(cor);
        return this;
    }

    public PatineteBuilder setMarca(String marca) {
        this.patinete.setMarca(marca);
        return this;
    }

    public PatineteBuilder setRodas(int rodas) {
        this.patinete.setRodas(rodas);
        return this;
    }

    public Patinete build() {
        return this.patinete;
    }
}