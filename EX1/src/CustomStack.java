public class CustomStack {
    private int capacity;
    private int[] stackArray;
    private int top;
    private int size;

    public CustomStack(int chosenCapacity) {
        capacity = chosenCapacity;
        stackArray = new int[chosenCapacity];
        top = -1;
        this.size = 0;
    }

    public void addElement(int element) {
        if (stackIsFull()) {
            System.out.println("Stack is full");
        } else {
            int[] newStack = new int[capacity];
            newStack[0] = element;
            top = element;
            System.arraycopy(stackArray, 0, newStack, 1, this.size);
            stackArray = newStack;
            this.size++;
        }
    }

    public void removeElement() {
        if (stackIsEmpty()) {
            System.out.println("Stack is empty");
        } else if (this.size == 1) {
            top = -1;
            this.size = 0;
            stackArray[0] = -1;
        } else {
            top = stackArray[1];
            int[] newStack = new int[capacity];
            System.arraycopy(stackArray, 1, newStack, 0, this.size - 1);
            stackArray = newStack;
            this.size--;
        }
    }

    public void displayStack() {
        for (int i = 0; i < this.size; i++) {
            System.out.println("element " + i + ": " + stackArray[i]);
        }
    }

    public boolean stackIsEmpty() {
        return top == -1;
    }

    public boolean stackIsFull() {
        return this.size == capacity;
    }
}
