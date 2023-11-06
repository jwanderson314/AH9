import java.util.ArrayList;
import java.util.LinkedList;

class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      
      Node<T> previous = null;
      Node<T> current = head;
      while(current!=null){
        Node<T> next = current.next;
        current.next = previous;
        previous = current;
        current = next;
      }

    head = previous;
    return head;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        
        x.next = y; // x -> y
    
        // reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
        
    }
  }