package charStream;

import java.io.*;

public class charSample {
	public static void main(String[] args)
	{
		
		try
		{
			OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("charfile.txt"));
			writer.write("Employee Name: Peter Sam Joes\n");
			writer.write("Department : Sales\n");
			writer.write("Destination : Manager\n");
			writer.write("Salary : 35000\n");
			
			writer.flush();
			writer.close();
			
			InputStreamReader reader=new InputStreamReader(new FileInputStream("charfile.txt"));
			char[] ch=new char[90];
			
			reader.read(ch);
			System.out.println(ch);
			reader.close();
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
