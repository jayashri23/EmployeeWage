import java.util.Random;

public class CheckPresentOrAbsent {

        public static void main(String[] args) {
            Random rand = new Random();
            int x = rand.nextInt(2);
            if (x == 1) {
                System.out.println("Employ is present");
            } else
                System.out.println("Employ is absent");

        }
    }
