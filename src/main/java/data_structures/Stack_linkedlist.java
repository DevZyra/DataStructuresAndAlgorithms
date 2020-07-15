package data_structures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Stack_linkedlist {
    private LinkedList<Employee> stack;


    public Stack_linkedlist(){
        stack = new LinkedList<>();
    }


    public void push(Employee emp){
        stack.push(emp);
    }

    public Employee pop(){
       return stack.pop();
    }
    public Employee peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void printStack(){
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
