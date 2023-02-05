/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grh;

/**
 *
 * @author mounia
 */

public class Etudiant extends personne{
    int moyenne;
    String niveau;

    public Etudiant(int moyenne, String niveau, int code, String nom, String prenom) {
        super(code, nom, prenom);
        this.moyenne = moyenne;
        this.niveau = niveau;
    }

    
    
    @Override
    public void afficher(){
        System.out.println(" le moyenne :"+moyenne+" le niveau :"+niveau+" le code :"+super.getCode()+" le nom et prenom :"+super.getNom()+" "+super.getPrenom());
    }

    public int getMoyenne() {
        return moyenne;
    }

    public String getNiveau() {
        return niveau;
    }

    public int getCode() {
        return getCode();
    }

    public String getNom() {
        return getNom();
    }

    public String getPrenom() {
        return getPrenom();
    }

   
    
}
