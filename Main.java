public class Main {
    public static void main(String[] args) {
        Settings s = new Settings();
        s.put("first", 0);
        s.put("second", 2);
        s.put("thiird", 4);
        s.put("main", 10);
        System.out.println(s);
        s.put("main", 20);
        System.out.println(s);
        System.out.println(s.get("main"));
        Settings ns = new Settings(s);
        System.out.println(s.equals(ns));
        s.delete("main");
        s.delete("main");
        System.out.println(s.equals(ns));
        System.out.println(s.get("main"));
    }
}
