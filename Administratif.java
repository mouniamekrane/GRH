
package grh;


public class Administratif extends Personnel{

    public Administratif(int bureau, double salaire, double prime, int code, String nom, String prenom) {
        super(bureau, salaire, prime, code, nom, prenom);
    }

    
    @Override
    public double Calculer_Salaire() {
        return getSalaire()+getPrime();
    }
    
    
    
}

