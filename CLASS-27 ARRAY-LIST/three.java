public class three {
    public static void main(String[] args) {
       Collection<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
       List<String> enames=new ArrayList<String>();
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       enames.add("Amith");
        System.out.println(enames);
        System.out.println(enames);
        //enames.remove("Rahul");
        //enames.removeAll(unames);
        enames.clear();
        System.out.println(enames);
    }
}