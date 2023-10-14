import java.util.Random;
public class evenOdd {
    public static void main(String[] args) {
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        if(randomInt % 2 == 0) {
            System.out.println("Random number: " + randomInt + " is even");
        }
        else {
            System.out.println("Random number: " + randomInt + " is odd");
        }
    }
}
