package Java.array;
import java.util.Scanner;
public class maxelementappear {
    public static void main(String[]args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i =0; i<n; i++){
      arr[i]=scn.nextInt();
    }
    int ans = countgre(arr);
        System.out.print(ans);
}
    public static int maxfind(int[]arr){
    int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
          if(arr[i]>max){
           max = arr[i];
          }
        }
        return max;
}
    public static int countgre(int[]arr){
    int maxEle = maxfind (arr);
        int c= 0;
        for(int i =0; i<arr.length; i++){
         if(arr[i]==maxEle){
          c++;
         }
        }
        return c;
    }
}
