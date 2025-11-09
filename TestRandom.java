public class TestRandom {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int countGreater = 0;
        int countSmallerOrEven = 0;

        for (int i = 0; i < N; i++) {
            double randomNumber = Math.random();
            if (randomNumber > 0.5) {
                countGreater++;
            } else {
                countSmallerOrEven++;
            }
        }

        System.out.println("> 0.5: " + countGreater + " times");
        System.out.println("<= 0.5: " + countSmallerOrEven + " times");

        if (countSmallerOrEven != 0) {
            double ratio = (double) countGreater / countSmallerOrEven;
            System.out.println("Ratio: " + ratio);
        }
    }
}


