package Java.Function;

public class function1 {
    public static void main(String[] args) {
        greet();
        int ans = sum(10,20);
        System.out.println(ans);
    }
    public static void greet() {
        System.out.println("Hii everyone");
    }
    public static int sum(int a, int b) {
        int s = a+b;
        return s;

    }
}
