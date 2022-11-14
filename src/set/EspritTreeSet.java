/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author maato
 */
public class EspritTreeSet implements GestionEnseignant {

    Set<Enseignant> treeSetEtudiant;

    public EspritTreeSet() {
        this.treeSetEtudiant = new TreeSet(new Id());
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        treeSetEtudiant.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return treeSetEtudiant.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : treeSetEtudiant) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        treeSetEtudiant.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(treeSetEtudiant);
    }

}
