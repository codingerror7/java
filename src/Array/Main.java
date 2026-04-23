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
//         //nested loop to compare elements inside array:
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
//     public static void pair(int arr[]){
//         int tp = 0;
//         for(int i = 0; i < arr.length; i++){
//             int curr = arr[i];
//             for(int j = i+1; j < arr.length; j++){
//                 System.out.print("(" + curr + "," + arr[j] + ")" + " ");
//                 tp++;
//             }
//         }
//         System.out.println("total no. of pair is " + tp);
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


//max sub array sum programme:
// public class Main{
//     public static void maxSubArrSum(int arr[]){
//         int curr = 0;
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i <arr.length; i++){
//             int start = i;
//             for(int j = i; j < arr.length; j++){
//                 int end = j;
//                 curr=0;
//                 for(int k = start; k<=end; k++){
//                     curr+=arr[k];
//                     System.out.println(curr);
//                     if(max<curr){
//                         max=curr;
//                     }
//                 }
//             }
//         }
//         System.out.println("max sum is " + max);
//     }
//     public static void main(String args[]){
//         int arr[] = {2,4,6,8,10};
//         maxSubArrSum(arr);
//     }
// }



//trapped rainwater problem:
// public class Main{
//     public static int trappedRainWater(int height[])
//     {
//         int n = height.length;
//         int width = 1;                 //width of each bar, it is usually 1 but in interviews they can change the height.
//         int left[] = new int[n];   

//         //calculate maximum leftmost boundary:
//         left[0] = height[0];             //take 1st index same to the height array coz it has no boundary.
//         for(int i = 1; i < n; i++){
//             left[i] = Math.max(height[i],left[i-1]);     //compare current bar height and previouse bar height.
//         }

//         //calculate maximum rightmost boundary:
//         int right[] = new int[n];
//         right[n-1] = height[n-1];     //begin from last bar.
//         for(int i = n-2; i >= 0; i--){
//             right[i] = Math.max(height[i],right[i+1]);
//         }

//         int trappedWater = 0;
//         for(int i = 0; i < n; i++){
//             int waterLevel = Math.min(left[i],right[i]);

//             //formula to calculate total waterlevel:
//             trappedWater += (waterLevel - height[i]) * width;
//         }

//         return trappedWater;
//     }
//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};            //height of bars
//         int res = trappedRainWater(height);
//         System.out.println("total water trapped is " + res);
//     }
// }


//stock buy sell:
// public class Main{
//     public static int buyAndSellStock(int arr[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxPrice = 0;
//         for(int i = 0; i < arr.length; i++){
//             if(buyPrice<arr[i]){
//                 int profit = arr[i] - buyPrice;
//                 maxPrice = Math.max(maxPrice, profit);
//             }
//             else{
//                 buyPrice = arr[i];
//             }
//         }
//         return maxPrice;
//     }
//     public static void main(String args[]){
//         int arr[] = {7,1,5,3,6,4};
//         int res = buyAndSellStock(arr);
//         System.out.println(res);
//     }
// }


//two sum code:
// public class Main{
//     public static int[] printSum(int arr[], int target){     //this is the compact way of making arrays.
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i+1; j < arr.length; j++){
//                 int sum = arr[i] + arr[j];
//                 if(sum==target){
//                     return new int[]{i,j};  //java ek time per ek hi chiz return kr skti hai, jab multiple values return krni hoti hai tab iska use krte hain.
//                 }   
//             }
//         }
//         return new int[]{};
//     }
//     public static void main(String args[]){
//         int arr[] = {5,2,3,5,6,7};
//         int target = 7;
//         int[] res = printSum(arr, target);
//         System.out.println(Arrays.toString(res));   //arrays is an object, agar directly print kr denge to memory address return krega, isliye we use this method to print, it converts array elements into string. It has come from java.util.Arrays;

//     }
// }


//to find second largest element in array:
// public class Main{
//     public static int printSecondLargest(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             if(largest<arr[i]){
//                 secondLargest = largest;
//                 largest = arr[i];
//             }
//             else if(arr[i]>secondLargest && largest<arr[i]){
//                 secondLargest=arr[i];
//             }
//         }
//         return secondLargest;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         int res = printSecondLargest(arr);
//         System.out.println("second largest element is " + res);
//     }
// }


//print second largest and second smallest element:
// public class Main{
//     public static int printSecondLargest(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             if(largest<arr[i]){
//                 secondLargest = largest;
//                 largest = arr[i];
//             }
//             else if(secondLargest>arr[i] && arr[i]!=largest){
//                 secondLargest = arr[i];
//             }
//         }
//         return secondLargest;
//     }
//     public static int printSecondSmallest(int arr[]){
//         int smallest = Integer.MAX_VALUE;
//         int secondSmallest = Integer.MAX_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             if(smallest>arr[i]){
//                 secondSmallest = smallest;
//                 smallest = arr[i];
//             }
//             else if(secondSmallest>arr[i] && arr[i]!=smallest){
//                 secondSmallest = arr[i];
//             }
//         }
//         return secondSmallest;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter array size:");
//         int n = sc.nextInt();
//         System.out.println("array size is " + n);
//         int arr[] = new int[n];
//         System.out.println("enter array elements:");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("array elements are:");
//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         int secondLargest = printSecondLargest(arr);
//         int secondSmallest = printSecondSmallest(arr);
//         System.out.println("secondlargest element is " + secondLargest);
//         System.out.println("second smallest element is " + secondSmallest);
//     }
// }


//check array is sorted or not
// public class Main{
//     public static Boolean isSort(int arr[]){
//         for(int i = 0; i <= arr.length-2; i++){
//             if(arr[i]<=arr[i+1]){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         Boolean res = isSort(arr);
//         if(res){
//             System.out.println("array is sorted");
//         }
//         else{
//             System.out.println("array not sorted..");
//         }
//     }
// }


//remove duplicates from sorted array:
// public class Main{
//     public static void removeDuplicate(int arr[]){
//         int n = arr.length;
//         int temp[] = new int[n];
//         int k = 0;

//         for(int i = 0; i < n; i++){
//             Boolean isDuplicate = false;

//             for(int j = 0; j < k; j++){
//                 if(arr[i] == temp[j]){
//                     isDuplicate = true;
//                     break;
//                 }
//             }

//             if(!isDuplicate){
//                 temp[k] = arr[i];
//                 k++;
//             }
//         }

//         //print temp loop:
//         for(int i = 0; i < k; i++){
//             System.out.print(temp[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,1,2,2,2,3};
//         removeDuplicate(arr);
//     }
// }


//left rotate array by one:
// public class Main{
//     public static void rotateArrayByOne(int arr[]){
//         int n = arr.length;
//         int temp = arr[0];

//         for(int i = 0; i < n-1; i++){
//             arr[i] = arr[i+1];        
//         }
//         arr[n-1] = temp;

//         System.out.println("rotated array is:");
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         rotateArrayByOne(arr);
//     }
// }


//right rotate array by one
// public class Main{
//     public static void rotateArrayByRight(int arr[]){
//         int n = arr.length;
//         int last = arr[n-1];

//         for(int i = n-1; i > 0; i--){
//             arr[i] = arr[i-1];
//         }
//         arr[0] = last;

//         System.out.println("right rotated array is:");
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         rotateArrayByRight(arr);
//     }
// }


//left rotate array by k places:  let k = 2
// public class Main{
//     public static void kRotateArray(int arr[]){
//         int n = arr.length;
//         int first = arr[0];
//         int second = arr[1];

//         for(int i = 0; i < n-2; i++){
//             arr[i] = arr[i+2];
//         }
//         arr[3] = first;
//         arr[4] = second;

//         System.out.println("rotated array by k=2 places is");
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         kRotateArray(arr);
//     }
// }


//right rotate array by k places:  let k = 2
// public class Main{
//     public static void kRotateArraysByRight(int arr[]){
//         int n = arr.length;
//         int first = arr[4];
//         int second = arr[5];
//         int third = arr[6];

//         for(int i = n-1; i > 2; i--){
//             arr[i] = arr[i-3];
//         }
//         arr[0] = first;
//         arr[1]  = second;
//         arr[2] = third;

//         System.out.println("when k=3, right rotate array is");
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5,6,7};
//         kRotateArraysByRight(arr);
//     }
// }


