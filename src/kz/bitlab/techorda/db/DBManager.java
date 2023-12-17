package kz.bitlab.techorda.db;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Book> books = new ArrayList<>();

    private static int id = 6;

    static {
        books.add(
                new Book(1,
                        "Harry Potter and Philosophy Stone",
                        "Joane Rowling",
                        "Fantasy",
                        5000
                )
        );
        books.add(
                new Book(2,
                        "Harry Potter and Azkaban Prison",
                        "Joane Rowling",
                        "Fantasy",
                        6000
                )
        );
        books.add(
                new Book(3,
                        "Twilight",
                        "Steffany Mayer",
                        "Fantasy",
                        7000
                )
        );
        books.add(
                new Book(4,
                        "Abay Zholy",
                        "Mukhtar Auezov",
                        "Roman",
                        50000
                )
        );
        books.add(
                new Book(5,
                        "I am Zlatan",
                        "Zlatan Ibrahimovic",
                        "Biography",
                        8000
                )
        );
    }

    public static ArrayList<Book> getBooks(){
        return books;
    }

    public static void addBook(Book book){
        book.setId(id);
        books.add(book);
        id++;
    }
}
