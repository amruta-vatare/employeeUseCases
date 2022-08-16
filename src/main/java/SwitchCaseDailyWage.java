public class SwitchCaseDailyWage {
    public static void main(String[] args) {
        int t = getRandomHours();
        switch (t){
            case 1:
                int partTimeWage = 4 * 20;
                System.out.println("Employee work part-time 4 hour, daily wage is "+partTimeWage);
                break;
            case 2:
                int FullTimeWage = 8 * 20;
                System.out.println("Employee work part-time 8 hour, daily wage is "+FullTimeWage);
                break;
            default:
                System.out.println("Unable to calculate wage!");
                break;
        }
    }
    private static int getRandomHours() {
        int min=1,max=3;
        double random = Math.random();
        int hours = (int)(random * (max - min))+min;
        return hours;
    }
}
