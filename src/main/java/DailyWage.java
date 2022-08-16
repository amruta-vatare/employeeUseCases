import java.util.HashMap;
import java.util.Map;

public class DailyWage {
    public static void main(String[] args) {


        int empRatePerHr=20;
        int workingDaysInMonths=20;
        int maxWorkingHrInMonth=100;
        HashMap <Integer,Integer>dailyWages = new HashMap<Integer,Integer>();

        int totalEmpHr=0;
        int totalEmpWorkingDays=0;
        while(totalEmpWorkingDays < workingDaysInMonths && totalEmpHr<maxWorkingHrInMonth){
            totalEmpWorkingDays++;
            int ch = getRandom();
            int empHrs = getWorkHours(ch);
            totalEmpHr=totalEmpHr+empHrs;
            int dailyWage =empHrs*empRatePerHr;
            dailyWages.put(totalEmpWorkingDays,dailyWage);
            System.out.println("working hours :"+empHrs+" wage is: "+dailyWage);
        }
        System.out.println("______________________________________________");

        for(Map.Entry<Integer,Integer> set :dailyWages.entrySet()){
            System.out.println("On day :"+set.getKey()+" wage is : "+set.getValue());

        }
    }
    private static int getWorkHours(int h){
        int isPartTime=1;
        int isFullTime=2;
        int workHours;
        switch (h){
            case 1:
                return workHours = 4;
            case 2:
                return workHours = 8;
            default:
                return workHours = 0;
        }
    }
    private static int getRandom() {
        int min=1,max=3;
        double random = Math.random();
        int hours = (int)(random * (max - min))+min;
        return hours;
    }
}
