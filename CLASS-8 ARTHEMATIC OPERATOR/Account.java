class Account{
    int min_bal=500;
    public static void main(String[] args) {
        Account a1=new Account();
        System.out.println(a1.min_bal);
        a1.min_bal=600;
        System.out.println(a1.min_bal);
    }
}