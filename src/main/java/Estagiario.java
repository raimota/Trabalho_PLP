
public class Estagiario extends Funcionario {

    private double vale_coxinha;

    public Estagiario(int ID, String nome, double salario, double vale_coxinha) {
        super(ID, nome, salario);
        this.vale_coxinha = vale_coxinha;
        super.setPrevidencia(0);
    }

    public double getVale_coxinha() {
        return vale_coxinha;
    }

    public void setVale_coxinha(double vale_coxinha) {
        this.vale_coxinha = vale_coxinha;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.getVale_coxinha();
    }
}
