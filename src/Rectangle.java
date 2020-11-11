import java.util.*;
public class Rectangle extends Shape {
private double length;
private double width;
public Rectangle() {
	
}
public Rectangle(double length,double width ) {
	this.length=length;
	this.width=width;
	}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public void Fun1(int num) {
	num = 5+num;
	System.out.println(num) ;
	
}
public double getArea() {
	return this.length*this.width;
}

}
