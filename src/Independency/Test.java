package Independency;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {  
	public static void main(String[] args) throws Exception {  
		
		
	
		
		String input = "txt=§<MONTHLY_FEE>§;DESCRIPTION=yallo Flat 01.03.18 - 31.03.18";

		String regex = "(\\d{2}.\\d{2}.\\d{2})";
		Matcher m = Pattern.compile(regex).matcher(input);
		List<String> listDate = new ArrayList<String>();
		
		while(m.find()){listDate.add(m.group(1));}
		//if (m.find()) {System.out.println("Hi Date test 1 "+ m.group(1));}
		//if (m.find()) {System.out.println("Hi Date test 2 "+ m.group(1));}
		System.out.println("Hi Date  has number of date "+ listDate.size());
		System.out.println("Hi Date test 1 "+ listDate.get(0));
		System.out.println("Hi Date test 2 "+ listDate.get(1));
		if (m.find()) {
			
			
			
			String date1 = m.group(1);
			String date2 = m.group(1);
			System.out.println("Hi Date 1 "+ date1); 
			System.out.println("Hi Date 2 "+ date2); 
			String date3= date1.replace(".", "/");
			String date4 = date2.replace(".", "/");
			
			System.out.println("Hi Date 1 "+ date3); 
			System.out.println("Hi Date 2 "+ date4); 
			//System.out.println("Hi Date 2 "+ m.group(2)); 
		    Date date = new SimpleDateFormat("dd/MM/yy").parse(date3);
		    
		   // Format formatter = new SimpleDateFormat("dd/MM/yy");
		   // String string = formatter.format(date);
		    System.out.println("Hi"+ date.toLocaleString()); 
		    // Use date here
		} else {
		    // Bad input
		}
		System.out.println("Hi");  
		
		
		   }  
		 }  