 package src.stack;

 import java.util.ArrayList;

// public class Lifo{
//     static class Stack{
//         static ArrayList<Integer> stack = new ArrayList<>();
//         public static Boolean isEmpty(){
//             if(stack.size()==0){
//                 return true;
//             }
//             return false;
//         }
//         public static void push(int data){
//             stack.add(data);
//         }
//         public static int pop(){
//             int top = stack.get(stack.size()-1);
//             stack.remove(stack.size()-1);
//             return top;
//         }
//         public static int peek(){
//             if(stack.size()==0){
//                 System.out.println("stack emptyy");
//                 return -1;
//             }
//             return stack.get(stack.size()-1);
//         }
//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(10);
//         s.push(20);
//         s.push(30);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// public class Lifo{
//     static class stack{
//        static ArrayList<Integer> l = new ArrayList<>();
//         public static Boolean isEmpty(){
//             if(l.size()==0){
//                 return true;
//             }
//             return false;
//         }
//         public static void push(int data){
//             if(l.size()==0){
//             System.out.prinltn("empty stack");
//}
//             l.get(l.size()-1);
//         }
//         public static int pop(){
//             if(l.size()==0){
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int var = l.get(l.size()-1);
//             l.remove(l.size()-1);
//             return var;
//         }
//         public static int peek(){
//             if(l.size()==0){
//                 System.out.println("empty stack..");
//                 return -1;
//             }
//             return l.get(l.size()-1);
//         }
//     }
//     public static void main(String args[]){
//         stack l = new stack();
//         l.push(10);
//         l.push(20);;
//         l.push(30);

//         while (!l.isEmpty()) {
//             System.out.println(l.peek());
//             l.pop();
//         }

//     }
// }


//JCF
// import java.util.*;

// public class Lifo{
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(10);
//         s.push(20);
//         s.push(30);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
        
//     }
// }