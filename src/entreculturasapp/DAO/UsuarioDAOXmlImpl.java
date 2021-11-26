package entreculturasapp.DAO;

import java.util.ArrayList;
import java.util.List;

import entreculturasapp.entreculturas.Usuario;

public class UsuarioDAOXmlImpl {

    
         // not thread-safe
         private static Usuario[] usuarioArray = new Usuario[10];

         // package level access
         UsuarioDAOXmlImpl() {
         }
     
         // Add an Usuario record
         public void add(Usuario usuario) {
             usuarioArray[usuario.getID()] = usuario;
         }
     
         // Update an Usuario record
         public void update(Usuario usuario) {
             usuarioArray[usuario.getID()] = usuario;
         }
     
         // Delete an Usuario record that has this ID
         public void delete(int id) {
             usuarioArray[id] = null;
         }
     
         // Find an Usuario record using this ID
         public Usuario findById(int id) {
             return usuarioArray[id];
         }
     
         // Return an array of all of the Usuario records
         // We are using a collection List object to store the results
         // This makes it easier to just add to the collection
         public Usuario[] getAllUsuarios() {
             List<Usuario> usuarios = new ArrayList<>();
             // Iterate through the memory array and find Usuario objects
             for (Usuario e : usuarioArray) {
                 if (e != null) {
                     usuarios.add(e);
                 }
             }
             return usuarios.toArray(new Usuario[0]);
         }
}
