package sapient;
class MyDate{
	private int date,month,year;
	MyDate(int a,int b,int c)
	{
		date=a;
		month=b;
		year=c;
	}
	public MyDate addDays(int k)
	{
		MyDate a= new MyDate(0,0,0);
		a.date=this.date+k;
		a.month=this.month;
		a.year=this.year;
		return a;
		
		
	}
	@Override
	public String toString() {
		return this.date+" "+this.month+" "+this.year;
	}
	
}
public class PractoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyDate my_birth=new MyDate(22,7,1964);
			MyDate the_next_week=my_birth.addDays(7);
			System.out.println(the_next_week);
			System.out.println(my_birth);
	}

}
