package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private Long id;
    private String title;
    private List<Author> authors = new ArrayList<>();
    private boolean available;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Book() {
    }

    public Book(Long id, String title, boolean available) {
        this.id = id;
        this.title = title;
        this.available = available;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        this.updatedAt = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.updatedAt = LocalDateTime.now();
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors.add(authors);
        this.updatedAt = LocalDateTime.now();
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        String isAvailable = available?"sim":"não";
        return id + " " + title + " " + authors + " -> available: " + isAvailable;
    }
}
