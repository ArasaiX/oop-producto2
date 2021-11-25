package entreculturasapp.DAO;

import entreculturasapp.entreculturas.Socios;

public interface SociosDAO {

    public void add(Socios socios);

    public void update(Socios socios);

    public void delete(int id);

    public Socios findById(int id);

    public Socios[] getAllsocios();

}