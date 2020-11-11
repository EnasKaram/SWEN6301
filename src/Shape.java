public abstract class Shape {
private String color;
private Boolean filled;
public Shape() {
	
}
public Shape(String color,boolean filled) {
	this.color=color;
	this.filled=filled;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Boolean getFilled() {
	return filled;
}
public void setFilled(Boolean filled) {
	this.filled = filled;
}
@Override
public String toString() {
    return  "\ncolor: " + color +
      " and filled: " + filled;
  }

public abstract double getArea();
}
