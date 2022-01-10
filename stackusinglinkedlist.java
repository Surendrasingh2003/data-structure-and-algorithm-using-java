
class stack
{
    Node top;
    stack(){
        top=null;
    }
        class Node
    {
        int data;
        Node link;
        Node(int data)
        {
            this.data=data;
            link=null;
        }
    }

    public boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
    }

    public boolean isFull(Node newNode)
    {
        if(newNode==null)
        {
            return true;
        }
        return false;
    }
    public void push(int data)
    {
        Node newNode=new Node(data);
        if(isFull(newNode))
        {
            System.out.println("Stack overFlow");
        }
        else{
            System.out.println("Added element : "+data);
            if(isEmpty())
            {
                top=newNode;
            }
            else
            {
                newNode.link=top;
                top=newNode;
            }

        }
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow");
        }
        else
        {
            System.out.println("poped element : "+top.data);
            Node p=top;
            top=p.link;
            p.link=null;
        }
    }
    
    public int peek()
    {
        return top.data;
    }

    public void print()
    {
        Node p=top;
        System.out.println("element present in stack");
        while(p!=null)
        {
            System.out.println(p.data);
            p=p.link;
        }
    }
}
class stackusinglinkedlist {
    public static void main(String[] args) {
        
    
    stack s=new stack();
    s.push(5);
    s.push(6);
    s.push(7);
    s.push(8);
    s.push(9);
    s.pop();
    System.out.println("peek value :"+s.peek());
    s.print();
    }
}