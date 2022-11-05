
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Intanciando a Classe empresa, para poder adicionar os funcionários
        Empresa empresa = new Empresa();
        Scanner leia = new Scanner(System.in); //ler os dados inseridos pelo usuário

        String opcao = "0", op; //essas duas variáveis serve para controlar erros do usuário
        int stop = 0; //também serve para controlar os erros de usuário é principalmento o while

        String nome_funcionario; //auto-explicativo
        String salario; //auto-explicativo
        String adicional; //auto-explicativo(Alterar o valor adicional para funcionários elegiveis a tal)

        //empresa.funcionario.add(new Estagiario("Fulano", 1200, 55));

        //While para controlar a atividade da aplicação
        while (true && stop != 5) {
            System.out.printf("Menu: \n"
                    + "[1] Adicionar Funcionário\n"
                    + "[2] Calcular Pagamento\n"
                    + "[3] Aumentar Adicional\n"
                    + "[4] Relatório Funcionários\n"
                    + "[5] Sair\n"
                    + "Escolha uma opção: \n");
            opcao = leia.nextLine();
            
            //Esse Try catch tenta transformar o valor digitado em inteiro 
            //Caso ele não consiga ele sobe uma excessão e retorna ao menu
            try {
                stop = Integer.parseInt(opcao);
                switch (Integer.parseInt(opcao)) {
                    case 1:
                        System.out.printf("Adicionar: \n"
                                + "[1] Estagiário\n"
                                + "[2] Secretária\n"
                                + "[3] Gerente\n"
                                + "[4] Presidente\n");
                        op = leia.nextLine();
                        switch (Integer.parseInt(op)) {
                            case 1:
                                System.out.println("Digite o Nome do Funcionário: ");
                                nome_funcionario = leia.nextLine();

                                System.out.println("Digite o salário: ");
                                salario = leia.nextLine();

                                System.out.println("Digite o Vale-Coxinha: ");
                                adicional = leia.nextLine();

                                try {
                                    //Apesar de ler todos os parametros em String ao adicionar convertemos para seus respectivos tipos
                                    //Conforme foi setado nas classes. Usou a váriavel "adicional" apenas para reaproveitar adional é o vale coxinha nesse caso
                                    empresa.funcionario.add(new Estagiario(nome_funcionario, Double.parseDouble(salario), Double.parseDouble(adicional)));
                                    System.out.println("Estagiário Cadastrado !");
                                } catch (Exception e) {
                                    System.out.println("Funcionário NÃO CADASTRADO! Alguns valores foram inseridos incorretamente.");
                                }
                                break;
                            case 2:
                                System.out.println("Digite o Nome do Funcionário: ");
                                nome_funcionario = leia.next();

                                System.out.println("Digite o salário: ");
                                //Consumir o buffer
                                salario = leia.nextLine();
                                salario = leia.nextLine();

                                try {
                                    empresa.funcionario.add(new Secretaria(nome_funcionario, Double.parseDouble(salario)));
                                    System.out.println("Secretária Cadastrada !");
                                } catch (Exception e) {
                                    System.out.println("Funcionário NÃO CADASTRADO! Alguns valores foram inseridos incorretamente.");
                                }
                                break;
                            case 3:
                                System.out.println("Digite o Nome do Funcionário: ");
                                nome_funcionario = leia.next();

                                System.out.println("Digite o salário: ");
                                //Consumir o buffer
                                salario = leia.nextLine();
                                salario = leia.nextLine();

                                System.out.println("Digite o percentual adicional: ");
                                adicional = leia.nextLine();

                                try {
                                    empresa.funcionario.add(new Gerente(nome_funcionario, Double.parseDouble(salario), Double.parseDouble(adicional)));
                                    System.out.println("Gerente Cadastrado !");
                                } catch (Exception e) {
                                    System.out.println("Funcionário NÃO CADASTRADO! Alguns valores foram inseridos incorretamente.");
                                }
                                break;
                            case 4:
                                System.out.println("Digite o Nome do novo Presidente: ");
                                nome_funcionario = leia.next();

                                System.out.println("Digite o salário: ");
                                //Consumir o buffer
                                salario = leia.nextLine();
                                salario = leia.nextLine();

                                try {
                                    empresa.funcionario.add(new Presidente(nome_funcionario, Double.parseDouble(salario)));
                                    System.out.println("Presidente Cadastrado !");
                                } catch (Exception e) {
                                    System.out.println("Funcionário NÃO CADASTRADO! Alguns valores foram inseridos incorretamente.");
                                }
                                break;
                            default:
                                System.out.println("Entrada Inválida !");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Digite o Id: ");
                        String id = leia.nextLine();

                        //Tem o Try Catch para não dar erro caso não haja o id digitado
                        try {
                            double result = empresa.funcionario.get(Integer.parseInt(id)).getSalario();
                            System.out.printf("R$ %.2f\n", result);
                        } catch (Exception e) {
                            System.out.println("Id Não encontrado");
                            continue;
                        }
                        break;
                    case 3:
                        System.out.println("Digite o Percentual (0-100): ");
                        String percentual = leia.nextLine();

                        //Tem o Try Catch para não dar erro
                        try {
                            Double.parseDouble(percentual);
                            //Acrescentar percentual adicional
                            for (int i = 0; i < empresa.funcionario.size(); i++) {
                                //Tem o Try Catch para não dar erros em funcionários que não são elegiveis ao aumento do percentual
                                try {
                                    empresa.funcionario.get(i).alteraAdicional(Double.parseDouble(percentual));
                                } catch (Exception e) {
                                    continue;
                                }
                            }
                            System.out.println("Adicionais Atualizados !");
                        } catch (Exception e) {
                            System.out.println("Não foi possivel alterar os valores. Valores inválidos");
                            continue;
                        }
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
                        break;
                }
            } catch (NumberFormatException e) {
                //Nesse Catch sobe a excessão que recomeça tudo de novo
                System.out.println("Entrada Inválida ! Apenas números");
            }
        }
    }
}
