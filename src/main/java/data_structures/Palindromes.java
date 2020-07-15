package data_structures;

import java.util.LinkedList;

public class Palindromes {
    public static void main(String[] args) {

    String s1 = "YolLoy";
    String s2 = "Racecar";
    String s3 = "Labamabal";

        System.out.println(checkForPalindromStackAndQueue(s1));
        System.out.println(checkForPalindromStackAndQueue(s2));
        System.out.println(checkForPalindromStackAndQueue(s3));






    }
public static boolean checkForPalindromStack(String string){

    LinkedList<Character> stack = new LinkedList<>();

    StringBuilder noPuncSb = new StringBuilder();
    String lowerCase = string.toLowerCase();

    for (int i = 0; i < lowerCase.length() ; i++) {
       char c = lowerCase.charAt(i);
       if(c >= 'a' && c <= 'z'){
            noPuncSb.append(c);
            stack.push(c);
       }}

     StringBuilder reversedString = new StringBuilder(stack.size());
      while(!stack.isEmpty()) {
        reversedString.append(stack.pop());
        }

      return reversedString.toString().equals(noPuncSb.toString());
    }

public static boolean checkForPalindromStackAndQueue(String string) {
LinkedList<Character> stack = new LinkedList<>();
LinkedList<Character> queue = new LinkedList<>();

String lowercase = string.toLowerCase();
    for (int i = 0; i < lowercase.length(); i++) {
        char c = lowercase.charAt(i);
        if(c >= 'a' && c <= 'z'){
            queue.addLast(c);
            stack.push(c);
        }
    }
    while (!stack.isEmpty()){
        if(!stack.pop().equals(queue.removeFirst())){
            return false;
        }
    }
    return true;

}
}
