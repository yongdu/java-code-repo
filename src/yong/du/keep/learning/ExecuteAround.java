package yong.du.keep.learning;

import java.io.*;
public class ExecuteAround {

    /*
     * execute around pattern:
     *  open source date/file, do some processing, then close source data/file.
     */
    public static void main(String ...args) throws IOException{
        String result;
        try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) {
            result =  br.readLine();
        }


        System.out.println(result);

        System.out.println("---");

        String oneLine = processFile((BufferedReader b) -> b.readLine());
        System.out.println(oneLine);

        String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
        System.out.println(twoLines);

    }



    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("employee.txt"))){
            return p.process(br);
        }

    }

    @FunctionalInterface
    public interface BufferedReaderProcessor{
        public String process(BufferedReader b) throws IOException;

    }
}
