public abstract class Personagem { 
    private String nome;
    private String classe;
    private int vida;
    private double poderDeAtaque;
    private int nivel;


    public Personagem(String nome, String classe, int vida, double poderDeAtaque, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.poderDeAtaque = poderDeAtaque;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public double getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vida);
        System.out.println("Poder de Ataque: " + poderDeAtaque);
        System.out.println("Nível: " + nivel);
    }

    protected abstract void usarHabilidade();

}
