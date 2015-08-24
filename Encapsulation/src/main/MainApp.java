package main;

class Process
{
	public int[] create()
	{
		int[] num;
		num=new int[10];
		num[4]=5;
		num[2]=6;
		num[6]=6;
		return num;
	}
	public void display(int[] src){
		for(int data:src)
			System.out.println(data);
	}
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Process P=new Process();
		int[] result=P.create();
		P.display(result);
		
		int[][][] num;
		num=new int[5][3][2];
		num[1][1][1]=5;
		for(int[][] data:num)
		{
			for(int[] m:data)
				{
				for(int k:m)
				System.out.print(k+" ");
				}
			System.out.println("");
		}
		}
		
}


