public class Hello {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            System.out.println("Hello World ..." + i);
            System.out.println("This is pushed after Jenkins integration ..." + i);
        }
    }
}