package p1;

public class Llist
{
    private int data;
    private Llist next;

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Llist getNext()
    {
        return next;
    }

    public void setNext(Llist next)
    {
        this.next = next;
    }

    public Llist(int data, Llist next)
    {
        this.data = data;
        this.next = next;
    }
    public Llist()
    {
        this.data=0;
        this.next=null;
    }
    public Llist(int data)
    {
        this.data=data;
    }
}
