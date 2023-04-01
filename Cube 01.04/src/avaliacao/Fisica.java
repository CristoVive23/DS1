
package avaliacao;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public abstract class Fisica extends Pessoa{
   
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    public Fisica() {
    }

    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String email, String telefone, Endereco endereco) {
        super(id, nome, email, telefone, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatar);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
