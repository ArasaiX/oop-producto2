package entreculturasapp.DAO;

import entreculturasapp.entreculturas.Ingresos;

public interface IngresosDAO {

    public void add(Ingresos ingresos);

    public void update(Ingresos ingresos);

    public void delete(int id);

    public Ingresos findById(int id);

    public Ingresos[] getAllIngresos();

}