package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int counter = cathetusLength - 1;

        for (int x = 1; x <= cathetusLength; x++) {
            for (int space = 0; space < counter; space++) {
                System.out.print(" ");
            }
            for (int y = x; y > 1; y--) {
                System.out.print(y);
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
            counter--;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
