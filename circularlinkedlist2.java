import java.util.Scanner;
public class circularlinkedlist2
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
    
    void insertAtFirst()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data of the node to be inserted at first");
        String data=sc.next();
        Node newNode=new Node(data);
        newNode.next=head;
        
        Node p=head;
        while(p.next!=head)
        {
            p=p.next;
        }
        head=newNode;
        p.next=head;
    }

    void insertAtEnd()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data of the node to be inserted at end");
        String data=sc.next();
        Node newNode=new Node(data);
        Node p=head;
        while(p.next!=head)
        {
            p=p.next;
        }
        p.next=newNode;
        newNode.next=head;
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
        circularlinkedlist2 l1=new circularlinkedlist2();
        l1.createCircularlist();
        System.out.println("circularLinked list:");
        l1.show();
        l1.insertAtFirst();
        System.out.println("After the insertion at beginning");
        l1.show();
        l1.insertAtEnd();
        System.out.println("After the insertion at end");
        l1.show();
    }
}