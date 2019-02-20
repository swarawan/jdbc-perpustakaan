package id.academy.view;

import java.util.Scanner;

public class BookConsole {

    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("===== ACTIVITY: BOOK");
        System.out.println("1. Add");
        System.out.println("2. Get One");
        System.out.println("3. Get All");
        System.out.println("4. Update");
        System.out.println("5. Remove");
        System.out.print("Choose (1..5) ? ");

        int chooseOption = scanner.nextInt();
        if (chooseOption == 1) {
            add();
        } else if (chooseOption == 2) {
            getOne();
        } else if (chooseOption == 3) {
            getAll();
        } else if (chooseOption == 4) {
            update();
        } else if (chooseOption == 5) {
            remove();
        } else {
            System.out.println("INVALID NUMBER");
        }
    }

    public void add() {

    }

    public void getOne() {

    }

    public void getAll() {

    }

    public void update() {

    }

    public void remove() {

    }
}
