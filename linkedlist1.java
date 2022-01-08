import java.util.Scanner;
public class linkedlist1 {
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

    void show(Node a)
    {
        Node lastNode=a;
        do{
            System.out.println(lastNode.data);
            lastNode=lastNode.next;
        }while(lastNode!=null);
    }

    void createNode()
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
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
            c=sc.nextInt();

        }while(c==1);
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist1 l1=new linkedlist1();
        l1.createNode();
  //    linkedlist1 l2=new linkedlist1();
  //    l2.createNode();
        System.out.println("linked list created :");
        l1.show(l1.head);
  //    l2.show(l2.head);
    }
    
}

