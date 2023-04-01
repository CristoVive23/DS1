
package avaliacao;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class PrestacaoServico extends Juridica{
    
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico() {
    }

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual) {
        super(cnpj, inscricaoEstadual);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nLogradouro: " + super.endereco.logradouro +
                "\nNúmero: " + super.endereco.numero +
                "\nComplemento: " + super.endereco.complemento +
                "\nCEP: " + super.endereco.cep +
                "\nCidade: " + super.endereco.cidade +
                "\nUnidade Federativa: " + super.endereco.uf +     
                "\nCNPJ: " + super.cnpj +
                "\nInscrição Estadual: " + super.inscricaoEstadual +
                "\nContrato Inicío: " + this.contratoInicio + 
                "\nContrato Fim: " + this.contratoFim;
    }
    
    

    public int getContratoInicio() {
        return Period.between(this.contratoInicio, LocalDate.now()).getYears();
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public String getContratoFim() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return contratoFim.format(formatar);   
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    
    
}
