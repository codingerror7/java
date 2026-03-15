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


public class Link{
    static class Node{
        int data;
        Node next;

        Node(int data){       //constructor
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}