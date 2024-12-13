import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        ArrayQueueImpl q=new ArrayQueueImpl();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println ("size: "+q.size());

        System.out.println("peek: "+q.peek());

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("size: "+q.size());
        System.out.println(q.dequeue());









    }
}