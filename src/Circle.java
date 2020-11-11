import java.util.*;
public class Circle extends Shape{
	private double radius;
public Circle() {
	
}
public Circle(double radius) {
	this.radius=radius;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double getArea() {
	return this.radius*this.radius*3.14;
}
public void printCircle() {
    System.out.println( " and the Area is " + getArea());
  }

}
