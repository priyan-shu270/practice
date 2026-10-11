package Java.function;
import java.util.*;
public class swapof2numberbyfunction {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt(); 
     int b = scn.nextInt(); 
    swap(a,b);
}
public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a+" "+b);
}
}

