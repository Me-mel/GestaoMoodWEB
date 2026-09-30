
package gestaomoodweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private final String URL = "jdbc:mysql://localhost:3306/gestaomood";
    private final String USUARIO = "root";
    private final String SENHA = "123456";
    
    public Connection conectar() {
        try{
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e){throw new RuntimeException(e);}
    }
}
