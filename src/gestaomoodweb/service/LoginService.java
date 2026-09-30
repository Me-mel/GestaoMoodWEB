
package gestaomoodweb.service;

import gestaomoodweb.dao.UsuarioDAO;

public class LoginService {
    
    private final UsuarioDAO usuarioDAO;
    
    public LoginService(){usuarioDAO = new UsuarioDAO();}
    
    public boolean login(String usuario, String senha){
        return usuarioDAO.login(usuario, senha);
    }
}
