
package avaliacao;

import java.time.LocalDate;

public class Medico extends Funcionario{
  
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, double salário, Setor setor, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String email, String telefone, Endereco endereco) {
        super(cpf, rg, matricula, salário, setor, genero, estadoCivil, dataNascimento, id, nome, email, telefone, endereco);
        this.crm = crm;
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
                "\nGenêro: " + super.genero +
                "\nEstado Civil: " + super.estadoCivil +
                "\nData de Nascimento: " + super.dataNascimento +
                "\nCPF: " + super.cpf +
                "\nRG: " + super.rg +
                "\nMatrícula: " + super.matricula +
                "\nSetor: " + super.setor +
                "\nSalário: " + super.salário +
                "\nCRM: " + this.crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    
}