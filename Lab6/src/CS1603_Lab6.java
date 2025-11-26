import java.util.ArrayList;

public static void main(String[] args) {
    Exercise3.main(args);
}

private class Exercise1 {
    private static void main(String[] args) {
        int[] timeInMinutes = { 1, 3, 5, 10 };

        for (int time : timeInMinutes) {
            System.out.println(time * 60);
        }
    }
}

private class Exercise2 {
    public static void main(String[] args) {
        int[][] movement = {
                { 100, 100, 1000 },
                { 70, 100, 2000 },
                { 100, 70, 3000 },
        };

        for (int[] movement_1D : movement) {
            for (int value : movement_1D) {
                System.out.println(value);

            }
        }
    }
}

private static class Data {
    private String name;
    private int age;

    Data(String n, int a) {
        name = n;
        age = a;
    }

    private String GetName() {
        return (name);
    }

    private void SetName(String n) {
        name = n;
    }

    private int GetAge() {
        return (age);
    }

    private void SetAge(int a) {
        age = a;
    }

    private void Print() {
        System.out.print(("(" + GetName()));
        System.out.print(",");
        System.out.print(GetAge());
        System.out.print(") ");
    }
}

private class Exercise3 {
    private static void main(String[] args) {
        Data x = new Data("Fred", 41);
        // x.Print();

        Data jo = new Data("Jo", 43);
        Data zoe = new Data("Zoe", 37);

        // ArrayList<Data> people = new ArrayList<Data>();
        ArrayList<Data> ArrayA = new ArrayList<Data>();
        // people.add(x);
        // people.add(jo);
        // people.add(zoe);
        ArrayA.add(x);
        ArrayA.add(jo);
        ArrayA.add(zoe);

        // doesn't work as the PrintArray function input is not an ArrayList
        // PrintArray(people);

        // Works
        // PrintDataArray(people);

        // doesn't work as x is already declared + each object is stored in different
        // vars
        // people.forEach(x -> x.Print());

        // double price = 49.99;
        // int discountedPrice = (int) price;
        // System.out.println(discountedPrice);

        // char letter = 'A';
        // int ascii = (int) letter;
        // System.out.println(ascii);

        // Data harry = new Data("Harry", 78);
        // people.add(2, harry);

        // ArrayList<Data> ArrayB = new ArrayList<Data>();
        // PrintDataArray(ArrayA);
        // System.out.println();
        // ArrayB = ArrayA;
        // PrintDataArray(ArrayB);
        // System.out.println();
        // ArrayA.remove(1);
        // PrintDataArray(ArrayB);

        ArrayList<Data> ArrayC = new ArrayList<Data>();
        ArrayC.add(x);
        ArrayC.add(jo);
        ArrayC.add(zoe);

        // ArrayList<Data> ArrayD = new ArrayList<Data>();
        ArrayList<Data> ArrayD = new ArrayList<>(ArrayC);

        PrintDataArray(ArrayC);
        System.out.println();
        // ArrayD = (ArrayList<Data>) ArrayC.clone();
        ArrayC.remove(1);
        PrintDataArray(ArrayC);
        System.out.println();
        PrintDataArray(ArrayD);
        System.out.println();
    }

    private static void PrintArray(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void PrintDataArray(ArrayList<Data> array) {
        for (Data e : array) {
            e.Print();
        }
    }
}
