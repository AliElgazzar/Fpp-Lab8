
public class LinkedListStack {

    Node Header;

    public LinkedListStack() {
        Header = new Node();
    }


    public void push(Integer x) {

        if (x == null) {
            return;
        }
        // Push at first of list
       /* Node n = new Node();
        n.data = x;
        n.next = Header.next;
        Header.next = n;
        if (Header.next != null) {
            Header.next.prev = n;
        }
        n.prev = Header;*/

        // push at last of list
        Node n = new Node();
        Node Current = Header;
        while (Current.next != null) {
            Current = Current.next;
        }
        n.data = x;
        n.prev = Current;
        Current.next = n;
        n.next = null;
    }

    public Integer pop() {
        int value = 0;
        if (isEmpty()) return null;
        Node Current = Header;
        while (Current.next != null) {
            Current = Current.next;
        }
        value = Current.data;
        RemoveLast();
        return value;

    }

    public void RemoveLast() {
      Node current = Header;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
    }

    public Integer peek() {

        if (isEmpty()) return null;
        Node Current = Header;
        while (Current.next != null) {
            Current = Current.next;
        }
        return Current.data;
    }

    public boolean isEmpty() {
        if (Header.next == null) return true;
        else return false;
    }

    public int size() {
        int size = 0;
        Node current = Header;
        while (current.next != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    @Override
    public String toString() {

        Node current = Header;
        String str = "stack now : [";
        while (current.next != null) {
            current = current.next;
            str += current.data + " ";
        }
        str += "]";
        return str;
    }

    public class Node {
        private int data;
        private Node next;
        private Node prev;

    }

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();
        System.out.println("empty " + stack.isEmpty());
        System.out.println("**status is Push**");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString());
        System.out.println("** status is pop **");
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println("peek " + stack.peek());
        System.out.println("size " + stack.size());
        stack.push(4);
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("size " + stack.size());
        System.out.println("Is empty : " + stack.isEmpty());


    }

}
