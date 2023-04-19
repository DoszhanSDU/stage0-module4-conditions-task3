package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        int remainder =month/3;
        if (month < 1 || month > 12) {
            System.out.println("wrong number");
        }else if (remainder == 1 || remainder==4 ) {
            System.out.println("Winter");
        }else if (remainder == 2) {
            System.out.println("Summer");
        }else if (remainder == 3) {
            System.out.println("Autumn");
        }
    }
}
