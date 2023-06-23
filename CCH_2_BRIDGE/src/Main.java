public class Main {
    public static void main(String[] args) {
        Acessorios acessoriosPatinete = new AcessoriosPatinete();
        Patinete patinete = new PatineteGenerico(acessoriosPatinete);
        patinete.usarAcessorios();
    }
}