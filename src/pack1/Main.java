package pack1;


// import java.util.Scanner;

// import sun.net.www.http.HttpCaptureInputStream;



public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // String title,String authors,String pub,String character,String intro,int year

    Comic c1 = new Comic("rrr", "arvind,sant", "ssr", 2022);

    Comic c2 = new Comic("spyderMan", "tom,hill,bill", "james house",
        "far away", "bos", 2021);

    System.out.println(c1.getPublisher());

    System.out.println(c2.getPublisher());

    System.out.println(c1.getDescription());

    System.out.println(c2.getDescription());


    History h1 = new History("india that is bharath", "j sai,deepak",
        "bloomsburry", 2021);

    History h2 = new History("pre-independence ind", "bala, guru", "ebook",
        "india in pre ind", "1800-2021", 2022);

    System.out.println(h1.getAuthors());
    System.out.println(h2.getAuthors());

    System.out.println(h1.getDescription());

    System.out.println(h2.getDescription());


    Book b = h1;

    System.out.println(b.getAuthors());

    b = c2;

    System.out.println(b.getPublisher());

    // cannot ref child method



  }


}
