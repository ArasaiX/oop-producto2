package entreculturasapp.DAO;

import java.util.ArrayList;
import java.util.List;

import entreculturasapp.entreculturas.Socios;

public class SociosDAOXmlImpl {

        // not thread-safe
    private static Socios[] SociosArray = new Socios[10];

    // package level access
    SociosDAOXmlImpl() {
    }

    // Add an Socios record
    public void add(Socios socios) {
        SociosArray[socios.getID()] = socios;
    }

    // Update an Socios record
    public void update(Socios socios) {
        SociosArray[socios.getID()] = socios;
    }

    // Delete an Socios record that has this ID
    public void delete(int id) {
        SociosArray[id] = null;
    }

    // Find an Socios record using this ID
    public Socios findById(int id) {
        return SociosArray[id];
    }

    // Return an array of all of the Socios records
    // We are using a collection List object to store the results
    // This makes it easier to just add to the collection
    public Socios[] getAllSocioss() {
        List<Socios> socios = new ArrayList<>();
        // Iterate through the memory array and find Socios objects
        for (Socios e : SociosArray) {
            if (e != null) {
                socios.add(e);
            }
        }
        return socios.toArray(new Socios[0]);
    }
}
