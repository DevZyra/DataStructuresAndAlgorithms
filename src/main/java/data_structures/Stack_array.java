package data_structures;


import java.util.EmptyStackException;

public class Stack_array {
private Employee[] stack;
private int top;


public Stack_array(int capacity){
    this.stack = new Employee[capacity];
}
public void push(Employee emp){
    if(top == stack.length){
    Employee[] newArray = new Employee[2* stack.length];
    System.arraycopy(stack,0,newArray,0,stack.length);
    stack = newArray;
    }
    stack[top++] = emp;
}
public boolean isEmpty(){
   return top == 0;
}

public Employee pop(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    Employee emp = stack[--top];
    stack[top] = null;
    return emp;
}

public Employee peek(){
    if(!isEmpty()){
        return stack[top-1];
    }else throw new EmptyStackException();
}
public void printStack(){
    for(int i = top -1 ;i>=0;i--){
        System.out.println(stack[i]);
    }

}

}