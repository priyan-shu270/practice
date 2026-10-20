package Java.function;
 import java.util.Scanner;
public class pnc {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int nfact = 1;
        for(int i =1; i<=n; i++){
            nfact = nfact*i;
        }
        int rfact =1;
        for(int i =1; i<=r; i++){
        rfact = rfact*i;
        }
        int nmrfact=1;
        for(int i =1; i<=n-r;i++){
            nmrfact = nmrfact*i;
        }
        int ans = nfact/(rfact*n-rfact);
        System.out.print(ans);
    }
}
