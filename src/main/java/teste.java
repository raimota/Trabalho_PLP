
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner leia = new Scanner(System.in);
        empresa.funcionario.add(new Estagiario("Rai", 3000, 900));
        empresa.funcionario.add(new Gerente("Scott", 15000, 0.15));
        empresa.funcionario.add(new Presidente("Zézin", 40000));

        System.out.println(empresa.funcionario.get(0).getSalario());
        System.out.println(empresa.funcionario.get(2).getSalario());
        System.out.println(empresa.funcionario.get(1).getSalario());

        /* Acrescentar percentual adicional
        int n = empresa.funcionario.size();
        for (int i = 0; i <= n; i++) {
            try {
                empresa.funcionario.get(i).alteraAdicional(0.10);
            } catch (Exception e) {
                continue;
            }

        }
        */
        System.out.println(empresa.funcionario.get(0).getSalario());
        System.out.println(empresa.funcionario.get(2).getSalario());
        System.out.println(empresa.funcionario.get(1).getSalario());

        /*
        System.out.printf("Percorrendo o ArrayList \n");
        int n = empresa.funcionario.size();
        //System.out.print(n);
        //System.out.println(empresa.toString());
        
        
        for (int i = 0; i < n; i++) {
            System.out.println(empresa.toString().split(",")[i]);
        }
         */
    }
}
