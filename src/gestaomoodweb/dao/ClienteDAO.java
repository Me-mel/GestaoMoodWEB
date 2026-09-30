
package gestaomoodweb.dao;

import gestaomoodweb.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    
    private Conexao conexao;
    
    public ClienteDAO(){conexao = new Conexao();}
    
    public void cadastrar(Cliente cliente){
        String sql = "INSERT INTO cliente"
                + "(nome_cliente, email, CPF, telefone_para_contato, endereco)"
                + "VALUES (?, ?, ?, ?, ?)";
        
        try(Connection conn = conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getEndereco());
            
            stmt.executeUpdate();
        } catch (SQLException e){throw new RuntimeException(e);}
        }
    }

