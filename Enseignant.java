
package grh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;


public class Enseignant extends Personnel{ 
    
    int sommeHeures ;
    String grade ;
    int volumeHoraire ;
    Map<String , List<Etudiant>> groupeEnseignant = new HashMap(); 

    public Enseignant(int bureau, double salaire, double prime, int code, String nom, String prenom) {
        super(bureau, salaire, prime, code, nom, prenom);
    }

    public int getSommeHeures() {
        return sommeHeures;
    }

    public void setSommeHeures(int sommeHeures) {
        this.sommeHeures = sommeHeures;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(int volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public Map<String, List<Etudiant>> getGroupeEnseignant() {
        return groupeEnseignant;
    }

    public void setGroupeEnseignant(Map<String, List<Etudiant>> groupeEnseignant) {
        this.groupeEnseignant = groupeEnseignant;
    }



  
    public double calculGrade(){
        double Salaire=0;
         if(grade.compareTo("PA")==0) {
                   Salaire= volumeHoraire*200;
         }          
         else if(grade.compareTo("PH")==0) {          
                   Salaire= volumeHoraire*250;
         }          
         else if(grade.compareTo("PES")==0){
                   Salaire= volumeHoraire*300;
         }
             return Salaire;
    }
         
    /**
     *
     * @return
     */
    @Override
    public double Calculer_Salaire() {
        return getSalaire()+getPrime()+calculGrade();
    }


     public void afficherEns(){
        Iterator<String> nom_grpe= groupeEnseignant.keySet().iterator();
        Iterator<List<Etudiant>> groupe= groupeEnseignant.values().iterator();
              
        while(nom_grpe.hasNext()){
            System.out.println(nom_grpe.next()+":");
            for(Etudiant e : groupe.next()){
                e.afficher();
            }           
        }
    }
    
    public void AjouteGrp(Groupe g){
        groupeEnseignant.put(g.getNom(), g.getLe());
    }
    
   
   
 





    
    
    
    
    
    

      
    
    
   
}
