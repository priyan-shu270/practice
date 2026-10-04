package Java.Function;

import java.util.Scanner;

public class function2 {
     public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
      int ans = fact(n);
      System.out.println(ans);
    }
    public static int fact(int n ) {
        int ans = 1;
        for(int i =1; i<=n; i++){
            ans = ans*i;
        }
        return ans;
    }
    
    }


