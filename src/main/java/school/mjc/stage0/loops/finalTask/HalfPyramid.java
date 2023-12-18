package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int counter = cathetusLength - 1;

        for (int x = 1; x <= cathetusLength; x++) {
            for (int space = 0; space < counter; space++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
            counter--;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
