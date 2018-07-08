package yong.du.keep.learning;

public class AutoBoxingAndUnboxing {

	
	 public static void display(long i) {
         System.out.print("long");
       }
	
       public static void display(Integer i) {
         System.out.print("Integer");
       }
       
       public static void display(Integer... i) {
           System.out.print("Integer...");
         } 
       
       public static void display(Long i) {
           System.out.print("Integer...");
         }
	public static void main(String[] args) {
		int a = 10;
		display(a);
	}
}
