package id.academy.view;

import id.academy.model.AddBook;

public interface BookService {

    void add(AddBook book);

    void getOne();

    void getAll();
}