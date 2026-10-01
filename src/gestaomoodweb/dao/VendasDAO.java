
package gestaomoodweb.dao;

import gestaomoodweb.model.Vendas;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasDAO {
    
    private final Conexao conexao;
    
    public VendasDAO(){conexao = new Conexao();}
    
    public void registrar (Vendas vendas){
        
        String sql = "INSERT INTO vendas"
                +"(data_venda, valor_total, forma_de_pagamento, id_cliente, id_funcionario)"
                +"VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setDate(1, java.sql.Date.valueOf(vendas.getData()));
            stmt.setBigDecimal(2, vendas.getValorTotal());
            stmt.setString(3, vendas.getPagamento());
            stmt.setInt(4, vendas.getidCliente());
            stmt.setInt(5, vendas.getidFuncionario());
            
            stmt.executeUpdate();
   
        }catch(SQLException e){throw new RuntimeException(e);}
    }
}
