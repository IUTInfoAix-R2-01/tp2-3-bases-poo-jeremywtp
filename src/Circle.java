public class Circle {
	private double radius;
	   private String color; 
	   public Circle() {  
	      radius = 1.0;
	      color = "rouge";
	   }  
	   public Circle(double r) {  
	      radius = r;
	      color = "rouge";
	   }	   
	   public double getRadius() {
	     return radius; 
	   }	   
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   public String getColor() {
	        return color;
	   }
	   public Circle(double r, String c) {
	        radius = r;
	        color = c;
	   }
	   public double getRadius() {
	        return radius;
	   }
	   public void setRadius(double r) {
	        radius = r;
	   }
	}