package enumerator;
enum Apple{
	Jonathan(10),GoldenDel(9),RedDel(8),Winesap(11),Cortland(12);// they are calling apple constructor
	private int price;
	Apple(int p)
	{
		price =p;
	}
	int getPrice()
	{
		return price;
	}
}
public class Enum {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Apple ap;
		System.out.println("Here are all Apple constants");
		Apple allapples[]=Apple.values();
		for (Apple a : allapples)
			System.out.println(a);
		System.out.println();
		ap=Apple.valueOf("Winesap");
		System.out.println("ap contains "+ ap);
	for(Apple a:Apple.values())
		System.out.println(a+"costs"+a.getPrice()+"cents");
	}
}
