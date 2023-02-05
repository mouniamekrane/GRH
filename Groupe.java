/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mounia
 */
public class Groupe {
    private String nom;
    private List<Etudiant> students;

    public Groupe(String nom) {
        this.nom = nom;
        students = new ArrayList();

    }
     
    public void AjouteEd(Etudiant e){
        students.add(e);
    }
    public void AfficherEd(int code){
     for (Etudiant etudent : students) {
                    if(code==etudent.getCode())
                    etudent.afficher();
                }
        
    }
    
    public void Afficher(){
        for(Etudiant e: students){
            e.afficher();
        }
    }

    public String getNom() {
        return nom;
    }

    public List<Etudiant> getLe() {
        return students;
    }

    Integer students() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    
    
    
    