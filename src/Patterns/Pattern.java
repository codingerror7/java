import java.util.Scanner;

// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5; i++){
//             System.out.println("*");
//         }
//     }
// }

//rectangle:
// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5; i++){         //outer loop for rows
//             for(int j = 1; j <= 5; j++){     //inner loop for columns
//                 System.out.print("*");
//             }
//             System.out.println();            //to move cursor to another line
//         }
//     }
// }



// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= 5; j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }



// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= 5; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//right pyramid
// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//right triangle of numbers
// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//another right triangle
// public class Pattern{
//     public static void main(String agrs[]){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }


//inverted right triangle
// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 5; i >= 1; i--){
//             for(int j = 1; j <=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//inverted right triangle of numbers
// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 5; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



// public class Pattern{
//     public static void main(String args[]){
//         for(int i = 5; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }



//pyramid:
// public class Pattern{
//     public static void main(String agrs[]){
//         int n = 5;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= 2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println(

//             );
//         }
//     }
// }


//inverted pyramid
public class Pattern{
    public static void main(String args[]){
        int n = 5;
        for(int i = n; i >= 1; i--){
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}