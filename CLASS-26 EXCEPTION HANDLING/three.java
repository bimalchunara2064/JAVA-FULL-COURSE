
import java.io.PrintWriter;

//import java.i.o*;
class three{
    public static void main(String[]args){
     try {
         PrintWriter Pw=new PrintWriter("abc.txt");
     } catch (Exception e) {
        System.out.println(e.getMessage());
     }
    }
}