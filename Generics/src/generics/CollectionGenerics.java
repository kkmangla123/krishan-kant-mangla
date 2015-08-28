package generics;

import java.util.ArrayList;
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
public class CollectionGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Data1> list=new HashSet<Data1>();
		list.add(new Data1(21));
		list.add(new Data1(4));
		list.add(new Data1(3));
		list.add(new Data1(3));
		Iterator<Data1> iterator=list.iterator();
		Data1 a;
		
		while(iterator.hasNext()){
			a=iterator.next();
			System.out.println(a.getValue());
		}

	}

}
