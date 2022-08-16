public class PartTimeDailyWage {
    public static void main(String[] args) {
        int h = getRandomHours();
        if(h < 5){
            int dailyWage = h * 20;
            System.out.println("Employee work part-time "+h+" hour, daily wage is "+dailyWage);
        }else{
            int dailyWage = h * 20;
            System.out.println("Employee work Full-time "+h+" hour, daily wage is "+dailyWage);
        }
    }

    private static int getRandomHours() {
        int min=1,max=8;
        double random = Math.random();
        int hours = (int)(random * (max - min))+min;
        return hours;
    }
}
