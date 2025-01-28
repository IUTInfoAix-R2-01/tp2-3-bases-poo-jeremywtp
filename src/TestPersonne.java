public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne("Agostinelli", "Laurence");
        System.out.println("Nom : " + p1.getNom());
        System.out.println("Prénom : " + p1.getPrenom());
        System.out.println(p1.toString());
    }
}
