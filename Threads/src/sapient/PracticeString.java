package sapient;
import java.io.*;
public class PracticeString {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 /* char c[] = {'J', 'a', 'v', 'a'};
		    String s1 = new String(c);
		    String s2 = new String(s1); 
*/
		BufferedReader br = new
			      BufferedReader(new InputStreamReader(System.in));
			    String str;

			    System.out.println("Enter 'stop' to quit.");
			    System.out.println("Enter State: ");
			    do {
			      str = br.readLine();
			      str = str.trim(); // remove whitespace

			      if(str.equals("Illinois"))
			        System.out.println("Capital is Springfield.");
			      else if(str.equals("Missouri"))
			        System.out.println("Capital is Jefferson City.");
			      else if(str.equals("California"))
			        System.out.println("Capital is Sacramento.");
			      else if(str.equals("Washington"))
			        System.out.println("Capital is Olympia.");
			      // ... 
			      
			    } while(!str.equals("stop"));
}
}

