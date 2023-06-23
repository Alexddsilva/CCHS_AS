public interface Visitante {
    void visitar(PatineteEletrico patinete);
    void visitar(PatineteConvencional patinete);
    void visitar(PatineteInfantil patinete);
}