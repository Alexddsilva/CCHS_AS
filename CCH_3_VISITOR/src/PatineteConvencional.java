public class PatineteConvencional extends Patinete {
    @Override
    public void aceitarVisitante(Visitante visitante) {
        visitante.visitar(this);
    }

    public void dobrar() {
        System.out.println("Dobrando patinete :(");
    }

    public void desdobrar() {
        System.out.println("Desdobrando patinete !!!");
    }
}