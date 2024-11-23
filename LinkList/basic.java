class basic{
    public static void display(Node head){
        // Node temp = head;
        // while(temp != null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
        if(head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void displayreverse(Node head){
        if(head == null) return;
        displayreverse(head.next);
        System.out.print(head.data+" ");
    }
    public static int  length(Node head){
        int count = 0;
        while(head!= null){
            count++;
            head = head.next;
        }
        System.out.println();
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        displayreverse(a);
        System.out.println("length "+length(a));

    }
}