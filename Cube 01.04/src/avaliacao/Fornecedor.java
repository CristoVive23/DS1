
package avaliacao;

import java.util.logging.Logger;

public class Fornecedor extends Juridica{
    
    private String produto;
    private static final Logger LOG = Logger.getLogger(Fornecedor.class.getName());

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual) {
        super(cnpj, inscricaoEstadual);
        this.produto = produto;
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
                "\nProduto: " + this.produto;
    }
    
    public String getProduto() {
        return produto;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    
    
}