//move zeroes to end:
// public class Main{
//     public static void moveZeroToEnd(int arr[]){
//         int n = arr.length;
//         int temp[] = new int[n];
//         int k = 0;

//         for(int i = 0; i < n; i++){
//                 if(arr[i] != 0){
//                 temp[k] = arr[i];
//                 k++;
//             }

//         }
//         while(k<n){
//             temp[k]=0;
//             k++;
//         }
//         for(int i = 0; i < n; i++){
//             arr[i] = temp[i];
//         }
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,0,4,0,0,5};
//         moveZeroToEnd(arr);

//     }
// }
 

//zero exist or not in array:
// public class Main{
//     public static Boolean findZero(int arr[], int zero){
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i]==zero){
//                 System.out.println("zero at index " + i);
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,0,2,3,4,5};
//         int zero = 0;
//         Boolean res = findZero(arr, zero);
//         if(res){
//             System.out.println("zero present in array");
//         }
//         else{
//             System.out.println("zero not present");
//         }
//     }
// }


//union of two arrays:
// public class Main{
//     public static void findUnion(int arr1[], int arr2[]){
//         int n = arr1.length;
//         int m = arr2.length;
//         int temp[] = new int[n+m];
//         int k = 0;

//         //adding elements of first array to temp array:
//         for(int i = 0; i < n; i++){
//             Boolean isDuplicate = false;
//             for(int j = 0; j < k; j++){
//                 if(arr1[i]==temp[j]){
//                     isDuplicate=true;
//                     break;
//                 }
//             }
//             if(!isDuplicate){
//                 temp[k]=arr1[i];
//                 k++;
//             }
//         }
//         //adding elements of second array to temp array:
//         for(int i = 0; i < m; i++){
//             Boolean isDuplicate = false;
//             for(int j = 0; j < k; j++){
//                 if(arr2[i]==temp[j]){
//                     isDuplicate = true;
//                     break;
//                 }
//             }
//             if(!isDuplicate){
//                 temp[k]=arr2[i];
//                 k++;
//             }
//         }
//         for(int i = 0; i < k; i++){
//             System.out.print(temp[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//     int arr[] = {1,2,3,4,5,6,7,8,9,10};
//     int arr2[] = {2,3,4,4,5,11,12};
//     findUnion(arr, arr2);
//     }
// }


