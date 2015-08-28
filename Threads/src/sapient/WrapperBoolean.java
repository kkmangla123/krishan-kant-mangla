package sapient;
class Data
{
	private int firstNumber;
	private int secondNumber;
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public boolean equals(Object obj)
	{
		Data d=new Data();
		d=(Data)obj;
		if(d!=null&&this!=null)
		{
					System.out.println("1");
		if(d.getFirstNumber()==this.getFirstNumber()&&d.getSecondNumber()==this.getSecondNumber())
			return true;
		}
		return false;
	}	
}
public class WrapperBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Data data1=new Data();
			Data data2=new Data();
			data1.setFirstNumber(2);
			data2.setFirstNumber(2);
			data1.setSecondNumber(4);
			data2.setSecondNumber(3);
			System.out.println(data1.equals(data2));
			
	}

}
