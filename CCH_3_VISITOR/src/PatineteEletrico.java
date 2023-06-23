public class PatineteEletrico extends Patinete {
    @Override
    public void aceitarVisitante(Visitante visitante) {
        visitante.visitar(this);
    }

    public void ligar() {
        System.out.println("Ligando Patinete!!!");
    }

    public void desligar() {
        System.out.println("Desligando Patinete :(");
    }
}