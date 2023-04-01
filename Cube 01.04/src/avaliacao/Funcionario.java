
package avaliacao;

import java.time.LocalDate;

public abstract class Funcionario extends Fisica {

    
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected double salário;
    protected Setor setor;
 
    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, String matricula, double salário, Setor setor, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String email, String telefone, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, id, nome, email, telefone, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.salário = salário;
        this.setor = setor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    
    
}

   
