class PatineteGenerico extends Patinete {
    public PatineteGenerico(Acessorios acessorios) {
        super(acessorios);
    }

    public void usarAcessorios() {
        acessorios.tocarCampainha();
        acessorios.acenderFarol();
    }
}