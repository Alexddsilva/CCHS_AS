public class PatineteInfantil extends Patinete {
    @Override
    public void aceitarVisitante(Visitante visitante) {
        visitante.visitar(this);
    }

    public void ajustarAlturaAssento() {
        System.out.println("Ajustando altura!");
    }
}