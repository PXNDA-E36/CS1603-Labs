public class Question {

    public static void main(String[] args) {
        // DoSomeCalculation(1.0, 2.0, 3.0, 4.0);
        MakeSequence(5);
    }

    public static void DoSomeCalculation(double a, double b, double c, double d) {
        System.out.println((a + b) / (c + d));
    }

    public static String MakeSequence(int N) {
        String output = "";

        if (N < 1) {
            return "";
        }

        for (int i = 1; i <= N; i++) {
            output = output + 1;
        }

        for (int i = 1; i <= N - 1; i++) {
            output = output + 2;
        }

        for (int i = 1; i <= N - 2; i++) {
            output = output + 3;
        }

        for (int i = 1; i <= N - 3; i++) {
            output = output + 4;
        }

        for (int i = 1; i <= N - 4; i++) {
            output = output + 5;
        }

        System.out.println(output);
        return output;
    }
}
