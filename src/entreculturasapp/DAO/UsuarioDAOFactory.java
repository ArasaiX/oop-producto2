package entreculturasapp.DAO;

public class UsuarioDAOFactory {
    
    public UsuarioDAO createUsuarioDAO() {
        return (UsuarioDAO) new UsuarioDAOXmlImpl();
    }
}
