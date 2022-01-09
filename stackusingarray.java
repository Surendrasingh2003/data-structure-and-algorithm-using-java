

class stack {
    private int top;
    private int size;
    private int arr[];
    public stack(int size)
    {
        top=-1;
        this.size=size;
        arr=new int[size];
    }

    public Boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        if(top==size-1)
        {
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack OverFlow");
        }
        else
        {
            System.out.println("Element added is:"+data);
            arr[++top]=data;
        }
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underFlow");
        }
        else
        {
            System.out.println("poped out element is : "+arr[top--]);

        }
    }

    public int peek()
    {
        return arr[top];
    }

    public void print()
    {
        System.out.println("Elements present in stacks are : ");
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class stackusingarray
{ 
    public static void main(String[] args)
    {
        stack s=new stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.peek();
        s.pop();
        s.pop();
        s.push(5);
        s.push(6);
        s.print();
    }
}
