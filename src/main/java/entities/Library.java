package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private Long id;
    private List<Book> books =  new ArrayList<>();
    private List<Author> authors =  new ArrayList<>();
    private List<Loan> loans =  new ArrayList<>();

    public Library() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void setBooks(Book books) {
        this.books.add(books);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors.add(authors);
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Loan loans) {
        this.loans.add(loans);
    }
}
