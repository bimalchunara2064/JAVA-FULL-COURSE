public class Demo {
        public static void main(String[] args) {
            SA sa1=new SA();
            CA ca1=new CA();
            sa1.setAcc_bal(5000);
            ca1.setAcc_bal(22000);
            int sa_bal=sa1.getAcc_bal();
            System.out.println(sa_bal);
            int ca_bal=ca1.getAcc_bal();
            System.out.println(ca_bal);

        
    }
}