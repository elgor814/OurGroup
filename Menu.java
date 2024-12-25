import java.util.Scanner;

public class Menu {

    public static void showStartMenu(){
        System.out.println("Выберите действие:");
        System.out.println("1. Ввести данные вручную");
        System.out.println("2. Сгенерировать данные случайны образом");
        System.out.println("3. Загрузить данные из файла");
        System.out.println("4. Отсортировать данные");
        System.out.println("5. Найти элемент с помощью бинарного поиска");
        System.out.println("6. Выход");
    }

    public static int getUserChoice(Scanner scanner, int min, int max) {
        int choice = -1;
        while (choice < min || choice > max) {
            try {
                System.out.print("Введите номер действия: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < min || choice > max) {
                    System.out.println("Некорректный выбор. Пожалуйста, выберите целое число от " + min + " до " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Пожалуйста, выберите целое число от " + min + " до " + max + ".");
            }
        }
        return choice;
    }

}
