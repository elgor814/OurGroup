import java.util.*;
import java.io.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Car[] cars;
    ArrayList<T> arrayList = new ArrayList<>();

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

            choice = Menu.getUserChoice(scanner, 1, 7);
            scanner.nextLine();

            switch (choice) {
                case 1:
                    handleManualInput();
                    break;
                case 2:
                    handleFileInput();
                    break;
                case 3:
                    handleRandomDataGeneration();
                    break;
                case 4:
                    handleSorting();
                    break;
                case 5:
                    handleBinarySearch(carList);
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
        System.out.println("Введите количество автомобилей для добавления:");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите данные для автомобиля №" + (i + 1) + ":");

            System.out.print("Мощность: ");
            int power = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Модель: ");
            String model = scanner.nextLine();

            System.out.print("Год производства: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Car car = new Car.Builder()
                    .setPower(power)
                    .setModel(model)
                    .setYear(year)
                    .build();

            carList.add(car);

            System.out.println("Автомобиль добавлен: " + car);
        }

        System.out.println("Все данные успешно добавлены!");
    }

    private static void handleFileInput() {
        System.out.println();
    }

    private static void handleRandomDataGeneration() {
        Randomaized randomaized = new Randomaized();
        arrayList = randomaized.getList();
    }

    private static void handleSorting() {
        System.out.println();
    }

    public static void handleBinarySearch(ArrayList<Car> carList) {
        if (carList == null || carList.isEmpty()) {
            System.out.println("Список пуст. Пожалуйста, сначала заполните данные.");
            return;
        }

        System.out.println("Введите мощность автомобиля для поиска:");
        int power = scanner.nextInt();
        scanner.nextLine();

        Car keyCar = new Car.Builder().setPower(power).build();

        Collections.sort(carList);

        int index = BinarySearch.binarySearch(carList, keyCar);

        if (index != -1) {
            System.out.println("Найден автомобиль: " + carList.get(index));
        } else {
            System.out.println("Автомобиль с указанной мощностью не найден.");
        }
    }


    private static void handleDataSaving() {
        System.out.println();
    }
}
