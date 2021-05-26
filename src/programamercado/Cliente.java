package programamercado;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends Pessoa{
    private double limite;
    private String codcliente;
    private String mesnascimento;
    private String primeiracompra;

    public String getMesnascimento() {
        return mesnascimento;
    }

    public void setMesnascimento(String mesnascimento) {
        this.mesnascimento = mesnascimento;
    }

    public String getPrimeiracompra() {
        return primeiracompra;
    }

    public void setPrimeiracompra(String primeiracompra) {
        this.primeiracompra = primeiracompra;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }
    
    public String salvar() {
        try {
            FileWriter fw = new FileWriter("clientes.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: " + this.nome); 
            pw.println("Código: " + this.codcliente);
            pw.println("Limite: R$" + this.limite);
            pw.println("Mês do Aniversário: " + this.mesnascimento);
            pw.println("Primeira Compra: " + this.primeiracompra);
            pw.println("Telefone: " + this.telefone);
            pw.println("CPF: " + this.CPF);
            pw.println("RG: " + this.RG);
            pw.println("==================================");
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
    public static String Ler() {
        Path caminho = Paths.get("clientes.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            return leitura;
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    }   