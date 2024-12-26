import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    // Метод для чтения данных о книгах из файла
    public static List<Book> readBooksFromFile(String fileName) {
        List<Book> books = new ArrayList<>();

        // Чтение файла
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Чтение каждой строки из файла
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 3) {
                    try {
                        String title = parts[0];
                        String author = parts[1];
                        int pages = Integer.parseInt(parts[2]);

                        // Создание книги с использованием паттерна Builder
                        Book book = new Book.BookBuilder(title)
                                .setAuthor(author)
                                .setPages(pages)
                                .build();

                        // Добавление книги в список
                        books.add(book);
                    } catch (NumberFormatException e) {
                        System.err.println("Ошибка при чтении количества страниц (неверный формат): " + parts[2]);
                    }
                } else {
                    System.err.println("Неверный формат строки: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return books;
    }
}

