package sapient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {
	public static int words=0,lines=0,chars=0;
	public static void wc(InputStreamReader isr)throws IOException{
		int c=0;
		boolean lastwhite=true;
		String whitespace="\t\n\r";
		//BufferedReader br = new BufferedReader(isr);
		System.out.println("#");
		while((c=isr.read())!=-1 || c!='$'){
			chars++;
			if(c=='\n'){
				lines++;
			}
			int index=whitespace.indexOf(c);
			if(index==-1)
			{
				if(lastwhite==true){
					++words;
				}
				lastwhite=false;
			}
			else
				{
				lastwhite=true;
				}
		}
		if(chars!=0){
			++lines;
		}
		System.out.println(lines+" "+chars+" "+words);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		try{
			if(args.length==0){
				wc(new InputStreamReader(System.in));
				
			}
			else{
				for(int i=0;i<args.length;i++)
				{
					fr=new FileReader(args[i]);
					wc(fr);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
