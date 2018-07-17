package yong.du.keep.learning;

public class Ambiguous {

    static public interface A {
       public default void hello(){
            System.out.println("Hello from A");
        }
    }

    static public interface  B extends A{
        @Override
        public default void hello(){
            System.out.println("Hello from B");
        }
    }
    static public class C implements  B, A{
        @Override
     public void hello(){
            B.super.hello();
         }
     }

    public static void main(String... args) {
        new C().hello();
    }
}
