import java.util.Scanner;
public class linkedlist3{
    Node head=null;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            next=null;
        }
    }

    void insertAtIndex(String data,int index)
    {
        Node newNode=new Node(data);
        Node p=head;
        int i=0;
        while(i<index-1)
        {
            p=p.next;
            i++;
        }
        newNode.next=p.next;
        p.next=newNode;
    }  

    void show()
    {
        Node lastNode=head;
        do{
            System.out.println(lastNode.data);
            lastNode=lastNode.next;
        }while(lastNode!=null);
    }

    void createNode()
    {
        Scanner sc=new Scanner(System.in);
        String c="";
        do{
            System.out.println("Enter the data of the node");
            String d=sc.next();
            Node newNode=new Node(d);
            if(head==null)
            {
                head=newNode;
            }
            else{
                Node lastNode=head;
                while(lastNode.next!=null)
                {
                    lastNode=lastNode.next;
                }
                lastNode.next=newNode; 
            }
            System.out.println("Do you want one more node then press 1 and enter otherwise press any other key");
            c=sc.next();

        }while(c.equals("1"));
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist3 l1=new linkedlist3();
        l1.createNode();
     //linkedlist1 l2=new linkedlist1();
     // l2.createNode();
        System.out.println("linked list created :");
        l1.show();
        System.out.println("Enter where you want to insert(index number)");
        int i=sc.nextInt();
        System.out.println("Enter the data of the node");
        String data=sc.next();
        System.out.println("After insertion");
        l1.insertAtIndex(data, i);
        l1.show();
    // l2.show();
    }
    
}

