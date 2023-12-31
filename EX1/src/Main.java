public class Main {
    public static void main(String[] args) {
        // Create a CustomStack with a capacity of 5
        CustomStack customStack = new CustomStack(5);

        // Add elements to the stack
        customStack.addElement(10);
        customStack.addElement(20);
        customStack.addElement(30);

        // Display the stack
        System.out.println("Stack after adding elements:");
        customStack.displayStack();

        // Remove an element from the stack
        customStack.removeElement();

        // Display the modified stack
        System.out.println("\nStack after removing an element:");
        customStack.displayStack();

        // Add more elements to the stack
        customStack.addElement(40);
        customStack.addElement(50);
        customStack.addElement(60);

        // Try adding more elements than the capacity
        customStack.addElement(70);

        // Display the final stack
        System.out.println("\nStack after adding more elements:");
        customStack.displayStack();
    }
}