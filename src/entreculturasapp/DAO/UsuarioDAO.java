package entreculturasapp.DAO;

import entreculturasapp.entreculturas.Usuario;

public interface UsuarioDAO {

    public void add(Usuario usuario);

    public void update(Usuario usuario);

    public void delete(int id);

    public Usuario findById(int id);

    public Usuario[] getAllUsuarios();

}