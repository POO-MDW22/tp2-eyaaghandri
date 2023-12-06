public class Caissier extends Employer
{
    public int numero;
    public Caissier(){}
    public Caissier(String nom, String adresse, int id, int nb_heure, int N)
    {
        super(nom,adresse,id,nb_heure);
        this.numero=N;
    }
    public void affiche_caissier()
    {
        System.out.println("numero"+this.numero);
    }
}
