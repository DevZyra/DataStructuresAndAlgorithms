package data_structures;



import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {


Queue_practice queue = new Queue_practice(5);

queue.add(new Employee("Pablo","Escobar",1));
queue.add(new Employee("Pawlo","Sankobar",2));
queue.add(new Employee("Marian","Freud",3));

queue.printQue();



    }







public static boolean checkForPalindrom(String string){

    LinkedList<Character> stack = new LinkedList<>();
    
    StringBuilder noPuncSb = new StringBuilder();
    String lowerCase = string.toLowerCase();

    for (int i = 0; i < lowerCase.length() ; i++) {
        char c = lowerCase.charAt(i);
        if(c >= 'a' && c <= 'z'){
            noPuncSb.append(c);
            stack.push(c);
        }
    }
    StringBuilder reversedString = new StringBuilder(stack.size());
    while(!stack.isEmpty()) {
        reversedString.append(stack.pop());
    }
    return reversedString.toString().equals(noPuncSb.toString());
}    
}
