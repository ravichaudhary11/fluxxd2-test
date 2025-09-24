public class HelloWorld {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello World from Java!");
            try {
                Thread.sleep(1000); // Print every second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

