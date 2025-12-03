import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Table elements:");

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}

