
package avaliacao;

public class Juridica extends Pessoa{
   
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        
    
    }

    @Override
    public String toString() {
        return "Juridica{" + "cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + '}';
    }
}