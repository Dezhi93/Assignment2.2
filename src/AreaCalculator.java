import java.util.Arrays;

public class AreaCalculator {

	AreaCalculator instance;
	AreaCalculator(AreaCalculator a){
		instance = a;
	}
	public AreaCalculator getInstance() {
		return instance;
		
	}
	static double sumOfArea(Shape s1,Shape s2){
		return s1.getArea()+s2.getArea();
	} // static let no need creat a new object to call it
	static double sumOfArea(Shape s1,Shape s2,Shape s3){
		return s1.getArea()+s2.getArea()+s3.getArea();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangleA = new Rectangle(20,10);
		Shape squareB = new Square(6);
		Shape circleC = new Circle(6);
		Shape circleD = new Circle(8.5);
		Shape rectangleE = new Rectangle(12,3);
		Shape[] shapes = new Shape[5];
		shapes[0]=rectangleA;
		shapes[1]=squareB;
		shapes[2]=circleC;
		shapes[3]=circleD;
		shapes[4]=rectangleE;
		if (squareB.compareTo(rectangleE)==0)  System.out.println("squareB is equal to retangleE");
		else if (squareB.compareTo(rectangleE)>0)  System.out.println("squareB is larger than retangleE");
		else  System.out.println("squareB is less than retangleE");
		System.out.println("the sum of B&C is " + sumOfArea(squareB,circleC));
		System.out.println("the sum of A&C&D is " + sumOfArea(rectangleA,circleC,circleD));
		
		Arrays.sort(shapes); // sort accordind to area
		for (int i=0;i<shapes.length;i++)
		{
			System.out.println(shapes[i].toString()); //output String,but why "shapes[i]" also right?
		}
	}
	
}
