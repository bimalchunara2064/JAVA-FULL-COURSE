public class Test {
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
        Test t1=new Test();
        System.out.println(t1.a+t1.b+t1.c);
        System.out.println(t1.a+t1.b+Test.c);
        System.out.println(t1.a+t1.b+c);
        Test t2=new Test();
         t1.a=11;
        System.out.println(t1.a+t1.a);
        System.out.println(t1.a+t2.b+c);
        Test.c=33;
        System.out.println(t1.a+t2.b+c);
    }
    
}