package generics;
class Data<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
public class GenericPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer> d=new Data<Integer>();
		d.setValue((Integer)34);
		Integer k=(Integer)d.getValue();
		System.out.println(k);
		
		
		Data<Float> f=new Data<Float>();
		f.setValue((Float)34.9f);
		Float k1=(Float)f.getValue();
		System.out.println(k1);
		
	}

}
