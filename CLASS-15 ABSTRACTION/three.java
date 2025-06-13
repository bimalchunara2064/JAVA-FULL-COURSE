interface Dao{
    public abstract void main();
    public abstract void logout();

}
class DaoImpl implements Dao{
public void login(){
System.out.println("login success");    
}
public void logout() {
    System.out.println("logout");
    
}
}