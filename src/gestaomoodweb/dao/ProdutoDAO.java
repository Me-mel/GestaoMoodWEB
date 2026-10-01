
package gestaomoodweb.dao;

import gestaomoodweb.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    
    private final Conexao conexao;
    
    public ProdutoDAO(){conexao = new Conexao();}
    
    public List<Produto> listarTodos(){
        
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList<>();
        
        try(Connection conn = conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()){
            while (rs.next()){
                Produto produto = new Produto(
                rs.getInt("idProduto"),
                rs.getString("categoria"),
                rs.getString("cor"),
                rs.getBigDecimal("preco"),
                rs.getString("marca"),
                rs.getString("SKU"),
                rs.getInt("Quantidade"),
                rs.getInt("idColecao")
                );
                
                produtos.add(produto);
            }
            return produtos;
        }catch (SQLException e){throw new RuntimeException(e);}
    }
}
