package Stack;

public class Stack_LinkedList {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static  class Stack{
        static Node head  = null;
        public static boolean isEmpty(){
            return  head == null;
        }
        public static void Push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int Peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;

        }
    }
    public static void main(String args []){
        Stack stack  = new Stack();
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(4);
        stack.Push(5);
        while(!stack.isEmpty()){
            System.out.println(stack.Peek());
            stack.Pop();
        }
    }
}
