package id.academy.view;

import id.academy.database.DbConnector;
import id.academy.model.AddBook;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookServiceImpl implements BookService {

    private Connection connection;
    private BookView view;

    BookServiceImpl(BookView view) {
        this.connection = DbConnector.getConnection();
        this.view = view;
    }

    public void add(AddBook book) {
        String query = "INSERT INTO `buku` (`name`, `author`, `created`, `updated`) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, book.getName());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setDate(3, new Date(System.currentTimeMillis()));
            preparedStatement.setDate(4, new Date(System.currentTimeMillis()));

            boolean isSuccess = preparedStatement.executeUpdate() > 0;
            if (isSuccess) {
                view.onSuccess();
            } else {
                view.onFailed();
            }
        } catch (SQLException e) {
            view.onError(e.getMessage());
        }
    }

    public void getOne() {

    }

    public void getAll() {

    }
}
