public class Personne {
    private String nom;
    private String prenom;
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String toString() {
        return "le Nom est " + nom + ", et le Prénom est " + prenom;
    }
}
