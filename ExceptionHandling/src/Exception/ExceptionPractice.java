package Exception;

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int sum=0;
			for(String arg:args){
				sum+=Integer.parseInt(arg);
						
			}
			System.out.println("Sum="+sum);
		}
		catch(NumberFormatException nfe){
			System.err.println("one of the command-line"+"arguments is not an int");
		}
			
		
	}

}
