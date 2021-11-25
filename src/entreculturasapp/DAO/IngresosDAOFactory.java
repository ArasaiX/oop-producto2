package entreculturasapp.DAO;

public class IngresosDAOFactory {
    
    public IngresosDAO createIngresosDAO() {
        return (IngresosDAO) new IngresosDAOXmlImpl();
    }
}
