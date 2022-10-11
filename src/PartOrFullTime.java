import java.util.Random;

//add part time employee and wage (part time hr=8)
public class PartOrFullTime {
    public static void main(String [] args) {
        int salary=0, fullhr = 16, parthr = 8, wage = 20;
        Random rand = new Random();
        int x = rand.nextInt(3);

        if (x == 2) {
            System.out.println("Employee is present full time and salary:");
            salary = (fullhr * wage);
            System.out.println(""+salary);
        } else if (x == 1) {
            System.out.println("Employee is part time present and salary:");
            salary = (parthr * wage);
            System.out.println("" +salary);
        } else
            System.out.println("Employee is absent");
    }
}

