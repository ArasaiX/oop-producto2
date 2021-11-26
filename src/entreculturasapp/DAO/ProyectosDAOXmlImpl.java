package entreculturasapp.DAO;

import java.util.ArrayList;
import java.util.List;

import entreculturasapp.entreculturas.Proyectos;

public class ProyectosDAOXmlImpl {

         // not thread-safe
         private static Proyectos[] proyectosArray = new Proyectos[10];

         // package level access
         ProyectosDAOXmlImpl() {
         }
     
         // Add an Proyectos record
         public void add(Proyectos proyectos) {
             proyectosArray[proyectos.getID()] = proyectos;
         }
     
         // Update an Proyectos record
         public void update(Proyectos proyectos) {
             proyectosArray[proyectos.getID()] = proyectos;
         }
     
         // Delete an Proyectos record that has this ID
         public void delete(int id) {
             proyectosArray[id] = null;
         }
     
         // Find an Proyectos record using this ID
         public Proyectos findById(int id) {
             return proyectosArray[id];
         }
     
         // Return an array of all of the Proyectos records
         // We are using a collection List object to store the results
         // This makes it easier to just add to the collection
         public Proyectos[] getAllProyectos() {
             List<Proyectos> proyectos = new ArrayList<>();
             // Iterate through the memory array and find Proyectos objects
             for (Proyectos e : proyectosArray) {
                 if (e != null) {
                     proyectos.add(e);
                 }
             }
             return proyectos.toArray(new Proyectos[0]);
         }
}
