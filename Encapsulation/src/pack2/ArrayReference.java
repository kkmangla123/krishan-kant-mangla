package pack2;
class Point
{
	private int x,y;
	Point()
	{
		x=1;y=1;
	}
	Point(int a,int b)
	{
		x=a;y=b;
	}
	public void display()
	{
		System.out.println(x+" "+y);
	}
	
}
public class ArrayReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(3,4);	
		p.display();
		Point[] p1;
		p1=new Point[10];
		for(int i=0;i<10;i++){
			p1[i]=new Point(i,i+1);
		}
	for(int i=0;i<10;i++)
	{
		p1[i].display();
	}
	}
}
