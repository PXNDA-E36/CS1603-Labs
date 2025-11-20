import java.util.Arrays;
import java.util.Collections;

public static void main(String[] args) {
    Task4();
}

private static void Task1() {
    int num = 126;

    if ((num % 2 == 0 && num % 3 == 0) && num % 5 != 0) {
        System.out.println("Divisible by 2 and 3 but not 5");
    } else if (num % 2 == 0 && num % 3 == 0) {
        System.out.println("Divisible by 2 and 3");
    }

    if (num % 7 == 0 || num % 9 == 0) {
        System.out.println("Divisible by 7 or 9");
    }
}

private static void Task2() {
    Integer[] num = { 10, -10, 3 };
    Arrays.sort(num);
    // Reverse order aka descending order
    // Arrays.sort(num, Collections.reverseOrder());
    System.out.println(Arrays.toString(num));

    String[] name = { "name2", "name3", "name1" };
    Arrays.sort(name);
    // Reverse order aka descending order
    // Arrays.sort(name, Collections.reverseOrder());

    System.out.println(Arrays.toString(name));
}

private static void Task3Example() {
    String month = "September";
    int daysinmonth = 0;

    switch (month) {
        case "January":
        case "March":
        case "May":
        case "July":
        case "August":
        case "October":
        case "December":
            daysinmonth = 31;
            break;
        case "February":
            daysinmonth = 28;
            break;
        case "April":
        case "June":
        case "September":
        case "November":
            daysinmonth = 30;
            break;
        default:
            daysinmonth = -1;
            break;
    }

    System.out.println("Days in month " + month + " = " + daysinmonth);
}

private static void Task3() {
    String animal = "bob";
    int legs = 0;

    switch (animal) {
        case "Centipede":
            // Calculates how many even numbers in range 30-382 inclusive
            // Picks a random index
            // Multiplies index by 2 to ensure an even number
            // Shifts index by 30 to fit target range
            // Casts to int as Math.random() returns a double
            legs = 30 + 2 * (int) (Math.random() * (((382 - 30) / 2) + 1));
            break;
        case "Tarantula", "Black Scorpion":
            legs = 8;
            break;
        case "Alsation Dog", "Sphynx Cat", "Ocelot", "Klingon":
            legs = 4;
            break;
        case "Baboon", "Human", "Potto":
            legs = 2;
            break;
        case "Cobra", "Cod", "Paul Allen the German Octopus", "Minke Whale":
            legs = 0;
            break;
        default:
            System.out.println("Unknown animal");
            System.exit(0);
    }

    System.out.println("This animal has " + legs + " legs");
}

private static void Task4() {
    String animal = "Tarantula";

    int legs = animal.equals("Centipede")
            ? (30 + 2 * (int) (Math.random() * (((382 - 30) / 2) + 1)))
            : (animal.equals("Tarantula") || animal.equals("Black Scorpion"))
                    ? 8
                    : (animal.equals("Alsation Dog") || animal.equals("Sphynx Cat")
                            || animal.equals("Ocelot") || animal.equals("Klingon"))
                                    ? 4
                                    : (animal.equals("Baboon") || animal.equals("Human") || animal.equals("Potto"))
                                            ? 2
                                            : (animal.equals("Cobra") || animal.equals("Cod")
                                                    || animal.equals("Paul Allen the German Octopus")
                                                    || animal.equals("Minke Whale"))
                                                            ? 0
                                                            : -1;

    if (legs == -1) {
        System.out.println("Unknown animal");
        System.exit(0);
    }

    System.out.println("This animal has " + legs + " legs");
}
