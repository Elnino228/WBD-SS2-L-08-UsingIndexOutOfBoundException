import java.util.Random;
import java.util.Scanner;

public class UsingArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        ArrayExample arrRandom=new ArrayExample();
        int[] arr=arrRandom.createRandom();
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter position: ");
        int pos=sc.nextInt();
        try {
            System.out.println("Element at position "+pos+" is "+arr[pos]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of range!");
        }
    }
}
 class ArrayExample {
    public int[] createRandom(){
        Random rd=new Random();
        int[] arr=new int[100];
        System.out.println("List elements of array: ");
        for (int i=0;i<100;i++){
            arr[i]=rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}
