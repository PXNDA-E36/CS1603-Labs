import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {
        Task3();
    }

    public static void Task1() {
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

    public static void Task2() {
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

    public static void Task3Example() {
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

    public static void Task3() {
        String animal = "Cat";
        int legs;

        switch (animal) {
            case "Alsation Dog", "Sphynx Cat":
                legs = 4;
                break;
        }
    }
}
