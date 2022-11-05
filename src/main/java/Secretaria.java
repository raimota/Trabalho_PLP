
public class Secretaria extends Funcionario {

    public Secretaria(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return super.toString() + "}";
    }
    
}
