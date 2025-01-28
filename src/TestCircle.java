public class TestCircle { 
   public static void main(String[] args) {
      Circle c1 = new Circle();
      System.out.println("le cercle a un rayon de " 
         + c1.getRadius() + " et une superficie de " + c1.getArea());
      Circle c2 = new Circle(2.0);
      System.out.println("le cercle a un rayon de " 
         + c2.getRadius() + " et une superficie de " + c2.getArea());
   }
}