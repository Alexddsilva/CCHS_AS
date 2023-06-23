public class Main {
    public static void main(String[] args) {
        PatineteEletrico patineteEletrico = new PatineteEletrico();
        PatineteConvencional patineteConvencional = new PatineteConvencional();
        PatineteInfantil patineteInfantil = new PatineteInfantil();

        Visitante verificadorPatinete = new TestaPatinete();

        patineteEletrico.aceitarVisitante(verificadorPatinete);
        patineteConvencional.aceitarVisitante(verificadorPatinete);
        patineteInfantil.aceitarVisitante(verificadorPatinete);
    }
}
