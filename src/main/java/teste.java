
public class teste {

    public static void main(String[] args) {
        Estagiario teste = new Estagiario(0, "Fulano", 1500, 50);
        System.out.println(teste.getSalario());

        Secretaria teste2 = new Secretaria(1, "Natasha Caldeirão", 2500);
        System.out.println(teste2.getSalario());

        Gerente teste3 = new Gerente(2, "Michael Scott", 15000, 5000);
        System.out.println(teste3.getSalario());

        teste3.alteraAdicional(0.05);
        System.out.println(teste3.getSalario());
        
        Presidente teste4 = new Presidente(3, "Zé do Caixão", 50000);
        System.out.println(teste4.getSalario());
    }
}
