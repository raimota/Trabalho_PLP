
public class Gerente extends Funcionario implements alteraAdicional {

    private double adicional;

    public Gerente(int ID, String nome, double salario, double adicional) {
        super(ID, nome, salario);
        this.adicional = adicional;
        //O desconto da previdência é maior para gerentes
        super.setPrevidencia(0.07);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public void alteraAdicional(double novo_percentual) {
        this.adicional = adicional * (1 + novo_percentual);
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.adicional;
    }
}
