package byteStream;

import java.io.*;

public class fileOutputStream {
	public static void main(String[] args)
	{
		InputStream in=System.in;
		try
		{
			byte[] bt=new byte[20];
			
			System.out.print("Enter Developer name ");
			in.read(bt);
			String str=new String(bt);
			System.out.print("  Enter Bug no:");
			in.read(bt);
			String num=new String(bt);
			System.out.print("  Enter Bug Description : ");
			in.read(bt);
			String desc=new String(bt);
			
			FileOutputStream fs=new FileOutputStream("buginfo.dat.txt");
			
			fs.write(str.getBytes());
			fs.write(num.getBytes());
			fs.write(desc.getBytes());
			
			fs.flush();
			fs.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
