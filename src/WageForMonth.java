package EmployeeWage;

import java.util.Random;



//calculate wages for a month Assume 20 working day per month
public class WageForMonth {
    public static void  main(String [] args){
        int salary = 0, total=0,fullhr = 16, parthr = 8, wage = 20 ,days=20;
        Random rand = new Random();
        int x = rand.nextInt(3);
        if(x==2)
        {
            System.out.println("Employee is present full time");
            salary=(wage*fullhr);
            total =(salary*days);
            System.out.println("salary of month is: "+total);
        } else if (x==1)
        {
            System.out.println("Employee is present part time");
            salary=(wage*parthr);
            total =(salary*days);
            System.out.println("Salary of month is:" +total);
        }else
            System.out.println("Employee is absent");
    }
}
