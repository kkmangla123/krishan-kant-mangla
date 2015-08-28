package threads;
import java.lang.*;
class runner1 implements Runnable{
	public void run(){
		System.out.println("Inside Run");
		System.out.println(Thread.currentThread());
	}
}
public class ThreadMain {
	
	public static void main(String[] args){
		runner1 r=new runner1();
		Thread mainThread=Thread.currentThread();
		Thread firstThread=new Thread(r,"first Thread");
		Thread secondThread=new Thread(r,"second Thread");
		firstThread.start();
		secondThread.start();
		System.out.println(firstThread.getState());
		System.out.println(secondThread.getState());
		try{
			firstThread.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("The end");
	}

}
