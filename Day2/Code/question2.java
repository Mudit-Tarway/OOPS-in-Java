// package Day2.Code;
import java.util.*;
public class question2 {
    public static void main(String arges[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the element of the array : ");
        for(int i=0 ; i<size ; i++){
            array[i] =  sc.nextInt();
        }
        System.out.print("Enter the element you want to search = ");
        int findElement = sc.nextInt();
        int index = findElementinArray(array,findElement);
        if(index == -1){
            System.out.println("Element is not present in the index");
        }else{
            System.err.println("Element "+findElement+" is at index "+index);
        }
    }

    public static int findElementinArray(int arr[] , int findElement){
        int length = arr.length;
        for(int i=0 ; i<length; i++){
            if(findElement == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
