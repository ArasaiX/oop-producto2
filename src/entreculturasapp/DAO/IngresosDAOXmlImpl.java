package entreculturasapp.DAO;

import java.util.ArrayList;
import java.util.List;

import entreculturasapp.entreculturas.Ingresos;

public class IngresosDAOXmlImpl {
   
         // not thread-safe
         private static Ingresos[] ingresosArray = new Ingresos[10];

         // package level access
         IngresosDAOXmlImpl() {
         }
     
         // Add an Ingresos record
         public void add(Ingresos ingresos) {
             ingresosArray[ingresos.getID()] = ingresos;
         }
     
         // Update an Ingresos record
         public void update(Ingresos ingresos) {
             ingresosArray[ingresos.getID()] = ingresos;
         }
     
         // Delete an Ingresos record that has this ID
         public void delete(int id) {
             ingresosArray[id] = null;
         }
     
         // Find an Ingresos record using this ID
         public Ingresos findById(int id) {
             return ingresosArray[id];
         }
     
         // Return an array of all of the Ingresos records
         // We are using a collection List object to store the results
         // This makes it easier to just add to the collection
         public Ingresos[] getAllIngresoss() {
             List<Ingresos> ingresos = new ArrayList<>();
             // Iterate through the memory array and find Ingresos objects
             for (Ingresos e : ingresosArray) {
                 if (e != null) {
                     ingresos.add(e);
                 }
             }
             return ingresos.toArray(new Ingresos[0]);
         }
}
