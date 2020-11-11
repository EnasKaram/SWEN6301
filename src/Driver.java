import java.util.*;

public class Driver {
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		//Data Coupling 
		Square square1 = new Square();
		square1.Fun2();
		//Stamp Coupling
		Circle c = new Circle(2);
		Square square2 = new Square(3);
		square2.send(c, "Stamp Coupling");
		displayObject(new Circle(1));
		displayObject(new Rectangle(2,4));
	  if(equals(new Circle(4)))
		System.out.println("area of this circle equal 5");
	  else
		  System.out.println("area not equal 5");
	}

	/** Display geometric object properties */
	public static void displayObject(Shape  object) {
		if (object instanceof Circle) {
			System.out.println("The circle area is " +
					( (Circle)object).getArea() );
		}
		else if (object instanceof Rectangle) {
			System.out.println("The Rectangle area is " +
					( (Rectangle)object).getArea() );
		}
		else
			System.out.println("The Square area is " +
					( (Square)object).getArea() );
			
	}
	public static boolean equals(Shape object) {
		double area =5;
		if (object instanceof Circle) {
			if(object.getArea() == area ){
				return true;
			}


			else
				return false;
		}
		return false;
	}

}
