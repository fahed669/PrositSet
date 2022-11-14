/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

/**
 *
 * @author maato
 */
public class Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   // TODO code application logic here
        Enseignant E1 = new Enseignant(1, "fahed", "maatoug");
        Enseignant E2 = new Enseignant(44, "Med", "Wahchi");
        Enseignant E3 = new Enseignant(15, "Tepsi", "Majd");
        System.out.println("The hashset:");
        EspritHashSet EH = new EspritHashSet();
        EH.ajouterEnseignant(E1);
        EH.ajouterEnseignant(E2);
        EH.ajouterEnseignant(E3);
        EH.displayEnseignants();
        System.out.println("The treeset:");
        EspritTreeSet ET = new EspritTreeSet();
        ET.ajouterEnseignant(E1);
        ET.ajouterEnseignant(E2);
        ET.ajouterEnseignant(E3);
        ET.displayEnseignants();
    }
    
}
