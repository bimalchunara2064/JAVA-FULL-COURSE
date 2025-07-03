class one {
    private String name;  // private = encapsulated

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        one s = new one();
        s.setName("Bimal");
        System.out.println(s.getName());
    }
}
