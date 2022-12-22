package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if(first>second){
            System.out.println(first>third?first:third);
        }else {
            System.out.println(second>third?second:third);
        }
    }
}
