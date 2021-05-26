package programamercado;
public class Fornecedor {
    private String nome;
    private String telefone;
    private String contato;
    private Endereço end = new Endereço();

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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }   
}