public class Main {
    public static void main(String[] args) {
        Patinete patinete = new PatineteBuilder()
                .setCor("Vermelho")
                .setMarca("Generica")
                .setRodas(2) 
                .build();  // Novo patinete retornado.

        patinete.usarPatinete();
    }
}
