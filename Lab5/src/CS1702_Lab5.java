public static void main(String[] args) {
    Exercise3.main(args);
}

private class Exercise1 {
    private static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            }
        }
    }
}

private class Exercise2 {
    private static void main(String[] args) {
        int x = 4;
        int y = 5;

        while (x < y) {
            // What happens?
            System.out.println("Hi there...");
        }
    }
}

private class Exercise3 {
    private static void main(String[] args) {
        int m = 5;
        int n = 5;

        for (int i = 1; i <= m; ++i) {
            System.out.println(i);

            for (int j = 1; j <= n; ++j) {
                System.out.println(" ----> " + j);
            }

        }

    }
}
