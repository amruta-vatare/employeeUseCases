public class CalculateDailyWages {
    public static void main(String[] args) {
        int h = getRandomHours();
        int wage = calculateDailyWage(h);
        System.out.println("Employee is work for "+h+" hours his daily wages is "+wage);

    }

    private static int getRandomHours() {
        int min=1,max=8;
        double random = Math.random();
        int hours = (int)(random * (max - min))+min;
        return hours;
    }

    public static int calculateDailyWage(int hour){
        int wagePerHour = 20;
        int wage = hour * wagePerHour;
        return wage;
    }
}
