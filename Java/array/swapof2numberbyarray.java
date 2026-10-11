package Java.array;

public class swapof2numberbyarray {
    public static void main(String[] args){
     int [] arr = {10, 20};
        swap(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
    public static void swap(int[] a){
        int temp = a[0];
        a[0] = a[1]; 
        a[1] = temp;
       
    }
}

