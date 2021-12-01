import java.awt.*;
interface Polygon
{
	public abstract void paint();
	public abstract void setBorderColor(Color c);
	public abstract void setFillColor(Color c);
}
class Circles implements Polygon //use keyword implements instead of extends
{

	@Override
	public void paint() {
	  System.out.println("Circle");
	}

	@Override
	public void setBorderColor(Color c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setFillColor(Color c) {
		// TODO Auto-generated method stub
	}
}
class Rectangles implements Polygon
{

	@Override
	public void paint() {
		System.out.println("Rectangle");
	}
	@Override
	public void setBorderColor(Color c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setFillColor(Color c) {
		// TODO Auto-generated method stub
	}
}
public class InterfaceEx {
public static void main(String a[])
{
	Polygon A, B;
	A= new Circles();
	B= new Rectangles();
	A.paint();
	B.paint();
	
}
}
