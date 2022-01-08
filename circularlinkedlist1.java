import java.util.Scanner;
public class circularlinkedlist1
{
    Node head=null;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void createCircularlist()
    {
        Scanner sc=new Scanner(System.in);
        String c="";
        do{
            System.out.println("enter the data ");
            String data=sc.next();
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                newNode.next=head;
            }
            else
            {
                Node p=head;
                while(p.next!=head)
                {
                    p=p.next;
                }
                p.next=newNode;
                newNode.next=head;
            }
            System.out.println("Enter 1 to add one more node otherwise enter any key");
            c=sc.next();
        }while(c.equals("1"));

    }
    

    void show()
    {
        Node p=head;
        while(p.next!=head)
        {
            System.out.println(p.data);
            p=p.next;
        }
        if(p.next==head)
        {
            System.out.println(p.data);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circularlinkedlist1 l1=new circularlinkedlist1();
        l1.createCircularlist();
        System.out.println("circularLinked list:");
        l1.show();
    }
}