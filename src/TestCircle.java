
public class TestCircle { 
   public static void main(String[] args) {
      Circle c1 = new Circle();
      System.out.println("le cercle a un rayon de " 
         + c1.getRadius() + " et une superficie de " + c1.getArea() + " et il est de couleur " + c1.getColor());
      Circle c2 = new Circle(2.0);
      System.out.println("le cercle a un rayon de " 
         + c2.getRadius() + " et une superficie de " + c2.getArea() + " et il est de couleur " + c2.getColor());
      System.out.println("le cercle a un rayon de " + c1.getRadius());
      c1.setRadius(5.0); 
      System.out.println("le cercle a maintenant un nouveau rayon de " + c1.getRadius());
   }
}
