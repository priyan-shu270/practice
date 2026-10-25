package Java.array;

import java.util.Scanner;

public class rotateclockwisematrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [][] arr =  new int [n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
       for(int j =0; j<n; j++){
           for(int i =n-1; i>=0; i--){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }


    }
}
