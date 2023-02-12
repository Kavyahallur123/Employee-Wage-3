public class DailyWage {

    int wagePerHour;
    int fullDayHour;

    public static void main(String[] args) {
        DailyWage dailyWage=new DailyWage();
        dailyWage.wagePerHour=20;
        dailyWage.fullDayHour=8;

        int dailyWageCalulate= dailyWage.wagePerHour* dailyWage.fullDayHour;
        System.out.println("The daily wage of employee is "+ dailyWageCalulate);


    }
}
