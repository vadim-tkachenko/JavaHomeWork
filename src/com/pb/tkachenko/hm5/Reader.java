package com.pb.tkachenko.hm5;

class Reader
{
    public String fullName;
    public int id;
    public String faculty;
    public String birthday;
    public String phoneNumber;

    Reader(String fullName, int id, String faculty, String birthday, String phoneNumber)
    {
        this.fullName = fullName;
        this.id = id;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int amountOfBooks)
    {
        System.out.printf("%s взял %d книги \n", fullName, amountOfBooks);
    }

    public void takeBook(String[] bookNames)
    {
        System.out.printf("%s взял книги: ", fullName);
        for (String bookName : bookNames)
        {
            System.out.printf("%s, ", bookName);
        }
        System.out.print("\n");
    }

    public void takeBook(Book[] books)
    {
        System.out.printf("%s взял книги: ", fullName);
        for (Book book : books)
        {
            System.out.printf("%s (%s %s), ", book.name, book.author, book.year);
        }
        System.out.print("\n");
    }

    public void returnBook(int amountOfBooks)
    {
        System.out.printf("%s вернул %d книги \n", fullName, amountOfBooks);
    }

    public void returnBook(String[] bookNames)
    {
        System.out.printf("%s вернул книги: ", fullName);
        for (String bookName : bookNames)
        {
            System.out.printf("%s, ", bookName);
        }
        System.out.print("\n");
    }

    public void returnBook(Book[] books)
    {
        System.out.printf("%s вернул книги: ", fullName);
        for (Book book : books)
        {
            System.out.printf("%s (%s %s), ", book.name, book.author, book.year);
        }
        System.out.print("\n");
    }
}