
package avaliacao;

import java.time.LocalDate;


public class Advogado extends Funcionario{
    
    private String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String matricula, double salário, Setor setor, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String email, String telefone, Endereco endereco) {
        super(cpf, rg, matricula, salário, setor, genero, estadoCivil, dataNascimento, id, nome, email, telefone, endereco);
        this.oab = oab;
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
                "\nOAB: " + this.oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
     


    
}