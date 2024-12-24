import java.util.Comparator;

public class BookComparators {

    // сортировка по названию
    public static final Comparator<Book> byTitle = Comparator.comparing(Book::getTitle);

    // сортировка по автору
    public static final Comparator<Book> byAuthor = Comparator.comparing(Book::getAuthor);

    // сортировка по году количеству страниц
    public static final Comparator<Book> byPages = Comparator.comparingInt(Book::getPages);

}