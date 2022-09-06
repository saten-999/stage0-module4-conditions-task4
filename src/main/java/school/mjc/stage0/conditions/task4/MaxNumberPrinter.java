package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int m,max;

        m = first>second ? first :second;
        max = m>third?m : third;

        System.out.println(max);
        
    }
}
