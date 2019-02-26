package p1;

public class Singlelinkedlist
{
    private class Node
    {
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
            this.data = 0;
            this.next = null;
        }

        public Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }

    private Node head=null;
    private int size=0;

    @Override
    public String toString()
    {
        StringBuilder response= new StringBuilder();
        response.append("[");
        response.append("]");
        return response.toString();
    }

    public static void main(String[] args)
    {
        Singlelinkedlist linkedlist=new Singlelinkedlist();
        System.out.println(linkedlist);

    }
}
