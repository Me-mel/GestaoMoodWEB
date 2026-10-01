
package gestaomoodweb.model;

import java.math.BigDecimal;

public class Produto {
    
    private int id;
    private String categoria;
    private String cor;
    private BigDecimal preco;
    private String marca;
    private String sku;
    private int quantidadeEstoque;
    private int idColecao;

    public Produto(int id, String categoria, String cor, BigDecimal preco, String marca, String sku, int quantidadeEstoque, int idColecao ) {
        this.id = id;
        this.categoria = categoria;
        this.cor = cor;
        this.preco = preco;
        this.marca = marca;
        this.sku = sku;
        this.quantidadeEstoque = quantidadeEstoque;
        this.idColecao = idColecao;
    }

    public int getId() {return id;}

    public String getCategoria() {return categoria;}

    public String getCor() {return cor;}

    public BigDecimal getPreco() {return preco;}

    public String getMarca() {return marca;}

    public String getSku() {return sku;}

    public int getQuantidadeEstoque() {return quantidadeEstoque;}

    public int getIdColecao() {return idColecao;}
    
    
}
