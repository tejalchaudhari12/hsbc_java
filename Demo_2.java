package com.cg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


@SuppressWarnings("unused")
public class Demo_2{


public static void compareTwoTextFiles() throws IOException {

File f1 = new File("C:\\Users\\TEJCHAUD\\File_1.txt");
File f2 = new File("C:\\Users\\TEJCHAUD\\File_2.txt");
FileReader r1 = new FileReader(f1);
FileReader r2 = new FileReader(f2);

try (BufferedReader reader1 = new BufferedReader(r1)) {
	BufferedReader reader2 = new BufferedReader(r2);
	
	String line1 = reader1.readLine();
	String line2 = reader2.readLine();
	
	
	
	boolean areEqual = false;
	int lineNum = 1;
	
	while(line1 != null && line2 != null)
	{
	
	if(line1.equalsIgnoreCase(line2))
	{
	areEqual = true;
	lineNum++;
	}
	else
	{
	areEqual = false;
	break;
	}
	line1 = reader1.readLine();
	line2 = reader2.readLine();
	}
	if(areEqual)
	{
	System.out.println("File Matched");
	}
	else
	System.out.println("File Mismatched at "+ lineNum+" line");
}
}

public static void main(String[] args)throws IOException {
compareTwoTextFiles();
}

}