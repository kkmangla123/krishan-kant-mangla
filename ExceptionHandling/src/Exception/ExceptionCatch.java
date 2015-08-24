package Exception;
class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		System.out.println("You need to be above 18");
		return super.getMessage();
	}
}
class Vote{
	public void register(int age)throws IllegalAgeException{
		if(age<18){
			throw new IllegalAgeException();
		}
		System.out.println("You are eligible to vote");
	}
}
public class ExceptionCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vote v=new Vote();
		try{
			v.register(14);
		}
		catch(IllegalAgeException e){
			e.printStackTrace();
		}
		
	}

}
