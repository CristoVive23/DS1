
package avaliacao;


public enum UnidadeFederativa {
    
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sao Paulo", "SP"),
    RIO_DE_JANEIRO("Rio_de_Janeiro", "RJ"),
    ACRE("Acre", "AC"),
    AMAPÁ("Amapa", "AP"),
    ALAGOAS("Alagoas", "AL"),
    AMAZONAS("Amazonas", "AM"),
    CEARA("Ceara", "CE"),
    ESPIRITO_SANTO("Espirito_Santo", "ES"),
    GOIAS("Goias", "GO"),
    MARANHAO("Maranhao", "MA"),
    MATO_GROSSO_DO_SUL("Mato_Grosso_do_Sul", "MS"),
    MATO_GROSSO("Mato_Grosso", "MT"),
    MINAS_GERAIS("Minas_Gerais", "MG"),
    PARA("Para", "PA"),
    PARAIBA("Paraiba", "PB"),
    PARANA("Parana", "PR"),
    PERNAMBUCO("Pernambuco", "PE"),
    PIAUI("Piaui", "PI"),
    RIO_GRANDE_DO_NORTE("Rio_Grande_do_Norte", "RN"),
    RIO_GRANDE_DO_SUL("Rio_Grande_do_Sul", "RS"),
    RONDONIA("Rondonia", "RO"),
    RORAIMA("Roraima", "RR"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    SERGIPE("Sergipe","SE"),
    TOCANTINS("Tocantins", "TO"),
    DISTRITO_FEDERAL("Distrito_Federal", "DF");
    
    protected String nome;
    protected String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
