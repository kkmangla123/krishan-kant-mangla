package sapient;

import java.io.File;

public class FileDemo {
	static void p(String s){
		System.out.println(s);
	}
	public static void main(String[] args){
		File f1=new File("D:/sapient");
		p("File Name:"+f1.getName());
		p("Path:"+f1.getPath());
		p("Abs Path:"+f1.getAbsolutePath());
		p("Parent:"+f1.getParent());
		p(f1.exists()?"exists":"does not exist");
		p(f1.canWrite()?"writable":"non-writable");
		p(f1.canRead()?"readable":"non-readable");
		p("is"+(f1.isDirectory()?"":"not")+"a directory");
		p("File last modified:"+f1.lastModified());
		p("File size:"+f1.getTotalSpace()+"bytes");
		
		
	}

}
