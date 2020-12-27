package TestDome.DataStructure;

public class Stack<T> {

    Object stackData [];
    int size;
    int top;

    public Stack(int size){
        this.size = size;
        this.top = -1;
        this.stackData = new Object[size];
    }

    public void push(Object item){
        if(isFull()){
            System.out.println("Stack full");
            return;
        }
        top++;
        stackData[top] = item;
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack empty");
            return null;
        }
        T item = (T) stackData[top];
        top--;
        return item;
    }

    public boolean isFull(){
        return top==size-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public T getAll(){
        return (T)stackData;
    }
}
