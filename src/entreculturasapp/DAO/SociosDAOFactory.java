package entreculturasapp.DAO;

public class SociosDAOFactory {
    
    public SociosDAO createSociosDAO() {
        return (SociosDAO) new SociosDAOXmlImpl();
    }
}
