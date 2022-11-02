
public class Gerente extends Funcionario implements alteraAdicional {

    private double adicional = 0.15;

    public Gerente(String nome, double salario, double adicional) {
        super(nome, salario);
        this.adicional = (adicional/100);
        //O desconto da previdência é maior para gerentes
        super.setPrevidencia(0.07);
    }

    protected double getAdicional() {
        return adicional;
    }

    protected void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public void alteraAdicional(double novo_percentual) {
        this.adicional = adicional * (1 + novo_percentual);
    }

    @Override
    protected double getSalario() {
        return super.getSalario() + (super.getSalario() * this.adicional);
    }

    @Override
    public String toString() {
        return "Gerente{" + "ID = " + super.getID() + "; Nome = " + super.getNome() + "; Salário Livre= " + super.getSalario() + "; Previdência = " + super.getPrevidencia()
                + "; Adicional = " + getAdicional() + '}';
    }
}
