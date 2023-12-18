package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int rezult = 1;

        for (int i = 0; i < power; i++) {
            rezult *= numberToPrint;
        }
        System.out.println(rezult);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
