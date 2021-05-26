package programamercado;
public class Pessoa {
    String nome;
    String telefone;
    String CPF;
    String RG;
    Endereço end = new Endereço();

    public Pessoa(){
        end = new Endereço();
    }

    public Endereço getEnd() {
        return end;
    }

    public void setEnd(Endereço end) {
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}