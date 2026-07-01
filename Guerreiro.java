public class Guerreiro extends Personagem {
    private int energia;

    public Guerreiro(String nome, int vida, double poderDeAtaque, int nivel, int energia) {
        super(nome, "Guerreiro", vida, poderDeAtaque, nivel);
        this.energia = energia;
    }

    public void usarHabilidade() {
        System.out.println(getNome() + " Ataca com sua espada!");
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Energia: " + energia);
    }

}
