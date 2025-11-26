import entities.Author;
import entities.Book;
import entities.Library;
import entities.Loan;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Random rand = new Random();

        Book book1 = new Book(
                1L, "Hary Potter", true
        );
        Book book2 = new Book(
                2L, "Aladim", true
        );
        Book book3 = new Book(
                3L, "The Elements", true
        );

        Author author1 = new Author(
                1L, "Euclides", LocalDate.parse("1990-01-01")
        );
        Author author2 = new Author(
                2L, "Harrison", LocalDate.parse("1925-11-21")
        );

        book1.setAuthors(author1);
        book2.setAuthors(author2);
        book3.setAuthors(author2);

        Loan loans = new Loan();

        Library library = new Library();
        library.setBooks(book1);
        library.setBooks(book2);
        library.setBooks(book3);
        library.setLoans(loans);

        Scanner scann = new Scanner(System.in);
        while (true) {
            System.out.print("Deseja ver a lista de livros (s/n)? ");
            String choice = scann.nextLine();
            if (choice.equals("n")) {
                break;
            }
            printBooks(library);

            System.out.print("Qual livro deseja emprestar (pelo id): ");
            Long idChoice = scann.nextLong();
            Book bookToLoan = library.getBook(idChoice);
            scann.nextLine();
            if (bookToLoan == null) {
                System.out.println("Nenhum livro encontrado");
                continue;
            }

            bookToLoan.setAvailable(false);
            System.out.print("Qual seu nome? ");
            String name = scann.nextLine();
            Loan loan = new Loan(rand.nextLong(), bookToLoan, name);
            System.out.println("Emprestado com sucesso");
        }
        scann.close();
    }

    private static void printBooks(Library library) {
        for (Book book : library.getBooks()) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}
