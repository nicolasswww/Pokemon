public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Fuleco";
        int idade = 67;
        Pokemon poke1 = new Pokemon("Snivy", "Grama", 80, 24);
        Pokemon poke2 = new Pokemon("Mew", "Psiquico", 60, 39);

        PokemonFogo poke3 = new PokemonFogo("Charmander", "Fogo", 90, 15);
        poke3.atacar(poke1);

       
    }
}