package byteStream;

import java.io.*;

public class bufferSample {
	public static void main(String[] args) {
		//InputStream in=System.in;
		try {
			FileOutputStream fstream=new FileOutputStream("bufferdata.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fstream);
			bout.write("Developer Name: Shravani\n".getBytes());
			bout.write("Bug No : 20\n".getBytes());
			bout.write("Bug Description : FileNotFounException".getBytes());
/*byte[] bt=new byte[20];
			
			System.out.print("Enter Developer name ");
			in.read(bt);
			String str=new String(bt);
			System.out.print("  Enter Bug no:");
			in.read(bt);
			String num=new String(bt);
			System.out.print("  Enter Bug Description : ");
			in.read(bt);
			String desc=new String(bt);
			
			bout.write(str.getBytes());
			bout.write(num.getBytes());
			bout.write(desc.getBytes());
			*/
			bout.flush();
			bout.close();
			
			FileInputStream fin=new FileInputStream("bufferdata.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			byte[] btt=new byte[bin.available()];
			bin.read(btt);
			System.out.println(new String(btt));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
