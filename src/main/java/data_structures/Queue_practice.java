package data_structures;

import javax.swing.*;
import java.util.NoSuchElementException;

public class Queue_practice {
Employee[] que;
private int front = 0;
private int back = 0;

    public Queue_practice(int cap) {
        que = new Employee[cap];
    }


    public void add(Employee emp){
    if(size() == que.length-1){
        int numOfitems = size();
        Employee[] newArray = new Employee[2 * que.length];
        System.arraycopy(que,front,newArray,0,que.length-front);
        System.arraycopy(que,0,newArray,que.length-front,back);
        que = newArray;
        front=0;
        back=numOfitems;
    }
        que[back] = emp;

    if(back<que.length-1){
        back++;
    }
    else back=0;
    }

    public Employee remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        Employee emp = que[front];
        que[front] = null;
        front++;

        if(size()== 0){
            front=0;
            back=0;
        }else if(front==que.length){
            front=0;
        }
    return emp;
    }


    public int size() {
        if(front<=back) return back - front;
        else return back-front+que.length;

    }
    public void printQue(){
        for (int i = 0; i <que.length ; i++) {
            System.out.println(que[i]);
        }
    }
}
