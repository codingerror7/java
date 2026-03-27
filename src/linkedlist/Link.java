package src.linkedlist;

import java.util.Scanner;

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


//calculate size of list:
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

//         int count = 0;

//         head.next = second;
//         second.next = third;
//         third.next = fourth;

//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//             count = count+1;
//         }
//         System.out.println("null");
//         System.out.println("size of list is" + " " + count);

//     }
// }


//giving string as data in list:
// class Node{
//     String data;
//     Node next;

//     Node(String data){
//         this.data = data;
//         this.next = null;
//     }
// }
// public class Link{
//     public static void main(String args[]){
//         Node head = new Node("one");
//         Node second = new Node("Second");
//         Node third = new Node("Third");
//         Node fourth = new Node("Fourth");
//         Node fifth = new Node("Fifth");

//         int count = 0;
//         head.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;

//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp=temp.next;
//             count++;
//         }
//         System.out.println("null");
//         System.out.println("the size of list is:" + " " + count);
//     }
// }


//built in method for linear search:
// import java.util.LinkedList;
// public class Link{
//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         ll.add(1);
//         ll.add(3);
//         ll.add(2);
//         ll.add(7);
//         ll.add(9);

//         System.out.println(ll.indexOf(9));
//     }
// }


//linear search by built in methods:
// import java.util.LinkedList;;

// public class Link{
//     public static int fn(LinkedList<Integer> ll, int key){
//         for(int i = 0; i <= ll.size(); i++){
//             if(ll.get(i)==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.add(1);  //to add
//         ll.add(3);
//         ll.add(4);
//         ll.add(5);
//         ll.add(7);
//         ll.add(9);
//         ll.add(10);
//         ll.remove(4);  //to remove

//         System.out.println(ll);
//         int res = fn(ll, 9);
//         if(res==-1){
//             System.out.println("Key npt found..");
//         }
//         else{
//             System.out.println("Key is at index" + " " + res);
//         }
//     }
// }



//input programme to find key:
// import java.util.Scanner;
// public class Link{
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static int fn(Node head, int key){
//         int i = 0;
//         Node temp = head;
//         while(temp!=null){
//             if(temp.data==key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         Node fourth = new Node(40);
//         Node fifth = new Node(50);

//         head.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;

//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp=temp.next;
//         }
//         System.out.println("null");

//         System.out.println("Please enter key:");
//         int key = sc.nextInt();

//         int res = fn(head, key);
//         if(res==-1){
//             System.out.println("Key not found..");
//         }
//         else{
//             System.out.println("key is present at index" + " " + res);
//         }

//     }
// }


// import java.util.LinkedList;

// public class Link{
//     public static void main(String args[]){
//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.add(10);
//         ll.add(20);
//         ll.add(30);
//         ll.add(40);
//         ll.add(50);
//         ll.add(60);
//         ll.add(70);
//         ll.add(80);

//         for(int i=7; i>=0; i--){
//             System.out.print(ll.get(i) + "->");
//         }
//         System.out.println("null");
//     }
// }


//how to create cycle
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
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         Node fourth = new Node(40);

//         head.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = second;

//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data + "->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
// }


//floyd's cycle detection algorithm
// public class Link{
//     static class  Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static boolean isCycle(Node head){
//         Node slow = head;
//         Node fast = head;

//         while(fast!=null && fast.next!=null){
//             slow = slow.next; //+1
//             fast = fast.next.next; //+2
//             if(slow==fast){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         Node four = new Node(40);

//         head.next = second;
//         second.next = third;
//         third.next = four;
//         four.next = second;

//         boolean res = isCycle(head);
//         if(res==true){
//             System.out.println("cycle detected");
//         }
//         else{
//             System.out.println("no cycle..");
//         }

//     }
// }