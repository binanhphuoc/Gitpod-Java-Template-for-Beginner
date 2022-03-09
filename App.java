/**
 * App
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        Scanner inputStream = new Scanner(System.in);
        String name = inputStream.nextLine();
        System.out.println(name);
    }
}