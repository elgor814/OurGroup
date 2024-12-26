import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Car[] cars;

    public static void main(String[] args) {



        boolean running = true;

        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Ввод данных вручную");
            System.out.println("2. Ввод данных из файла");
            System.out.println("3. Ввод данных случайным образом");
            System.out.println("4. Сортировать данные");
            System.out.println("5. Найти элемент бинарным поиском");
            System.out.println("6. Записать в файл");
            System.out.println("7. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    handleManualInput();
                    break;
                case 2:
                    // Пример использования: чтение данных из файла
                    String fileName = "src/main/resources/books.txt"; // Имя файла для чтения
                    List<Book> books = DataReader.readBooksFromFile(fileName);

                    // Вывод загруженных данных
                    System.out.println("Загруженные книги из файла:");
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    handleFileInput();
                    break;
                case 3:
                    handleRandomDataGeneration();
                    break;
                case 4:
                    handleSorting();
                    break;
                case 5:
                    handleBinarySearch();
                    break;
                case 6:
                    handleDataSaving();
                    break;
                case 7:
                    System.out.println("Выход из программы...");
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }
        }
    }

    private static void handleManualInput() {
        System.out.println("Ввод данных вручную...");
    }

    private static void handleFileInput() {
        System.out.println();
    }

    private static void handleRandomDataGeneration() {
        System.out.println();
    }

    private static void handleSorting() {

        if (cars == null || cars.length == 0) {
            System.out.println("Массив пуст. Пожалуйста, сначала заполните данные.");
            return;
        }

        ISortStrategy<Car> shellSort = new ShellSort<>();
        Comparator<Car> comparator = Comparator.comparing(Car::getModel)
                .thenComparing(Car::getYear)
                .thenComparing(Car::getPower);

        shellSort.sort(Arrays.asList(cars), comparator);

        System.out.println("Данные успешно отсортированы:");
        for (Car car : cars) {
            System.out.println(car);
        }


        System.out.println();
    }

    public static void handleBinarySearch() {
        if (cars == null || cars.length == 0) {
            System.out.println("Массив пуст. Пожалуйста, сначала заполните данные.");
            return;
        }

        System.out.println("Введите мощность автомобиля для поиска:");
        int power = scanner.nextInt();
        scanner.nextLine();

        Car keyCar = new Car.CarBuilder("BMW").setPower(power).build();

        int index = BinarySearch.binarySearch(cars, keyCar);

        if (index != -1) {
            System.out.println("Найден автомобиль: " + cars[index]);
        } else {
            System.out.println("Автомобиль с указанной мощностью не найден.");
        }
    }

    private static void handleDataSaving() {
        System.out.println();
    }
}
