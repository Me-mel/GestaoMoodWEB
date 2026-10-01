
package gestaomoodweb.dao;

import gestaomoodweb.model.Fornecedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedoresDAO {
    
 private final Conexao conexao;

    public FornecedoresDAO() {
        conexao = new Conexao();
    }

    public List<Fornecedores> listarTodos() {

        String sql = "SELECT * FROM fornecedores";
        List<Fornecedores> fornecedores = new ArrayList<>();

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Fornecedores fornecedor = new Fornecedores(
                    rs.getInt("IdFor"),
                    rs.getString("nomeFornecedor"),
                    rs.getString("cnpj"),
                    rs.getString("telefone"),
                    rs.getString("email")
                );

                fornecedores.add(fornecedor);
            }

            return fornecedores;

        } catch (SQLException e) {throw new RuntimeException(e);}
    }
}