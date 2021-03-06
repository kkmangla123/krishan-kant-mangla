package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class OldStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); 
		 
	    // These lines store strings, but any type of object 
	    // can be stored.  In old-style code, there is no  
	    // convenient way restrict the type of objects stored 
	    // in a collection 
	    list.add("one"); 
	    list.add("two"); 
	    list.add(3); 
	    list.add("four"); 
	 
	    Iterator itr = list.iterator();
	    while(itr.hasNext()) { 
	 
	      // To retrieve an element, an explicit type cast is needed 
	      // because the collection stores only Object. \
	    	
	      String str = itr.next().toString(); // explicit cast needed here. 

	 
	      System.out.println(str + " is " + str.length() + " chars long."); 
	    } 
	}

}
