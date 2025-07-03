class TestTwo{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=10;
        //System.out.println(a.equals(b));
        System.out.println(a==c);
        TestTwo t1=new TestTwo();
        TestTwo t2=new TestTwo();
       System.out.println(t1.equals(t2));
       String s1=new String("Bimal");
       String s2="Bimal";
       System.out.println(s1.equals(s2));
       System.out.println(s1==s2);
    }
}