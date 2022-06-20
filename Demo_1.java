package Java;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Scanner;import org.apache.pdfbox.pdmodel.PDDocument;
	import org.apache.pdfbox.util.PDFTextStripper;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	public class Demo_1 {
	
	public void ReadFile() throws IOException
	{
	File file=new File("C:\\Users\\TEJCHAUD\\T_C.doc");
	FileInputStream Fis= new FileInputStream(file);
	PDDocument doc= PDDocument.load(Fis);
	System.out.println(doc.getNumberOfPages());
	PDFTextStripper pdfTextStripper =new PDFTextStripper();
	String docText=pdfTextStripper.getText(doc);
	Scanner s = new Scanner(System.in);
	System.out.print("Enter no. of keywords in array:");
	int n = s.nextInt();
	String keywords[] = new String[n];
	System.out.println("Enter all the keywords:");
	for(int i = 0; i < n ; i++)
	{
	keywords[i] = s.next();
	} int index=0;
	double percentage=0, sum=0; for(index = 0; index < keywords.length ; index++)
	{
	if(docText.contains(keywords[index]))
	{
	System.out.println("keyword found");
	sum=sum+1;
	percentage=(sum/n)*100;
	}
	else
	{
	System.out.println("keyword notfound");
	}
	}
	System.out.println("the match is "+ percentage+"%");
	}
	}

	


