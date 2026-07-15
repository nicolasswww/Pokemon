public abstract class Pokemon {
    protected String nome;
    protected String tipo;
    protected int hp;
    protected int ataque;

    public Pokemon(String nome, String tipo, int hp, int ataque) {
        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
        this.ataque = ataque;
    }

    public void atacar(Pokemon oponente) {
        System.out.println(this.nome + " atacou " + oponente.getNome() + "!");
        oponente.receberDano(this.ataque, this);
    }

    public void receberDano(int quantidadeDano, Pokemon oponente) {
        this.hp -= quantidadeDano;
        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println(this.nome + " desmaiou!");
        } else {
            System.out.println(this.nome + " agora tem " + this.hp + " de HP remanescente.");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getHp() {
        return this.hp;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAtaque() {
        return ataque;
    }

   
}