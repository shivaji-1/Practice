package week2;

import java.util.ArrayList;
import java.util.Scanner;
import pack1.Book;
import pack1.Comic;
import pack1.History;

public class BookOperations {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    ArrayList<Book> books = new ArrayList<>();
    boolean loop = true;

    while (loop) {
      System.out.println(
          "1)ADD BOOK\n2)DELETE BOOK\n3)VIEW ALL BOOKS\n4)UPDATE BOOK\n5)EXIT");

      int choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.println("enter year of book");
          int year = sc.nextInt();
          System.out.println("enter type of book");
          String type = sc.next();
          System.out.println("enter title of book");
          String title = sc.next();
          System.out.println("enter authors of book");
          String authors = sc.next();
          System.out.println("enter publisher of book");
          String publisher = sc.next();

          addBook(books, type, title, authors, publisher, year);

          break;

        case 2:

          System.out.println("enter title of the book");
          String name = sc.next();
          int index;
          try {
            index = findIndex(books, name);
            deleteBook(books, index);

          } catch (BookNotFoundException e) {

            e.printStackTrace();
          }
          break;

        case 3:

          viewBooks(books);

          break;

        case 4:

          System.out.println("enter title of book");
          title = sc.next();
          updateBook(books, title);
          break;

        case 5:
          loop = false;
          break;

      }
    }
  }

  public static int findIndex(ArrayList<Book> books, String title)
      throws BookNotFoundException {

    for (int i = 0; i < books.size(); i++) {
      if (title.equals(books.get(i).getTitle())) {
        return i;

      }

    }

    throw new BookNotFoundException("\n****Invalid Valid Book Title****\n");

  }

  public static void viewBooks(ArrayList<Book> books) {

    if (books.size() > 0) {

      System.out.println("\n\n*******books are******\n\n");
      for (int i = 0; i < books.size(); i++) {
        System.out.println("books no " + i);
        System.out.println("book title is : " + books.get(i).getTitle());
        System.out.println("book authors are : " + books.get(i).getAuthors());
        System.out.println("book was published in : " + books.get(i).getYear());


        System.out.println();
      }
      System.out.println("\n\n****end of books*****");

    }

  }

  public static void updateBook(ArrayList<Book> books, String title) {

    System.out.println("called");

    int choice;

    for (int i = 0; i < books.size(); i++) {

      if (books.get(i).getTitle().equals(title)) {

        System.out.println("update\n1) title\n2)authors\n3)publishers\n4)year");

        choice = sc.nextInt();

        switch (choice) {

          case 1:
            System.out.println("enter title");
            String newTile = sc.nextLine();
            books.get(i).setTitle(newTile);
            break;

          case 2:
            System.out.println("enter authors");
            String newAuthors = sc.nextLine();
            books.get(i).setAuthors(newAuthors);
            break;

          case 3:
            System.out.println("enter publishers");
            String publishers = sc.nextLine();
            books.get(i).setPublisher(publishers);
            break;

          case 4:
            System.out.println("enter year");
            int year = sc.nextInt();
            books.get(i).setYear(year);
            break;

        }

        System.out.println("book updated");

        break;

      }

      else {
        System.out.println(books.get(i).getTitle());
      }

    }


  }

  public static void deleteBook(ArrayList<Book> books, int index) {

    if (index >= books.size())
      return;

    Book b = books.remove(index);
    System.out.println("removed " + b);

  }


  public static void addBook(ArrayList<Book> books, String bookType,
      String title, String authors, String pub, int year) {

    Book b;

    if (bookType == "comic") {

      b = new Comic(title, authors, pub, year);

    } else {

      b = new History(title, authors, pub, year);

    }

    books.add(b);
    return;

  }

}
