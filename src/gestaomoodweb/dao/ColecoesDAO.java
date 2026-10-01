
package gestaomoodweb.dao;

import gestaomoodweb.model.Colecoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColecoesDAO {
    
    private final Conexao conexao;
    
    public ColecoesDAO(){conexao = new Conexao();}
    
    public List<Colecoes> listarTodos() {

        String sql = "SELECT * FROM colecoes";
        List<Colecoes> colecoes = new ArrayList<>();

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Colecoes colecao = new Colecoes(
                    rs.getInt("IdColecoes"),
                    rs.getString("NomeColecoes"),
                    rs.getString("tema"),
                    rs.getDate("datal").toLocalDate(),
                    rs.getString("temporada"),
                    rs.getInt("idFornecedor")
                );

                colecoes.add(colecao);
            }

            return colecoes;

            
        }catch (SQLException e){throw new RuntimeException(e);
    }
    }
}
