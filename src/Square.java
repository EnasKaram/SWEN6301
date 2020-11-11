
public class Square extends Shape {
	private double side;
	Rectangle rec = new Rectangle();
	public Square() {

	}
	public Square(double side) {
		this.side = side;
	}
	public void Fun2() {
		for (int i = 1 ; i <= 2;i ++)
		{ 
			int y = i ;
			// y is set
			rec.Fun1(y) ; // y is aliased to x
		}
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void send(Circle c , String text) {
		System.out.println("The circle area is " +
				( (Circle)c).getArea() );
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);

	}


}
