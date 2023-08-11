package com.customer;

import java.io.*;

public class callQualityRecords {

	public void saveRecord(callQuality callquality)
	{
		 try 
		 {
	     FileOutputStream fileout=new FileOutputStream(callquality.getCustomerName()+".dat");
		 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 objectout.writeObject(callquality);
		 objectout.flush();
		 objectout.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println("FileNotFoundException");
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	public void displayRecord(String name)
	{
		
		try {
			FileInputStream filein =new FileInputStream(name+".dat");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			callQuality callquality=(callQuality)objectin.readObject();
			
			System.out.println("Call ID : "+callquality.getCallId());
			System.out.println("Call Duration : "+callquality.getCallDuration());
			System.out.println("Call Quality Grade : "+callquality.getCallQualityGrade());
			System.out.println("Customer Name : "+callquality.getCustomerName());
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}	
	}
public static void main(String[] args) {
		callQuality obj1=new callQuality(101,25,"Excellent","Shravani");
		callQualityRecords records=new callQualityRecords();
		records.saveRecord(obj1);
		records.displayRecord(obj1.getCustomerName());
	}
}