
package avaliacao;

public enum Genero {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
    
    protected String texto;
    protected char valor;

    private Genero(char valor, String texto) {
        this.texto = texto;
        this.valor = valor;
    }

  

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

}
