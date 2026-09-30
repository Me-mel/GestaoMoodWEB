/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaomoodweb.model;

public class Cliente {
   
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    
    public Cliente (int id, String nome, String email, String cpf, String telefone, String endereco){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public int getId(){return id;}
    public String getNome(){return nome;}
    public String getEmail(){return email;}
    public String getCpf(){return cpf;}
    public String getTelefone(){return telefone;}
    public String getEndereco(){return endereco;}
}
