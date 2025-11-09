public class CalcPi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double denominator = 1 + 2 * i;
            double fraction = 1.0 / denominator;

            if (i % 2 == 0) {
                sum += fraction;
            } else {
                sum -= fraction;
            }
        }

        double approxPi = 4 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi);
    }
}
