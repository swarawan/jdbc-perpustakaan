package id.academy.view;

import id.academy.model.AddBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookConsole implements BookView {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private BookService service = new BookServiceImpl(this);

    public void start() {
        System.out.println("===== ACTIVITY: BOOK");
        System.out.println("1. Add");
        System.out.println("2. Get One");
        System.out.println("3. Get All");
        System.out.println("4. Update");
        System.out.println("5. Remove");
        System.out.print("Choose (1..5) ? ");

        try {
            int chooseOption = Integer.parseInt(reader.readLine());
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void add() {
        try {
            System.out.print("Book Title : ");
            String title = reader.readLine();

            System.out.print("Book Author : ");
            String author = reader.readLine();

            AddBook addBook = new AddBook(title, author);
            service.add(addBook);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getOne() {

    }

    private void getAll() {

    }

    private void update() {

    }

    private void remove() {

    }

    public void onSuccess() {
        System.out.println("Success add");
    }

    public void onFailed() {
        System.out.println("Connection Failed");
    }

    public void onError(String message) {
        System.out.println("ERROR : " + message);
    }
}