//two sum by user input:
// public class Main{
//     public static Boolean twoSum(int arr[],int target){
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[i] + arr[j] == target){
//                     System.out.println(arr[i] + "+" + arr[j] + " = " + target + " at index " + i + " and " + j );
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter array size:");
//         int n = sc.nextInt();
//         System.out.println("array size is " + n);
//         int arr[] = new int[n];
//         System.out.println("enter array elements:");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("array elements are:");
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("enter target:");
//         int target = sc.nextInt();
//         Boolean res = twoSum(arr, target);
//         if(res){
//             System.out.println("yess");
//         }
//         else{
//             System.out.println("No");
//         }
//     }
// }


//maximum consecutive ones:
// public class Main{
//     public static void consecutiveZero(int arr[]){
//         int n = arr.length;
//         int max = 0;
//         for(int i = 0; i < n; i++){
//             int count = 0;
//             for(int j = i; j < n; j++){
//                 if(arr[j]==1){
//                     count++;
//                 }
//                 else{
//                     break;
//                 }
//             }
//             if(count>max){
//                 max=count;
//             }
//         }
//         System.out.println(max);
//     }
//     public static void main(String args[]){
//         int arr[] = {1,1,0,1,1,1};
//         consecutiveZero(arr);
//     }
// }


//two multiply(like two sum):
// public class Main{
//     public static void twoMultiply(int arr[],int target){
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[i]*arr[j]==target){
//                     System.out.println(arr[i] + "x" + arr[j] + " = " + target + " at index " + i + " and " + j );
//                     break;
//                 }
//             }
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter array size:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("enter array elements:");
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("array is:");
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("enter target:");
//         int target = sc.nextInt();

//         twoMultiply(arr, target);
//     }
// }



//Find the number that appears once, and other numbers twice.
// public class Main{
//     public static int appearOnce(int arr[]){
//         int n = arr.length;

//         for(int i = 0; i < n; i++){
//             int count = 0;
//             for(int j = 0; j < n; j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             if(count==1){
//                 return arr[i];
//             }
//         }
//         return -1;  //sentinel value : a special type of value used to terminate a loop/function/programme. the value used as sentinel must not be a part of real data in arrays, it must be different from real values in array.
//     }
//     public static void main(String args[]){
//         int arr[] = {4,1,2,1,2};
//         int res = appearOnce(arr);
//         if(res==-1){
//             System.out.println("nothing..");
//         }
//         else{
//             System.out.println(res);
//         }
//     }
// }


//Sort an array of 0's 1's and 2's
// public class Main{
//     public static void sortBinary(int arr[]){
//         int count0 = 0, count1 = 0, count2 = 0;
//         int n = arr.length;

//         for(int i = 0; i < n; i++){
//             if(arr[i]==0){
//                 count0++;
//             }
//             else if(arr[i]==1){
//                 count1++;
//             }
//             else if(arr[i]==2){
//                 count2++;
//             }
//         }
//         int index = 0;

//         for(int i = 0; i < count0; i++){
//             arr[index++] = 0;
//         }
//         for(int i = 0; i < count1; i++){
//             arr[index++] = 1;
//         }
//         for(int i = 0; i < count2; i++){
//             arr[index++] = 2;
//         }
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,0,2,1,0,2,1,2,1,2,0,0,1};
//         sortBinary(arr);
//     }
// }


