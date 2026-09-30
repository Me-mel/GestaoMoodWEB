
package gestaomoodweb.dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class UsuarioDAO {
    
    private final Conexao conexao;
    
    public UsuarioDAO(){conexao = new Conexao();}
    
    public boolean login(String usuario, String senha){
        
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        
        try(Connection conn = conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            
            return rs.next();
        } catch (SQLException e){throw new RuntimeException(e);}
    }
}
