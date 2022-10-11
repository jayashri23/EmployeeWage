import java.util.Random;


//calculate wages till a condition of total working hours or days is reached for a month(assume 100 hrs and 20 days)
public class TillConditionReaches {
    public static void main(String [] args){

        int maxhr=100,numworkingdays=20,monthlysalary=0,wage=20;
        int totalworkingdays=0,parthr=8,fullhr=16,monthsalary=0 ;

        Random random=new Random();
        int x=random.nextInt(3);
        while (totalworkingdays< numworkingdays &&
                totalworkingdays < maxhr)
        {
            totalworkingdays ++;
            switch (x)
            {
                case 0:
                    System.out.println("Employee is absent");
                    break;
                case 1:
                    System.out.println("Employee is present part time");
                    monthlysalary=(wage*parthr);
                    System.out.println("Salary of an employee in a month is :" +monthlysalary);
                    System.out.println("Salary of an employee in a month is :" +totalworkingdays);
                    break;
                case 2:
                    System.out.println("Employee is present full time");
                    monthsalary=(wage*fullhr);
                    System.out.println("Salary of an employee in a month is :" +monthlysalary);
                    System.out.println("Salary of an employee in a month is :" +totalworkingdays);
            }
        }

    }
}

