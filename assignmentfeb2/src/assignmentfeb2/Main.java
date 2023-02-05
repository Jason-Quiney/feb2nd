package assignmentfeb2;
import java.util.*;

class Shape
{
	void shape1()
	{
		System.out.println("finding area");
	}	
	}

class Circle extends Shape
{
	int r=4;
	double pi=3.14,area;
	
	public void getArea()
	{
		area=pi*r*r;
	System.out.println("Area of Circle is="+area);
		
	}
	
}


class Square  extends Circle
{
	int side=4,area;
	public void getArea()
	{
	area=side*side;
	System.out.println("Area of square="+area);
		
		
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape f=new Shape();
		f.shape1();
		Square s=new Square();
		Circle c=new Circle();
		c.getArea();
		
		s.getArea();
		
		
	}

}