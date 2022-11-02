
public class Presidente extends Funcionario implements alteraAdicional {

    private double adicional_whisky, adicional_helicoptero, adicional_adicional;

    public Presidente(String nome, double salario) {
        super(nome, salario);
        super.setPrevidencia(0.15);
        this.adicional_whisky = 0.1;
        this.adicional_helicoptero = 0.3;
        this.adicional_adicional = 3.8;
    }

    @Override
    protected double getSalario() {
        // Calcula o salário líquido do presidente
        return (super.getSalario()
                + (super.getSalario()
                * (this.adicional_whisky
                + this.adicional_helicoptero
                + this.adicional_adicional)));
    }

    @Override
    public String toString() {
        return "Presidente{" + "ID = " + super.getID() + "; Nome = " + super.getNome() + "; Salário Livre = " + super.getSalario() + "; Previdência = " + super.getPrevidencia()
                + "; Adicional Whisky = " + adicional_whisky + "; Adicional Helicóptero = " + adicional_helicoptero + "; Adicional = " + adicional_adicional + '}';
    }

    @Override
    public void alteraAdicional(double novo_percentual) {

        this.adicional_whisky = this.adicional_whisky * (1 + (novo_percentual / 100));
        this.adicional_helicoptero = this.adicional_helicoptero * (1 + (novo_percentual / 100));
        this.adicional_adicional = this.adicional_adicional * (1 + (novo_percentual / 100));

    }

    protected double getAdicional_whisky() {
        return adicional_whisky;
    }

    protected void setAdicional_whisky(double adicional_whisky) {
        this.adicional_whisky = adicional_whisky;
    }

    protected double getAdicional_helicoptero() {
        return adicional_helicoptero;
    }

    protected void setAdicional_helicoptero(double adicional_helicoptero) {
        this.adicional_helicoptero = adicional_helicoptero;
    }

    protected double getAdicional_adicional() {
        return adicional_adicional;
    }

    protected void setAdicional_adicional(double adicional_adicional) {
        this.adicional_adicional = adicional_adicional;
    }

}
