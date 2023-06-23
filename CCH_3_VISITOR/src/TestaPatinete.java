public class TestaPatinete implements Visitante {
    @Override
    public void visitar(PatineteEletrico patinete) {
        patinete.ligar();
        patinete.desligar();
    }

    @Override
    public void visitar(PatineteConvencional patinete) {
        patinete.dobrar();
        patinete.desdobrar();
    }

    @Override
    public void visitar(PatineteInfantil patinete) {
        patinete.ajustarAlturaAssento();
    }
}
