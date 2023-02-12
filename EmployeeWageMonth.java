import java.util.Random;

public class EmployeeWageMonth {

    int wagePerHour;
    int fullDayHour;
    int partTimeHour;
    int workingDaysPerMonth;

    public static void main(String[] args) {
        Random random=new Random();

        int isPresent=2;
        int randomNum=random.nextInt(isPresent);

        EmployeeWageMonth dailyWage=new EmployeeWageMonth();
        EmployeeWageMonth partTime=new EmployeeWageMonth();
        EmployeeWageMonth workingDays=new EmployeeWageMonth();

        dailyWage.wagePerHour=20;
        dailyWage.fullDayHour=16;

        partTime.partTimeHour=8;

        workingDays.workingDaysPerMonth=20;

        int calculateFullTime=(dailyWage.wagePerHour* dailyWage.fullDayHour);
        System.out.println("The full time employe wsge is "+calculateFullTime+ "rs");

        int calculatePartTime= dailyWage.wagePerHour*partTime.partTimeHour;
        System.out.println("the part time employee is " +calculatePartTime+ "rs");

        int calulateMonthWage=0;


        switch (randomNum){
            case 0:
                calulateMonthWage=(calculatePartTime*workingDays.workingDaysPerMonth);
                System.out.println("The "+workingDays.workingDaysPerMonth+ "day employee is "+calulateMonthWage);
                break;
            case  1:
                calulateMonthWage=(calculateFullTime*workingDays.workingDaysPerMonth);
                System.out.println("the "+workingDays.workingDaysPerMonth+ "day employee full time wage is "+calulateMonthWage);
                break;



        }



    }
}
