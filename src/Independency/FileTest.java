package Independency;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileTest {

	public static void main(String[] args) 
	{
		
		List<String> hundreads = Arrays.asList("101","102","103");
        List<String> thousands = Arrays.asList("1001","1002","1003");
        List<String> merged = new ArrayList<String>();
        merged.addAll(hundreads);
        merged.addAll(thousands);
        System.out.println("Merged List : " + merged);
		String[] files = new File("C:/Users/Yong.Du/Documents/Yong").list();
		for (String fileName : files) {
	    System.out.println(fileName);
		}
	}
}
