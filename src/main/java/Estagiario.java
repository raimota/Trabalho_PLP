
public class Estagiario extends Funcionario {

    private double vale_coxinha;

    public Estagiario(String nome, double salario, double vale_coxinha) {
        super(nome, salario);
        //Vale coxinha do estag
        this.vale_coxinha = vale_coxinha;
        //Estagiário não tem desconto na previdência
        super.setPrevidencia(0);
    }

    protected double getVale_coxinha() {
        return vale_coxinha;
    }

    protected void setVale_coxinha(double vale_coxinha) {
        this.vale_coxinha = vale_coxinha;
    }

    @Override
    protected double getSalario() {
        return super.getSalario() + this.getVale_coxinha();
    }
    
}
