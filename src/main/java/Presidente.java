
public class Presidente extends Funcionario implements alteraAdicional {

    private double adicional_whisky, adicional_helicoptero, adicional_adicional;

    public Presidente(int ID, String nome, double salario) {
        super(ID, nome, salario);
        super.setPrevidencia(0.15);
        this.adicional_whisky = 0.9;
        this.adicional_helicoptero = 0.7;
        this.adicional_adicional = 3.8;
    }

    @Override
    public double getSalario() {
        // Calcula o salário líquido do presidente
        return (super.getSalario() + this.adicional_whisky
                + this.adicional_helicoptero + this.adicional_adicional);
    }

    @Override
    public void alteraAdicional(double novo_percentual) {
        this.adicional_whisky = 0.9 * (1 + novo_percentual);
        this.adicional_helicoptero = 0.7 * (1 + novo_percentual);
        this.adicional_adicional = 3.8 * (1 + novo_percentual);
    }

    public double getAdicional_whisky() {
        return adicional_whisky;
    }

    public void setAdicional_whisky(double adicional_whisky) {
        this.adicional_whisky = adicional_whisky;
    }

    public double getAdicional_helicoptero() {
        return adicional_helicoptero;
    }

    public void setAdicional_helicoptero(double adicional_helicoptero) {
        this.adicional_helicoptero = adicional_helicoptero;
    }

    public double getAdicional_adicional() {
        return adicional_adicional;
    }

    public void setAdicional_adicional(double adicional_adicional) {
        this.adicional_adicional = adicional_adicional;
    }

}
