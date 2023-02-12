public class EmployeewagePartTime {

    int wagePerHour;
    int fulldayHour;
    int parTimeHour;
    public static void main(String[] args) {

        EmployeewagePartTime dailyWage=new EmployeewagePartTime();
        EmployeewagePartTime partTime=new EmployeewagePartTime();

        dailyWage.wagePerHour=20;
        dailyWage.fulldayHour=16;
        partTime.parTimeHour=8;

        int calculate = dailyWage.wagePerHour* dailyWage.fulldayHour;
        System.out.println("The full time employee wage is : "+calculate+" rs");

        calculate= dailyWage.wagePerHour*partTime.parTimeHour;
        System.out.println("The part time employee wage is : "+calculate+" rs");


    }
}
