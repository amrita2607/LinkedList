package p1;

public class mylinkedlist
{
    private Llist head,tail;
    private int size;

    public Llist getHead() {
        return head;
    }

    public void setHead(Llist head) {
        this.head = head;
    }

    public Llist getTail() {
        return tail;
    }

    public void setTail(Llist tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public mylinkedlist()
    {
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public static void main(String[] args)
    {
        mylinkedlist l=new mylinkedlist();
        Llist node=new Llist(10,null);


    }

}
