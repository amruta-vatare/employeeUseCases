public class EmployeeAttendance {
    public static void main(String[] args) {
        int num = getRandomNumber();
        System.out.println(num);
        if(num == 0){
            System.out.println("Employee is absent");
        }else{
            System.out.println("Employee is present");
        }
    }

    private static int getRandomNumber() {
        int min =0, max = 2;
        double random = Math.random();
        int randomNum = (int)(random*(max - min))+min;
        return randomNum;
    }
}
