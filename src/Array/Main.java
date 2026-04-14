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


//linear search:
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter array size:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("array size is" + " " + n);
//         System.out.println("enter array elements:");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("array elements are:");
//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         Boolean flag = false;
//         System.out.println("enter key to be found:");
//         int key = sc.nextInt();
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i]==key){
//                 System.out.println("key found at index" + " " + i);
//                 flag = true;
//                 break;
//             }
//         }
//         if(!flag){
//             System.out.println("key not found");
//         }
//     }
// }


//reverse an array by user input:
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter array size:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("array size is:" + n);
//         System.out.println("enter array elements:");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         sc.nextLine();
//         System.out.println("now, reverse/not reverse?");
//         String select = sc.nextLine();
//         sc.close();
//         if(select.equalsIgnoreCase("reverse")){
//             System.out.println("reversed array is:");
//             for(int i = arr.length-1; i >= 0; i--){
//                 System.out.println(arr[i]);
//             }
//         }
//         else if(select.equalsIgnoreCase("not reverse")){
//             for(int i = 0; i < arr.length; i++){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }


//largest and smallest element in array:
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = {22,33,43,32,67,76,78,90,99};
//         int maxVal = Integer.MIN_VALUE;
//         int minVal = Integer.MAX_VALUE;
//         System.out.println("array is:");
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("max value is:");
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i]>maxVal){
//                 maxVal=arr[i];
//             }
//         }
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i]<minVal){
//                 minVal=arr[i];
//             }
//         }
//         System.out.println("largest element is " + maxVal);
//         System.out.println("Smallest element is " + minVal);
//     }
// }


//pair of elements in array:
// public class Main{
//     public static int pair(int arr[]){
//         int tp = 0;
//         for(int i = 0; i < arr.length; i++){
//             int curr = arr[i];
//             for(int j = i+1; j < arr.length; j++){
//                 System.out.print("(" + curr + "," + arr[j] + ")" + " ");
//                 tp++;
//             }
//         }
//         System.out.println("total no. of pair is " + tp);
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[] = {2,4,6,8,10};
//         pair(arr);
//     }
// }


//print subarrays:
// public class Main{
//     public static void subArr(int arr[]){
//         int totalSubarr = 0;
//         for(int i = 0; i < arr.length; i++){   
//             int start = i;
//             for(int j = i; j < arr.length; j++){
//                 int end = j;
//                 for(int k = start; k <= end; k++){   //start se leke end tak elements print krne ke liye.
//                     System.out.print(arr[k] + " ");
//                     totalSubarr++;
//                 }
//             }
//         }
//         System.out.println(totalSubarr);
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         subArr(arr);
//     }
// }