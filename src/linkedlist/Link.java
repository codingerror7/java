package src.linkedlist;

// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;   //address hum manually fill krte h isliye ise by default null value assign kr dete hai.
//     }
// }
// public class Link{
//     public static void main(String args[]){
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         head.next = second;         //isme hum address assign kr rhe hai for next.
//         second.next = third;
//     }
// }


//     class Node{
//         int data;
//         Node next;

//         Node(int data){       //constructor
//             this.data = data;
//             this.next = null;
//         }

// public class Link{
//     public static void main(String args[]){
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         head.next = second;
//         second.next = third;

//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }


//Insertion at beginning:
// public class Link{
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static void main(String args[]){
//         Node newhead = new Node(5);
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);

//         head.next = second;
//         second.next = third;

//         //insertion at beginning
//         newhead.next = head;
//         head = newhead;

//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }


//inserting multiple elements at beginning
// public class Link{
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static void main(String args[]){
//         Node newNode6 = new Node(1);
//         Node newNode5 = new Node(3);
//         Node newNode4 = new Node(4);
//         Node newNode3 = new Node(5);
//         Node newNode2 = new Node(8);
//         Node newNode = new Node(9);
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);

//         head.next = second;
//         second.next = third;
         
//         //inserting first newnode
//         newNode.next = head;
//         head = newNode;

//         //inserting second new node
//         newNode2.next = head;
//         head = newNode2;

//         //inserting third new node
//         newNode3.next = head;
//         head = newNode3;

//         //inserting fourth new node
//         newNode4.next = head;
//         head = newNode4;

//         //inserting fifth new node
//         newNode5.next = head;
//         head = newNode5;

//         //inserting sixth new node
//         newNode6.next = head;
//         head = newNode6;

//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }


//inserting element at last
// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Link{
//     public static void main(String args[]){
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);

//         head.next = second;
//         second.next = third;

//         Node fourth = new Node(40);

//         Node temp = head;
//         while(temp.next!=null){
//             temp = temp.next;
//         }
//         temp.next = fourth;

//         temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp = temp.next;
//         }
//         System.out.println("null");

//     }
// }


//inserting multiple elements at last:
// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Link{
//     public static void main(String args[]){
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);

//         head.next = second;
//         second.next = third;

//         Node newNode = new Node(40);
//         Node newNode2 = new Node(50);
//         Node newNode3 = new Node(60);
//         Node temp = head;
//         while(temp.next!=null){
//             temp = temp.next;
//         }
//         temp.next = newNode;
        
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next = newNode2;

//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next = newNode3;

//         temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }


//INSERTING ELEMENT IN BETWEEN
// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Link{
//     public static void main(String args[]){
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         Node fourth = new Node(40);

//         head.next = second;
//         second.next = third;
//         third.next = fourth;

//         int position = 3;
//         Node newNode = new Node(25);
//         Node temp = head;
//         for(int i = 1; i < position-1; i++){
//             temp=temp.next;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;

//         temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
// }


//How to remove node from beginning
// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Link{
//     public static void main(String args[]){
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);

//         head.next = second;
//         second.next = third;

//         head = head.next;  //head ko shift krdo, remove ho jyegi first node.

//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }


//remove node from end
// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Link{
//     public static void main(String args[]){
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         Node fourth = new Node(40);

//         head.next = second;
//         second.next = third;
//         third.next = fourth;

//         int position = 4;
//         Node temp = head;
//         for(int i = 1; i < position-1; i++){
//             temp=temp.next;
//         }
//         temp.next = null;

//         temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             temp = temp.next;
//         }
//         System.out.println("null");

//     }
// }


//Multiple operations together:
// class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Link{
//     public static void main(String args[]){
//         Node newNode = new Node(5);
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         Node fourth = new Node(40);
//         Node fifth = new Node(50);

//         head.next = second;
//         second.next = third;
//         third.next = fourth;

//         newNode.next = head;
//         head = newNode;

//         int pos = 4;
//         Node betNode = new Node(25);
//         Node temp = head;
//         for(int i = 1; i<pos-1; i++){
//             temp = temp.next;
//         }
//         betNode.next = temp.next;
//         temp.next = betNode;

//         int newPos = 6;
//         Node newNode2 = new Node(35);
//         temp = head;
//         for(int i = 1; i < newPos-1; i++){
//             temp = temp.next;
//         }
//         newNode2.next = temp.next;
//         temp.next = newNode2;

//         temp = head;
//         while(temp.next!=null){
//             temp = temp.next;
//         }
//         temp.next = fifth;

//         temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }



//using built-in class for creating linked list, its not used in dsa but is useful in developing apps. Issey doubly linked list hi create hoti hai.
// import java.util.LinkedList;

// public class Link{
//     public static void main(String args[]){
//         LinkedList<String> l = new LinkedList<>();
//         l.add("suji");
//         l.add("ronaldo");
//         l.add("messi");
//         l.add("neymar");
//         l.add("pogba");

//         System.out.println(l);
//     }
//}

