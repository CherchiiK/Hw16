import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test for task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your string for check \"cat/dog\"");
        String userString = scanner.nextLine();

        System.out.println(StringMethod.stringCheck(userString));

        //Test for task 2

        System.out.println("Size of your array: ");
        String[] array = new String[Integer.parseInt(scanner.nextLine())];
        System.out.println("Words for your array: " + array.length);
        int i = 0;
        System.out.println(i);
        while (i < array.length) {
            array[i] = scanner.nextLine();
            i++;
            System.out.println(i);
        }
        System.out.println(MapMethod.mapMethod(array));

        //Test for task 3

        System.out.println("Enter your string here: ");
        String base = scanner.nextLine();
        System.out.println("Enter a string to search for matches and delete: ");
        String remove = scanner.nextLine();
        if (remove.length() == 0) {
            throw new ArithmeticException("\"You must type at least 1 symbol\"");
        }
        System.out.println(StringMethod.withoutRemove(base, remove));

    }
}