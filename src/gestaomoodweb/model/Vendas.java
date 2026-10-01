
package gestaomoodweb.model;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Vendas {
    
    private int id;
    private LocalDate data;
    private BigDecimal valorTotal;
    private String pagamento;
    private int idCliente;
    private int idFuncionario;
    
   public Vendas(int id, LocalDate data, BigDecimal valorTotal, String pagamento, int idCliente, int idFuncionario){
       this.id = id;
       this.data = data;
       this.valorTotal = valorTotal;
       this.pagamento = pagamento;
       this.idCliente = idCliente;
       this.idFuncionario = idFuncionario;
   }
   
   public int getId(){return id;}
   
   public LocalDate getData(){return data;}
   
   public BigDecimal getValorTotal(){return valorTotal;}
   
   public String getPagamento(){return pagamento;}
   
   public int getidCliente(){return idCliente;}
   
   public int getidFuncionario(){return idFuncionario;}
   }


