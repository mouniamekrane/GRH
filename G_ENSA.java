/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grh;

import static grh.Directeur.nouveau;

public class G_ENSA {
    public static void main(String[] args){
        // TODO code application logic here
        Directeur Dr= nouveau(9090,15000,2000,989,"alae","ahlam");
        Enseignant ens1= new Enseignant("az",8.5,8977,8000,2000,6767,"ahmed","khalid");
        
        Groupe g1 = new Groupe("Groupe Tdi");
        Groupe g2 = new Groupe("Groupe tdm");
                
        Etudiant student1 = new Etudiant(18,"master",676,"mounia","alami");
        Etudiant student2 = new Etudiant(17,"master",121,"sara","ibrahimi");
 
        g1.AjouteEtudiant(student1);
        g1.AjouteEtudiant(student2);
         ens1.AjouteGrp(g1);
         ens1.AjouteGrp(g2);
         ens1.afficherEns();
         ////////////////////////////////
         System.out.println(ens1.Calculer_Salaire());
        
        
        
        


        
        
        
        
        
        
        
        
        
        
    }
      
    
}
