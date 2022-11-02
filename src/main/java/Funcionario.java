
public abstract class Funcionario implements alteraAdicional{

    private static int count = -1; 
    private int ID;
    private String nome;
    private double salario;
    private double previdencia;
    
    protected Funcionario(String nome, double salario) {
        this.ID = ++count; ;
        this.nome = nome;
        this.salario = salario;
        // Desconto fixo de um sistema de previdência da empresa
        this.previdencia = 0.05;
    }

    protected int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "ID = " + ID + "; Nome = " + nome + "; Salário Bruto = " + salario + "; Previdência = " + previdencia + '}';
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    protected String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    protected double getSalario() {
        // Calcula o salário líquido
        return (salario * (1 - previdencia));
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    protected double getPrevidencia() {
        return previdencia;
    }

    protected void setPrevidencia(double previdencia) {
        this.previdencia = previdencia;
    }

    @Override
    public void alteraAdicional(double novo_percentual) {
    }
}
