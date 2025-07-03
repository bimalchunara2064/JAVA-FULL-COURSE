 class TestOne extends Object {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;
        TestOne t1=new TestOne();
        TestOne t2=new TestOne();
        String s1=new String("Bimal");
        String s2="Bimal";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(a==c);
        System.out.println(t1==t2);
    }
}
