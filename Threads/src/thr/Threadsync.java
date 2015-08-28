package thr;
class Data{
	private int value;
	public void getValue(){
		System.out.println(value);
	}
	public void setvalue(int value){
		this.value=value;
	}
}
class Runner implements Runnable{
	Data data;
	boolean flag=false;
	public Runner(){
		data=new Data();
	}
	private Thread secondThread;
	private Thread firstThread;
	
	public void run(){
		Thread currThread;
		
		for(int counter=0;counter<10;counter++){
			currThread=Thread.currentThread();
			if(currThread.getName().equals("Producer")){
				
				System.out.println(currThread);
				synchronized(data){
					data.notify();
					
					try {
						if(!secondThread.isAlive())
						{secondThread.start();
						}
						data.wait();
						}
						
					 catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				data.setvalue(counter+1);
				}
			}
			else if(currThread.getName().equals("Consumer")){
				System.out.print(currThread);
				synchronized(data){
					data.notify();
					try {
						if(!firstThread.alive)
						{
							firstThread.start;
						}
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				data.getValue();
				}
			}
		}
	}
	public void setSecondThread(Thread secondThread) {
		this.secondThread=secondThread;
		
	}
}
public class Threadsync {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Runner r=new Runner();
			Thread firstThread=new Thread(r,"Producer");
			Thread secondThread=new Thread(r,"Consumer");
			firstThread.start();
			r.setSecondThread(secondThread);
			System.out.println("The end");
	}
}
