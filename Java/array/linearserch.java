package Java.array;

public class linearserch {
    public static void main (String[]args){
    int [] arr = {12,13,15,17,18,45,34,89,15};
        int target = 1;
        boolean flag = false; //false mean target array main nhi ha 
        for(int i =0; i<arr.length; i++){
            if(arr[i]==target){
             flag = true; // true mean target array main ha 
             break;
            }
        }
        if(flag == true){
            System.out.println("Target exist in array");
        }
        else{
            System.out.println("Target missing in array");
        }
    }
}
