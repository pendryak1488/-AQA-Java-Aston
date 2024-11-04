import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
//1
public class PrintThreeWords {

    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
//2
public class CheckSumSign {

    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
//3
public class PrintColor {

    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 101;

        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
//4
public class CompareNumbers {

    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
//5
public class SumInRange {

    public static void main(String[] args) {
        System.out.println(sumInRange(5, 10)); // true
        System.out.println(sumInRange(5, 15)); // true
        System.out.println(sumInRange(5, 25)); // false
    }

    public static boolean sumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
//6
public class PrintSign {

    public static void main(String[] args) {
        printSign(5); // Positive
        printSign(-3); // Negative
        printSign(0); // Positive
    }

    public static void printSign(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
//7
public class IsNegative {

    public static void main(String[] args) {
        System.out.println(isNegative(5)); // false
        System.out.println(isNegative(-3)); // true
        System.out.println(isNegative(0)); // false
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }
}
//8
public class PrintStringNTimes {

    public static void main(String[] args) {
        printStringNTimes("Hello", 3); // Hello Hello Hello
    }

    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str + " ");
        }
    }
}
//9
public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2023)); // false
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
//10
public class InvertArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr)); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]
    }
}
//11
public class FillArray {

    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ..., 100]
    }
}
//12
public class MultiplyLessThanSix {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 11};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr)); // [2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 11]
    }
}
//13
public class DiagonalOnes {

    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];

        // Заполняем диагональ единицами
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }

        // Печатаем массив
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
//14
public class CreateArray {

    public static void main(String[] args) {
        int[] arr = createArray(5, 10);
        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}


