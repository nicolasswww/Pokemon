public class PokemonFogo extends Pokemon {

    public PokemonFogo(String nome, String tipo, int hp, int ataque) {
        super(nome, tipo, hp, ataque);
    }

    @Override
    public void atacar(Pokemon oponente) {

        System.out.println(this.nome + " atacou " + oponente.getNome() + "!");
        if (oponente.tipo == "Grama") {
            oponente.receberDano(this.ataque + this.ataque, oponente);
        }
    }

    @Override
    public void receberDano(int quantidadeDano, Pokemon oponente) {
        if ((oponente.getTipo() == "Grama") || (oponente.getTipo() == "Gelo")
             || (oponente.getTipo() == "Inseto") || (oponente.getTipo() == "Aço")) {
            this.hp -= quantidadeDano / 2;
        }
        else if ((oponente.getTipo() == "Água") || (oponente.getTipo() == "Terra")
             || (oponente.getTipo() == "Pedra")) {
            this.hp -= quantidadeDano * 2;
        }
        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println(this.nome + " desmaiou!");
        }
        if (this.hp > 0) {
            System.out.println(this.nome + " agora tem " + this.hp + " de HP remanescente.");
        }
    }
}
