
package gestaomoodweb.service;

import gestaomoodweb.dao.ClienteDAO;
import gestaomoodweb.model.Cliente;

public class ClienteService {
    
    private final ClienteDAO clienteDAO;
    
    public ClienteService() {clienteDAO = new ClienteDAO();}
    
    public void cadastrar(Cliente cliente) {clienteDAO.cadastrar(cliente);}
}
