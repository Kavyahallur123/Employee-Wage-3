import java.util.Random;

public class EmployeeAttendence {
    public static void main(String[] args) {

        Random random=new Random();
        int randomVal=random.nextInt();
        int empPresent=1;
        if (randomVal==1){
            System.out.println("Employee is present ");

        }else {
            System.out.println("Employee is absent");
        }


    }
}
