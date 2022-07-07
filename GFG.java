// Java program for iterating the LinkedList
// using Enhanced For loop
  
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
  
public class GFG {
    // public static void main(String[] args)
    // {
  
    //     // Creating a LinkedList of String type
    //     LinkedList<String> linkedList = new LinkedList<>();
  
    //     // Inserting some String values to our LinkedList
    //     linkedList.add("Geeks");
    //     linkedList.add("for");
    //     linkedList.add("Geeks");
  
    //     // LinkedList after insertions: ["Geeks", "for",
    //     // "Geeks]
  
    //     // Calling the function to iterate our LinkedList
    //     iterateUsingEnhancedForLoop(linkedList);
    // }
  
    // // Function to display LinkedList using Enhanced for
    // // loop
    // public static void iterateUsingEnhancedForLoop(LinkedList<String> linkedList)
    // {
  
    //     System.out.print(
    //         "Iterating the LinkedList using enhanced for loop : ");
  
    //     for (String listElement : linkedList) {
    //         System.out.print(listElement + " ");
    //     }
    // }






       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            Stack<Character> stack = new Stack<>();
            String line = scanner.nextLine();
            for(char c : line.toCharArray()) {
                if(c == '{' || c == '(' || c == '[') {
                   stack.push(c);
                   continue;
                }                    
                
                if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }
                
                if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    continue;
                }
                
                if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                    continue;
                }
                
                if(c == '}' || c == ')' || c == ']') {
                    stack.push(c);
                    break;
                }   
            }
            System.out.println(stack.isEmpty());
        }
    }
}