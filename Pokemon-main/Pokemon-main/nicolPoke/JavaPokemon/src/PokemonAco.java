public class PokemonAco extends Pokemon {

    public PokemonAco(String nome, String tipo, int hp, int ataque) {
        super(nome, tipo, hp, ataque);
    }

    @Override
    public void atacar(Pokemon oponente) {

        System.out.println(this.nome + " atacou " + oponente.getNome() + "!");
        if (oponente.tipo == "Fada") {
            oponente.receberDano(this.ataque + this.ataque, oponente);
        }
    }

    @Override
    public void receberDano(int quantidadeDano, Pokemon oponente) {
        if ((oponente.getTipo() == "Fada") || (oponente.getTipo() == "Gelo")
             || (oponente.getTipo() == "Pedra")) {
            this.hp -= quantidadeDano / 2;
        }
        else if ((oponente.getTipo() == "Fogo") || (oponente.getTipo() == "Terra")
             || (oponente.getTipo() == "Lutador")) {
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
