package id.academy.model;

public class AddBook {

    private String name;
    private String author;

    public AddBook(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
