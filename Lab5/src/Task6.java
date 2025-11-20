public static void main(String[] args) {
    Task4();
}

private static void Task1() {
    int n;

    n = 10;
    System.out.print("First q: ");
    for (int i = 1; i <= n; i++) {
        System.out.print("+");
    }

    System.out.println();

    n = 9;
    System.out.print("Second q: ");
    for (int i = 1; i <= n; i++) {
        System.out.print("-");
    }

    System.out.println();

    n = 5;
    System.out.print("Third q: ");
    for (int i = 1; i <= n; i++) {
        System.out.print("+-");
    }

    System.out.println();

    n = 3;
    System.out.print("Fourth q: ");
    for (int i = 1; i <= n; i++) {
        System.out.print("*+-");
    }

    System.out.println();

    n = 4;
    System.out.print("Fifth q: ");
    for (int i = 1; i <= n; i++) {
        if (i == 4) {
            System.out.print("*");
            break;
        }
        System.out.print("*+-");
    }

    System.out.println();

    n = 3;
    System.out.print("Sixth q: ");
    for (int i = 1; i <= n; i++) {
        System.out.print("**++");
    }

    System.out.println();

    n = 2;
    System.out.print("Seventh q: ");
    for (int i = 1; i <= n; i++) {
        System.out.print("***+++---");
    }

    System.out.println();

    n = 3;
    System.out.print("Eighth q: ");
    for (int i = 1; i <= n; i++) {
        if (i == 1) {
            System.out.print("***+++");
        } else if (i == 2) {
            System.out.print("------");
        } else {
            System.out.print("+++***");
        }
    }
}

private static void Task2() {
    int n;

    n = 11;
    System.out.print("First q: ");
    for (int i = 4; i <= n; i++) {
        if (i == n) {
            System.out.print(i);
            break;
        }
        System.out.print(i + ",");
    }

    System.out.println();

    n = 19;
    System.out.print("Second q: ");
    for (int i = 10; i <= n; i = i + 3) {
        if (i == n) {
            System.out.print(i);
            break;
        }
        System.out.print(i + ", ");
    }

    System.out.println();

    n = 16;
    System.out.print("Third q: ");
    for (int i = 1; i <= n; i = i + 3) {
        if (i == n) {
            System.out.print(i);
            break;
        }
        System.out.print(i + ", ");
    }

    System.out.println();

    n = 12;
    System.out.print("Fourth q: ");
    for (int i = 1; i <= n; i++) {
        if (i == n) {
            System.out.print(i);
            break;
        }
        if (i % 2 == 0) {
            System.out.print(i + ", ");
        }
    }

    System.out.println();

    n = 10;
    System.out.print("Fifth q: ");
    for (int i = 1; i <= n; i++) {
        if (i == n) {
            System.out.print(((int) Math.pow(i, 2)));
            break;
        }
        System.out.print((int) Math.pow(i, 2) + ", ");

    }

    System.out.println();

    n = 10;
    System.out.print("Sixth q: ");
    for (int i = -10; i <= n; i += 2) {
        if (i == n) {
            System.out.print(i);
            break;
        }
        System.out.print(i + ", ");
    }

    System.out.println();

    n = 20;
    System.out.print("Seventh q: ");
    for (int i = -20; i <= n; i += 5) {
        if (i == n) {
            System.out.print(i);
            break;
        }
        System.out.print(i + ", ");
    }
}

private static void Task3(int a, int b) {
    while (b != 0) {
        int t = b;
        b = a % b;
        a = t;
    }
    System.out.println(a);
}

private static void Task4() {
    int n;

    n = 5;
    System.out.print("First q: ");
    for (int i = 1; i <= n; i++) {
        int counter = i;
        while (counter != 0) {
            System.out.print(i);
            counter--;
        }
    }

    System.out.println();

    n = 6;
    System.out.print("Second q: ");
    for (int i = 2; i <= n; i++) {
        int counter = i;
        while (counter != 0) {
            System.out.print(i);
            counter--;
        }
    }

    System.out.println();

    n = 5;
    System.out.print("Third q: ");
    for (int i = 1; i <= n; i += 2) {
        int counter = i;
        while (counter != 0) {
            System.out.print(i);
            counter--;
        }
    }

    System.out.println();

    n = 7;
    System.out.print("Fourth q: ");
    for (int i = 1; i <= n; i += 2) {
        int counter = (i + 1) / 2;
        while (counter != 0) {
            System.out.print(i);
            counter--;
        }
    }

    System.out.println();

    n = 5;
    System.out.print("Fifth q: ");
    for (int i = n; i >= 1; i--) {
        int counter = i;
        while (counter != 0) {
            System.out.print(i);
            counter--;
        }
    }

    System.out.println();

    n = 5;
    System.out.print("Sixth q: ");
    for (int i = n; i >= 1; i--) {
        int counter = 1;
        while (counter <= ((n - i) + 1)) {
            System.out.print(i);
            counter++;
        }
    }

    System.out.println();

    n = 5;
    System.out.print("Seventh q: ");
    for (int i = 1; i <= n; i++) {
        int counter = i;
        if (i % 2 == 0) {
            while (counter != 0) {
                System.out.print("*");
                counter--;
            }
        } else {
            while (counter != 0) {
                System.out.print("+");
                counter--;
            }
        }
    }

    System.out.println();

    n = 7;
    System.out.print("Eighth q: ");
    for (int i = 2; i <= n; i++) {
        int counter = i;

        switch (i) {
            case 2, 5:
                while (counter != 0) {
                    System.out.print("-");
                    counter--;
                }
            case 3, 6:
                while (counter != 0) {
                    System.out.print("*");
                    counter--;
                }
            case 4, 7:
                while (counter != 0) {
                    System.out.print("+");
                    counter--;
                }
        }
    }

    System.out.println();

    n = 10;
    System.out.print("Ninth q: ");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i == 10 && j == 10) {
                // my original print
                // System.out.print("(" + i + "," + j + ")");

                // ChatGPT optimised version
                System.out.printf("(%d,%d)", i, j);
            } else {
                System.out.printf("(%d,%d), ", i, j);
            }
        }
    }

    System.out.println();

    n = 10;
    System.out.print("Tenth q: ");
    for (int i = 1; i <= n; i++) {
        int counter = i + 1;
        while (counter <= n) {
            if (counter == 10 && i == 9) {
                System.out.printf("(%d,%d)", i, counter);
            } else {
                System.out.printf("(%d,%d), ", i, counter);
            }
            counter++;
        }
    }

    System.out.println();

    System.out.print("Eleventh q: ");
    for (int i = 1; i <= 4; i++) {
        for (int j = 4; j <= 8; j++) {
            if (i == 4 && j == 8) {
                System.out.printf("(%d,%d)", i, j);
            } else {
                System.out.printf("(%d,%d), ", i, j);
            }
        }
    }
}
