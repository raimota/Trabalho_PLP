
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner leia = new Scanner(System.in);

        int opcao = 0, op;
        String nome_funcionario;
        double salario;
        double adicional;
        double adicional_2;
        double adicional_3;
        double previdencia;
        empresa.funcionario.add(new Estagiario("Fulano", 1200, 55));

        while (opcao != 5) {
            System.out.printf("Menu: \n"
                    + "[1] Adicionar Funcionário\n"
                    + "[2] Calcular Pagamento\n"
                    + "[3] Aumentar Adicional\n"
                    + "[4] Relatório Funcionários\n"
                    + "[5] Sair\n"
                    + "Escolha uma opção: \n");

            try {
                opcao = leia.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada Inválida");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.printf("Adicionar: \n"
                            + "[1] Estagiário\n"
                            + "[2] Secretária\n"
                            + "[3] Gerente\n"
                            + "[4] Presidente\n");
                    op = leia.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Digite o Nome do Funcionário: ");
                            nome_funcionario = leia.next();
                            System.out.println("Digite o salário: ");
                            salario = leia.nextDouble();
                            System.out.println("Digite o Vale-Coxinha: ");
                            adicional = leia.nextDouble();
                            empresa.funcionario.add(new Estagiario(nome_funcionario, salario, adicional));
                            System.out.println("Estagiário Cadastrado !");
                            break;
                        case 2:
                            System.out.println("Digite o Nome do Funcionário: ");
                            nome_funcionario = leia.next();
                            System.out.println("Digite o salário: ");
                            salario = leia.nextDouble();
                            empresa.funcionario.add(new Secretaria(nome_funcionario, salario));
                            System.out.println("Secretária Cadastrada !");
                            break;
                        case 3:
                            System.out.println("Digite o Nome do Funcionário: ");
                            nome_funcionario = leia.next();
                            System.out.println("Digite o salário: ");
                            salario = leia.nextDouble();
                            System.out.println("Digite o percentual adicional: ");
                            adicional = leia.nextDouble();
                            empresa.funcionario.add(new Gerente(nome_funcionario, salario, adicional));
                            System.out.println("Gerente Cadastrado !");
                            break;
                        case 4:
                            System.out.println("Digite o Nome do novo Presidente: ");
                            nome_funcionario = leia.next();
                            System.out.println("Digite o salário: ");
                            salario = leia.nextDouble();
                            empresa.funcionario.add(new Presidente(nome_funcionario, salario));
                            System.out.println("Presidente Cadastrado !");
                            break;
                        default:
                            System.out.println("Entrada Inválida !");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o Id: ");
                    int id = leia.nextInt();
                    try {
                        double result = empresa.funcionario.get(id).getSalario();
                        System.out.printf("R$ %.2f\n", result);
                    } catch (Exception e) {
                        System.out.println("Id Não encontrado");
                        continue;
                    }
                    break;
                case 3:
                    System.out.println("Digite o Id: ");
                    double percentual = leia.nextDouble();
                    //Acrescentar percentual adicional
                    for (int i = 0; i < empresa.funcionario.size(); i++) {
                        try {
                            empresa.funcionario.get(i).alteraAdicional(percentual);
                        } catch (Exception e) {
                            continue;
                        }
                    }
                    System.out.println("Adicionais Atualizados");
                    break;
                case 4:
                    for (int i = 0; i < empresa.funcionario.size(); i++) {
                        System.out.println(empresa.toString().split(",")[i]);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Valor Inválido");
            }
        }

        //System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        //int n = empresa.funcionario.size();
        //System.out.print(n);
        /*
        for (int i = 0; i < n; i++) {
            System.out.printf("Posição %d - %s\n", i, empresa.funcionario.get(i));
        }
         */
    }
}
