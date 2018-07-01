package Write2Text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNumber2Text {

	public static void main(String[] args) throws IOException {
        String text = ",";
        String result = "";
        for(int i =1;i<=300;i ++){
        	result = result + String.valueOf(i) + text ; 
        }
        
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(result);
            System.out.print("Hi");
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( output != null ) {
            output.close();
          }
        }
    }
}
