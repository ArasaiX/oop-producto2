package entreculturasapp.DAO;

import entreculturasapp.entreculturas.Usuario;

public class UsuarioDAOXmlImpl {

     
    // not thread-safe
    private static Usuario[] UsuarioArray = new Usuario[10];

    // package level access
    UsuarioDAOXmlImpl() {
    }

    // Add an Usuario record
    public void add(Usuario emp) {
        //TODO
    }

    // Update an Usuario record
    public void update(Usuario emp) {
        //TODO
    }

    // Delete an Usuario record that has this ID
    public void delete(int id) {
        //TODO
    }

    // Find an Usuario record using this ID
    public Usuario findById(int id) {
        //TODO
    }

     // Return an array of all of the Usuario records
    // We are using a collection List object to store the results
    // This makes it easier to just add to the collection
    public Usuario[] getAllUsuarios() {
       //TODO
    }

    
}
