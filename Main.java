public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao reino de Eldoria!/n");
        System.out.println("Aqui, guerreiros e magos lutam lado a lado para proteger o reino.");
        Personagem guerreiro1 = new Guerreiro("Aragorn", 100, 20.5, 5, 50);
        Personagem guerreiro2 = new Guerreiro("Thor", 120, 22.0, 6, 60);
        Personagem mago1 = new Mago("Gandalf", 80, 30.0, 10, 100);
        Personagem mago2 = new Mago("Merlin", 75, 28.5, 9, 95);

        java.util.ArrayList<Personagem> personagens = new java.util.ArrayList<>();

        personagens.add(guerreiro1);
        personagens.add(guerreiro2);
        personagens.add(mago1);
        personagens.add(mago2);

        for (Personagem p : personagens) {
            p.exibirStatus();
            p.usarHabilidade();
            System.out.println();
        }
    }
}
