
public class Gerente extends Funcionario implements alteraAdicional {

    private double adicional = 0.15;

    public Gerente(String nome, double salario, double adicional) {
        super(nome, salario);
        this.adicional = (adicional / 100);
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
        this.adicional = adicional * (1 + (novo_percentual / 100)); //Vamos receber a alteração atráves de números de ponto flutuante > 0
    }

    @Override
    protected double getSalario() {
        return super.getSalario()
                + (super.getSalario() * this.adicional);
    }

    //Pegando o toString da classe mãe e adicinando o adicional
    @Override
    public String toString() {
        return super.toString() + "; Adicional = " + getAdicional() + '}';
    }
}
