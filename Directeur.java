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
public class Directeur extends Personnel{
    int primesDeplacementDirect ;
    static  Directeur Dr = null ;

    private Directeur(int bureau, double salaire, double prime, int code, String nom, String prenom) {
        super(bureau, salaire, prime, code, nom, prenom);
    }



    public void setPrimesDeplacementDirect(int primesDeplacementDirect) {
        this.primesDeplacementDirect = primesDeplacementDirect;
    }

    public int getPrimesDeplacementDirect() {
        return primesDeplacementDirect;
    }
    
    public static Directeur nouveau(int bureau, double salaire, double prime, int code, String nom, String prenom){
        if(Dr==null){
            Dr=new Directeur(bureau, salaire, prime, code, nom, prenom);
        }else{
            System.out.println("il y a déjà un directeur ");
        }
        return Dr;
    }
    
    public static void finDeTravaux(){
        Dr=null;
    }
 
    @Override
    public double Calculer_Salaire() {
        return getSalaire()+getPrime();
    }

    
}
