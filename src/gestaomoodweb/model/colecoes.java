
package gestaomoodweb.model;

import java.time.LocalDate;

public class Colecoes {
    
    private int id;
    private String nome;
    private String tema;
    private LocalDate data;
    private String temporada;
    private int idFornecedor;

    public Colecoes(int id, String nome, String tema, LocalDate data, String temporada, int idFornecedor) {
        this.id = id;
        this.nome = nome;
        this.tema = tema;
        this.data = data;
        this.temporada = temporada;
        this.idFornecedor = idFornecedor;
    }

    public int getId() {return id;}

    public String getNome() {return nome;}

    public String getTema() {return tema;}

    public LocalDate getData() {return data;}

    public String getTemporada() {return temporada;}

    public int getIdFornecedor() {return idFornecedor;}
    
    
}
