package src.Array;

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("array elements are:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==arr[i]){
                System.out.println("duplicate element is:"+arr[i] + " at index:"+i);
                break;
            }
            else{
                System.out.println("no duplicate element is found");
            }
        }
    }
}
