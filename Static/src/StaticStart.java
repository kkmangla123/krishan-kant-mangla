class Data{
	static int value;//field   //class scope  //Class variable
	static{
		System.out.println("Static");
	}
}
public class StaticStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data data1=new Data();
		//Data data2=new Data();
		//data1.value=4;
		//data2.value=3;
		System.out.println(Data.value);
	}

}
