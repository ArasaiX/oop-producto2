package entreculturasapp.DAO;

import entreculturasapp.entreculturas.Proyectos;

public interface ProyectosDAO<T> {

    public void add(Proyectos<T> proyectos);

    public void update(Proyectos<T> proyectos);

    public void delete(int id);

    public Proyectos<T> findById(int id);

    public Proyectos<T>[] getAllProyectos();

}