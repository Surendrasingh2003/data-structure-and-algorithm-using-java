import java.util.Scanner;
public class doublylinkedlist {
    Node head=null;
    class Node
    {
        String data;
        Node prevlink;
        Node nextlink;
        Node(String data)
        {
            prevlink=null;
            nextlink=null;
            this.data=data;
        }
    }

    void createDoublylinkedlist()
    {
        Scanner sc=new Scanner (System.in);
        String c="";
        do{
            System.out.println("Enter the data");
            String data=sc.next();
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
            }
            else{
                Node p=head;
                
                while(p.nextlink!=null)
                {
                    p=p.nextlink;
                }
                p.nextlink=newNode;
                newNode.prevlink=p;
                
            }
            System.out.println("enter 1 to add one more node otherwise enter any other key ");
                c=sc.next();
        }while(c.equals("1"));
    }

    void show()
    {
        Node p=head;
        
        System.out.println("doubly linkedlist :");
        while(p.nextlink!=null)
        {
            System.out.println(p.data);
            p=p.nextlink;
        }
        if(p.nextlink==null){
            System.out.println(p.data);
        }
        System.out.println("reverse printing");
        while(p.prevlink!=null)
        {
            System.out.println(p.data);
            p=p.prevlink;
        }
        if(p.prevlink==null){
            System.out.println(p.data);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        doublylinkedlist l1=new doublylinkedlist();
        l1.createDoublylinkedlist();
        l1.show();
    }
}
