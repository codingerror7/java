package src.Array;

import java.util.*;


//find duplicate element in array:
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter array size:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements:");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("array elements are:");
//         for(int i = 0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         Boolean flag = false;
//         //nested loop to comapre elements inside array:
//         for(int i = 0; i<arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 if(arr[i]==arr[j]){
//                     System.out.println("duplicate element" + " " + arr[i] + " " + "at index" + " " + i);
//                     flag = true;
//                     break;
//                 }
//             }
//         }
//         if(!flag){
//             System.out.println("no duplicate element");
//         }
        
//     }
// }