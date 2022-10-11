import java.util.Random;


//solve usingswitch case
public class UsingSwitchCase {
    public static void main(String [] args) {
        int salary = 0, fullhr = 16, parthr = 8, wage = 20;
        Random rand = new Random();
        int x = rand.nextInt(3);
        switch(x)
        {
            case 2:
                System.out.println("Employee full time present");
                salary = (fullhr * wage);
                System.out.println("" +salary);
                break;
            case 1:
                System.out.println("Employee part time present");
                salary = (parthr * wage);
                System.out.println("" +salary);
                break;
            default:
                System.out.println("Employee is absent");
        }
    }
}
