public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertend(int val){
            Node temp = new Node(val);
            tail = temp;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
    }
}
