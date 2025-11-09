public class Collatz {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];
        int seedAdd;

        if (mode.equals("v")) {
            for (int i = 1; i <= seed; i++) {

                if (i == 1) {
                    System.out.println("1 4 2 1 (4)");
                } else {
                    seedAdd = i;
                    int countSeed = 1;
                    System.out.print(i);
                    while (seedAdd != 1) {
                        if (seedAdd % 2 == 0) {
                            seedAdd = seedAdd / 2;
                        } else {
                            seedAdd = (seedAdd * 3) + 1;
                        }
                        System.out.print(" " + seedAdd);
                        countSeed++;
                    }
                    System.out.println(" (" + countSeed + ")");
                }
            }
            System.out.println("Every one of the first " + seed + " hailstone sequences reached 1");
        } else {
            System.out.println("Every one of the first " + seed + " hailstone sequences reached 1");
        }
    }
}


