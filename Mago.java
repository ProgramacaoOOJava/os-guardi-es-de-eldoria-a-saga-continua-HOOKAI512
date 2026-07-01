public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int vida, double poderDeAtaque, int nivel, int mana) {
        super(nome, "Mago", vida, poderDeAtaque, nivel);
        this.mana = mana;
    }

    public void usarHabilidade() {
        System.out.println(getNome() + " Conjura Amaterasu!");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Mana: " + mana);
    }

}
