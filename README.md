# Trabalho_PLP
Trabalho de PLP(Paradigmas de Linguagem de Programação) - Faculdade

### Sistema da Empresa XYZ

1ª Parte do trabalho
Observando-se cada classe isoladamente, nota-se que cada uma representa bem um tipo de funcionário, porém, quando observadas em conjunto, várias modificações podem ser introduzidas para se aproveitar as funcionalidades do paradigma orientada a objetos, tais como herança e polimorfismo.  Assim defina uma classe abstrata para armazenar os atributos comuns para todos os funcionários e método(s) abstrato(s) que as subclasses deverão implementar, em seguida, reescreva as classes acima de forma aproveitem as funcionalidades da orientação a objetos vistas na disciplina. Note que o adicional de salário é definido somente para alguns funcionários, assim você deve definir uma interface com somente o método alteraAdicional(double novo_percentual), a interface deverá ser implementada em todas as classes que precisarem dessa funcionalidade.
 
2ª Parte do trabalho
Após você reescrever as classes implemente a classe Empresa que armazena os funcionários da empresa utilizando um container (coleção objetos). Na Linguagem Java os containers estão disponíveis em um framework chamado Java Collections, o framework possui diversas classes genéricas para armazenamento de dados.  Uma classe genérica (ou parametrizada) é classe cuja definição depende de um ou mais tipos como parâmetros.  O mecanismo na linguagem que permite a construção de classes genéricas chama polimorfismo paramétrico.  
 
No nosso caso utilizaremos como container a classe ArrayList, para um usuário conseguir administrar os funcionários armazenados na classe Empresa, a classe disponibiliza métodos com as seguintes operações:
Adicionar um funcionário;
Calcular pagamento do funcionário.
Aumentar o adicional de todos os funcionários.
Relatório dos funcionários da empresa.
 
Para saber mais sobre ArrayList acessem: 
https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298     
 
Para testar a classe Empresa implemente uma classe principal com a função main(), que apresenta um menu para o usuário escolher qual das operações acima irá executar, em seguida é executado o método correspondente a operação, e disponibilizado novamente o menu para que usuário escolha uma próxima operação, e é claro, você deve disponibilizar no menu uma opção para finalizar o programa.
Na implementação dos métodos da classe Empresa as informações necessárias para a sua execução devem ser passadas por parâmetro, ou seja, os métodos não realizam a entrada de dados (Scanner) e nem saída de dados (System.out.println).
 
Por exemplo, se for solicitada a 1ª operação (Adicionar um funcionário) o usuário deverá informar os dados do funcionário, em seguida é criado um novo funcionário (objeto) e a classe principal faz a chamada do método da classe Empresa informando o objeto a ser inserido, que realiza inserção e atualização no container.
 
Detalhamento das operações
1)   Para adicionar um funcionário, no método da classe Empresa responsável por essa operação, o método recebe como parâmetro um objeto que será adicionado no container.
2)   Para calcular o pagamento do funcionário o método da classe Empresa responsável por essa operação, recebe por parâmetro o ID do funcionário, em seguida busca no container o funcionário calcula e devolve o valor do salário do funcionário para a classe principal.
3) Para aumentar o adicional de todos funcionários o método da classe Empresa responsável por essa operação recebe o percentual de aumento, um valor entre 0.0 e 1.0, em seguida, para todos os funcionários da empresa que tem direito ao adicional é aplicado o percentual de aumento.
5)   Para fazer o relatório dos funcionários da empresa o método da classe Empresa responsável por essa operação deve devolver uma String com a lista com todos os funcionários da empresa contendo o ID, o nome do funcionário e o salário de cada um dos funcionários que estão armazenados no container. Na tela deve ser impresso um funcionário por linha.  Sugestão reescreva o método toString() da classe Empresa que armazena o container.
 
Observações importantes
 
1)   O programa deve estar bem documentado e implementado na linguagem Java, aplicando os conhecimentos sobre paradigma orientado a objetos e tipo abstrato de dados vistos nesse semestre.
 
2)   Este trabalho pode ser desenvolvido em grupos. Como este trabalho pode ser feito em grupo, evidentemente você pode “discutir”' o problema dado com outros grupos, inclusive as “dicas”' para chegar às soluções, mas você deve ser responsável pela solução final e pelo desenvolvimento do seu programa. Ou seja, qualquer tentativa de fraude será punida com a nota zero. Para maiores esclarecimentos leiam o documento “Orientações para Desenvolvimento de Trabalhos Práticos”.
 
3)   O trabalho será a avaliado de acordo com os seguintes critérios:
Funcionamento do programa, ou seja, programas com erros de compilação e não executando receberão nota 0 (zero);
O quão fiel é o programa quanto à descrição do enunciado;
Clareza e organização, programas com código confuso (linhas longas, variáveis com nomes não-significativos, etc.) e desorganizado (sem indentação, sem comentários, etc.) também serão penalizados
E principalmente a aplicação dos conceitos de orientação a objetos vistos durante as aulas da disciplina;
