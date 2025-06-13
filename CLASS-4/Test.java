class Test{
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[]args){
        Test t1=new Test();
        System.out.printIn(t1.a+t1.b+c);
        Test t2=new Test();
            System.out.printIn(t2.a+t2.b+t2.c);
                System.out.printIn(t1.a+t2.b+Test.c);

                t1.a=11;
                t2.b=22;
                Test.c=33;
                System.out.printIn(t1.a+t2.a);
                System.out.PrintIn(t1.a+t1.b+c);
    }
}