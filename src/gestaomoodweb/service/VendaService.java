
package gestaomoodweb.service;

import gestaomoodweb.model.Vendas;
import gestaomoodweb.dao.VendasDAO;

public class VendaService {
    
    private final VendasDAO vendasDAO;
    
    public VendaService(){vendasDAO = new VendasDAO();}
    
    public void registrar(Vendas vendas){vendasDAO.registrar(vendas);}
    }

