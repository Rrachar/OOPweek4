//Robert Rachar
//OOP week 4
//Student class for ibnformation storage
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int count = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while (i < count) {

            System.out.print("Enter Student name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Student Course: ");
            String course = sc.nextLine();
            i++;
        }
    }
}
