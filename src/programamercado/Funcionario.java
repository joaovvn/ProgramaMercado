package programamercado;

public class Funcionario extends Pessoa{
    private String matricula;
    private double salario;
    private String cargo;
    private String setor;
    private Pagamento pag;
    
    public Funcionario() {
        pag = new Pagamento();
    }
    
    public String CalcularPagamento() {
        String folhapag;
        pag.setSalariobruto(this.salario);
        folhapag = "Folha de Pagamento" + "\nNome: " + super.getNome() +  "\nSalário Bruto: R$ " + this.salario + "\nSalário Liquido: R$ " + pag.getSalarioliquido() + "\nINSS: R$ " + pag.getInss()
+ "\nIRFF: R$ " + pag.getIrrf();  
        return folhapag;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
