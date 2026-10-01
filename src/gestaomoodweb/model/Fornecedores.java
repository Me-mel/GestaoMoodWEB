
package gestaomoodweb.model;

        
public class Fornecedores {
        private int id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    
   public Fornecedores(int id, String nome, String cnpj, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {return id;}

    public String getNome() {return nome;}

    public String getCnpj() {return cnpj;}

    public String getTelefone() {return telefone;}

    public String getEmail() {return email;}
    
}


