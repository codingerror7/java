// package src.stack;

// import java.util.ArrayList;

// public class Stack{
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
//         ArrayList<Integer> stack = new ArrayList<>();
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
