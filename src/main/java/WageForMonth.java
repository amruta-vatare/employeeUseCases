public class WageForMonth {
    public static void main(String[] args) {
        int days = getRandomDays();
        System.out.println("Monthly wage is: "+calculateMonthlyWage(days));
    }

    private static int  calculateMonthlyWage(int days) {
        return  days * 20;
    }

    private static int getRandomDays() {
        int min=1,max=20;
        double random = Math.random();
        int days = (int)(random * (max - min))+min;
        return days;
    }
}