//Find the Majority Element that occurs more than N/2 times
// public class Main{
//     public static void majorityElement(int arr[]){
//         int n = arr.length;

//         int half = n/2;
//         int count0 = 0, count1 = 0, count2 = 0, count7 = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i]==0){
//                 count0++;
//             }
//             else if(arr[i]==1){
//                 count1++;
//             }
//             else if(arr[i]==2){
//                 count2++;
//             }
//             else if(arr[i]==7){
//                 count7++;
//             }
//         }

//         //to compare count of each element and to find maximum count value:

//         if(count0>half){
//             System.out.println("majority element is 0");
//         }
//         else if(count1 > half){
//             System.out.println("majority element is 1");
//         }
//         else if(count2>half){
//             System.out.println("majority element is 2");
//         }
//         else if(count7 > half){
//             System.out.println("majority element is 7");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {7,0,0,1,7,7,2,7,7};
//         majorityElement(arr);
//     }
// }


//kadanes algorithm for max subarray sum:
// public class Main{
//     public static void maxSubArraySum(int arr[]){
//         int n = arr.length; 
//         int curr = 0;
//         int max = Integer.MIN_VALUE;

//         for(int i = 0; i < n; i++){
//             curr = curr + arr[i];

//             if(curr>max){
//                 max=curr;
//             }

//             if(curr<0){
//                 curr=0;
//             }
//         }
//         System.out.print(max);
//     }
//     public static void main(String args[]){
//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//         maxSubArraySum(arr);
//     }
// }