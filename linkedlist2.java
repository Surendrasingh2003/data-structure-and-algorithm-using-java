import java.util.Scanner;
public class linkedlist2 {
    Node head=null;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            next=null;
        }
    }

    void createNode()
    {
        Scanner sc=new Scanner(System.in);
        String c="";
        do
        {
            System.out.println("Enter the data :");
            String d=sc.nextLine();
            Node newNode=new Node(d);
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                Node lastNode=head;
                while(lastNode.next!=null)
                {
                    lastNode=lastNode.next;
                }
                lastNode.next=newNode;
            }
            System.out.println("Enter 1 if you want to add one more node otherwise enter any key");
            c=sc.nextLine();
        }while(c.equals("1"));
    }

    void show()
    {
        Node lastNode=head;
        do
        {
            System.out.println(lastNode.data);
            lastNode=lastNode.next;
        }
        while(lastNode!=null);
    }

    void insertAtFirst(String data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String args[])
    {
        linkedlist2 l1=new linkedlist2();
        l1.createNode();
        System.out.println("before insertion :");
        l1.show();
        System.out.println("After insertion :");
        l1.insertAtFirst("89");
        l1.show();
    }
}
