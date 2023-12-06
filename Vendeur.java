public class Vendeur extends Employer
{
    public int taux;
    public Vendeur(){}
    public Vendeur(String nom, String adresse, int id, int nb_heure, int T)
    {
        super(nom,adresse,id,nb_heure);
        this.taux=T;
    }
    public void affiche_vendeur()
    {
        System.out.println("taux:"+this.taux);
    }

}
