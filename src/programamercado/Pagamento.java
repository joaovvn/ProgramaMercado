package programamercado;
public class Pagamento {
    private double salariobruto, inss, irrf, salarioliquido;

    public double getSalariobruto() {
        return salariobruto;
    }

    public void setSalariobruto(double salariobruto) {
        this.salariobruto = salariobruto;
    }
    
    public double getInss() {
        if(this.salariobruto <= 1556.94){
            this.inss = this.salariobruto/100*8;    
        }
        else if(this.salariobruto > 1556.94 && this.salariobruto <= 2594.92){
            this.inss = this.salariobruto/100*9;    
        }
        else if(this.salariobruto > 2594.92 && this.salariobruto <= 5189.82){
            this.inss = this.salariobruto/100*10;    
        }
        else if(this.salariobruto > 5189.82){
            this.inss = this.salariobruto/100*11;    
        }
        return inss;
    }
    public double getIrrf() {
        double salariodescinss = this.salariobruto - getInss();
        if(salariodescinss <= 1903.99){
            this.irrf = 0;
        }
        else if(salariodescinss > 1903.99 && salariodescinss <= 2826.65) {
            this.irrf = salariodescinss/100*7.5;
        }
        else if(salariodescinss > 2826.65 && salariodescinss <= 3751.05) {
            this.irrf = salariodescinss/100*15;
        }
        else if(salariodescinss > 3751.05 && salariodescinss <= 4664.68) {
            this.irrf = salariodescinss/100*22.5;
        }
        else if(salariodescinss > 4664.68) {
            this.irrf = salariodescinss/100*27.5;
        }
        return irrf;
    }
    public double getSalarioliquido() {
        this.salarioliquido = this.salariobruto - getInss() - getIrrf();
        return salarioliquido;
    }
}
