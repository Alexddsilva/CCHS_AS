abstract class Patinete {
    protected Acessorios acessorios;

    public Patinete(Acessorios acessorios) {
        this.acessorios = acessorios;
    }

    public abstract void usarAcessorios();
}