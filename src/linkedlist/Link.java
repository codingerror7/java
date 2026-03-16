package src.linkedlist;

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
//     }
// }


// public class Link{
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){       //constructor
//             this.data = data;
//             this.next = null;
//         }
//     }
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