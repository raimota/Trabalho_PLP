
public abstract class Funcionario {

    private int ID;
    private String nome;
    private double salario;
    private double previdencia;

    public Funcionario(int ID, String nome, double salario) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
        // Desconto fixo de um sistema de previdência da empresa
        this.previdencia = 0.05;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        // Calcula o salário líquido
        return (salario * (1 - previdencia));
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPrevidencia() {
        return previdencia;
    }

    public void setPrevidencia(double previdencia) {
        this.previdencia = previdencia;
    }
}
