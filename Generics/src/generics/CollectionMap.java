package generics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.lang.Object;
class Data1{
	private int value;
	
	public int getValue() {
		return value;
	}
	
	
	Data1(int k)
	{
		this.value=k;
	}
	
		public boolean equals(Object obj)
			{
				if(this.value==((Data1) obj).getValue())
					return true;
				
				return false;
			}
			
			public int hashCode()
			{
				return (Integer) this.value;
			}

}
public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Data1> result=new HashMap<Integer,Data1>();
		result.put(3, new Data1(12));
		result.put(4, new Data1(13));
		result.put(3, new Data1(14));
		result.put(8, new Data1(15));
		Set<Integer> keys=result.keySet();
		Iterator<>

	}

}
