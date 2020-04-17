public class StackA {
    char[] stackA;
    int top;

    public StackA(){
        stackA=new char[10];
        top=-1;
    }
    public void push(char a){
        if(isFull())
            System.out.println("Full Stack");
        else{
            top=top+1;
            stackA[top]=a;
        }
    }
    public char pop(){
        if(isEmpty())
            System.out.println("Empty");

        char c=stackA[top];
        top-=1;
        return c;
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    public boolean isFull(){
        if(top==stackA.length-1)
            return true;
        return false;
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print("|"+stackA[i]+"|");
        }
    }
}

