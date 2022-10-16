
public class teste {

    public static void main(String[] args) {
        Estagiario teste = new Estagiario(0, "Fulano", 1500, 50);
        System.out.println(teste.getSalario());

        Secretaria teste2 = new Secretaria(1, "Natasha Caldeirão", 2500);
        System.out.println(teste2.getSalario());
    }
}
