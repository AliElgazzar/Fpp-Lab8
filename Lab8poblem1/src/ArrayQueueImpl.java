public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (!isEmpty()) {
            return arr[front];
        }
        return -1;
    }

    // Add an element to the queue
    public void enqueue(int obj) {
        if ((rear + 1) % arr.length == front) {
            resize();
        }
        if (front == -1) {
            front++;
        }
        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed = arr[front];

        //For checking if the last element is removed or no
        if (front == rear - 1) {
            front = -1;
            rear = 0;
        } else {
            front = (front + 1) % arr.length;
        }
        return removed;
    }


    // ceck if the queue is empty
    public boolean isEmpty() {

        if (front == -1) {
            return true;
        } else if (front == rear) {
            return true;
        }
        return false;
    }

    // returns the size of the queue
    public int size() {
        if (front != -1) {

            if (rear >= front) {
                return rear - front;
            }
            return arr.length - front + rear;
        }
        return 0;
    }

    // resize the array
    private void resize() {
        int[] newArr = new int[arr.length * 2];
        int Size = size();


        for (int i = 0; i < Size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = Size;
    }
}