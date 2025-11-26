package entities;

import java.time.LocalDateTime;

public class Loan {
    private Long id;
    private Book book;
    private String nameClient;


    public Loan() {
    }

    public Loan(Long id, Book book, String nameClient) {
        this.id = id;
        this.book = book;
        this.nameClient = nameClient;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
}
