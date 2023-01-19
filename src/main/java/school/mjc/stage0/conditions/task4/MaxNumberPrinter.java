package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        int max = first > (second > third ? second : third) ? first : ((second > third) ? second : third);
        if (max == first) {
            System.out.println(0);
        }else {
            System.out.println(max);
        }
    }
}
