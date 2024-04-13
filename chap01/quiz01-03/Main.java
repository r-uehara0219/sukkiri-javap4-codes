import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        ArrayList<Book> books = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setTitle("Java入門");
        book1.setPublishDate(sdf.parse("2011/10/07"));
        book1.setComment("スッキリわかる1");
        books.add(book1);
        Book book2 = new Book();
        book2.setTitle("Python入門");
        book2.setPublishDate(sdf.parse("2012/10/07"));
        book2.setComment("スッキリわかる2");
        books.add(book2);
        Book book3 = new Book();
        book3.setTitle("C入門");
        book3.setPublishDate(sdf.parse("2013/10/07"));
        book3.setComment("スッキリわかる3");
        books.add(book3);

        Collections.sort(books, new TitleComparator());
        for (Book book : books) {
            System.out.println(book.getTitle() + " " + sdf.format(book.getPublishDate()) + " " + book.getComment());
        }
    }
}