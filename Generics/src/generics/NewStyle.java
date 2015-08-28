package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class NewStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); 
		 
	    list.add("one"); 
	    list.add("two"); 
	    list.add("three"); 
	    list.add("four"); 
	 
	    // Notice that Iterator is also generic. 
	    Iterator<String> itr = list.iterator(); 
	 
	    while(itr.hasNext()) { 
	      String str =(String) itr.next(); 
	 
	      System.out.println(str + " is " + str.length() + " chars long."); 
	    } 
	}

}
