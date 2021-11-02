package com.pb.tkachenko.hm5;

import java.util.Arrays;
import java.util.List;

class Library {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Король лев", "Рудге", "1590"),
                new Book("Истории отца Посполита", "Иван", "1988"),
                new Book("Бандера", "Гриша", "1998")
        );

        List<Reader> readers = Arrays.asList(
                new Reader("Vadim Tkachenko", 0, "facultet clounov", "10002.10.12", "911"),
                new Reader("Vadim Tkachenko1", 0, "facultet clounov", "10002.10.12", "911"),
                new Reader("Vadim Tkachenko2", 0, "facultet clounov", "10002.10.12", "911")
        );

        System.out.println("Книги: ");
        for (Book book : books)
        {
            System.out.printf("\t %s (%s %s) \n", book.name, book.author, book.year);
        }

        System.out.println("\n Читатели: ");
        for (Reader reader : readers)
        {
            System.out.printf("\t %s \n", reader.fullName);
        }

        String[] testBookNames = { "Король лев", "Истории отца Посполита", "Бандера" };
        Reader exampleReader = readers.get(0);

        exampleReader.takeBook(5);
        exampleReader.takeBook(testBookNames);
        exampleReader.takeBook(books.toArray(new Book[0]));

        System.out.print("\n");

        exampleReader.returnBook(5);
        exampleReader.returnBook(testBookNames);
        exampleReader.returnBook(books.toArray(new Book[0]));
    }
}