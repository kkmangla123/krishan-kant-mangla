package threads;
class runner{
	void run()
	{
		System.out.println(Thread.currentThread());
	}
}
public class ThreadPractice {
		public static void main(String[] args)
		{
			// every Java Application is single threaded....
			runner r=new runner();
			Thread mainThread=Thread.currentThread();
			Thread firstThread=new Thread();
			System.out.println(firstThread.getState());
			firstThread.start();
			System.out.println(firstThread.getState());
			System.out.println(mainThread);
			try{
				Thread.sleep(5000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("THe End");
		}
}
