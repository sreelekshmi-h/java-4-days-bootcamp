package proj;

public class Question3 {

	public static void main(String[] args) {
		Circle c=new Circle(2);
		System.out.printf("Area of circle:%.2f",c.calculateArea());
		System.out.println();
		Rectangle r=new Rectangle(2,3);
		System.out.printf("Area of rectangle:%.2f",r.calculateArea());
		System.out.println();
        Triangle t=new Triangle(4,5);
        System.out.printf("Area of triangle:%.2f",t.calculateArea());
	}

}

abstract class Shape{
	abstract double calculateArea();
}

class Circle extends Shape{
	double r;
	Circle(double r){
		this.r=r;
	}
	double calculateArea(){
	   return	3.14*r*r;
	}
}

class Rectangle extends Shape{
	double a;
	double b;
	Rectangle(double a,double b){
		this.a=a;
		this.b=b;
	}
	double calculateArea() {
		return a*b;
	}
}


class Triangle extends Shape{
	double base;
	double height;
	Triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
	double calculateArea() {
		return 0.5*base*height;
	}
	
}
