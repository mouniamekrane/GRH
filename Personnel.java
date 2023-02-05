
package grh;

abstract class Personnel extends personne {
  private int bureau;
  private double salaire;
  private double prime;

    public Personnel(int bureau, double salaire, double prime, int code, String nom, String prenom) {
        super(code, nom, prenom);
        this.bureau = bureau;
        this.salaire = salaire;
        this.prime = prime;
    }

   
    
    public abstract double  Calculer_Salaire();

    public int getBureau() {
        return bureau;
    }

    public double getSalaire() {
        return salaire;
    }

    public double getPrime() {
        return prime;
    }

    public int getCode() {
        return super.getCode();
    }

    public String getNom() {
        return super.getNom();
    }

    public String getPrenom() {
        return super.getPrenom();
    }
    
    
    
  @Override
     public void afficher(){
        
    }
    
    
    
    
    
}
