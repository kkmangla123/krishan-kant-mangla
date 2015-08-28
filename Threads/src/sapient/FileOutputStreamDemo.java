package sapient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String source="Now is the time for all good men\n"+"to come to the aid of thier country\n"+"and"
				+ " pay thier duw taxes";
		byte buf[]=source.getBytes();
		OutputStream f0=new FileOutputStream("file1.txt");
		for(int i=0;i<buf.length;i+=2)
		f0.write(buf[i]);
		f0.close();
		OutputStream f1=new FileOutputStream("file2.txt");
		f1.write(buf);
		f1.close();
		OutputStream f2=new FileOuputStream("file3.txt");
		f2.write(b);
		
		
	}

}
